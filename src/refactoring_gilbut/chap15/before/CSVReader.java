package refactoring_gilbut.chap15.before;

import java.io.IOException;
import java.util.regex.Pattern;

public abstract class CSVReader {
	protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");

	// 콤마앞뒤에공백(A whitespace character: [ \t\n\x0B\f\r]) 포함
	// test ,test test, test test, test
	public abstract String[] readCSV() throws IOException;

	public abstract void close() throws IOException;
}
