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
public class ScheduleController {
     public ResultSet getAvailableScheduleBySpecialty (String specialty, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM schedule WHERE specialty LIKE '" + specialty +"%' AND patient IS NULL");
        
        return result;
    }
     
     public ResultSet getScheduleByDoctor (String doctor, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM schedule WHERE doctor LIKE '" + doctor +"%' AND patient IS NULL");
        
        return result;
    }
     
     public ResultSet getScheduleByPatient (String patient, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM schedule WHERE patient LIKE '" + patient +"%' AND patient IS NULL");
        
        return result;
    }
}
