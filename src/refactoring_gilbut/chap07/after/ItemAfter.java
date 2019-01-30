package refactoring_gilbut.chap07.after;

public class ItemAfter {
	private final ItemTypeAfter itemType;
	private final String title;
	private final int price;

	// getTitle(), getPrice()
	public ItemTypeAfter getItemType() {
		return itemType;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	public ItemAfter(ItemTypeAfter itemType, String title, int price) {
		this.itemType = itemType;
		this.title = title;
		this.price = price;
	}

	public int getTypecode() {
		return itemType.getTypecode();
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", getTypecode(), title, price);
	}
}
