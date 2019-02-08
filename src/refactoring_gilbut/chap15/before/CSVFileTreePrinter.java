package refactoring_gilbut.chap15.before;

import java.io.IOException;

public class CSVFileTreePrinter extends CSVFileReader {
	public CSVFileTreePrinter(String filename) throws IOException {
		super(filename);
	}

	public void print() throws IOException {
		String[] prevItem = new String[0];
		String[] item = null;
		while ((item = readCSV()) != null) {
			boolean justprint = false;
			for (int column = 0; column < item.length; column++) {
				if (justprint) {
					printline(column, item[column]);
				} else {
					if (prevItem.length <= column || !item[column].equals(prevItem[column])) {
						printline(column, item[column]);
						justprint = true;
					}
				}
			}
			prevItem = item;
		}
	}

	private void printline(int indent, String s) {
		// TODO Auto-generated method stub
		for (int i = 0; i < indent; i++) {
			System.out.print(" ");
		}
		System.out.println(s);
	}
}
