package refactoring_gilbut.chap02.after_break;

public class FindIntBreak {
	public static boolean find(int[] data, int target) {
		boolean found = false;

		for (int i = 0; i < data.length; i++) {
			if (data[i] == target) {
				found = true;
				break;
			}
		}
		return found;
	}
}
