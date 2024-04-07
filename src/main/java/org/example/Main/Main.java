package org.example.Main;

import java.sql.Connection; // Importar la clase Connection

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            DatabaseConnector connector = new DatabaseConnector();
            Connection connection = connector.getConnection();
            Menu menu = new Menu(connection);
            menu.showMenu();
            menu.closeScanner();
            connector.closeConnection();
        } catch (SQLException e) {
            System.out.println("Connection failed. Error: " + e.getMessage());
        }
    }
}
