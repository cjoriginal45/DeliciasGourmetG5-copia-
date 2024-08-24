/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo5.taller.restaurantdeliciasgourmet.logica;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Administrador {
    private ArrayList<Empleado> empleados;

    public Administrador() {
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    
    public void bloquearMesa(int mesaId,LocalTime fecha){
        
    }
    
    public void crearEmpleado(String nombre,Rol rol,String correoElectronico,String telefono
                               , String contrasenia, Permiso permiso){
        
    }
    
    public void asignarRolEmpleado(int idEmpleado){
        
    }
    
    public void desbloquearMesa(int mesaId, LocalTime fecha){
        
    }
    
    public void eliminarEmpleado(int idEmpleado){
        
    }
    
    public void generarReporteReservas(){
        
    }
    
    
}
