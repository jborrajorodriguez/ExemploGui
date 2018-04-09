package com.juan.ventana;

import javax.swing.*;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class VentanaComponentes2 {
JFrame ventana;
JPanel panel;
JLabel etUsuario,etContrasinal;
JButton boton1,boton2;
JTextField jtUsuario;
JPasswordField jptContrasinal;

    public VentanaComponentes2() {
        ventana=new JFrame("Ventana componentes");
        panel=new JPanel();
        etUsuario=new JLabel("Usuario");
        etContrasinal=new JLabel("Contrasinal");
        boton1=new JButton("Inxire");
        boton2=new JButton("Limpar");
        jtUsuario=new JTextField(7);
        jptContrasinal=new JPasswordField(4);
        
        ventana.setSize(600, 300);
        panel.add(etUsuario);
        panel.add(jtUsuario);
        panel.add(etContrasinal);
        panel.add(jptContrasinal);
        panel.add(boton1);
        panel.add(boton2);
        panel.setLayout(null);
        ventana.add(panel);
        ventana.pack();
        ventana.setLayout(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

}
