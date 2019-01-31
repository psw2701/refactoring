package refactoring_gilbut.chap09.after;

public abstract class State {
	public abstract int getTypeCode();
	
	public abstract void start(LoggerAfter logger);
	public abstract void stop(LoggerAfter logger);
	public abstract void log(String info);
}
