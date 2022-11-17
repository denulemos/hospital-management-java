package provider;

import utils.Constants;
import java.sql.Connection;
import java.sql.DriverManager;


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
