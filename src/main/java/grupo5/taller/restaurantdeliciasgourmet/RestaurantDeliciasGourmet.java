/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package grupo5.taller.restaurantdeliciasgourmet;

import grupo5.taller.restaurantdeliciasgourmet.logica.Empleado;
import grupo5.taller.restaurantdeliciasgourmet.logica.Permiso;
import grupo5.taller.restaurantdeliciasgourmet.logica.Rol;
import grupo5.taller.restaurantdeliciasgourmet.persistencia.ControlPersistencia;
import grupo5.taller.restaurantdeliciasgourmet.swing.windows.Login;
import java.sql.*;
import javax.swing.SwingUtilities;



/**
 *
 * @author grupo5
 */
public class RestaurantDeliciasGourmet {
    public static ControlPersistencia cp;
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:sqlite:src/main/java/grupo5/taller/restaurantdeliciasgourmet/persistencia/db/usersdb.db";
       SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
            
        });
       try (Connection conn = DriverManager.getConnection(jdbcUrl)) {
            if (conn != null) { 
                System.out.println("Conectado al SQLite!");
                cp = new ControlPersistencia();
                cp.createEmpleadoTable();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       Empleado a = new Empleado(23,Rol.RECEPCIONISTA,Permiso.PERMISO_COMPLETO);
       Empleado b = new Empleado(24,Rol.ADMIN,Permiso.PERMISO_COMPLETO);
       Empleado c = new Empleado(25,Rol.MAITRE,Permiso.PERMISO_COMPLETO);
    }
}

