package io.mosip.preregistration.core.code;

public enum BookingTypeCodes {

	NEW("NEW"),

	RENEWAL("RENEWAL"),

	UPDATE("UPDATE"),

	LOST("LOST"),
	
	FIRSTID("FIRSTID");

	BookingTypeCodes(String bookingTypeCode) {
		this.bookingTypeCode = bookingTypeCode;
	}

	private String bookingTypeCode;

	public String getBookingTypeCode() {
		return bookingTypeCode;
	}

}
