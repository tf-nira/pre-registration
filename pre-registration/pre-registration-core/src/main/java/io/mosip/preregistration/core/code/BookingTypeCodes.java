package io.mosip.preregistration.core.code;

public enum BookingTypeCodes {

	NEW("NEW"),

	RENEWAL("RENEWAL"),

	UPDATE("UPDATE"),

	LOST("LOST"),

	FIRSTID("FIRSTID"),

	ALIENNEW("ALIENNEW"),

	ALIENRENEWAL("ALIENRENEWAL"),

	ALIENLOST("ALIENLOST");

	BookingTypeCodes(String bookingTypeCode) {
		this.bookingTypeCode = bookingTypeCode;
	}

	private String bookingTypeCode;

	public String getBookingTypeCode() {
		return bookingTypeCode;
	}

	public static BookingTypeCodes fromCode(String code) {
		if (code == null) {
			return null;
		}
		for (BookingTypeCodes type : values()) {
			if (type.bookingTypeCode.equalsIgnoreCase(code)) {
				return type;
			}
		}
		return null;
	}

}
