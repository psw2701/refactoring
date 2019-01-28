package refactoring_gilbut.chap02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import refactoring_gilbut.chap02.after_break.FindIntBreak;
import refactoring_gilbut.chap02.after_return.FindIntReturn;
import refactoring_gilbut.chap02.before.FindIntBefore;
import refactoring_gilbut.chap02.simpledatabase_after_api.SimpleDatabaseAPI;
import refactoring_gilbut.chap02.simpledatabase_after_pattern.SimpleDatabasePattern;
import refactoring_gilbut.chap02.simpledatabase_after_rename.SimpleDatabaseRename;

public class Main {

	public static void main(String[] args) {

		int[] data = { 1, 9, 0, 2, 8, 5, 6, 3, 4, 7, };

		before(data);

		after_break(data);

		after_return(data);

		before_simpledatabase();

		after_rename_simpledatabase();

		after_api_simpledatabase();

		after_pattern_simpledatabase();
	}

	private static void after_pattern_simpledatabase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			/* System.out.println("fileUrl : " + fileUrl); */
			SimpleDatabasePattern db = new SimpleDatabasePattern(new FileReader(fileUrl));
			Iterator<String> it = db.iterator();
			while (it.hasNext()) {
				String key = it.next();
				/*
				 * System.out.println("KEY:\"" + key + "\""); System.out.println("VALUE: \"" +
				 * db.getValue(key) + "\"");
				 */
				System.out.printf("KEY : %s%nVALUE : %s%n", key, db.getValue(key));
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.err.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.err.println("해당 파일에 문제가 있어 읽을 수 없습니다.");
		}
	}

	private static void after_api_simpledatabase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			/* System.out.println("fileUrl : " + fileUrl); */
			SimpleDatabaseAPI db = new SimpleDatabaseAPI(new FileReader(fileUrl));
			Iterator<String> it = db.iterator();
			while (it.hasNext()) {
				String key = it.next();
				/*
				 * System.out.println("KEY:\"" + key + "\""); System.out.println("VALUE: \"" +
				 * db.getValue(key) + "\"");
				 */
				System.out.printf("KEY : %s%nVALUE : %s%n", key, db.getValue(key));
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.err.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.err.println("해당 파일에 문제가 있어 읽을 수 없습니다.");
		}
	}

	private static void after_rename_simpledatabase() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			/* System.out.println("fileUrl : " + fileUrl); */
			SimpleDatabaseRename db = new SimpleDatabaseRename(new FileReader(fileUrl));
			Iterator<String> it = db.iterator();
			while (it.hasNext()) {
				String key = it.next();
				/*
				 * System.out.println("KEY:\"" + key + "\""); System.out.println("VALUE: \"" +
				 * db.getValue(key) + "\"");
				 */
				System.out.printf("KEY : %s%nVALUE : %s%n", key, db.getValue(key));
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			System.err.println("해당 파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.err.println("해당 파일에 문제가 있어 읽을 수 없습니다.");
		}
	}

	private static void before_simpledatabase() {
		after_rename_simpledatabase();
	}

	private static void after_return(int[] data) {
		if (FindIntReturn.find(data, 5)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not Found...");
		}
	}

	private static void after_break(int[] data) {
		if (FindIntBreak.find(data, 5)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not Found...");
		}
	}

	private static void before(int[] data) {

		if (FindIntBefore.find(data, 5)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not Found...");
		}
	}

}
