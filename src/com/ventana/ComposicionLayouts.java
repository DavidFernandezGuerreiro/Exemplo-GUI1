
package com.ventana;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dfernandezguerreiro
 */
public class ComposicionLayouts {
    
    JFrame marco;
    JPanel panel,panel2,panel3,panel4;
    JLabel etUsuario,etContrasinal;
    JButton boton1,boton2,boton3;
    JTextField jtUsuario;
    JPasswordField jpContrasinal;
    
    public ComposicionLayouts(){
        marco=new JFrame(" COMPOSICION LAYOUTS ");
        panel=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        panel4=new JPanel();
        boton1=new JButton("boton1");
        boton2=new JButton("boton2");
        boton3=new JButton("boton3");
        etUsuario=new JLabel("USUARIO");
        etContrasinal=new JLabel("CONTRASINAL");
        jpContrasinal=new JPasswordField(4);
        jtUsuario=new JTextField(7);

    }
    
    public void composicionLayout(){
        
        panel.add(panel4);
        
        //Aplicamos os Layouts:
        panel2.setLayout(new GridLayout(2,2)); //2 filas, 2 columnas
        panel2.add(etUsuario);
        panel2.add(jtUsuario);
        panel2.add(etContrasinal);
        panel2.add(jpContrasinal);
        
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.X_AXIS));
        panel3.add(boton1);
        panel3.add(boton2);
        panel3.add(boton3);
        
        //GridLayout para que los botones estén debajo de Usuario y Contraseña.
        panel4.setLayout(new GridLayout(2,0));
        panel4.add(panel2);
        panel4.add(panel3);
        
        marco.add(panel); //Engadimos o panel
        marco.pack();
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
    
    
}
