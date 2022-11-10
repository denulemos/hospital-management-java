/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validators;

import Controllers.UserController;
import Models.UserModel;
import exceptions.UserAlreadyExistsException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Denu
 */
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
