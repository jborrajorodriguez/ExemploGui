package com.juan.ventana;

import java.awt.Color;
import javax.swing.*;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class VentanaComponentes {

    JFrame ventana;
    JPanel panel;
    JLabel etUsuario, etContrasinal;
    JButton boton1, boton2;
    JTextField jtUsuario;
    JPasswordField jptContrasinal;

    public VentanaComponentes() {
        ventana = new JFrame("Ventana componentes");
        panel = new JPanel();
        etUsuario = new JLabel("Usuario");
        etContrasinal = new JLabel("Contrasinal");
        boton1 = new JButton("Inxire");
        boton2 = new JButton("Limpar");
        jtUsuario = new JTextField(7);
        jptContrasinal = new JPasswordField(4);
        panel.setLayout(null);
        ventana.setSize(600, 300);
        panel.setBounds(0, 0, 800, 300);

        panel.add(etUsuario);
        panel.setBackground(Color.yellow);

        etUsuario.setBounds(30, 20, 200, 15);
        panel.add(jtUsuario);

        jtUsuario.setBounds(230, 20, 200, 25);

        panel.add(etContrasinal);
        etContrasinal.setBounds(30, 65, 200, 15);

        panel.add(jptContrasinal);

        jptContrasinal.setBounds(230, 65, 200, 25);

        panel.add(boton1);
        boton1.setBounds(30, 130, 200, 25);

        panel.add(boton2);
        boton2.setBounds(250, 130, 180, 25);

        ventana.add(panel);

        //ventana.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }

}
