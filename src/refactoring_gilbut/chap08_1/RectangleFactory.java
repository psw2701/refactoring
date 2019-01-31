package refactoring_gilbut.chap08_1;

public class RectangleFactory extends ShapeFactory {

	private static final ShapeFactory instance = new RectangleFactory();

	private RectangleFactory() {
	}

	public static ShapeFactory getInstance() {
		return instance;
	}

	@Override
	public Shape create(int startX, int startY, int endX, int endY) {
		return new ShapeRectangle(startX, startY, endX, endY);
	}

}
