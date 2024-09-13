/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo5.taller.restaurantdeliciasgourmet.logica;

/**
 *
 * @author Usuario
 * ELIMINAR CLASE
 */
public class Permiso {
    private String tipoPermiso;
    private Rol rol;
    
    public Permiso() {
    }

    public Permiso(String tipoPermiso, Rol rol) {
        this.tipoPermiso = tipoPermiso;
        this.rol = rol;
    }

    public String getTipoPermiso() {
        return tipoPermiso;
    }

    public void setTipoPermiso(String tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }


}
