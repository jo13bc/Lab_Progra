/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_progra_iii;

import Control.ControlSeccionPublica;
import Modelo.ModeloSeccionPublica;
import Vista.VistaSeccionPublica;

public class Lab_Progra_III {

    public static void main(String[] args) {
        
          ModeloSeccionPublica modelo = new ModeloSeccionPublica();

        VistaSeccionPublica vista=new VistaSeccionPublica();
        vista.setVisible(true);
        
     
        ControlSeccionPublica control = new ControlSeccionPublica(vista, modelo);
        
    }
    
}
