package refactoring_gilbut.chap08_1;

public class LineFactory extends ShapeFactory {

	private static final ShapeFactory instance = new LineFactory();

	private LineFactory() {
	}

	public static ShapeFactory getInstance() {
		return instance;
	}

	@Override
	public Shape create(int startX, int startY, int endX, int endY) {
		return new ShapeLine(startX, startY, endX, endY);
	}

}
