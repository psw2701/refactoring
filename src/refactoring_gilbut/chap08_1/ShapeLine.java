package refactoring_gilbut.chap08_1;

public class ShapeLine extends Shape {
	public static ShapeLine createShapeLine(int startX, int startY, int endX, int endY) {
		return new ShapeLine(startX, startY, endX, endY);
	}

	ShapeLine(int startX, int startY, int endX, int endY) {
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
