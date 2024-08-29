package grupo5.taller.restaurantdeliciasgourmet.logica;

import java.io.Serializable;
import javax.persistence.*;
@Entity
public class Empleado extends Persona implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Integer idEmpleado;
    @Enumerated(EnumType.STRING)
    private Rol rol;
    @Enumerated(EnumType.STRING)
    private Permiso permiso;

    public Empleado() {
    }


    public Empleado(String nombre, String nombreUsuario, String contrasenia, String correo, String telefono, Rol rol, Permiso permisos) {
        setNombre(nombre);
        setNombreUsuario(nombreUsuario);
        setContrasenia(contrasenia);
        setCorreoElectronico(correo);
        setTelefono(telefono);
    }
    @Override
    public String getNombre() {
    return super.getNombre();
}

    @Override
    public void setNombre(String nombre) {
    super.setNombre(nombre);
}

    @Override
    public String getNombreUsuario() {
    return super.getNombreUsuario();
}

    @Override
    public void setNombreUsuario(String nombreUsuario) {
    super.setNombreUsuario(nombreUsuario);
}

    @Override
    public String getContrasenia() {
    return super.getContrasenia();
}

    @Override
    public void setContrasenia(String contrasenia) {
    super.setContrasenia(contrasenia);
}

    @Override
    public String getCorreoElectronico() {
    return super.getCorreoElectronico();
}

    @Override
    public void setCorreoElectronico(String correoElectronico) {
    super.setCorreoElectronico(correoElectronico);
}

    @Override
    public String getTelefono() {
    return super.getTelefono();
}

    @Override
    public void setTelefono(String telefono) {
    super.setTelefono(telefono);
}

    
    public Empleado(int idEmpleado, String nombre, String nombreUsuario, String contrasenia, String correo, String telefono, Rol rol, Permiso permisos) {
        this.idEmpleado = idEmpleado;
        setNombre(nombre);
        setNombreUsuario(nombreUsuario);
        setContrasenia(contrasenia);
        setCorreoElectronico(correo);
        setTelefono(telefono);
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
