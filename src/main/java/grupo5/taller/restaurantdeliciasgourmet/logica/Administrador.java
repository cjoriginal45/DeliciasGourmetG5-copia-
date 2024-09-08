
package grupo5.taller.restaurantdeliciasgourmet.logica;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Administrador extends Empleado{
    private ArrayList<Empleado> empleados;

    public Administrador() {
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    
    public void bloquearMesa(int mesaId,LocalTime fecha){
        
    }
    
    public void crearEmpleado(String nombre,Rol rol,String correoElectronico,String telefono
                               , String contrasenia, Permiso permiso){
        
    }
    
    public void asignarRolEmpleado(int idEmpleado){
        
    }
    
    public void desbloquearMesa(int mesaId, LocalTime fecha){
        
    }
    
    public void eliminarEmpleado(int idEmpleado){
        
    }
    
    public void generarReporteReservas(){
        
    }
    
    
}
