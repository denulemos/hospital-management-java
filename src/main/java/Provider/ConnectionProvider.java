/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Provider;

import Utils.Constants;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Denu
 */
public class ConnectionProvider {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(Constants.CONNECTION_PATH, Constants.DB_USER, Constants.DB_PASSWORD);
            return connection;
        }
        catch (Exception e) {
            return null;
        }
    }
}
