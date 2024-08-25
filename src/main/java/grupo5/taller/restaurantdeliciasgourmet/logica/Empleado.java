
package grupo5.taller.restaurantdeliciasgourmet.logica;

import grupo5.taller.restaurantdeliciasgourmet.RestaurantDeliciasGourmet;
import java.util.ArrayList;

public class Empleado extends Persona {

    private Integer idEmpleado;
    private Rol rol;
    private Permiso permiso;

    public Empleado() {
    }

    public Empleado(Integer idEmpleado, Rol rol, Permiso permisos) {
        this.idEmpleado = idEmpleado;
        this.rol = rol;
        this.permiso = permisos;
        RestaurantDeliciasGourmet.cp.insertEmpleado(this);
    }
    private void insertEmpleado(){
        
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Permiso getPermiso() {
        return permiso;
    }

    public void setPermiso(Permiso permiso) {
        this.permiso = permiso;
    }


    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", rol=" + rol + ", permiso=" + permiso + '}';
    }

}
