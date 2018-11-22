/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.ServicioSeccionPublica;
import Modelo.ModeloLogin;
import Modelo.ModeloRegistrar;
import Vista.VistaSeccionPublica;
import Modelo.ModeloSeccionPublica;
import Vista.VistaLogueo;
import Vista.VistaRegistrar;
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

 
    VistaLogueo vistaL=new VistaLogueo();
    ModeloLogin modeloL=new ModeloLogin();
    ControlLogueo controladorL=new ControlLogueo(modeloL,vistaL);
    
    VistaRegistrar vistaR=new VistaRegistrar();
    ModeloRegistrar modeloR=new ModeloRegistrar();
    ControlRegistrar controladorR=new ControlRegistrar(modeloR,vistaR);

    private VistaSeccionPublica vista;
//    private ModeloSeccionPublica modeloSeccionPublica;
    private ServicioSeccionPublica accesoADatosSeccionPublica = ServicioSeccionPublica.getServicioSeccionPublica();

    private ModeloSeccionPublica modeloSeccionPublica = new ModeloSeccionPublica();

//    private ModeloRegistrar modeloRegistrarse = new ModeloRegistrar();
    public ControlSeccionPublica(VistaSeccionPublica vista, ModeloSeccionPublica modeloSeccionPublica) {
        this.vista = vista;
//        this.vistaR = vistaR;
        this.modeloSeccionPublica = modeloSeccionPublica;
//        this.modeloRegistrarse = modeloRegistrarse;
        vista.setModelo(modeloSeccionPublica);
        vista.setControlador(this);
        vista.setModelo(modeloSeccionPublica);
        vista.setControlador(this);
        this.modeloSeccionPublica.setDb(accesoADatosSeccionPublica);

    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        switch (evt.getActionCommand()) {

            case "Registrarse": 
                System.out.println("registrarse");
                vistaR.setVisible(true);

            

            break;

            case "Logueo": {
                System.out.println("log");
               
                vistaL.setVisible(true);
            }

            break;
            
            case "Atras": {
                System.out.println("atras2");
                
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
