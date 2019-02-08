package refactoring_gilbut.chap15.before;

import java.io.IOException;

public class Main {
	private static final String SAMPLE_CSV_STRING = "좋은아침입니다.,Good morning.\n" + "안녕하세요~,Hello.\n"
			+ "안녕하세요.,Good evening.\n" + "안녕히주무세요.,Good night.\n";
	private static final String SAMPLE_CSV_FILE = "file.csv";

	public static void main(String[] args) throws IOException {
		new CSVStringTablePrinter(SAMPLE_CSV_STRING).print();
		new CSVFileTreePrinter(SAMPLE_CSV_FILE).print();
	}
}
