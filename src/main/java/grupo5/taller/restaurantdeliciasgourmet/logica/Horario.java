
package grupo5.taller.restaurantdeliciasgourmet.logica;

import java.time.LocalDate;
import java.util.ArrayList;


public class Horario {
    private LocalDate fecha;
    private LocalDate horaDesde;
    private LocalDate horaHasta;
    private LocalDate horarioApertura;
    private LocalDate horarioCierre;
    private ArrayList<Reserva> reservas;
    private ArrayList<Mesa> mesas;
    private ArrayList<Administrador> administradores;

    public Horario() {
    }

    public Horario(LocalDate fecha, LocalDate horaDesde, LocalDate horaHasta, LocalDate horarioApertura, LocalDate horarioCierre, ArrayList<Reserva> reservas, ArrayList<Mesa> mesas, ArrayList<Administrador> administradores) {
        this.fecha = fecha;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.reservas = reservas;
        this.mesas = mesas;
        this.administradores = administradores;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(LocalDate horaDesde) {
        this.horaDesde = horaDesde;
    }

    public LocalDate getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(LocalDate horaHasta) {
        this.horaHasta = horaHasta;
    }

    public LocalDate getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalDate horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalDate getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalDate horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    @Override
    public String toString() {
        return "Horario{" + "fecha=" + fecha + ", horaDesde=" + horaDesde + ", horaHasta=" + horaHasta + ", horarioApertura=" + horarioApertura + ", horarioCierre=" + horarioCierre + ", reservas=" + reservas + ", mesas=" + mesas + ", administradores=" + administradores + '}';
    }
    
    
}
