package refactoring_gilbut.chap04.after2;

public class LabelAfter2 {
	private String label;

	public LabelAfter2(String lable) {
		this.label = lable;
	}

	public static LabelAfter2 newNull() {
		return new NullLabel2().getInstance();
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

	private static class NullLabel2 extends LabelAfter2 {
		private static final NullLabel2 instance = new NullLabel2();

		public static NullLabel2 getInstance() {
			return instance;
		}

		public NullLabel2() {
			super("(none)");
			// TODO Auto-generated constructor stub
		}

		@Override
		public void display() {

		}

		@Override
		public boolean isNull() {
			// TODO Auto-generated method stub
			return true;
		}

	}

}
