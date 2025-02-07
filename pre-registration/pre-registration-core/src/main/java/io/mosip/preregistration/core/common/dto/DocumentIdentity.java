package io.mosip.preregistration.core.common.dto;

import io.mosip.preregistration.core.common.dto.identity.IdentityJsonValues;
import lombok.Data;

@Data
public class DocumentIdentity {
	
	/** Proof of Address. */
	private IdentityJsonValues poa;
	
	/** Proof of Identity. */
	private IdentityJsonValues poi;
	
	/** Proff of Birth. */
	private IdentityJsonValues pob;
	
	/** Proof of exception. */
	private IdentityJsonValues poe;
	
	/** Proof of Relation. */
	private IdentityJsonValues por;

	/** Proof of Legal Documents. */
//	private IdentityJsonValues pold;
	/** Proof of payment. */
	private IdentityJsonValues popmt;
	/** Proof of replacement. */
	private IdentityJsonValues porep;
	/** Proof of registration. */
	private IdentityJsonValues poreg;
	/** Proof of signature. */
	private IdentityJsonValues pos;
	/** Proof of change of particulars. */
	private IdentityJsonValues pocp;
	/** Proof of adoption. */
	private IdentityJsonValues poadtn;
	/** Proof of citizenship. */
	private IdentityJsonValues poc;
	/** Proof of Declarant. */
	private IdentityJsonValues pod;
	/** Proof of Legal Gazzeete. */
	private IdentityJsonValues polg;
	/** Proof of Legal Statutory Declaration. */
	private IdentityJsonValues polsd;
	/** Proof of Legal Deep Poll. */
	private IdentityJsonValues poldp;
	/** Proof of court Order. */
	private IdentityJsonValues poco;
	/** proofOfOtherSupportingdocumentIssuedbyGovt. */
	private IdentityJsonValues poosd;
	/** proofOfOtherSupportingDocuments. */
	private IdentityJsonValues posd;
	/** proofOfPhysicalApplicationForm. */
	private IdentityJsonValues popf;
	/** proofOfAbandonment. */
	private IdentityJsonValues poabd;
	/** proofOfModificationConsent. */
	private IdentityJsonValues pomc;
	/** introducerProofOfSignature. */
	private IdentityJsonValues pois;

}
