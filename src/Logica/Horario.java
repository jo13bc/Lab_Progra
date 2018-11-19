package Logica;

import java.sql.Date;
import java.sql.Time;


public class Horario {
    
    private int identificador;
    private Date horario;
    private Date horaLlegada;
    private float precio;

    public Horario(int identificador, Date horario, float precio) {
        this.identificador = identificador;
        this.horario = horario;
        this.precio = precio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void calcular(Time duracion) {
        horaLlegada.after(duracion);
    }
}
