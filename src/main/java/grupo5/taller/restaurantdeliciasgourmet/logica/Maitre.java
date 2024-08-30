
package grupo5.taller.restaurantdeliciasgourmet.logica;
import java.util.ArrayList;

public class Maitre extends Empleado {
    
    private ArrayList<Cliente> clientes;

    public Maitre(){
        
    }

    public Maitre(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Maitre(ArrayList<Cliente> clientes, int idEmpleado, String nombre, String nombreUsuario, String contrasenia, String correo, String telefono, Rol rol, Permiso permisos) {
        super(idEmpleado, nombre, nombreUsuario, contrasenia, correo, telefono, rol, permisos);
        this.clientes = clientes;
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
        
    
    public void coordinarConCocina(){
    
    }
    public void supervisarPersonal(){
    
    }
    public void gestionarQuejas(){
    
    }
    
}
