package refactoring_gilbut.chap08.after.simple;

import refactoring_gilbut.chap08.after.ShapeAfter;

public class ShapeRectangle extends ShapeAfterSimple {
	public static ShapeRectangle createShapeRectangle(int startX, int startY, int endX, int endY) {
		return createShapeRectangle(startX, startY, endX, endY);
	}
	
	private ShapeRectangle( int startX, int startY, int endX, int endY) {
		super( startX, startY, endX, endY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getTypeCode() {
		return ShapeAfterSimple.TYPECODE_RECTANGLE;
	}

	@Override
	public String getName() {
		return "RECTANGLE";
	}

	@Override
	public void draw() {
		drawRectangle();
	}

	private void drawRectangle() {
		System.out.printf("%15s : %s%n", "drawRectangle", this.toString());
	}

}
