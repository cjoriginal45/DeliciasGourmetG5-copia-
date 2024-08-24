/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo5.taller.restaurantdeliciasgourmet.logica;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre;
    private String correoElectronico;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String correoElectronico, String telefono) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", correoElectronico=" + correoElectronico + ", telefono=" + telefono + '}';
    }
    
    
}
