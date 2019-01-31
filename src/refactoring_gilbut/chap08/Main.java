package refactoring_gilbut.chap08;

import java.util.Arrays;
import java.util.List;

import refactoring_gilbut.chap08.after.ShapeAfter;
import refactoring_gilbut.chap08.after.factory.LineFactory;
import refactoring_gilbut.chap08.after.factory.OvalFactory;
import refactoring_gilbut.chap08.after.factory.RectangleFactory;
import refactoring_gilbut.chap08.after.factory.ShapeAfterfactory;
import refactoring_gilbut.chap08.after.factory.TriangleFactory;
import refactoring_gilbut.chap08.before.ShapeBefore;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		before();

		after();

		after2();

	}

	private static void after2() {
		List<ShapeAfterfactory> shapes = Arrays.asList(
				ShapeAfterfactory.createShape(LineFactory.getInstance(), 0, 0, 100, 200),
				ShapeAfterfactory.createShape(RectangleFactory.getInstance(), 10, 20, 30, 40),
				ShapeAfterfactory.createShape(OvalFactory.getInstance(), 100, 200, 300, 400));
				ShapeAfterfactory.createShape(TriangleFactory.getInstance(), 100, 200, 300, 400);
		for (ShapeAfterfactory s : shapes) {
			s.draw();
		}
	}

	private static void after() {
		List<ShapeAfter> shapes = Arrays.asList(ShapeAfter.createShape(ShapeAfter.TYPECODE_LINE, 0, 0, 100, 200),
				ShapeAfter.createShape(ShapeAfter.TYPECODE_RECTANGLE, 10, 20, 30, 40),
				ShapeAfter.createShape(ShapeAfter.TYPECODE_OVAL, 100, 200, 300, 400));
		for (ShapeAfter s : shapes) {
			s.draw();
		}
	}

	private static void before() {
		List<ShapeBefore> shapes = Arrays.asList(new ShapeBefore(ShapeBefore.TYPECODE_LINE, 0, 0, 100, 200),
				new ShapeBefore(ShapeBefore.TYPECODE_RECTANGLE, 10, 20, 30, 40),
				new ShapeBefore(ShapeBefore.TYPECODE_OVAL, 100, 200, 300, 400));
		for (ShapeBefore s : shapes) {
			s.draw();
		}
	}
}
