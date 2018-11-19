package Logica;

public class Avion {
    private String identificador;
    private String anno;
    private String modelo;
    private String marca;
    private int cantidadPasajeros;
    private int catidadFilas;
    private int cantidadColumnas;

    public Avion(String identificador, String anno, String modelo, String marca, int cantidadPasajeros, int catidadFilas, int cantidadColumnas) {
        this.identificador = identificador;
        this.anno = anno;
        this.modelo = modelo;
        this.marca = marca;
        this.cantidadPasajeros = cantidadPasajeros;
        this.catidadFilas = catidadFilas;
        this.cantidadColumnas = cantidadColumnas;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCatidadFilas() {
        return catidadFilas;
    }

    public void setCatidadFilas(int catidadFilas) {
        this.catidadFilas = catidadFilas;
    }

    public int getCantidadColumnas() {
        return cantidadColumnas;
    }

    public void setCantidadColumnas(int cantidadColumnas) {
        this.cantidadColumnas = cantidadColumnas;
    }
}
