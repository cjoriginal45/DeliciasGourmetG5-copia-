
package grupo5.taller.restaurantdeliciasgourmet.logica;
import java.util.ArrayList;

public class Rol {
    private String nombreRol;
    private ArrayList<Empleado> empleados;
    private ArrayList<Permiso> permisos;

    public Rol() {
    }

    public Rol(String nombreRol, ArrayList<Empleado> empleados) {
        this.nombreRol = nombreRol;
        this.empleados = empleados;
    }

    public Rol(String nombreRol, ArrayList<Empleado> empleados, ArrayList<Permiso> permisos) {
        this.nombreRol = nombreRol;
        this.empleados = empleados;
        this.permisos = permisos;
    }

    public ArrayList<Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(ArrayList<Permiso> permisos) {
        this.permisos = permisos;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleados;
    }

    public void setEmpleado(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "Rol{" + "nombreRol=" + nombreRol + ", empleado=" + empleados + '}';
    }
    
    public void asignarRol(){
        
    }
    
}
