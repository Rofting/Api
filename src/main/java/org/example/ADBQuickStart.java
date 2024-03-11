import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ADBQuickStart {

    public static void main(String args[]) {
        // Database URL, username, and password
        final String DB_URL = "jdbc:oracle:thin:@//localhost:1521/XE";
        final String DB_USER = "JRODRIGUEZ";
        final String DB_PASSWORD = "12231223";

        // Establish the connection
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conectado a la base de datos");

            //Menu para CRUD
            Scanner scanner = new Scanner(System.in);
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
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        break;

                    case 0:
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                        ;
                }
            } while (option != 0) ;
            //En caso de error
        } catch (SQLException e) {
            System.out.println("Connection failed. Error: " + e.getMessage());
        }
    }
}
