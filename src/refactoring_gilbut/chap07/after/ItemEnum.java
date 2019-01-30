package refactoring_gilbut.chap07.after;

public class ItemEnum {
	private final ItemTypeEnum itemType;
	private final String title;
	private final int price;

	// getTitle(), getPrice()
	public ItemTypeEnum getItemType() {
		return itemType;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public ItemEnum(ItemTypeEnum itemType, String title, int price) {
		this.itemType = itemType;
		this.title = title;
		this.price = price;
	}

	public int getTypecode() {
		return itemType.getTypeCode();
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", getTypecode(), title, price);
	}
}
