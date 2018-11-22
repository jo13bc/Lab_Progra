/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import AccesoADatos.GlobalException;
import AccesoADatos.NoDataException;
import AccesoADatos.ServicioUsuario;
import Logica.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;


public class ModeloRegistrar extends Observable {

    private Usuario usuario;
    private ServicioUsuario dbU;
    private ArrayList<Usuario> arregloConUsuarios;

    public ModeloRegistrar() {

//        usuario = null;
        arregloConUsuarios = new ArrayList();

    }

    public void setUsuario(Usuario estu) {
        usuario = estu;
        synchronized (this) {
            this.setChanged();
            this.notifyObservers(usuario);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public ServicioUsuario getDb() {
        return dbU;
    }

    public void setDb(ServicioUsuario dbU) {
        this.dbU = dbU;
        arregloConUsuarios.removeAll(arregloConUsuarios);
        arregloConUsuarios = getListaUsuario();
        this.setChanged();
        this.notifyObservers();
    }

//    public void insertarUsuario(String usuario, String contrasena, String nombre, String apellidos,
//            String correoElectronico, String fecha, String direccion, int telefonoTrabajo, int celular) throws Exception {
//        try {
////            if (usuario.equals("")) {
////                throw (new Exception("usuario invalido"));
////            }
////            if (nombre.equals("")) {
////                throw (new Exception("Nombre invalido"));
////            }
////            if (precio.equals("")) {
////                throw (new Exception("Precio invalido"));
////            }
//Usuario usu=new Usuario( usuario,  contrasena,  nombre,  apellidos,correoElectronico,  
//                    fecha,  direccion,  telefonoTrabajo,  celular);
//            System.out.println(usu.toString());
//            dbU.insertarUsuario(usu);
//           
//        } catch (Exception ex) {
//            throw (new Exception(ex.getMessage()));
//        }
//    }
    
    
    
    
    public void insertarUsuario(String usuario, String contrasena, String nombre, String apellidos,
            String correoElectronico, String fecha, String direccion, int telefonoTrabajo, int celular) throws GlobalException, NoDataException {
        
         dbU.insertarUsuario(new Usuario (usuario,  contrasena,  nombre,  apellidos,correoElectronico,  
                    fecha,  direccion,  telefonoTrabajo,  celular));
        
    }
    
    
    
    
    
       public ArrayList<Usuario> getListaUsuario() {
        ArrayList<Usuario> list = null;
        try {
            list = (ArrayList<Usuario>) dbU.listarUsuario();
        } catch (GlobalException | NoDataException ex) {

        }
        return list;
    }
    
    @Override
     public void notifyObservers() {
       
    }

    
}