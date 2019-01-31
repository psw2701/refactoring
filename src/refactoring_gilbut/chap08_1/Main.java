package refactoring_gilbut.chap08_1;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Shape> shapes = Arrays.asList(ShapeLine.createShapeLine(0, 0, 100, 200),
				ShapeRectangle.createShapeRectangle(10, 20, 30, 40), ShapeOval.createShapeOval(100, 200, 300, 400));
		for (Shape s : shapes) {
			s.draw();
		}
	}
}
