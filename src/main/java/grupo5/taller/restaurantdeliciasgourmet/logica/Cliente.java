
package grupo5.taller.restaurantdeliciasgourmet.logica;
import java.util.List;

public class Cliente extends Persona{ 
    
    private int clienteId;
    private List<String> intolerancias;
    
    public Cliente() {
    }
    
    public Cliente(String nombre, String nombreUsuario, String contrasenia, String correoElectronico, String telefono, int clienteId, List<String> intolerancias){
        super(nombre, nombreUsuario, contrasenia, correoElectronico, telefono);
        this.clienteId = clienteId;
        this.intolerancias = intolerancias;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public List<String> getIntolerancias() {
        return intolerancias;
    }

    public void setIntolerancias(List<String> intolerancias) {
        this.intolerancias = intolerancias;
    }
    
    
}
