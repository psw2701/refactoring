package refactoring_gilbut.chap07.after;

public enum ItemTypeEnum {
	BOOK(0), DVD(1), SOFTWARE(2);
	private final int typeCode;

	private ItemTypeEnum(int typeCode) {
		this.typeCode = typeCode;
	}

	public int getTypeCode() {
		return typeCode;
	}

}
