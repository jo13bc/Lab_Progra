/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

 

import Vista.VistaSeccionPublica;
import Modelo.ModeloSeccionPublica;
import Vista.VistaRegistrarse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;



public class ControlSeccionPublica implements ActionListener, MouseListener, KeyListener {

    private VistaSeccionPublica vista;
    private ModeloSeccionPublica modeloSeccionPublica = new ModeloSeccionPublica();
    private  VistaRegistrarse registrarse;
    public ControlSeccionPublica(VistaSeccionPublica vista, ModeloSeccionPublica modeloSeccionPublica) {
        this.vista = vista;
        this.modeloSeccionPublica = modeloSeccionPublica;
        vista.setModelo(modeloSeccionPublica);
        vista.setControlador(this);
    
//       VistaRegistrarse.setControlador(this);
//       VistaRegistrarse.addWindowListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        switch (evt.getActionCommand()) {
         
            case "Registrarse": {
    
      registrarse.setVisible(true);
       
    }
                
            break;
            
            case "Logueo": {
                System.out.println("log");
            }

            break;
            
            case "  Referente instucicional": {
                System.out.println("ref");
            }

            break;
            
            case "Historia": {
                System.out.println("his");
            }

            break;
            
            case "Contactenos": {
                System.out.println("con");
            }

            break;
            
            case "Buscador de vuelos": {
                System.out.println("bus");
            }

            break;

        }
    }

    @Override
    public void mouseClicked(MouseEvent me) {        

    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }
}

