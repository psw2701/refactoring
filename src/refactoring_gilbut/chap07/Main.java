package refactoring_gilbut.chap07;

import refactoring_gilbut.chap07.after.ItemAfter;
import refactoring_gilbut.chap07.after.ItemEnum;
import refactoring_gilbut.chap07.after.ItemTypeAfter;
import refactoring_gilbut.chap07.after.ItemTypeEnum;
import refactoring_gilbut.chap07.before.ItemBefore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();

		after();

		afterEnum();
	}

	private static void afterEnum() {
		ItemEnum book = new ItemEnum(ItemTypeEnum.BOOK, "세계역사", 4800);
		ItemEnum dvd = new ItemEnum(ItemTypeEnum.DVD, "뉴욕의꿈특별판", 3000);
		ItemEnum soft = new ItemEnum(ItemTypeEnum.SOFTWARE, "튜링머신", 3200);
		System.out.printf("%5s = %s%n", "book", book);
		System.out.printf("%5s = %s%n", "dvd", dvd);
		System.out.printf("%5s = %s%n", "soft", soft);
	}

	private static void after() {
		ItemAfter book = new ItemAfter(ItemTypeAfter.BOOK, "세계역사", 4800);
		ItemAfter dvd = new ItemAfter(ItemTypeAfter.DVD, "뉴욕의꿈특별판", 3000);
		ItemAfter soft = new ItemAfter(ItemTypeAfter.SOFTWARE, "튜링머신", 3200);
		System.out.printf("%5s = %s%n", "book", book);
		System.out.printf("%5s = %s%n", "dvd", dvd);
		System.out.printf("%5s = %s%n", "soft", soft);
	}

	private static void before() {
		ItemBefore book = new ItemBefore(ItemBefore.TYPECODE_BOOK, "세계역사", 4800);
		ItemBefore dvd = new ItemBefore(ItemBefore.TYPECODE_DVD, "뉴욕의꿈특별판", 3000);
		ItemBefore soft = new ItemBefore(ItemBefore.TYPECODE_SOFTWARE, "튜링머신", 3200);
		System.out.printf("%5s = %s%n", "book", book);
		System.out.printf("%5s = %s%n", "dvd", dvd);
		System.out.printf("%5s = %s%n", "soft", soft);
	}

}
