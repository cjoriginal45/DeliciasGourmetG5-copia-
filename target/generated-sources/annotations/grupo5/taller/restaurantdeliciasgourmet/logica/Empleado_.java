package grupo5.taller.restaurantdeliciasgourmet.logica;

import grupo5.taller.restaurantdeliciasgourmet.logica.Permiso;
import grupo5.taller.restaurantdeliciasgourmet.logica.Rol;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-09-07T17:27:58", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Empleado.class)
public class Empleado_ extends Persona_ {

    public static volatile SingularAttribute<Empleado, Integer> idEmpleado;
    public static volatile SingularAttribute<Empleado, Permiso> permiso;
    public static volatile SingularAttribute<Empleado, Rol> rol;

}