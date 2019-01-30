package refactoring_gilbut.chap06;

import refactoring_gilbut.chap06.after.BookAfter;
import refactoring_gilbut.chap06.before.BookBefore;

public class Main {
	public static void main(String[] args) {
		before();
		after();
		
	}

	private static void after() {
		BookAfter refactoring = new BookAfter("Refactoring: improving the desginof existing code",
				"ISBN0201485672",
				"$4495",
				"Martin Fowler",
				"fowler@acm.org");
		System.out.println(refactoring.toXml());
	}

	private static void before() {
		BookBefore refactoring = new BookBefore("Refactoring: improving the desginof existing code",
				"ISBN0201485672",
				"$4495",
				"Martin Fowler",
				"fowler@acm.org");
		System.out.println(refactoring.toXml());
	}
}
