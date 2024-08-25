/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package grupo5.taller.restaurantdeliciasgourmet;

import grupo5.taller.restaurantdeliciasgourmet.logica.Empleado;
import grupo5.taller.restaurantdeliciasgourmet.logica.Permiso;
import grupo5.taller.restaurantdeliciasgourmet.logica.Rol;
import grupo5.taller.restaurantdeliciasgourmet.persistencia.EmpleadoDAO;
import grupo5.taller.restaurantdeliciasgourmet.persistencia.GenericDAO;
import grupo5.taller.restaurantdeliciasgourmet.persistencia.SQLManager;
import grupo5.taller.restaurantdeliciasgourmet.swing.windows.Login;
import java.sql.*;
import javax.swing.SwingUtilities;



/**
 *
 * @author grupo5
 */
public class RestaurantDeliciasGourmet {
    private static GenericDAO genericDAO;
    private static EmpleadoDAO empleadoDAO;
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
                genericDAO = new GenericDAO();
                empleadoDAO = new EmpleadoDAO();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       SQLManager.createDatabaseAndTables();
       Empleado c = new Empleado("Tomi", "Omeprazol", "contra123","Tomi@correo.com","Tomi54345",Rol.ADMIN,Permiso.PERMISO_COMPLETO);
       System.out.println(empleadoDAO.retrieveEmpleados().toString());
       
    }

    public static GenericDAO getGenericDAO() {
        return genericDAO;
    }

    public static void setGenericDAO(GenericDAO genericDAO) {
        RestaurantDeliciasGourmet.genericDAO = genericDAO;
    }

    public static EmpleadoDAO getEmpleadoDAO() {
        return empleadoDAO;
    }

    public static void setEmpleadoDAO(EmpleadoDAO empleadoDAO) {
        RestaurantDeliciasGourmet.empleadoDAO = empleadoDAO;
    }
}

