package io.mosip.preregistration.application.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.security.PermitAll;

import org.altcha.altcha.Altcha;
import org.altcha.altcha.Altcha.Algorithm;
import org.altcha.altcha.Altcha.Challenge;
import org.altcha.altcha.Altcha.ChallengeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/") 
public class CaptchaController {
	
	@Value("${ALTCHA_HMAC_KEY:secret-key}") 
    private String hmacKey;
	
	@PermitAll
	@GetMapping(path = "altcha/challenge/generate")
	@Operation(summary = "Generate Altcha Challenge", description = "Generate Altcha Challenge", tags = "captcha-controller")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK"),
			@ApiResponse(responseCode = "201", description = "Created" ,content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "401", description = "Unauthorized" ,content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "403", description = "Forbidden" ,content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "404", description = "Not Found" ,content = @Content(schema = @Schema(hidden = true)))})
	public Challenge altcha() {
        try {
            ChallengeOptions options = new ChallengeOptions();
            options.algorithm = Algorithm.SHA256;
            options.hmacKey = hmacKey;

            return Altcha.createChallenge(options);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error generating challenge", e);
        }
    }

    @PostMapping("altcha/challenge/verify")
    @Operation(summary = "Verify Altcha Challenge", description = "Verify Altcha Challenge", tags = "captcha-controller")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "OK"),
			@ApiResponse(responseCode = "201", description = "Created" ,content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "401", description = "Unauthorized" ,content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "403", description = "Forbidden" ,content = @Content(schema = @Schema(hidden = true))),
			@ApiResponse(responseCode = "404", description = "Not Found" ,content = @Content(schema = @Schema(hidden = true)))})
    public Map<String, Object> submit(@RequestParam Map<String, String> formData) {
        Map<String, Object> response = new HashMap<>();
        try {
            String payload = formData.get("altcha");

            if (payload == null) {
                response.put("success", false);
                response.put("error", "'altcha' field is missing");
                return response;
            }

            boolean isValid = Altcha.verifySolution(payload, hmacKey, true);
            response.put("success", isValid);
            response.put("data", formData);
        } catch (Exception e) {
            e.printStackTrace();
            response.put("success", false);
            response.put("error", "Error verifying solution: " + e.getMessage());
        }
        return response;
    }

}
