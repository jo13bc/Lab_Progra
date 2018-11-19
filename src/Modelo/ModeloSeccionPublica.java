package Modelo;


import java.util.Observable;
import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloSeccionPublica extends Observable {

    
    public ModeloSeccionPublica() {
 
    }
    
   
    @Override
    public void notifyObservers() {
       
        super.notifyObservers();
    }
    
}