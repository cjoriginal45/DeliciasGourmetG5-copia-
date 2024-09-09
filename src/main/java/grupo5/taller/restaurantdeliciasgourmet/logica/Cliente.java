
package grupo5.taller.restaurantdeliciasgourmet.logica;
import java.util.ArrayList;

public class Cliente { 
    
    private int clienteId;
    private String telefono;
    private String nombre;
    private String contraseña;
    private String correoElectronico;
    private ArrayList<Reserva> reservas;
    private ArrayList<Maitre> maitres;
    
    
    public Cliente() {
    }

    public Cliente(int clienteId, String telefono, String nombre, String contraseña, String correoElectronico, ArrayList<Reserva> reservas, ArrayList<Maitre> maitres) {
        this.clienteId = clienteId;
        this.telefono = telefono;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.correoElectronico = correoElectronico;
        this.reservas = reservas;
        this.maitres = maitres;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public ArrayList<Maitre> getMaitres() {
        return maitres;
    }

    public void setMaitres(ArrayList<Maitre> maitres) {
        this.maitres = maitres;
    }

    @Override
    public String toString() {
        return "Cliente{" + "clienteId=" + clienteId + ", telefono=" + telefono + ", nombre=" + nombre + ", contrase\u00f1a=" + contraseña + ", correoElectronico=" + correoElectronico + ", reservas=" + reservas + ", maitres=" + maitres + '}';
    }
    
 
    
}
