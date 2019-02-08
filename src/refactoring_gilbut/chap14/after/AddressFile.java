package refactoring_gilbut.chap14.after;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;

public class AddressFile {
	private final Database database;

	public AddressFile(String filename) {
		database = new Database(filename);
	}

	public Enumeration<?> names() {
		return database.getProperties().propertyNames();
	}

	public void set(String key, String value) {
		database.set(key, value);
	}

	public String get(String key) {
		return database.get(key);
	}

	public void update() throws FileNotFoundException, IOException {
		database.update();
	}
}
