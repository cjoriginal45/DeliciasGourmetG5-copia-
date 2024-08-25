package grupo5.taller.restaurantdeliciasgourmet.persistencia;

import grupo5.taller.restaurantdeliciasgourmet.logica.Empleado;
import grupo5.taller.restaurantdeliciasgourmet.logica.Rol;
import grupo5.taller.restaurantdeliciasgourmet.logica.Permiso;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmpleadoDAO {
    private GenericDAO<Empleado> genericDAO;

    public EmpleadoDAO() {
        genericDAO = new GenericDAO<>();
    }

    public void insertEmpleado(Empleado empleado) {
        String sql = "INSERT INTO Empleado(idEmpleado, rol, permiso) VALUES(?, ?, ?)";
        genericDAO.insert(sql, empleado.getIdEmpleado(), empleado.getRol().toString(), empleado.getPermiso().toString());
    }

    public List<Empleado> retrieveEmpleados() {
        String sql = "SELECT * FROM Empleado";

        return genericDAO.retrieveAll(sql, new GenericDAO.RowMapper<Empleado>() {
            @Override
            public Empleado mapRow(ResultSet rs) throws SQLException {
                Integer idEmpleado = rs.getInt("idEmpleado");
                Rol rol = Rol.valueOf(rs.getString("rol"));
                Permiso permiso = Permiso.valueOf(rs.getString("permiso"));
                return new Empleado(idEmpleado, rol, permiso);
            }
        });
    }

    public String deleteEmpleado(int idEmpleado) {
        String sql = "DELETE FROM Empleado WHERE idEmpleado = ?";
        return genericDAO.delete(sql, idEmpleado);
    }
}