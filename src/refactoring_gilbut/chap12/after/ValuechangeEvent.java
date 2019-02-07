package refactoring_gilbut.chap12.after;

public class ValuechangeEvent {
	private final Value source;

	public ValuechangeEvent(Value source) {
		this.source = source;
	}

	public Value getSource() {
		return source;
	}

}
