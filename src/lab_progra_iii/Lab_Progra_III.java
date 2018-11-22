/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_progra_iii;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioUsuario;
import Control.ControlSeccionPublica;
import Logica.Usuario;
import Modelo.ModeloSeccionPublica;
import Vista.VistaSeccionPublica;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab_Progra_III {

    public static void main(String[] args) {
        
          ModeloSeccionPublica modelo = new ModeloSeccionPublica();

        VistaSeccionPublica vista=new VistaSeccionPublica();
        vista.setVisible(true);
        
     
        ControlSeccionPublica control = new ControlSeccionPublica(vista, modelo);
   
      
        
    }
    
}
