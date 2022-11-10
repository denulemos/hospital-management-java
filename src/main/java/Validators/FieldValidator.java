/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validators;

import Exceptions.AllNumberException;
import exceptions.EmptyFieldException;

/**
 *
 * @author Denu
 */
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
