package refactoring_gilbut.chap05.after;

public class BannerAfter {
	private final String content;

	public BannerAfter(String content) {
		this.content = content;
	}

	public void print(int times) {
		printBorder();
		printContent(times);
		printBorder();
	}

	private void printContent(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("|" + content + "|");
		}
	}

	private void printBorder() {
		System.out.print("+");
		for (int i = 0; i < content.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}

}
