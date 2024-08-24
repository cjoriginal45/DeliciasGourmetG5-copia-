
package grupo5.taller.restaurantdeliciasgourmet.logica;

import java.util.ArrayList;

public class Empleado extends Persona {

    private Integer idEmpleado;
    private Rol rol;
    private Permiso permiso;
    private ArrayList<Administrador> administradores;

    public Empleado() {
    }

    public Empleado(Integer idEmpleado, Rol rol, Permiso permiso, ArrayList<Administrador> administradores) {
        this.idEmpleado = idEmpleado;
        this.rol = rol;
        this.permiso = permiso;
        this.administradores = administradores;
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

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", rol=" + rol + ", permiso=" + permiso + ", administradores=" + administradores + '}';
    }

}
