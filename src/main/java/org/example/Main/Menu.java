package org.example.Main;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;

public class Menu {
    private Scanner scanner;
    private Connection connection;

    public Menu(Connection connection) {
        this.connection = connection;
        this.scanner = new Scanner(System.in);
    }

    public void showMenu() {
        int option;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Crear registro");
            System.out.println("2. Leer registros");
            System.out.println("3. Actualizar registro");
            System.out.println("4. Eliminar registro");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    createRecord();
                    break;
                case 2:
                    readRecords();
                    break;
                case 3:
                    updateRecord();
                    break;
                case 4:
                    deleteRecord();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (option != 0);
    }

    private void createRecord() {

    }

    private void readRecords() {
        // Lógica para leer registros
    }

    private void updateRecord() {
        // Lógica para actualizar un registro
    }

    private void deleteRecord() {
        // Lógica para eliminar un registro
    }

    public void closeScanner() {
        this.scanner.close();
    }
}
