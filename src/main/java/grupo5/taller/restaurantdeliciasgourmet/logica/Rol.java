
package grupo5.taller.restaurantdeliciasgourmet.logica;


public class Rol {
    private String nombreRol;
    private Empleado empleado;

    public Rol() {
    }

    public Rol(String nombreRol, Empleado empleado) {
        this.nombreRol = nombreRol;
        this.empleado = empleado;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Rol{" + "nombreRol=" + nombreRol + ", empleado=" + empleado + '}';
    }
    
    public void asignarRol(){
        
    }
    
}
