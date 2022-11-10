package exceptions;

public class CantTakeAppointmentWithoutPatientException extends Exception {
	
	public CantTakeAppointmentWithoutPatientException() {
		super("Can't take appointment if the patient does not exists");
	}
}

