/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import Modelo.ModeloRegistrar;
import Vista.VistaRegistrar;
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
public class ControlRegistrar  extends AbstractController{

    private VistaUsuario vu;
    
    
    
    ModeloRegistrar modeloAgregarUsuario;
    VistaRegistrar vistaAgregaUsuario;
    ControlRegistrar(ModeloRegistrar modeloAgregarUsuario, VistaRegistrar vistaAgregaUsuario) {
        this.modeloAgregarUsuario = modeloAgregarUsuario;
        this.vistaAgregaUsuario = vistaAgregaUsuario;
        this.vistaAgregaUsuario.setControlador(this);
    }

 @Override
    public void actionPerformed(ActionEvent evt) {
        switch (evt.getActionCommand()) {
         
           
             case "Guardar": {
          
                System.out.println("guardar");
                
     String usuario=vistaAgregaUsuario.getjTUsuario().getText();
     String contrasena=vistaAgregaUsuario.getjPassword1().getText();
     String nombre=vistaAgregaUsuario.getjTNombre().getText();
     String apellidos=vistaAgregaUsuario.getjTApellidos().getText();
     String correoElectronico=vistaAgregaUsuario.getjTCorreo().getText();
     String fecha=vistaAgregaUsuario.getjTNacimiento().getText();
     String direccion=vistaAgregaUsuario.getjTDireccion().getText();
     int telefonoTrabajo=Integer.parseInt(vistaAgregaUsuario.getjTTelefono().getText());
     int celular=Integer.parseInt(vistaAgregaUsuario.getjTCelular().getText());
 
         
            try {
                modeloAgregarUsuario.insertarUsuario(usuario, contrasena, nombre, apellidos, correoElectronico, fecha, direccion, telefonoTrabajo, celular);
            } catch (GlobalException ex) {
                Logger.getLogger(ControlRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoDataException ex) {
                Logger.getLogger(ControlRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }
           
                   
//                }
//                vista.limpiarEspacios();
//
//                modeloDetalle.notifyObservers(modeloDetalle.getListaDetalle());

                break;
                          
            }
             
              case "Atras": {
          
                System.out.println("atras");
                
                vistaAgregaUsuario.setVisible(false);
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
