package refactoring_gilbut.chap01;

import refactoring_gilbut.chap01.after.RobotSymbolicConstant;
import refactoring_gilbut.chap01.after2.RobotCommandClass;
import refactoring_gilbut.chap01.after3.Command;
import refactoring_gilbut.chap01.after3.RobotEnum;
import refactoring_gilbut.chap01.before.RobotMagicNumber;

public class Main {
	public static void main(String[] args) {

		before();
		afterSymbolicConstant();
		afterClass();
		afterEnum();
	}

	private static void afterEnum() {
		System.out.println("afterEnum Main()");
		RobotEnum robot = new RobotEnum("김보민");
		robot.order(Command.WORK);
		robot.order(Command.STOP);
		robot.order(Command.JUMP);
	}

	private static void afterClass() {
		System.out.println("afterClass Main()");
		RobotCommandClass robot = new RobotCommandClass("Andrew");
		robot.order(RobotCommandClass.COMMAND_WALK);
		robot.order(RobotCommandClass.COMMAND_STOP);
		robot.order(RobotCommandClass.COMMAND_JUMP);
	}

	private static void afterSymbolicConstant() {
		System.out.println("afterSymbolicConstant Main()");
		RobotSymbolicConstant robot = new RobotSymbolicConstant("Andrew");
		robot.order(RobotSymbolicConstant.COMMAND_WALK);
		robot.order(RobotSymbolicConstant.COMMAND_STOP);
		robot.order(RobotSymbolicConstant.COMMAND_JUMP);
	}

	private static void before() {
		System.out.println("before Main()");
		RobotMagicNumber robot = new RobotMagicNumber("Andrew");
		robot.order(0); // walk
		robot.order(1); // stop
		robot.order(2); // jump
	}
}
