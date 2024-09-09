package grupo5.taller.restaurantdeliciasgourmet.logica;

import javax.persistence.*;

@Entity
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idEmpleado;
    
    private Rol rol;
    private String correoElectronico;
    private String contraseña;
    

    public Empleado() {
    }

    public Empleado(Integer idEmpleado, Rol rol, String correoElectronico, String contraseña) {
        this.idEmpleado = idEmpleado;
        this.rol = rol;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
    }

    public Empleado(Rol rol, String correoElectronico, String contraseña) {
        this.rol = rol;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
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

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void gestionarReserva(int idReservas){
        
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", rol=" + rol + ", correoElectronico=" + correoElectronico + ", contrase\u00f1a=" + contraseña + '}';
    }
   
    
    
    
}
