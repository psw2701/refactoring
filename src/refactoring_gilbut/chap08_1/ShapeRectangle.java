package refactoring_gilbut.chap08_1;

public class ShapeRectangle extends Shape {
	public static ShapeRectangle createShapeRectangle(int startX, int startY, int endX, int endY) {
		return new ShapeRectangle(startX, startY, endX, endY);
	}

	ShapeRectangle(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
	}

	@Override
	public int getTypeCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

	}
}
