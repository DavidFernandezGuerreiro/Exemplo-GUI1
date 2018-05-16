
package com.ventana;

import javax.swing.*;

/**
 *
 * @author dfernandezguerreiro
 */
public class VentanaComponentes2 {
    
    JFrame marco;
    JPanel panel;
    JLabel etUsuario,etContrasinal;
    JButton boton1,blimpar;
    JTextField jtUsuario;
    JPasswordField jpContrasinal;
    
    public VentanaComponentes2(){
        marco=new JFrame(" VENTANA COMPONENTES ");
        panel=new JPanel();
        etUsuario=new JLabel("USUARIO");
        etContrasinal=new JLabel("CONTRASINAL");
        boton1=new JButton("inxire");
        blimpar=new JButton("limpa");
        jpContrasinal=new JPasswordField(4);
        jtUsuario=new JTextField(7);
        
        marco.setSize(600, 300);
        panel.add(etUsuario);
        panel.add(jtUsuario);
        panel.add(etContrasinal);
        panel.add(jpContrasinal);
        panel.add(boton1);
        panel.add(blimpar);
        marco.add(panel);
//        marco.pack();
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        //COLOCANDO LOS COMPONENTES:
        panel.setLayout(null);
        etUsuario.setBounds(60, 40, 100, 10);
        jtUsuario.setBounds(135, 35, 100, 20);
        etContrasinal.setBounds(30, 80, 100, 10);
        jpContrasinal.setBounds(135, 75, 100, 20);
        boton1.setBounds(30, 130, 100, 40);
        blimpar.setBounds(135, 130, 100, 40);
        
        //CARACTERISTICAS
        boton1.setToolTipText("inxire os datos");
        blimpar.setMnemonic('l');
        
    }
    
    
    
}
