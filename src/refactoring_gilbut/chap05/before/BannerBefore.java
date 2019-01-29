package refactoring_gilbut.chap05.before;

public class BannerBefore {
	private final String content;

	public BannerBefore(String content) {
		this.content = content;
	}

	public void print(int times) {
		// 테두리출력
		System.out.print("+");
		for (int i = 0; i < content.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
		// 내용출력
		for (int i = 0; i < times; i++) {
			System.out.println("|" + content + "|");
		}
		// 테두리출력
		System.out.print("+");
		for (int i = 0; i < content.length(); i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
}
