/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author Denu
 */
public class ScheduleController {

  Connection connection = ConnectionProvider.getConnection();

     public ResultSet getAvailableScheduleBySpecialty (String specialty) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM schedule WHERE specialty LIKE '" + specialty +"%' AND patient IS NULL");
        
        return result;
    }
     
     public ResultSet getScheduleByDoctor (String doctor) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM schedule WHERE doctor LIKE '" + doctor +"%");
        
        return result;
    }
     
          public ResultSet getFreeScheduleByDoctor (String doctor) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM schedule WHERE doctor LIKE '" + doctor +"%' AND patient IS NULL");
        
        return result;
    }
     
      public ResultSet getScheduleByDoctorByDates (String doctor, Date startDate, Date endDate) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet result;
        
        result = statement.executeQuery("SELECT * FROM schedule WHERE doctor LIKE '" + doctor + "%' AND date BETWEEN '"+ startDate +"' and '"+ endDate +"'");
        
        return result;
    }
     
     public ResultSet takeSchedule (String id) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet result;
        
         result = statement.executeQuery("INSERT INTO schedule (`taken`) VALUES (1) WHERE id = " + id);
        
        return result;
    }
     
      public ResultSet createSchedule (String doctor, String date) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet result;
        
         result = statement.executeQuery("INSERT INTO schedule (`doctor`, `date`) VALUES ("+ doctor + "," + date + ");");
        
        return result;
    }
     
     public ResultSet getScheduleByPatient (String patient) throws SQLException {
        Statement statement = connection.createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM schedule WHERE patient LIKE '" + patient +"%'");
        
        return result;
    }
}
