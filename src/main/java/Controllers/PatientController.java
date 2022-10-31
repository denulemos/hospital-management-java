/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Provider.ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Denu
 */
public class PatientController {
    
    public void addPatient (String id, String fullname, String birthday, String history, String gender) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        statement.executeUpdate("INSERT INTO patients VALUES('"+fullname+"', '"+id+"', '"+birthday+"', '"+history+"', '"+gender+"')");
    }
    public ResultSet getAllPatients (String id, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM patients");
        
        return result;
    }
    
     public ResultSet getPatientById (String id, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM patients WHERE ID LIKE '" + id +"%'");
        
        return result;
    }
}
