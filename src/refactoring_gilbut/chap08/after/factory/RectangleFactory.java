package refactoring_gilbut.chap08.after.factory;

public class RectangleFactory extends ShapeFactory {

	private static final ShapeFactory instance = new RectangleFactory();

	private RectangleFactory() {
	}

	public static ShapeFactory getInstance() {
		return instance;
	}

	@Override
	public ShapeAfterfactory create(int startX, int startY, int endX, int endY) {
		return new ShapeRectangle(startX, startY, endX, endY);
	}

}
