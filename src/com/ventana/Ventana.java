
package com.ventana;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author dfernandezguerreiro
 */
public class Ventana {
    
    JFrame marco;
    JPanel panel1,panel2;
    
    public Ventana(){
        marco=new JFrame("GUI 1");
        marco.setSize(800, 400); //Tamaño de la ventana.
        
        panel1=new JPanel(); //Creamos dos paneles.
        panel2=new JPanel();
        
        //CARACTERISTICAS:
        panel1.setBounds(0, 0, 800, 150); //Tamaño de los paneles.
        panel1.setBackground(Color.yellow); //Le damos color al panel.
        panel2.setBounds(0, 200, 800, 150);
        panel2.setBackground(Color.blue);
        
        marco.setLayout(null); //Anular el xestor de layout por defecto. Para poder darle cordenadas propias.
        marco.add(panel1);//Añadimos los paneles al marco.
        marco.add(panel2);
        
//        marco.setLocationRelativeTo(marco); //Pone la ventana en el medio. No en la esquina.
//        marco.pack(); //Ajusta la ventana a los botones, etc.
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Al darle a la X que se cierre (apague el programa).
        marco.setVisible(true); //Se hace la ventana visible.
        
    }
    
}
