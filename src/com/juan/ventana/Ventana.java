package com.juan.ventana;

import java.awt.Color;
import javax.swing.*;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Ventana {
    JFrame ventana;
    JPanel panel1,panel2;
    
    public Ventana() {
        ventana = new JFrame("Exemplo GUI");
        ventana.setSize(800, 400);
        panel1=new JPanel();
//        panel1.setSize(400, 200);
        panel1.setBounds(0, 0, 800, 150);
        panel1.setBackground(Color.yellow);
        panel2=new JPanel();
//        panel2.setSize(400, 200);
        panel2.setBounds(0, 200, 800, 150);
         panel2.setBackground(Color.blue);
        ventana.setLayout(null);
        ventana.add(panel1);
         ventana.add(panel2);
        
        ventana.setLocationRelativeTo(ventana);
//        ventana.pack();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
}
