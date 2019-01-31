package refactoring_gilbut.chap08.after.factory;

public class TriangleFactory extends ShapeFactory {

	private static final ShapeFactory instance = new TriangleFactory();

	private TriangleFactory() {
	}

	public static ShapeFactory getInstance() {
		return instance;
	}

	@Override
	public ShapeAfterfactory create(int startX, int startY, int endX, int endY) {
		return new ShapeTriangle(startX, startY, endX, endY);
	}

}
