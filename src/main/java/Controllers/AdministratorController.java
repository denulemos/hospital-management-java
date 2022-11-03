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
public class AdministratorController {
    public void addAdmin (String id, String name, String lastname, String password) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        statement.executeUpdate("INSERT INTO users  (`ID`, `Name`, `Lastname`, `Password`) VALUES('"+id+", '"+name+"', '"+lastname+"', '"+password+"')");
    }
}
