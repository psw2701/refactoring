package refactoring_gilbut.chap08.before;

public class ShapeBefore {
	public static final int TYPECODE_LINE = 0;
	public static final int TYPECODE_RECTANGLE = 1;
	public static final int TYPECODE_OVAL = 2;
	private final int typeCode;
	private final int startX;
	private final int startY;
	private final int endX;
	private final int endY;

	public ShapeBefore(int typeCode, int startX, int startY, int endX, int endY) {
		this.typeCode = typeCode;
		this.startX = startX;
		this.startY = startY;
		this.endX = endX;
		this.endY = endY;
	}
	
	

	public int getTypeCode() {
		return typeCode;
	}

	public String getName() {
		switch (typeCode) {
		case TYPECODE_LINE:
			return "LINE";
		case TYPECODE_RECTANGLE:
			return "RECTANGLE";
		case TYPECODE_OVAL:
			return "OVAL";
		default:
			return null;
		}
	}

	@Override
	public String toString() {
		return String.format("[%-10s, (%3s, %3s) - (%3s, %3s)]", getName(), startX, startY, endX, endY);
	}

	private void drawLine() {
		System.out.printf("%15s : %s%n", "drawLine", this.toString());
	}

	private void drawRectangle() {
		System.out.printf("%15s : %s%n", "drawRectangle", this.toString());
	}

	private void drawOval() {
		System.out.printf("%15s : %s%n", "drawOval", this.toString());
	}

	public void draw() {
		switch (typeCode) {
		case TYPECODE_LINE:
			drawLine();
			break;
		case TYPECODE_RECTANGLE:
			drawRectangle();
			break;
		case TYPECODE_OVAL:
			drawOval();
			break;
		default:
			;
		}
	}
}
