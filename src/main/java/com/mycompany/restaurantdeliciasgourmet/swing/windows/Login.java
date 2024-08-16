package com.mycompany.restaurantdeliciasgourmet.swing.windows;

import javax.swing.*;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtPassword;

    public Login() {
        initComponents();
    }

    private void initComponents() {
        FlatDarkLaf.setup();
        setTitle("Delicias Gourmet - Login");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.setBackground(new Color(43, 43, 43));

        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(3, 2, 10, 10));
        panelCampos.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 50));
        panelCampos.setBackground(new Color(43, 43, 43));

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setForeground(Color.WHITE);
        txtUsuario = new JTextField(20);

        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setForeground(Color.WHITE);
        txtPassword = new JPasswordField(20);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER));
        panelBotones.setBackground(new Color(43, 43, 43));
        
        JButton btnLogin = new JButton("Iniciar Sesión");
        JButton btnCrearUsuario = new JButton("Crear Usuario");
        btnLogin.setFocusPainted(false);
        btnCrearUsuario.setFocusPainted(false);

        panelBotones.add(btnLogin);
        panelBotones.add(btnCrearUsuario);

        panelCampos.add(lblUsuario);
        panelCampos.add(txtUsuario);
        panelCampos.add(lblPassword);
        panelCampos.add(txtPassword);

        panelPrincipal.add(panelCampos, BorderLayout.CENTER);
        panelPrincipal.add(panelBotones, BorderLayout.SOUTH);

        add(panelPrincipal);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validarLogin();
            }
        });

        btnCrearUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearUsuario();
            }
        });
    }

    private void validarLogin() {
        String usuario = txtUsuario.getText();
        String password = new String(txtPassword.getPassword());

        if ("admin".equals(usuario) && "1234".equals(password)) {
            JOptionPane.showMessageDialog(this, "Login exitoso!");
            new Home().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void crearUsuario() {
        JOptionPane.showMessageDialog(this, "Falta implementar.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
