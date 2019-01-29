package refactoring_gilbut.chap04.after;

public class LabelAfter {
	private String label;

	public LabelAfter(String lable) {
		this.label = lable;
	}

	public static LabelAfter newNull() {
		return new NullLabel();
	}

	public void display() {
		System.out.printf("display : %s%n", label);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isNull() {
		return false;
	}

	@Override
	public String toString() {

		return String.format("\"%s\"", label);
	}

}
