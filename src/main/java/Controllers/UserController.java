package Controllers;

import Models.UserModel;
import Provider.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Denu
 */
public class UserController {
    
   public static UserModel currentUser;
   
   public ResultSet loginUser (String id, String password) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        ResultSet result;
        
        result = statement.executeQuery("SELECT * FROM users WHERE id LIKE '" + id + "' AND password LIKE '" + password + "';");
        
        return result;
    }
   
    public void addUser (String id, String fullname, String password) throws SQLException {
        int idNumber = Integer.parseInt(id);
        Statement statement = ConnectionProvider.getConnection().createStatement();
        statement.executeUpdate("INSERT INTO users VALUES("+idNumber+", '"+fullname+"', '"+password+"', "+null+")");
    }
    
    public ResultSet getUserById (String id) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        ResultSet result;
        
        result = statement.executeQuery("SELECT * FROM users WHERE id LIKE '" + id + "';");
        
        return result;
    }
  
   public static UserModel setGlobalUser (String name, String lastname, String id, String specialty, int price) {
       UserModel user = new UserModel(name, lastname, id, specialty, price);
       currentUser = user;
       return user;
   }

   
   
}
