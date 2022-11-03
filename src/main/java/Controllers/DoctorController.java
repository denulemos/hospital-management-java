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
     
     public void addDoctor (String id, String name, String lastname, String password, String specialty, int price) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        statement.executeUpdate("INSERT INTO users (`ID`, `Name`, `Lastname`, `Password`, `Specialty`, `Price`) VALUES('"+id+"', '"+name+"', '"+lastname+"', '"+password+"', '"+ specialty +"', "+price+")");
    }
    
     
      public ResultSet getDoctorBySpecialty (String specialty, Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM users WHERE specialty LIKE '" + specialty +"%'");
        
        return result;
    }
}
