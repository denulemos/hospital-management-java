package exceptions;

public class AllNumberException extends Exception {
	
	public AllNumberException(String message) {
		super("A field must be filled with only numbers " + message);
	}
}

