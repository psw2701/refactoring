package refactoring_gilbut.chap10;

import refactoring_gilbut.chap10.before.Robot;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot robot= new Robot("Andrew");
		System.out.println(robot);
		robot.execute("forward right forward");
		System.out.println(robot);
		robot.execute("left backward left forward");
		System.out.println(robot);
		robot.execute("right forward forwardfarvard");
		System.out.println(robot);
	}

}
