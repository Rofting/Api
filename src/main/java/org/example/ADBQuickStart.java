import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ADBQuickStart {

    public static void main(String args[]) {
        // Database URL, username, and password
        final String DB_URL = "jdbc:oracle:thin:@//192.168.1.95:1521/XE";
        final String DB_USER = "JRODRIGUEZ";
        final String DB_PASSWORD = "12231223";

        // Establish the connection
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            System.out.println("Conectado a la base de datos");

            // Perform database operations
            Update.updateQuery(conn, "UPDATE DATOS SET CITY = 'Valencia' WHERE INVOICE_ID = '642-32-2990'");
        } catch (SQLException e) {
            System.out.println("Connection failed. Error: " + e.getMessage());
        }
    }
}
