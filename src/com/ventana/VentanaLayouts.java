
package com.ventana;

import java.awt.*;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author dfernandezguerreiro
 */
public class VentanaLayouts {
    
    JFrame marco;
    JPanel panel;
    JButton boton1,boton2,boton3,boton4,boton5;
    
    public VentanaLayouts(){
        marco=new JFrame(" FLOWLAYOUT ");
        panel=new JPanel();
        boton1=new JButton("boton1");
        boton2=new JButton("boton2");
        boton3=new JButton("boton3");
        boton4=new JButton("boton4");
        boton5=new JButton("boton5");
    }
    
    public void distribuidorFlowLayout(){
        //LO PONEMOS EN EL CONSTRUCTOR:
//        marco=new JFrame(" FLOWLAYOUT ");
//        panel=new JPanel();
//        boton1=new JButton("boton1");
//        boton2=new JButton("boton2");
//        boton3=new JButton("boton3");
//        boton4=new JButton("boton4");
//        boton5=new JButton("boton5");

        //damoslle as caracteristicas a todos os compoñentes
        boton1.setBackground(Color.yellow);
        boton2.setBackground(Color.red);
        boton3.setBackground(Color.blue);
        boton4.setBackground(Color.cyan);
        boton5.setBackground(Color.green);
        
        marco.setSize(600, 300);
        
        //Aplicamos o Layout:
        panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,5)); //Y le damos valores.
        //Engadimos compoñentes:
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel); //Engadimos o panel
        
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
    
    public void disBoxLayout(){
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS)); //BoxLayout Y_AXIS->vertical
        //Engadimos compoñentes:
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel); //Engadimos o panel
        marco.pack(); //Axusta o marco aos compoñentes.
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
    public void disBorderLayout(){
        panel.setLayout(new BorderLayout());
        //Engadimos compoñentes: //damoslle a sua posicion
        panel.add(boton1,BorderLayout.NORTH);
        panel.add(boton2,BorderLayout.SOUTH);
        panel.add(boton3,BorderLayout.EAST);
        panel.add(boton4,BorderLayout.WEST);
        panel.add(boton5,BorderLayout.CENTER);
        marco.add(panel);
        marco.pack(); //Axusta o marco aos compoñentes.
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
    
    public void disGridLayout(){
        panel.setLayout(new GridLayout(3,2)); //3 filas, 2 columnas
        //Engadimos compoñentes:
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel); //Engadimos o panel
        marco.pack(); //Axusta o marco aos compoñentes.
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    
}
