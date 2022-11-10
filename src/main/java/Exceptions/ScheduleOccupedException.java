

package exceptions;

public class ScheduleOccupedException extends Exception {
	
	public ScheduleOccupedException() {
		super("This date is already occuped by another appointment");
	}
}

