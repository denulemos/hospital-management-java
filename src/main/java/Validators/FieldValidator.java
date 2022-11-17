package validators;

import exceptions.AllNumberException;
import exceptions.EmptyFieldException;


public class FieldValidator {
    public static int validateAndConvertToNumber (String text) throws AllNumberException {
        if (text.matches("[0-9]+")){
            return Integer.parseInt(text);
        }
        throw new AllNumberException(text);
    }
    
     public static boolean validateField (String field) throws EmptyFieldException {
        if (field.isEmpty()){
            throw new EmptyFieldException();
        }
        return true;
    }
}
