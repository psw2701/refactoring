package refactoring_gilbut.chap13.after;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dice> dices = Arrays.asList(new Dice(), new Dice(456L), new Dice());
		dices.get(2).setSeed(456L);
		for (Dice d : dices) {
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d%s", d.nextInt(), i < 9 ? "," : "");
			}
			System.out.println();
		}
	}

}
