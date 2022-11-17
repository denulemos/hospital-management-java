package controllers;

import provider.ConnectionProvider;
import java.sql.SQLException;
import java.sql.Statement;


public class AdministratorController {
    public void addAdmin (String id, String name, String lastname, String password) throws SQLException {
        Statement statement = ConnectionProvider.getConnection().createStatement();
        statement.executeUpdate("INSERT INTO users  (`ID`, `Name`, `Lastname`, `Password`) VALUES('"+id+"', '"+name+"', '"+lastname+"', '"+password+"')");
    }
}
