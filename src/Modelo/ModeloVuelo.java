package Modelo;

import Logica.Vuelo;
import java.util.Observable;
import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioVuelo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloVuelo extends Observable {

    private Vuelo vuelo;
    private ServicioVuelo dbV;
    private ArrayList<Vuelo> arregloConVuelos;

    public ModeloVuelo() {

        vuelo = null;
        arregloConVuelos = new ArrayList();

    }

    public void modificarVuelo(String origen, String destino, String fechaIda, String fechaRegreso, int cantidadPasajeros, int descuento) throws Exception {

//            if (nombre.equals("")) {
//                throw (new Exception("Debe ingresar un nombre para el vuelo"));
//            }
//            
//              if (precio.equals("")) {
//                throw (new Exception("Debe ingresar un nombre para el vuelo"));
//            }
//              
//            if (tipo.equals("") || Integer.valueOf(tipo) <= 0) {
//                throw (new Exception("Precio invalida"));
//            }
//                if (porcentaje.equals("") || Integer.valueOf(porcentaje) < 0) {
//                throw (new Exception("Unidad invalida"));
////            }
//            vuelo.setCodigo(codigo);
//            vuelo.setNombre(nombre);
//            vuelo.setImportado(importado);
//            vuelo.setPrecio(precio);
//            vuelo.setString(tipo);
        dbV.modificarVuelo(new Vuelo(origen, destino, fechaIda, fechaRegreso, cantidadPasajeros, descuento));
        arregloConVuelos.removeAll(arregloConVuelos);
        arregloConVuelos = getListaVuelo();
        this.setChanged();
        this.notifyObservers();

    }

//    public void crearVuelo(String codigo, String nombre, boolean importado, int precio, String tipo) throws Exception {
//        try {
//            if (nombre.equals("")) {
//                throw (new Exception("Debe ingresar una nombre para el vueloo"));
//            }
//
////            if (precio.equals("")) {
////                throw (new Exception("Debe ingresar un precio para el vuelo"));
////            }
////            if (tipo.equals("") || Integer.valueOf(tipo) < 0) {
////                throw (new Exception("Precio invalido"));
////            }
////            if (porcentaje.equals("") || Integer.valueOf(porcentaje) < 0) {
////                throw (new Exception("Unidad invalida"));
////            }
//            vuelo = new Vuelo(codigo, nombre, importado, precio, tipo);
//            synchronized (this) {
//                this.setChanged();
//                this.notifyObservers(vuelo);
//            }
//        } catch (Exception ex) {
//            throw (new Exception(ex.getMessage()));
//        }
//    }
    public void crearVuelo(String origen, String destino, String fechaIda, String fechaRegreso, int cantidadPasajeros, int descuento) throws Exception {
        try {
            if (origen.equals("")) {
                throw (new Exception("Codigo invalido"));
            }
            if (origen.equals("")) {
                throw (new Exception("Nombre invalido"));
            }
//            if (precio.equals("")) {
//                throw (new Exception("Precio invalido"));
//            }
            dbV.insertarVuelo(new Vuelo(origen, destino, fechaIda, fechaRegreso, cantidadPasajeros, descuento));
            arregloConVuelos.removeAll(arregloConVuelos);
            arregloConVuelos = getListaVuelo();
            this.setChanged();
            this.notifyObservers();
        } catch (Exception ex) {
            throw (new Exception(ex.getMessage()));
        }
    }

//    
//    public void eliminarVuelo() {
//        vuelo = null;
//        synchronized (this) {
//            this.setChanged();
//            this.notifyObservers(vuelo);
//        }
//    }
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

    public ServicioVuelo getDb() {
        return dbV;
    }

    public void setDb(ServicioVuelo dbV) {
        this.dbV = dbV;
        arregloConVuelos.removeAll(arregloConVuelos);
        arregloConVuelos = getListaVuelo();
        this.setChanged();
        this.notifyObservers();
    }

    public ArrayList<Vuelo> getListaVuelo() {
        ArrayList<Vuelo> list = null;
        try {
            list = dbV.listarVuelo();
        } catch (GlobalException | NoDataException ex) {

        }
        return list;
    }

    public void buscarVueloPorNombre(String origen) throws Exception {
        arregloConVuelos.removeAll(arregloConVuelos);
        try {
            if (origen.equals("")) {
                throw (new Exception("Debe ingresar un nombre"));
            }
            Iterator<Vuelo> ite = dbV.listarVuelo().iterator();
            while (ite.hasNext()) {
                Vuelo aux = ite.next();
                if (aux.getOrigen().equals(origen)) {

                    arregloConVuelos.add(aux);
                }
            }
            this.setChanged();
            this.notifyObservers();

        } catch (Exception ex) {
            throw (new Exception(ex.getMessage()));
        }
    }

    public void eliminarVuelo(String codigo) throws Exception {
        try {
            if (codigo.equals("")) {
                throw (new Exception("Debe ingresar un codigo"));
            }
            dbV.eliminarVuelo(codigo);

            arregloConVuelos.removeAll(arregloConVuelos);
            arregloConVuelos = getListaVuelo();
            this.setChanged();
            this.notifyObservers();

        } catch (Exception ex) {
            throw (new Exception(ex.getMessage()));
        }
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

}
