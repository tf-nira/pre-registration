/* 
 * Copyright
 * 
 */
package io.mosip.preregistration.datasync.code;

/**
 * 
 * This Enum provides the constant variables to accept input request.
 * 
 * @author Ravi C Balaji
 * @since 1.0.0
 *
 */
public enum RequestCodes {
	PRE_REGISTARTION_ID("preRegistrationId"), 
	REGISTARTION_CLIENT_ID("registrationCenterId"), 
	FROM_DATE("fromDate"), 
	TO_DATE("toDate"), 
	IDENTITY("identity"),
	POA("POA"),
	POI("POI"),
	POR("POR"),
	POD("POD"),
	POB("POB"),
	POLG("POLG"),
	POLSD("POLSD"),
	POLDP("POLDP"),
	POPMT("POPMT"),
	POREP("POREP"),
	POREG("POREG"),
	POSIG("POS"),
	POCP("POCP"),
	POADTN("POADTN"),
	POC("POC"),
	POE("POE"),
	POCO("POCO"),
	POOSD("POOSD"),
	POABD("POABD"),
	POSD("POSD"),
	POLC("POLC"),
	POPC("POPC"),
	POL("POL"),
	NID("NID"),
	PODMG("PODMG"),
	PONOT("PONOT"),
	PODP("PODP"),
	POCID("POCID"),
	POIP("POIP"),
	POBC("POBC"),
	POAD("POAD"),
	POPASS("POPASS"),
	POVOT("POVOT"),
	PODRI("PODRI"),
	POBAP("POBAP"),
	POOR("POOR"),
	POLCL("POLCL"),
	POSTA("POSTA"),
	POLCV("POLCV"),
	POREC("POREC"),
	POOS("POOS"),
	POSTP("POSTP"),
	PONR("PONR"),
	POCR("POCR"),
	POCN("POCN"),
	POCD("POCD"),
	POMCERT("POMCERT"),
	PODA("PODA"),
	PODNA("PODNA"),
	POBCBR("POBCBR"),
	POCREP("POCREP"),
	POMED("POMED"),
	POBAPP("POBAPP"),
	POALL("POALL"),
	POLR("POLR"),
	POANID("POANID"),
	POPNID("POPNID"),
	PONPBR("PONPBR"),
	POCLEI("POCLEI"),
	POPPD("POPPD"),
	PONCERT("PONCERT"),
	POPIR("POPIR"),
	POPOLREP("POPOLREP"),
	POFALL("POFALL"),
	POCIF("POCIF"),
	POCOP("POCOP"),
	POPR("POPR"),
	POAID("POAID");

	/**
	 * @param code
	 */
	private RequestCodes(String code) {
		this.code = code;
	}

	private final String code;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
}
