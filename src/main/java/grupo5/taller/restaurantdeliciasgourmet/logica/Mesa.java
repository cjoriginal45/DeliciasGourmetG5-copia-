
package grupo5.taller.restaurantdeliciasgourmet.logica;
import java.time.LocalDate;
import java.util.ArrayList;

public class Mesa {
        private int numeroMesa;
        private int capacidad;
        private String ubicacion;
        private boolean disponibilidad;
        private ArrayList<Reserva> reservas;
        private ArrayList<Administrador> administradores;
        
    public Mesa() {
    }

    public Mesa(int numeroMesa, int capacidad, String ubicacion, boolean disponibilidad, ArrayList<Reserva> reservas, ArrayList<Horario> horarios, ArrayList<Administrador> administradores) {
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.disponibilidad = disponibilidad;
        this.reservas = reservas;
        this.administradores = administradores;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numeroMesa=" + numeroMesa + ", capacidad=" + capacidad + ", ubicacion=" + ubicacion + ", disponibilidad=" + disponibilidad + ", reservas=" + reservas + ", administradores=" + administradores + '}';
    }

    
    public void bloquearMesa(){
        
    }
    
    public void desbloquearMesa(){
        
    }
    
    public void configurarMesa(int numeroMesa, int capacidad, boolean disponibilidad, String ubicacion){
        
    }
    
    public void actualizarEstado(boolean disponibilidad){
        
    }
    
    public void mostrarDisponibilidad(LocalDate fecha){
        
    }
}
