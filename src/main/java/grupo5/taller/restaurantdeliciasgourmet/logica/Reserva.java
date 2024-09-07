/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo5.taller.restaurantdeliciasgourmet.logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

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
    private TarjetaCredito tarjeta;
    private Mesa mesa;
    private Cliente cliente;
    private ArrayList<Recepcionista> recepcionistas;
    private Horario horario;
    private ArrayList<String> intolerancias;
    private ArrayList<Reporte> reportes;
    private ArrayList<Administrador> administradores;
    //faltarian agregar mas atributos

    public Reserva() {
    }

    public Reserva(int idReserva, LocalDate fechaReserva, LocalTime horaInicio, LocalTime horaFin, EstadoReserva estadoReserva, TarjetaCredito tarjeta, Mesa mesa, Cliente cliente, ArrayList<Recepcionista> recepcionistas, Horario horario, ArrayList<String> intolerancias, ArrayList<Reporte> reportes, ArrayList<Administrador> administradores) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estadoReserva = estadoReserva;
        this.tarjeta = tarjeta;
        this.mesa = mesa;
        this.cliente = cliente;
        this.recepcionistas = recepcionistas;
        this.horario = horario;
        this.intolerancias = intolerancias;
        this.reportes = reportes;
        this.administradores = administradores;
    }

    public Reserva(LocalDate fechaReserva, LocalTime horaInicio, LocalTime horaFin, EstadoReserva estadoReserva, TarjetaCredito tarjeta, Mesa mesa, Cliente cliente, ArrayList<Recepcionista> recepcionistas, Horario horario, ArrayList<String> intolerancias, ArrayList<Reporte> reportes, ArrayList<Administrador> administradores) {
        this.fechaReserva = fechaReserva;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estadoReserva = estadoReserva;
        this.tarjeta = tarjeta;
        this.mesa = mesa;
        this.cliente = cliente;
        this.recepcionistas = recepcionistas;
        this.horario = horario;
        this.intolerancias = intolerancias;
        this.reportes = reportes;
        this.administradores = administradores;
    }
    
}
