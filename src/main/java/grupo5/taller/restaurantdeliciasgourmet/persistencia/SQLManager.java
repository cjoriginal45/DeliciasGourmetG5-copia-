package grupo5.taller.restaurantdeliciasgourmet.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLManager {
    private static final String JDBC_URL = "jdbc:sqlite:src/main/java/grupo5/taller/restaurantdeliciasgourmet/persistencia/db/usersdb.db";

    public static final String CREATE_EMPLEADO_TABLE = "CREATE TABLE IF NOT EXISTS Empleado (" +
            "idEmpleado INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "nombre TEXT NOT NULL, " +
            "nombreUsuario TEXT NOT NULL, " +
            "contrasenia TEXT NOT NULL, " +
            "correoElectronico TEXT NOT NULL, " +
            "telefono TEXT NOT NULL, " +
            "rol TEXT NOT NULL, " +
            "permiso TEXT NOT NULL);";

    public static void createDatabaseAndTables() {
        try (Connection conn = DriverManager.getConnection(JDBC_URL);
             Statement stmt = conn.createStatement()) {
            
            stmt.execute(CREATE_EMPLEADO_TABLE);
            System.out.println("Tabla Empleado creada.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getJdbcUrl() {
        return JDBC_URL;
    }
}
