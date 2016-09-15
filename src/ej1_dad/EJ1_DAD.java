
package ej1_dad;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Alejandro
 */
public class EJ1_DAD 
{
    public static void main(String[] args) 
    {
        //Marco
        JFrame marco = new JFrame ("Ejercicio 1 - DAD");
         
        //Etiquetas
        JLabel etiqueta_a = new JLabel ("Primera etiqueta");
        JLabel etiqueta_b = new JLabel ("Segunda etiqueta");
        
        //Campos de texto
        JTextField campo_a = new JTextField ("Primer campo de texto");
        JTextField campo_b = new JTextField ("Segundo campo de texto");
        
        //Botón
        JButton boton = new JButton ("Botón");
        
        //Layout
        FlowLayout layout = new FlowLayout();
        
        marco.setVisible(true);
        marco.setSize(600,500);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLayout(layout);
        
        marco.getContentPane().add(etiqueta_a);
        marco.getContentPane().add(etiqueta_b);
        marco.getContentPane().add(campo_a);
        marco.getContentPane().add(campo_b);
        marco.getContentPane().add(boton);
        
        marco.pack();
    }
}
