/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Provider;

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
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaladministration", "root", "root");
            return connection;
        }
        catch (Exception e) {
            return null;
        }
    }
}
