package controllers;

import models.UserModel;
import provider.ConnectionProvider;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
       UserModel user = new UserModel(name, lastname, id, specialty, price, null);
       currentUser = user;
       return user;
   }

   
   
}
