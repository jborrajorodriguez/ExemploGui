package com.juan.ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class VentanaPaneles {
JFrame ventana;
    JPanel panel,panel1,panel2;
    JLabel etUsuario, etContrasinal;
    JButton boton1, boton2,boton3;
    JTextField jtUsuario;
    JPasswordField jptContrasinal;
    public VentanaPaneles() {
        ventana = new JFrame("Ventana paneles");
        panel = new JPanel();
        panel1=new JPanel();
        panel2=new JPanel();
        panel.setLayout(new BorderLayout());
        panel1.setLayout(new GridLayout(2,2));
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        etUsuario = new JLabel("Usuario");
        etContrasinal = new JLabel("Contrasinal");
        boton1 = new JButton("Inxire");
        boton2 = new JButton("Limpar");
        boton3 =new JButton("Nuevo");
        jtUsuario = new JTextField(7);
        jptContrasinal = new JPasswordField(4);
     
        ventana.setSize(600, 300);
        //panel1.setBounds(0, 0, 400, 300);

        panel1.add(etUsuario);
        panel1.setBackground(Color.MAGENTA);

        //etUsuario.setBounds(30, 20, 200, 15);
        panel1.add(jtUsuario);

        //jtUsuario.setBounds(230, 20, 200, 25);

        panel1.add(etContrasinal);
       // etContrasinal.setBounds(30, 65, 200, 15);

        panel1.add(jptContrasinal);

        //jptContrasinal.setBounds(230, 65, 200, 25);

        panel2.add(boton1);
       
        panel2.add(boton2);
        panel2.add(boton3);
        
        panel.add(panel1,BorderLayout.CENTER);
        panel.add(panel2,BorderLayout.SOUTH);
        ventana.add(panel);

        ventana.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
    

}
