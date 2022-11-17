
package exceptions;


public class PatientNotFoundException extends Exception{
    public PatientNotFoundException (String id) {
		super("This patient does not exist: " + id);
	}
    
}
