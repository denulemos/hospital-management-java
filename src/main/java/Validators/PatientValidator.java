/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validators;

import Controllers.PatientController;
import Exceptions.PatientNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Denu
 */
public class PatientValidator {
    public static void checkIfUserExists (String id) throws PatientNotFoundException, SQLException {
        if (id == null) {
            return;
        }
        PatientController patientController = new PatientController();
        ResultSet result = patientController.getPatientById(id);
        
        if (result.next()){ 
            return;
        }
        else {
            throw new PatientNotFoundException(id);
        }
    }
}
