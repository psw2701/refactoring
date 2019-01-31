package refactoring_gilbut.chap09.after;

public class LoggerAfter {
	public static final int STATE_STOPPED = 0;
	public static final int STATE_LOGGING = 1;
	private State state;

	public int getState() {
		return state.getTypeCode();
	}

	public void setState(int state) {
		switch (state) {
		case STATE_STOPPED:
			this.state = new StateStopped();
			break;
		case STATE_LOGGING:
			this.state = new StateLogging();
			break;
		default:
			System.out.println("Invalid state : " + state);
		}
	}

	public LoggerAfter() {
		// TODO Auto-generated constructor stub
		setState(STATE_STOPPED);
	}

	public void start() {
		switch (getState()) {
		case STATE_STOPPED:
			System.out.println("** START LOGGING **");
			setState(STATE_LOGGING);
			break;
		case STATE_LOGGING:
			/* 아무것도하지않음 */ break;
		default:
			System.out.println("Invalid state : " + getState());
		}
	}

	public void stop() {
		switch (getState()) {
		case STATE_STOPPED:
			/* 아무것도하지않음 */ break;
		case STATE_LOGGING:
			System.out.println("** STOP LOGGING **");
			setState(STATE_STOPPED);
			break;
		default:
			System.out.println("Invalid state : " + getState());
		}
	}

	public void log(String info) {
		switch (getState()) {
		case STATE_STOPPED:
			System.out.println("Ignoring: " + info);
			break;
		case STATE_LOGGING:
			System.out.println("Logging: " + info);
			break;
		default:
			System.out.println("Invalid state : " + getState());
		}
	}

}
