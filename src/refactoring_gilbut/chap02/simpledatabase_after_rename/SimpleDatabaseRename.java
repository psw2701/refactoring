package refactoring_gilbut.chap02.simpledatabase_after_rename;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabaseRename {
	private Map<String, String> map = new HashMap<>();

	public SimpleDatabaseRename(Reader r) throws IOException {
		BufferedReader reader = new BufferedReader(r);
		boolean reading = false;
		String tmp;
		while (!reading) {
			tmp = reader.readLine();
			if (tmp == null) {
				reading = true;
			} else {
				boolean scanningKey = true;
				StringBuffer keyBuffer = new StringBuffer();
				StringBuffer valueBuffer = new StringBuffer();
				for (int i = 0; i < tmp.length(); i++) {
					char tmp2 = tmp.charAt(i);
					if (scanningKey) {
						if (tmp2 == '=') {
							scanningKey = false;
						} else {
							keyBuffer.append(tmp2);
						}
					} else {
						valueBuffer.append(tmp2);
					}
				}
				String key = keyBuffer.toString();
				String value = valueBuffer.toString();
				map.put(key, value);
			} // end if-else
		} // end while

	}// end constructor

	public void putValue(String key, String value) {
		map.put(key, value);
	}

	public String getValue(String key) {
		return map.get(key);
	}

	public Iterator<String> iterator() {
		return map.keySet().iterator();
	}

}
