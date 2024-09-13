/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo5.taller.restaurantdeliciasgourmet.logica;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class Recepcionista extends Empleado{
    private ArrayList<Reserva> reservas;


    public Recepcionista(){
        
    }
    public Recepcionista(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    
   
    
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }    
    
    
    public void asignarMesa(int idReserva, int numeroMesa){
        
    }
    
    public void recibirCliente(){
        
    }
}
