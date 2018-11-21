/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.ModeloRegistrarse;
import Vista.VistaRegistrarse;
import Vista.VistaUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fernando
 */
public class ControlRegistrarse  extends AbstractController{

    private VistaUsuario vu;
    
    
    
    ModeloRegistrarse modeloAgregarUsuario;
    VistaRegistrarse vistaAgregaUsuario;
    ControlRegistrarse(ModeloRegistrarse modeloAgregarUsuario, VistaRegistrarse vistaAgregaUsuario) {
        this.modeloAgregarUsuario = modeloAgregarUsuario;
        this.vistaAgregaUsuario = vistaAgregaUsuario;
        this.vistaAgregaUsuario.setController(this);
    }

 @Override
    public void actionPerformed(ActionEvent evt) {
        switch (evt.getActionCommand()) {
         
           
             case "Guardar": {
          
                System.out.println("guardar");
                
//                int numero = Integer.parseInt(VistaRegistrarse.getText());
//                int factura = Integer.parseInt(vistaAgregaUsuario.getJTextField3().getText());    
//                String producto="";
//                int cantidad = Integer.parseInt(vu.getJTextField4().getText());
//                String tipo = "";
//
//                if (vista.getjComboBox2().getSelectedItem().toString().equals("Suntuario")) {
//                    tipo = "Sun";
//
//                }
//                if (vista.getjComboBox2().getSelectedItem().toString().equals("Can. Basca")) {
//                    tipo = "Bas";
//
//                }
//                if (vista.getjComboBox2().getSelectedItem().toString().equals("Popular")) {
//                    tipo = "Pop";
//
//                }

//                 {
//                    try {
//                        modeloDetalle.crearDetalle(numero, factura, producto,cantidad);
//                    } catch (Exception ex) {
//                        Logger.getLogger(ControladorDetalle.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//                vista.limpiarEspacios();
//
//                modeloDetalle.notifyObservers(modeloDetalle.getListaDetalle());

                break;
                
            }


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

    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mostrarVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ocultarVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cerrarVista() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
