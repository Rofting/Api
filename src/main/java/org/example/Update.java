import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

    public static void updateQuery(Connection connection, String query) {
        try (Statement statement = connection.createStatement()) {
            int rowsAffected = statement.executeUpdate(query);
            System.out.println("Filas afectadas: " + rowsAffected);
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta de actualización: " + e.getMessage());
        }
    }
}
