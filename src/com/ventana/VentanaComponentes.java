
package com.ventana;

import javax.swing.*;

/**
 *
 * @author dfernandezguerreiro
 */
public class VentanaComponentes {
    
    JFrame marco;
    JPanel panel;
    JLabel etUsuario,etContrasinal;
    JButton boton1,blimpar;
    JTextField jtUsuario;
    JPasswordField jpContrasinal;
    
    public VentanaComponentes(){
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
        marco.pack();
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
    }
    
    
}
