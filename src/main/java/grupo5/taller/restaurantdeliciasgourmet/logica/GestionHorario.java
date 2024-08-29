
package grupo5.taller.restaurantdeliciasgourmet.logica;

import java.time.LocalTime;
import java.text.DateFormat;

public class GestionHorario {
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private LocalTime horarioEspecial;
    private DateFormat diaEspecial;
    private String tipoDeEvento;

    public GestionHorario() {
    }

    public GestionHorario(LocalTime horarioApertura, LocalTime horarioCierre, LocalTime horarioEspecial, DateFormat diaEspecial, String tipoDeEvento) {
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
        this.horarioEspecial = horarioEspecial;
        this.diaEspecial = diaEspecial;
        this.tipoDeEvento = tipoDeEvento;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public LocalTime getHorarioEspecial() {
        return horarioEspecial;
    }

    public void setHorarioEspecial(LocalTime horarioEspecial) {
        this.horarioEspecial = horarioEspecial;
    }

    public DateFormat getDiaEspecial() {
        return diaEspecial;
    }

    public void setDiaEspecial(DateFormat diaEspecial) {
        this.diaEspecial = diaEspecial;
    }

    public String getTipoDeEvento() {
        return tipoDeEvento;
    }

    public void setTipoDeEvento(String tipoDeEvento) {
        this.tipoDeEvento = tipoDeEvento;
    }
    
    public void definirHorarioAperturaCierre(LocalTime horarioApertura ,LocalTime horarioCierre){
    
    }
    
    public void definirHorarioEspecial(LocalTime horarioEspecial){
    
    }
    
    public void bloquearFranjaHoraria(){
    
    }
    
}
