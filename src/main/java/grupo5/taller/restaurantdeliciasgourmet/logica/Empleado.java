
package grupo5.taller.restaurantdeliciasgourmet.logica;

import grupo5.taller.restaurantdeliciasgourmet.RestaurantDeliciasGourmet;

public class Empleado extends Persona {

    private Integer idEmpleado;
    private Rol rol;
    private Permiso permiso;

    public Empleado() {
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    @Override
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    @Override
    public String getContrasenia() {
        return contrasenia;
    }

    @Override
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    @Override
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado(String nombre, String nombreUsuario, String contrasenia, String correo, String telefono, Rol rol, Permiso permisos) { //Este se usa para crear empleados.
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia= contrasenia;
        this.correoElectronico = correo;
        this.telefono = telefono;
        this.rol = rol;
        this.permiso = permisos;
        RestaurantDeliciasGourmet.getEmpleadoDAO().insertEmpleado(this);
    }
    
    public Empleado(int idEmpleado, String nombre, String nombreUsuario, String contrasenia, String correo, String telefono, Rol rol, Permiso permisos) { //Este se usa para generar la view en la lista.
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasenia= contrasenia;
        this.correoElectronico = correo;
        this.telefono = telefono;
        this.rol = rol;
        this.permiso = permisos;
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
