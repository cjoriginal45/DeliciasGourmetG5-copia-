
package grupo5.taller.restaurantdeliciasgourmet.logica;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Administrador extends Empleado{
    private ArrayList<Reserva> reservas;
    private ArrayList<Reporte> reportes;
    private ArrayList<Horario> horarios;
    private ArrayList<Mesa> mesas;

    public Administrador() {
    }

    public Administrador(ArrayList<Reserva> reservas, ArrayList<Reporte> reportes, ArrayList<Horario> horarios, ArrayList<Mesa> mesas) {
        this.reservas = reservas;
        this.reportes = reportes;
        this.horarios = horarios;
        this.mesas = mesas;
    }

    public Administrador(ArrayList<Reserva> reservas, ArrayList<Reporte> reportes, ArrayList<Horario> horarios, ArrayList<Mesa> mesas, Integer idEmpleado, Rol rol, String correoElectronico, String contraseña) {
        super(idEmpleado, rol, correoElectronico, contraseña);
        this.reservas = reservas;
        this.reportes = reportes;
        this.horarios = horarios;
        this.mesas = mesas;
    }

    public Administrador(ArrayList<Reserva> reservas, ArrayList<Reporte> reportes, ArrayList<Horario> horarios, ArrayList<Mesa> mesas, Rol rol, String correoElectronico, String contraseña) {
        super(rol, correoElectronico, contraseña);
        this.reservas = reservas;
        this.reportes = reportes;
        this.horarios = horarios;
        this.mesas = mesas;
    }

    
    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public ArrayList<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(ArrayList<Reporte> reportes) {
        this.reportes = reportes;
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(ArrayList<Horario> horarios) {
        this.horarios = horarios;
    }

    public ArrayList<Mesa> getMesas() {
        return mesas;
    }

    public void setMesas(ArrayList<Mesa> mesas) {
        this.mesas = mesas;
    }
    
    public void crearEmpleado(String nombre,Rol rol,String correoElectronico, String contrasenia, String permiso){
        
    }
    
    public void asignarRolEmpleado(Empleado empleado, Rol rol){
        
    }
    
    public void eliminarEmpleado(Empleado empleado){
        
    }
    
   /* public List<Reporte> generarReporteReservas(LocalDate fechaInicio, LocalDate fechaFin){
        return;
    } */
    
    public void configurarHorarioEspecial(LocalDate fecha, LocalDate horaApertura, LocalDate horaCierre){
        
    }
    
    public void definirHorarioAperturaCierre(LocalDate horaApertura, LocalDate horaCierre){
        
    }
    
    public void bloquearfranjaHoraria(){
        
    }
    
    public void ajustarHorarioMesa(int numeroMesa, LocalDate horaInicio, LocalDate horaFin, boolean disponible){
        
    }
    
    public void quitarReservaLista(Reserva reserva){
        
    }
    
    public void agregarReservaLista(Reserva reserva){
        
    }
    
    public void gestionarReserva(int idReserva){
        
    }
    
}
