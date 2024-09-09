
package grupo5.taller.restaurantdeliciasgourmet.logica;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Mesa {
        private int numeroMesa;
        private int capacidad;
        private String ubicacion;
        private boolean disponibilidad;
        private ArrayList<Reserva> reservas;
        private ArrayList<Horario> horarios;
        private ArrayList<Administrador> administradores;
        
    public Mesa() {
    }

    public Mesa(int numeroMesa, int capacidad, String ubicacion, boolean disponibilidad, ArrayList<Reserva> reservas, ArrayList<Horario> horarios, ArrayList<Administrador> administradores) {
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.disponibilidad = disponibilidad;
        this.reservas = reservas;
        this.horarios = horarios;
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

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numeroMesa=" + numeroMesa + ", capacidad=" + capacidad + ", ubicacion=" + ubicacion + ", disponibilidad=" + disponibilidad + ", reservas=" + reservas + ", horarios=" + horarios + ", administradores=" + administradores + '}';
    }
    
    public void filtrarCapacidad(){
        
    }
   
    public void filtrarUbicacion(){
        
    }
    
    public void bloquearMesa(){
        
    }
    
    public void bloquearMesas(){
        
    }
    
    public void configurarMesa(int numeroMesa, int capacidad, boolean disponibilidad, String ubicacion){
        
    }
    
    public void actualizarEstado(boolean disponibilidad){
        
    }
    
    public void mostrarDisponibilidad(LocalDate fecha){
        
    }
}
