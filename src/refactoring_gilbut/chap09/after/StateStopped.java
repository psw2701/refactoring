package refactoring_gilbut.chap09.after;

public class StateStopped extends State {
	private static final StateStopped instance = new StateStopped();

	public static StateStopped getInstance() {
		return instance;
	}

	private StateStopped() {
	}

	@Override
	public int getTypeCode() {
		// TODO Auto-generated method stub
		return LoggerAfter.STATE_STOPPED;
	}

	@Override
	public void start(LoggerAfter logger) {
		System.out.println("** START LOGGING **");
		logger.setState(StateLogging.getInstance());
	}

	@Override
	public void stop(LoggerAfter logger) {
		/* 아무것도하지않음 */

	}

	@Override
	public void log(String info) {
		System.out.println("Ignoring: " + info);

	}

}
