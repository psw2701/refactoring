package refactoring_gilbut.chap08_1;

public class OvalFactory extends ShapeFactory {

	private static final ShapeFactory instance = new OvalFactory();

	private OvalFactory() {
	}

	public static ShapeFactory getInstance() {
		return instance;
	}

	@Override
	public Shape create(int startX, int startY, int endX, int endY) {
		return new ShapeOval(startX, startY, endX, endY);
	}

}
