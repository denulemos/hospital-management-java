package exceptions;

public class DateEmptyException extends Exception {
	
	public DateEmptyException() {
		super("All dates must be filled");
	}
}
