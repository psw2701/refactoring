package refactoring_gilbut.chap08.after.factory;



public class ShapeTriangle extends ShapeAfterfactory {

	public ShapeTriangle(int startX, int startY, int endX, int endY) {
		super(startX, startY, endX, endY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTypeCode() {
		return ShapeAfterfactory.TYPECODE_TRI;
	}

	@Override
	public String getName() {
		return "TRIANGLE";
	}

	@Override
	public void draw() {
		drawLine();
	}

	private void drawLine() {
		System.out.printf("%15s : %s%n", "ShapeTriangle", this.toString());
	}

}
