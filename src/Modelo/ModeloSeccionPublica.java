package Modelo;


import java.util.Observable;
import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioSeccionPublica;
import AccesoADatos.ServicioVuelo;
import Logica.Vuelo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloSeccionPublica extends Observable {

    private Vuelo vuelo;
    private ServicioSeccionPublica dbV;
    private ArrayList<Vuelo> arregloConVuelos;

    public ModeloSeccionPublica() {

        vuelo = null;
        arregloConVuelos = new ArrayList();

    }

    public void setVuelo(Vuelo estu) {
        vuelo = estu;
        synchronized (this) {
            this.setChanged();
            this.notifyObservers(vuelo);
        }
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public ServicioSeccionPublica getDb() {
        return dbV;
    }

    public void setDb(ServicioSeccionPublica dbV) {
        this.dbV = dbV;
        arregloConVuelos.removeAll(arregloConVuelos);
        arregloConVuelos = getListaVuelo();
        this.setChanged();
        this.notifyObservers();
    }

    public ArrayList<Vuelo> getListaVuelo() {
        ArrayList<Vuelo> list = null;
        try {
            list = (ArrayList<Vuelo>) dbV.listarVuelo();
        } catch (GlobalException | NoDataException ex) {

        }
        return list;
    }

    public void actualizar() throws Exception {

        arregloConVuelos.removeAll(arregloConVuelos);
        arregloConVuelos = getListaVuelo();
        this.setChanged();
        this.notifyObservers();

    }
    
   
    @Override
     public void notifyObservers() {
        ArrayList<Object> lista = new ArrayList();
        Iterator<Vuelo> ite = arregloConVuelos.iterator();

        while (ite.hasNext()) {
            Vuelo e = ite.next();
            Object[] fila = new Object[7];

            fila[0] = e.getOrigen();
            fila[1] = e.getDestino();
            fila[2] = e.getFechaIda();
            fila[3] = e.getFechaRegreso();
            fila[4] = e.getCantidadPasajeros();
            fila[5] = e.getDescuento();

            lista.add(fila);
        }
        super.notifyObservers(lista);
    }

//    public void setDb(ServicioSeccionPublica accesoADatosVuelo) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}