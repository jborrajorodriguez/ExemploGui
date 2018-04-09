package com.juan.ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class VentanaLayout {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;

    public VentanaLayout() {
        marco = new JFrame("VentanaLayout");
        panel = new JPanel();
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");
        boton3 = new JButton("Boton 3");
        boton4 = new JButton("Boton 4");
        boton5 = new JButton("Boton 5");
        //Damoslle as caracteristicas aos compoñentes
        boton1.setBackground(Color.orange);
        boton2.setBackground(Color.green);
        boton3.setBackground(Color.yellow);
        boton4.setBackground(Color.white);
        boton5.setBackground(Color.pink);

        marco.setSize(600, 300);
        
    }

    public void distribuidorLayout() {
        //Aplicamos o Layout
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        //Engadimos os compoñentes
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        //Engadir o panel no marco
        marco.add(panel);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

    public void disBoxLayout() {
        //Aplicamos o Layout
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        //Engadimos os compoñentes
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        //Engadir o panel no marco
        marco.add(panel);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.pack();//ajusta el marco a los componentes
        marco.setVisible(true);

    }
    
    public void disBorderLayout(){
        //Aplicamos o Layout
        panel.setLayout(new BorderLayout());
        //Engadimos os compoñentes
        panel.add(boton1,BorderLayout.NORTH);
        panel.add(boton2,BorderLayout.SOUTH);
        panel.add(boton3,BorderLayout.EAST);
        panel.add(boton4,BorderLayout.WEST);
        panel.add(boton5,BorderLayout.CENTER);
        //Engadir o panel no marco
        marco.add(panel);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.pack();//ajusta el marco a los componentes
        marco.setVisible(true);
    }
    
    public void gridLayout(){
        //Aplicamos o Layout
        panel.setLayout(new GridLayout(3,2));
        //Engadimos os compoñentes
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        //Engadir o panel no marco
        marco.add(panel);
        marco.setLocationRelativeTo(null);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.pack();//ajusta el marco a los componentes
        marco.setVisible(true);
    }

}
