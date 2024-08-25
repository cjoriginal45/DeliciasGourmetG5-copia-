package grupo5.taller.restaurantdeliciasgourmet.persistencia;

import grupo5.taller.restaurantdeliciasgourmet.logica.Administrador;
import grupo5.taller.restaurantdeliciasgourmet.logica.Empleado;
import grupo5.taller.restaurantdeliciasgourmet.logica.Permiso;
import grupo5.taller.restaurantdeliciasgourmet.logica.Rol;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControlPersistencia {
    private String jdbcUrl;

    public ControlPersistencia() {
        jdbcUrl = "jdbc:sqlite:src/main/java/grupo5/taller/restaurantdeliciasgourmet/persistencia/db/usersdb.db";
    }
    

    public void createEmpleadoTable() {
    String dropSql = "DROP TABLE IF EXISTS Empleado;";
    String createSql = "CREATE TABLE IF NOT EXISTS Empleado (\n"
            + " idEmpleado INTEGER PRIMARY KEY,\n"
            + " rol TEXT NOT NULL,\n"
            + " permiso TEXT NOT NULL\n"
            + ");";

    try (Connection conn = DriverManager.getConnection(jdbcUrl);
         Statement stmt = conn.createStatement()) {
        
        stmt.execute(dropSql);
        System.out.println("Table 'Empleado' dropped successfully.");

        stmt.execute(createSql);
        System.out.println("Table 'Empleado' created successfully.");
        
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

    public String insertEmpleado(Empleado empleado) {
        String sql = "INSERT INTO Empleado(idEmpleado, rol, permiso) VALUES(?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(jdbcUrl);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, empleado.getIdEmpleado());
            pstmt.setString(2, empleado.getRol().toString());
            pstmt.setString(3, empleado.getPermiso().toString());

            pstmt.executeUpdate();
            return("Empleado creado.");
        } catch (SQLException e) {
            return(e.getMessage());
        }
    }

    public ArrayList<Empleado> retrieveEmpleados() {
        String sql = "SELECT * FROM Empleado";
        ArrayList<Empleado> empleados = new ArrayList<>();

        try (Connection conn = DriverManager.getConnection(jdbcUrl);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Integer idEmpleado = rs.getInt("idEmpleado");
                Rol rol = Rol.valueOf(rs.getString("rol"));
                Permiso permiso = Permiso.valueOf(rs.getString("permiso"));

                ArrayList<Administrador> administradores = new ArrayList<>();
                
                Empleado empleado = new Empleado(idEmpleado, rol, permiso);
                empleados.add(empleado);
            }

            System.out.println("Empleados retrieved successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return empleados;
    }
}
