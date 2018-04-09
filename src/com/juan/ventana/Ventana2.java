package com.juan.ventana;

import javax.swing.JFrame;

/**
 * @author {Juan Borrajo Rodriguez}
 */
public class Ventana2 extends JFrame {
    public Ventana2(){
        this.setTitle("Ventana 2");
        this.setSize(800,600);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(this);
        this.setVisible(rootPaneCheckingEnabled);
    }
    

}
