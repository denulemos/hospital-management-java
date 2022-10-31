/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Provider.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Denu
 */
public class DoctorController {
    
     public ResultSet getAllDoctors (Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM users WHERE specialty IS NOT NULL");
        
        return result;
    }
     
     public void addDoctor (String id, String fullname, String password, String specialty) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        statement.executeUpdate("INSERT INTO users VALUES('"+id+"', '"+fullname+"', '"+password+"', '"+specialty+"')");
    }
     
     public ResultSet getDoctorById (String id) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        ResultSet result = statement.executeQuery("SELECT * FROM users WHERE id LIKE '" + id +"%'");
        
        
        return result;
    }
     
      public ResultSet getDoctorBySpecialty (String specialty, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM users WHERE specialty LIKE '" + specialty +"%'");
        
        return result;
    }
}
