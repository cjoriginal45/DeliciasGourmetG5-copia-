//package grupo5.taller.restaurantdeliciasgourmet.swing.windows;
//
//import grupo5.taller.restaurantdeliciasgourmet.RestaurantDeliciasGourmet;
//import javax.swing.*;
//import javax.swing.table.DefaultTableModel;
//import java.awt.*;
//import java.util.List;
//import grupo5.taller.restaurantdeliciasgourmet.logica.Empleado;
//import grupo5.taller.restaurantdeliciasgourmet.persistencia.EmpleadoDAO;
//
///**
// * @author grupo5
// */
//public class EmpleadosList extends JFrame {
//    private JTable empleadosTable;
//    private static EmpleadoDAO empleadoDAO;
//
//    public EmpleadosList() {
//        empleadoDAO = RestaurantDeliciasGourmet.getEmpleadoDAO();
//        initComponents();
//    }
//
//    private void initComponents() {
//        setTitle("Listado de Empleados");
//        setSize(800, 400); // Adjusted size for better visibility
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        setLocationRelativeTo(null);
//
//        JPanel panelPrincipal = new JPanel(new BorderLayout());
//        panelPrincipal.setBackground(new Color(60, 63, 65));
//
//        DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("ID");
//        model.addColumn("Nombre");
//        model.addColumn("Correo Electrónico");
//        model.addColumn("Teléfono");
//        model.addColumn("Rol");
//        model.addColumn("Permiso");
//
//        try {
//            List<Empleado> empleados = empleadoDAO.retrieveEmpleados();
//
//            for (Empleado empleado : empleados) {
//                Object[] rowData = {
//                    empleado.getIdEmpleado(),
//                    empleado.getNombre(),
//                    empleado.getCorreoElectronico(),
//                    empleado.getTelefono(),
//                    empleado.getRol().toString(),
//                    empleado.getPermiso() != null ? empleado.getPermiso().toString() : "Sin Permiso"
//                };
//                model.addRow(rowData);
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Error al recuperar empleados: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
//        }
//
//        empleadosTable = new JTable(model);
//        JScrollPane scrollPane = new JScrollPane(empleadosTable);
//        panelPrincipal.add(scrollPane, BorderLayout.CENTER);
//        add(panelPrincipal);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            new EmpleadosList().setVisible(true);
//        });
//    }
//}
