
package validators;

import controllers.PatientController;
import exceptions.PatientNotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;


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
