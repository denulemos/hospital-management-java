/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validators;

import exceptions.DateEmptyException;
import java.time.LocalDateTime;

/**
 *
 * @author Denu
 */
public class DateValidator {
    public static boolean isDateFilled (LocalDateTime time) throws DateEmptyException{
        if (time == null) {
            throw new DateEmptyException();
        }
        return true;
    }
    
}
