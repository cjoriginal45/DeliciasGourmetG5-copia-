
package grupo5.taller.restaurantdeliciasgourmet.logica;


public class Cliente{ 
        private int numeroMesa;
        private int capacidad;
        private String ubicacion;
        private boolean disponibiñidad;

    public Cliente() {
    }

    public Cliente(int numeroMesa, int capacidad, String ubicacion, boolean disponibinidad) {
        this.numeroMesa = numeroMesa;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.disponibiñidad = disponibinidad;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isDisponibiñidad() {
        return disponibiñidad;
    }

    public void setDisponibiñidad(boolean disponibinidad) {
        this.disponibiñidad = disponibinidad;
    }
        
        
        

    
}
