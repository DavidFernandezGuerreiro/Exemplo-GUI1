
package com.ventana;

import javax.swing.JFrame;

/**
 *
 * @author dfernandezguerreiro
 */
public class Ventana2 extends JFrame{
    
    public Ventana2(){
        this.setSize(800, 400);
        this.setTitle("***** VENTANA 2 *****");
        setLocationRelativeTo(this); //Pone la ventana en el medio. No en la esquina.
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Al darle a la X que se cierre (apague el programa).
        setVisible(true); //Se hace la ventana visible.
    }
    
}
