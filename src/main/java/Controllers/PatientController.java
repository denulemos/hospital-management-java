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
public class PatientController {
     public ResultSet getPatientById (String id, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM patients WHERE ID LIKE '" + id +"%'");
        
        return result;
    }
}
