package refactoring_gilbut.chap06_1.after;

public class Video extends Media {

	public Video(String data) {
		super(data);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", data, "play");
	}

	@Override
	public void loop() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", data, "loop");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.printf("%s %s%n", data, "stop");
	}

}
