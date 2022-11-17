
package validators;

import controllers.UserController;
import models.UserModel;
import exceptions.UserAlreadyExistsException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UserValidator {
    public static boolean isDoctor (UserModel user) {
        return !(user.getSpecialty() == null);
    }
    
    public static boolean userExists (String id) throws UserAlreadyExistsException, SQLException {
        UserController userController = new UserController();
        ResultSet result = userController.getUserById(id);
            if (result.next()) {
                throw new UserAlreadyExistsException(id);
            }
        return true;
    }
}
