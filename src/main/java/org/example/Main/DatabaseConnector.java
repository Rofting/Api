package org.example.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
    private final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/XE";
    private final String DB_USER = "JRODRIGUEZ";
    private final String DB_PASSWORD = "12231223";
    private Connection connection;

    public DatabaseConnector() throws SQLException {
        this.connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public Connection getConnection() {
        return this.connection;
    }

    public void closeConnection() throws SQLException {
        if (this.connection != null) {
            this.connection.close();
        }
    }
}
private