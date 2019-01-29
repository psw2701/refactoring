package refactoring_gilbut.chap03.after_assertion;

import java.util.Arrays;

public class SortSampleAssertion {
	private final int[] data;

	public SortSampleAssertion(int[] data) {
		this.data = new int[data.length];
		System.arraycopy(data, 0, this.data, 0, data.length);
	}

	// 선택정렬
	public void sort() {
		for (int x = 0; x < data.length - 1; x++) {
			int m = x;
			for (int y = x + 1; y < data.length; y++) {
				if (data[m] > data[y]) {
					m = y;
				}
			}
			assert inMin(m, x, data.length - 1) : this + ", x" + x;

			int v = data[m]; // data[m]는 data[x] ~ data[data.length]
			data[m] = data[x];
			data[x] = v;
			// 여기서 data[0] ~ data[x+1]은 이미 정렬되어 있어야함
			assert isSorted(0, x + 1) : this + ", x" + x;
		}
	}

	private boolean isSorted(int start, int end) {
		for (int i = start; i < end; i++) {
			if (data[i] > data[i + 1]) {
				return false;
			}
		}
		return true;
	}

	private boolean inMin(int pos, int start, int end) {
		for (int i = start; i <= end; i++) {
			if (data[pos] > data[i]) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("%s", Arrays.toString(data));
	}

}
