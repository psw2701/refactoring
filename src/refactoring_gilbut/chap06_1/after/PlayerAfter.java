package refactoring_gilbut.chap06_1.after;

public class PlayerAfter {
	private Media media;

	public void setMedia(Media media) {
		this.media = media;
	}

	public void play() {
		media.play();
	}

	public void loop() {
		media.loop();
	}

	public void stop() {
		media.stop();
	}
}
