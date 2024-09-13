package grupo5.taller.restaurantdeliciasgourmet.swing.windows;

import grupo5.taller.restaurantdeliciasgourmet.persistencia.EmpleadoJpaController;
import grupo5.taller.restaurantdeliciasgourmet.logica.Empleado;
import grupo5.taller.restaurantdeliciasgourmet.logica.Rol;
import grupo5.taller.restaurantdeliciasgourmet.logica.Permiso;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * @author grupo5
 */
public class EmpleadosList extends JFrame {
    private JTable empleadosTable;
    private static EmpleadoJpaController empleadoJpaController;
    private DefaultTableModel model;

    public EmpleadosList() {
        empleadoJpaController = new EmpleadoJpaController();
        initComponents();
    }

    private void initComponents() {
        setTitle("Listado de Empleados");
        setSize(800, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.setBackground(new Color(60, 63, 65));

        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Correo Electrónico");
        model.addColumn("Teléfono");
        model.addColumn("Rol");
        model.addColumn("Permiso");

        loadEmpleados();

        empleadosTable = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(empleadosTable);
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);

        JButton addEmpleadoButton = new JButton("Agregar Empleado");
        addEmpleadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                agregarEmpleado();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addEmpleadoButton);
        panelPrincipal.add(buttonPanel, BorderLayout.SOUTH);

        add(panelPrincipal);
    }

    private void loadEmpleados() {
        try {
            List<Empleado> empleados = empleadoJpaController.findEmpleadoEntities();
            model.setRowCount(0);
            for (Empleado empleado : empleados) {
                Object[] rowData = {
                    empleado.getIdEmpleado(),
                    empleado.getNombre(),
                    empleado.getCorreoElectronico(),
                    //empleado.getTelefono(),
                    empleado.getRol() != null ? empleado.getRol().toString() : "Sin Rol",
                   // empleado.getPermiso() != null ? empleado.getPermiso().toString() : "Sin Permiso"
                };
                model.addRow(rowData);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al recuperar empleados: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void agregarEmpleado() {
        JDialog dialog = new JDialog(this, "Agregar Empleado", true);
        dialog.setSize(400, 300);
        dialog.setLayout(new GridLayout(6, 2));

        JTextField nombreField = new JTextField();
        JTextField correoField = new JTextField();
        JTextField telefonoField = new JTextField();
        
        // Use JComboBox for enums Rol and Permiso
       // JComboBox<Rol> rolComboBox = new JComboBox<>(Rol.values());
       // JComboBox<Permiso> permisoComboBox = new JComboBox<>(Permiso.values());

        dialog.add(new JLabel("Nombre:"));
        dialog.add(nombreField);
        dialog.add(new JLabel("Correo Electrónico:"));
        dialog.add(correoField);
        dialog.add(new JLabel("Teléfono:"));
        dialog.add(telefonoField);
        dialog.add(new JLabel("Rol:"));
        //dialog.add(rolComboBox);
        dialog.add(new JLabel("Permiso:"));
       // dialog.add(permisoComboBox);

        JButton saveButton = new JButton("Guardar");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String correo = correoField.getText();
                String telefono = telefonoField.getText();
         //       Rol rol = (Rol) rolComboBox.getSelectedItem();
           //     Permiso permiso = (Permiso) permisoComboBox.getSelectedItem();

                Empleado nuevoEmpleado = new Empleado();
                //nuevoEmpleado.setNombre(nombre);
                nuevoEmpleado.setCorreoElectronico(correo);
               // nuevoEmpleado.setTelefono(telefono);
               // nuevoEmpleado.setRol(rol);
                //nuevoEmpleado.setPermiso(permiso);

                try {
                    empleadoJpaController.create(nuevoEmpleado);
                    JOptionPane.showMessageDialog(dialog, "Empleado agregado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    loadEmpleados(); // Reload employee list
                    dialog.dispose(); // Close the dialog
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(dialog, "Error al guardar el empleado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton cancelButton = new JButton("Cancelar");
        cancelButton.addActionListener(e -> dialog.dispose());

        dialog.add(saveButton);
        dialog.add(cancelButton);

        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EmpleadosList().setVisible(true);
        });
    }
}
