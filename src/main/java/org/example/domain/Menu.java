package org.example.domain;
import org.example.dao.UsuarioDao;

import java.util.Scanner;
import java.sql.Connection;

import org.example.domain.Usuario;
import org.jdbi.v3.core.Jdbi;

public class Menu {
    private final Scanner scanner;
    private Connection connection;
    private final UsuarioDao usuarioDao;

    public Menu(Jdbi jdbi) {
        this.usuarioDao = new UsuarioDao(jdbi);
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
                    createUser();
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

    private void createUser() {
        try {
            // Datos del nuevo usuario
            String nombreUsuario = "ejemplo";
            String apellidoUsuario = "ejemplo";
            String email = "ejemplo@example.com";
            String contrasena = "123456";
            float altura = 175.5F;
            float peso = 70.0F;

            // Crear una instancia de java.sql.Date a partir de una fecha en formato String
            java.sql.Date fechaNacimiento = java.sql.Date.valueOf("1990-01-01");

            // Crear una instancia de Usuario con los datos proporcionados
            Usuario usuario = new Usuario(-1, nombreUsuario, apellidoUsuario, email, contrasena, altura, peso, fechaNacimiento);

            // Llamar al método createUser del usuarioDao para insertar el nuevo usuario en la base de datos
            usuarioDao.createUser(usuario);

            System.out.println("Usuario creado con éxito.");
        } catch (Exception e) {
            System.out.println("Error al crear el usuario: " + e.getMessage());
        }
    }



    private void readRecords() {
        // Lógica para leer registros
    }


        private void updateRecord()  {}   /*{
        try {
          Usuario usuario = new Usuario(/*Proporciona los datos del usuario a actualizar aquí* /);
        userDao.updateUser(usuario);
        System.out.println("Usuario actualizado con éxito.");
        } catch (SQLException e) {
          System.out.println("Error al actualizar el usuario: " + e.getMessage());
        }
        }
        */


    private void deleteRecord() {
        // Lógica para eliminar un registro
    }

    public void closeScanner() {
        this.scanner.close();
    }
}
