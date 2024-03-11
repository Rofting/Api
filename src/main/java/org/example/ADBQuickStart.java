import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

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
            doSQLWork(conn);
        } catch (SQLException e) {
            System.out.println("Connection failed. Error: " + e.getMessage());
        }
    }

    /*
     * Selects 20 rows from the DATOS table.
     */
    private static void doSQLWork(Connection conn) {
        String queryStatement = "SELECT INVOICE_ID, BRANCH, CITY, CUSTOMER_TYPE, GENDER, " +
                "PRODUCT_LINE, UNIT_PRICE, QUANTITY, TAX_5, TOTAL, DATES, " +
                "TIME, PAYMENT, COGS, GROSS_MARGIN_PERCENTAGE, GROSS_INCOME, RATING " +
                "FROM DATOS WHERE ROWNUM < 11";

        System.out.println("\nQuery: " + queryStatement);

        // Prepare and execute the SQL statement
        try (Statement statement = conn.createStatement();
             ResultSet resultSet = statement.executeQuery(queryStatement)) {
            // Print the results
            while (resultSet.next()) {
                System.out.println("INVOICE_ID: " + resultSet.getString("INVOICE_ID"));
                // Print other columns similarly
            }
        } catch (SQLException e) {
            System.out.println("SQL execution failed. Error: " + e.getMessage());
        }
    }
}
