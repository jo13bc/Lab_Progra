
package Logica;

public class Flota {
    Avion avion;
    Ruta ruta;
    Horario horario;

    public Flota(Avion avion, Ruta ruta, Horario horario) {
        this.avion = avion;
        this.ruta = ruta;
        this.horario = horario;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    
}
