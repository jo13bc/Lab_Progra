package Logica;

import java.sql.Date;


public class Usuario {

  
    public String usuario;
    public String contrasena;
    public String nombre;
    public String apellidos;
    public String email;
    public String fecha;
    public String direccion;
    public int telefonoTrabajo;
    public int celular;
    
    
    public Usuario(String usuario, String contrasena, String nombre, String apellidos,
            String email, String fecha, String direccion, int telefonoTrabajo, int celular) {
        this.usuario  = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fecha  = fecha;
        this.direccion = direccion;
        this.telefonoTrabajo = telefonoTrabajo;
        this.celular = celular;
    }
    
    
    public String getUsuario() {
        return usuario;
    }

   
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

 
    public String getPassword() {
        return contrasena;
    }

 
    public void setPassword(String contrasena) {
        this.contrasena = contrasena;
    }


    public String getNombre() {
        return nombre;
    }

  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellidos() {
        return apellidos;
    }

 
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

 
    public String getEmail() {
        return email;
    }

 
    public void setEmail(String email) {
        this.email = email;
    }

   
    public String getFecha() {
        return fecha;
    }


    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

  
    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public int getTelefonoTrabajo() {
        return telefonoTrabajo;
    }


    public void setTelefonoTrabajo(int telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }


    public int getCelular() {
        return celular;
    }


    public void setCelular(int celular) {
        this.celular = celular;
    }

    

   
}
