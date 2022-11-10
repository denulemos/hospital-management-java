package exceptions;

public class UserAlreadyExistsException extends Exception {
	
	public UserAlreadyExistsException(String id) {
		super("This User already exists: " + id);
	}
}
