package refactoring_gilbut.chap09.after;

public class StateLogging extends State {
	private static final StateLogging instance = new StateLogging();

	public static StateLogging getInstance() {
		return instance;
	}

	private StateLogging() {
	}

	@Override
	public int getTypeCode() {
		// TODO Auto-generated method stub
		return LoggerAfter.STATE_LOGGING;
	}

	@Override
	public void start(LoggerAfter logger) {
		/* 아무것도하지않음*/

	}

	@Override
	public void stop(LoggerAfter logger) {
		System.out.println("** STOP LOGGING **");
		logger.setState(StateStopped.getInstance());

	}

	@Override
	public void log(String info) {
		System.out.println("Logging: "+ info);
		

	}

}
