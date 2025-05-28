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
	
	/** proofOfNationalId. */
	private IdentityJsonValues ponid;
	
	/** proofOfDamaged. */
	private IdentityJsonValues podmg;
	
	/** proofOfNoticeOfIntension. */
	private IdentityJsonValues ponot;
	
	/** proofOfDeedPoll. */
	private IdentityJsonValues podp;
	
	/** proofOfCID. */
	private IdentityJsonValues pocid;
	
	/** proofOfInterpol. */
	private IdentityJsonValues poip;
	
	/** proofOfBirthCert. */
	private IdentityJsonValues pobc;
	
	/** proofOfAcademic. */
	private IdentityJsonValues poad;
	
	/** proofOfPassport. */
	private IdentityJsonValues popass;
	
	/** proofOfVoters. */
	private IdentityJsonValues povot;
	
	/** proofOfDriving. */
	private IdentityJsonValues podri;
	
	/** proofOfBaptism. */
	private IdentityJsonValues pobap;
	
	/** proofOfOtherRelevant. */
	private IdentityJsonValues poor;
	
	/** proofOfLC1Letter. */
	private IdentityJsonValues polcl;
	
	/** proofOfStatutory. */
	private IdentityJsonValues posta;
	
	/** proofOfLCV. */
	private IdentityJsonValues polcv;
	
	/** proofOfRecLetter. */
	private IdentityJsonValues porec;
	
	/** proofOfOtherSupporting. */
	private IdentityJsonValues poos;
	
	/** proofOfStaDecalrationByParent. */
	private IdentityJsonValues postp;
	
	/** proofOfNotification. */
	private IdentityJsonValues ponr;
	
	/** proofOfCbyReg. */
	private IdentityJsonValues pocr;
	
	/** proofOfCbyNat. */
	private IdentityJsonValues pocn;
	
	/** proofOfCbyDual. */
	private IdentityJsonValues pocd;
	
	/** proofOfMarCert. */
	private IdentityJsonValues pomcert;
	
	/** proofOfDecAbsolute. */
	private IdentityJsonValues poda;
	
	/** proofOfDNA. */
	private IdentityJsonValues podna;
	
	/** proofOfBirthCertBeforeReg. */
	private IdentityJsonValues pobcbr;
	
	/** proofOfCourtOrder. */
	private IdentityJsonValues pocrep;
	
	
}
