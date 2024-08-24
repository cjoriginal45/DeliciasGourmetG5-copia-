/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo5.taller.restaurantdeliciasgourmet.logica;
import grupo5.taller.restaurantdeliciasgourmet.logica.Reserva;
import java.util.ArrayList;
/**
 *
 * @author guard
 */
public class TarjetaCredito {
    private String nombreTitular;
    private String emisor;
    private String numeroTarjeta;
    private String codigoVerificacion;
    private ArrayList<Reserva> reservas;

    public TarjetaCredito() {
    }
    
    public TarjetaCredito(String nombreTitular, String emisor, String numeroTarjeta, String codigoVerificacion, ArrayList<Reserva> reservas) {
        this.nombreTitular = nombreTitular;
        this.emisor = emisor;
        this.numeroTarjeta = numeroTarjeta;
        this.codigoVerificacion = codigoVerificacion;
        this.reservas = reservas;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }

    public void setCodigoVerificacion(String codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }

    public ArrayList<Reserva> getLista_reserva() {
        return reservas;
    }

    public void setLista_reserva(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "nombreTitular=" + nombreTitular + ", emisor=" + emisor + ", numeroTarjeta=" + numeroTarjeta + ", codigoVerificacion=" + codigoVerificacion + ", reservas=" + reservas + '}';
    }
    
    
    
    
}
