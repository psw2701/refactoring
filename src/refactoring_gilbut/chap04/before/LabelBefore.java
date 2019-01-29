package refactoring_gilbut.chap04.before;

public class LabelBefore {
	private String label;

	public LabelBefore(String lable) {
		this.label = lable;
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

	@Override
	public String toString() {
		return String.format("\"%s\"", label);
	}

}
