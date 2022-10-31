/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Denu
 */
public class DoctorController {
     public ResultSet getDoctorById (String id, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM doctors WHERE id LIKE '" + id +"%'");
        
        return result;
    }
     
      public ResultSet getDoctorBySpecialty (String id, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM doctors WHERE specialty LIKE '" + id +"%'");
        
        return result;
    }
}
