
package grupo5.taller.restaurantdeliciasgourmet.logica;
import java.util.ArrayList;

public class Maitre extends Empleado {
    
    private ArrayList<Cliente> clientes;

    public Maitre() {
    }

    public Maitre(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Maitre(ArrayList<Cliente> clientes, Integer idEmpleado, Rol rol, String correoElectronico, String contraseña) {
        super(idEmpleado, rol, correoElectronico, contraseña);
        this.clientes = clientes;
    }

    public Maitre(ArrayList<Cliente> clientes, Rol rol, String correoElectronico, String contraseña) {
        super(rol, correoElectronico, contraseña);
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Maitre{" + "clientes=" + clientes + '}';
    }
     
    
}
