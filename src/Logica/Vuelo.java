/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

public class Vuelo {
    
    private String origen;
    private String destino;
    private String fechaIda;
    private String fechaRegreso;
    private int cantidadPasajeros;
    private int descuento;

    public Vuelo(String origen, String destino, String fechaIda, String fechaRegreso, int cantidadPasajeros, int descuento) {
        this.origen = origen;
        this.destino = destino;
        this.fechaIda = fechaIda;
        this.fechaRegreso = fechaRegreso;
        this.cantidadPasajeros = cantidadPasajeros;
        this.descuento = descuento;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

    public String getFechaRegreso() {
        return fechaRegreso;
    }

    public void setFechaRegreso(String fechaRegreso) {
        this.fechaRegreso = fechaRegreso;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "origen=" + origen + ", destino=" + destino + ", fechaIda=" + fechaIda + ", fechaRegreso=" + fechaRegreso + ", cantidadPasajeros=" + cantidadPasajeros + ", descuento=" + descuento + '}';
    }
    
    
    
    
    
}
