package refactoring_gilbut.chap03.before;

import java.util.Arrays;

public class SortSampleBefore {
	private final int[] data;

	public SortSampleBefore(int[] data) {
		this.data = new int[data.length];
		System.arraycopy(data, 0, this.data, 0, data.length);
	}

	//선택정렬
	public void sort() {
		for (int x = 0; x < data.length - 1; x++) {
			int m = x;
			for (int y = x + 1; y < data.length; y++) {
				if (data[m] > data[y]) {
					m = y;
				}
			}
			int v = data[m]; //data[m]는 data[x] ~ data[data.length]
			data[m] = data[x];
			data[x] = v;
			// 여기서 data[0] ~ data[x+1]은 이미 정렬되어 있어야함
		}
	}

	@Override
	public String toString() {
		return String.format("%s", Arrays.toString(data));
	}

}
