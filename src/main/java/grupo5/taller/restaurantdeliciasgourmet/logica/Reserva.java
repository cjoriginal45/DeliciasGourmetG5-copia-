/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo5.taller.restaurantdeliciasgourmet.logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author guard
 */
public class Reserva {
    private int idReserva;
    private LocalDate fechaReserva;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private EstadoReserva estadoReserva;
    private String motivo;
    private TarjetaCredito tarjeta;
    private Mesa mesa;
    private Cliente cliente;
    private ArrayList<Recepcionista> recepcionistas;
    private GestionHorario gestionarHorario;
    
    //faltarian agregar mas atributos
    
    private void realizarComentario(){
        
    }
    
    private void enviarRecordatorio(){
        
    }
    
    private void cobrarMulta(TarjetaCredito tarjeta, EstadoReserva estado){
        
    }
    
    private void verReservasPorCliente(int clienteId){
        
    }
    
    private void modificarReserva(int idReserva, LocalTime fechaReserva, Mesa nuevaMesa){
        
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDate fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Recepcionista> getRecepcionistas() {
        return recepcionistas;
    }

    public void setRecepcionistas(ArrayList<Recepcionista> recepcionistas) {
        this.recepcionistas = recepcionistas;
    }

    public GestionHorario getGestionarHorario() {
        return gestionarHorario;
    }

    public void setGestionarHorario(GestionHorario gestionarHorario) {
        this.gestionarHorario = gestionarHorario;
    }
    
    
    
    
}
