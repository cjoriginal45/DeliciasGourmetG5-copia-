
package grupo5.taller.restaurantdeliciasgourmet.logica;

import java.time.LocalDate;
import java.util.ArrayList;


public class Horario {
    private LocalDate fecha;
    private LocalDate horarioApertura;
    private LocalDate horarioCierre;
    private ArrayList<Administrador> administradores;

    public Horario() {
    }

    public Horario(LocalDate fecha, LocalDate horaDesde, LocalDate horaHasta, LocalDate horarioApertura, LocalDate horarioCierre, ArrayList<Reserva> reservas, ArrayList<Mesa> mesas, ArrayList<Administrador> administradores) {
        this.fecha = fecha;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.administradores = administradores;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    public ArrayList<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(ArrayList<Administrador> administradores) {
        this.administradores = administradores;
    }

    @Override
    public String toString() {
        return "Horario{" + "fecha=" + fecha + ", horarioApertura=" + horarioApertura + ", horarioCierre=" + horarioCierre + ", administradores=" + administradores + '}';
    }


    
}
