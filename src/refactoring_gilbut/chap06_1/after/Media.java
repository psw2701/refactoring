package refactoring_gilbut.chap06_1.after;

public abstract class Media {
	protected String data;

	public Media(String data) {
		this.data = data;
	}

	public abstract void play();

	public abstract void loop();

	public abstract void stop();
}
