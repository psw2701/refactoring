package refactoring_gilbut.chap07.before;

public class ItemBefore {
	public static final int TYPECODE_BOOK = 0;
	public static final int TYPECODE_DVD = 1;
	public static final int TYPECODE_SOFTWARE = 2;
	private ItemTypeBefore itemType = new ItemTypeBefore();
	private final String title;
	private final int price;

	public ItemBefore(int typecode, String title, int price) {
		this.itemType.setTypecode(typecode);
		this.title = title;
		this.price = price;
	}

	public int getTypecode() {
		return itemType.getTypecode();
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", itemType.getTypecode(), title, price);
	}
}
