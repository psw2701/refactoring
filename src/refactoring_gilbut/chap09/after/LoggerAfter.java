package refactoring_gilbut.chap09.after;

public class LoggerAfter {
	public static final int STATE_STOPPED = 0;
	public static final int STATE_LOGGING = 1;
	private State state;

	public void setState(State state) {
		this.state = StateStopped.getInstance();
	}

	public LoggerAfter() {
		// TODO Auto-generated constructor stub
		this.state = StateStopped.getInstance();
	}

	public void start() {
		state.start(this);
	}

	public void stop() {
		state.stop(this);
	}

	public void log(String info) {
		state.log(info);
	}

}
