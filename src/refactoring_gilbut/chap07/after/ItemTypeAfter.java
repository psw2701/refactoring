package refactoring_gilbut.chap07.after;

public class ItemTypeAfter {
	public static final ItemTypeAfter BOOK = new ItemTypeAfter(0);
	public static final ItemTypeAfter DVD = new ItemTypeAfter(1);
	public static final ItemTypeAfter SOFTWARE = new ItemTypeAfter(2);
	public final int typecode;

	private ItemTypeAfter(int typecode) {
		this.typecode = typecode;
	}

	public int getTypecode() {
		return typecode;
	}
}
