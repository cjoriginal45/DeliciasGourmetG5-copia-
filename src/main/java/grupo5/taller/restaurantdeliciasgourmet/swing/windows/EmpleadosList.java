package grupo5.taller.restaurantdeliciasgourmet.swing.windows;

import grupo5.taller.restaurantdeliciasgourmet.RestaurantDeliciasGourmet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
import grupo5.taller.restaurantdeliciasgourmet.logica.Empleado;
import grupo5.taller.restaurantdeliciasgourmet.persistencia.EmpleadoDAO;

/**
 * @author grupo5
 */
public class EmpleadosList extends JFrame {

    private JTable empleadosTable;
    private EmpleadoDAO controlPersistencia;

    public EmpleadosList() {
        this.controlPersistencia = RestaurantDeliciasGourmet.empleadosDAO;
        initComponents();
    }

    private void initComponents() {
        setTitle("Listado de Empleados");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBackground(new Color(60, 63, 65));

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Rol");
        model.addColumn("Permiso");

        List<Empleado> empleados = controlPersistencia.retrieveEmpleados();

        for (Empleado empleado : empleados) {
            Object[] rowData = {
                empleado.getIdEmpleado(),
                empleado.getRol().toString(),
                empleado.getPermiso() != null ? empleado.getPermiso().toString() : "Sin Permiso"
            };
            model.addRow(rowData);
        }

        empleadosTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(empleadosTable);
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);
        add(panelPrincipal);
    }

    public static void main(String[] args) {
        EmpleadoDAO controlPersistencia = new EmpleadoDAO();
        controlPersistencia.retrieveEmpleados();
        
        SwingUtilities.invokeLater(() -> {
            new EmpleadosList().setVisible(true);
        });
    }
}
