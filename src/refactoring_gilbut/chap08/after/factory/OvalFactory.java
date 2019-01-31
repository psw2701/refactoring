package refactoring_gilbut.chap08.after.factory;

public class OvalFactory extends ShapeFactory {

	private static final ShapeFactory instance = new OvalFactory();

	private OvalFactory() {
	}

	public static ShapeFactory getInstance() {
		return instance;
	}

	@Override
	public ShapeAfterfactory create(int startX, int startY, int endX, int endY) {
		return new ShapeOval(startX, startY, endX, endY);
	}

}
