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
    private TarjetaCredito tarjeta;
    private Mesa mesa;
    private Cliente cliente;
    private ArrayList<Recepcionista> recepcionistas;
    private ArrayList<String> intolerancias;
    private ArrayList<Administrador> administradores;
    private int multa;
    
    public Reserva() {
    }

    public Reserva(int idReserva, LocalDate fechaReserva, LocalTime horaInicio, LocalTime horaFin, EstadoReserva estadoReserva, TarjetaCredito tarjeta, Mesa mesa, Cliente cliente, ArrayList<Recepcionista> recepcionistas, ArrayList<String> intolerancias, ArrayList<Administrador> administradores, int multa) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estadoReserva = estadoReserva;
        this.tarjeta = tarjeta;
        this.mesa = mesa;
        this.cliente = cliente;
        this.recepcionistas = recepcionistas;
        this.intolerancias = intolerancias;
        this.administradores = administradores;
        this.multa = multa;
    }

    public Reserva(LocalDate fechaReserva, LocalTime horaInicio, LocalTime horaFin, EstadoReserva estadoReserva, TarjetaCredito tarjeta, Mesa mesa, Cliente cliente, ArrayList<Recepcionista> recepcionistas, ArrayList<String> intolerancias, ArrayList<Administrador> administradores, int multa) {
        this.fechaReserva = fechaReserva;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.estadoReserva = estadoReserva;
        this.tarjeta = tarjeta;
        this.mesa = mesa;
        this.cliente = cliente;
        this.recepcionistas = recepcionistas;
        this.intolerancias = intolerancias;
        this.administradores = administradores;
        this.multa = multa;
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

    public ArrayList<String> getIntolerancias() {
        return intolerancias;
    }

    public void setIntolerancias(ArrayList<String> intolerancias) {
        this.intolerancias = intolerancias;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", fechaReserva=" + fechaReserva + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", estadoReserva=" + estadoReserva + ", tarjeta=" + tarjeta + ", mesa=" + mesa + ", cliente=" + cliente + ", recepcionistas=" + recepcionistas + ", intolerancias=" + intolerancias + ", administradores=" + administradores + ", multa=" + multa + '}';
    }


    
}