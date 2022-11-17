package controllers;

import provider.ConnectionProvider;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PatientController {
    
    public void addPatient (String id, String name, String lastname, String history, String gender) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        statement.executeUpdate("INSERT INTO patients VALUES('"+id+"', '"+lastname+"', '"+name+"', '"+history+"', '"+gender+"')");
    }
    public ResultSet getAllPatients (String id) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
         ResultSet result;
        
         result = statement.executeQuery("SELECT * FROM patients");
        
        return result;
    }
    
    public ResultSet searchPatient (String id, String name, String lastname) throws SQLException {
        ResultSet result;
        
        if (id.isEmpty()) {
            result = getPatientByName(name, lastname);
            return result;
        }
        if (name.isEmpty() && lastname.isEmpty()) {
            result = getPatientById(id);
            return result;
        }
        
        result = fullSearch(id, name, lastname);
        return result;
        
     }
    
     public ResultSet getPatientById (String id) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        ResultSet result;
        
        result = statement.executeQuery("SELECT * FROM patients WHERE ID LIKE '" + id +"%'");
        
        return result;
    }
     
     
     public ResultSet fullSearch (String id, String name, String lastname) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        ResultSet result;
        
        result = statement.executeQuery("SELECT * FROM patients WHERE ID LIKE '" + id +"%' AND Name LIKE '" + name +"%' AND Lastname LIKE '" + lastname + "%'");
        
        return result;
    }
     
      public ResultSet getPatientByName (String name, String lastname) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        ResultSet result;
        
        if (name.isEmpty() && !lastname.isEmpty()) {
            result = statement.executeQuery("SELECT * FROM patients WHERE Lastname LIKE '" + lastname +"%'");
            return result;
        }
        if (lastname.isEmpty() && !name.isEmpty()) {
            result = statement.executeQuery("SELECT * FROM patients WHERE Name LIKE '" + name +"%'");
            return result;
        }
        
        result = statement.executeQuery("SELECT * FROM patients WHERE Name LIKE '" + name +"%' AND Lastname LIKE '"+lastname+"%'");
        return result;
    }
      
     
      public void editPatient (String id, String name,  String lastname, String history) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        statement.executeUpdate("UPDATE patients SET lastname='" + lastname + "', name='" + name + "', history='" + history + "' WHERE (ID = '" + id + "')");
        
    }
}
