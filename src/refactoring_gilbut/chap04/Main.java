package refactoring_gilbut.chap04;

import refactoring_gilbut.chap04.after.LabelAfter;
import refactoring_gilbut.chap04.after.PersonAfter;
import refactoring_gilbut.chap04.before.LabelBefore;
import refactoring_gilbut.chap04.before.PersonBefore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();
		PersonAfter[] people = {
				new PersonAfter(new LabelAfter("Alice"), new LabelAfter("alice@example.com")),
				new PersonAfter(new LabelAfter("Bobby"), new LabelAfter("bobby@example.com")),
				new PersonAfter(new LabelAfter("Chris")),
		};
		
		for (PersonAfter p : people) {
			System.out.println(p.toString());
			p.display();
			System.out.println();
		}
	}

	private static void before() {
		PersonBefore[] people = {
				new PersonBefore(new LabelBefore("Alice"), new LabelBefore("alice@example.com")),
				new PersonBefore(new LabelBefore("Bobby"), new LabelBefore("bobby@example.com")),
				new PersonBefore(new LabelBefore("Chris")),
		};
		
		for (PersonBefore p : people) {
			System.out.println(p.toString());
			p.display();
			System.out.println();
		}
	}

}
