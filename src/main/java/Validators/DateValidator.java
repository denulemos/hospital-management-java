package validators;

import exceptions.DateEmptyException;
import java.time.LocalDateTime;


public class DateValidator {
    public static boolean isDateFilled (LocalDateTime time) throws DateEmptyException{
        if (time == null) {
            throw new DateEmptyException();
        }
        return true;
    }
    
}
