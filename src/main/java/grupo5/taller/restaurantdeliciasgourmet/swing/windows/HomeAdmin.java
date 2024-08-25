package grupo5.taller.restaurantdeliciasgourmet.swing.windows;

import javax.swing.*;
import com.formdev.flatlaf.FlatDarkLaf;
import grupo5.taller.restaurantdeliciasgourmet.RestaurantDeliciasGourmet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author grupo5
 */
public class HomeAdmin extends JFrame {

    public HomeAdmin() {
        initComponents();
    }

    private void initComponents() {
        FlatDarkLaf.setup();

        setTitle("Delicias Gourmet - Gestión de Restaurante");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(new Color(60, 63, 65));

        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new GridLayout(1, 5, 10, 10));
        panelSuperior.setBackground(new Color(43, 43, 43));

        JButton btnClientes = new JButton("Clientes");
        JButton btnReservas = new JButton("Reservas");
        JButton btnRestaurante = new JButton("Restaurante");
        JButton btnEmpleados = new JButton("Empleados");
        JButton btnReportes = new JButton("Reportes");

        panelSuperior.add(btnClientes);
        panelSuperior.add(btnReservas);
        panelSuperior.add(btnRestaurante);
        panelSuperior.add(btnEmpleados);
        panelSuperior.add(btnReportes);

        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);

        JPanel panelBienvenida = new JPanel();
        panelBienvenida.setLayout(new BorderLayout());
        panelBienvenida.setBackground(new Color(43, 43, 43));
        JLabel lblBienvenida = new JLabel("Bienvenido a Delicias Gourmet", JLabel.CENTER);
        lblBienvenida.setFont(new Font("Arial", Font.BOLD, 28));
        lblBienvenida.setForeground(Color.WHITE);
        panelBienvenida.add(lblBienvenida, BorderLayout.CENTER);

        panelPrincipal.add(panelBienvenida, BorderLayout.CENTER);

        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelInferior.setBackground(new Color(60, 63, 65));
        JButton btnSalir = new JButton("Salir");
        btnSalir.setFocusPainted(false);
        panelInferior.add(btnSalir);

        btnSalir.addActionListener(e -> System.exit(0));

        panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

        add(panelPrincipal);

        btnClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Registrar Cliente Clicked!");
            }
        });

        btnReservas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Nueva Reserva Clicked!");
            }
        });

        btnRestaurante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Configurar Mesas Clicked!");
            }
        });

        btnEmpleados.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EmpleadosList().setVisible(true);
            }
        });

        btnReportes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Generar Reporte Clicked!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HomeAdmin().setVisible(true);
            }
        });
    }
}
