package org.example.beans;

public class Satelites {
    private int id;
    private String nombre_satelite;
    private String orbita;
    private String peso;
    private int coste;
    private String activo;
    private String fecha_lanzamiento;
    private int agencia_id;
    private String autor_examen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_satelite() {
        return nombre_satelite;
    }

    public void setNombre_satelite(String nombre_satelite) {
        this.nombre_satelite = nombre_satelite;
    }

    public String getOrbita() {
        return orbita;
    }

    public void setOrbita(String orbita) {
        this.orbita = orbita;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getFecha_lanzamiento() {
        return fecha_lanzamiento;
    }

    public void setFecha_lanzamiento(String fecha_lanzamiento) {
        this.fecha_lanzamiento = fecha_lanzamiento;
    }

    public int getAgencia_id() {
        return agencia_id;
    }

    public void setAgencia_id(int agencia_id) {
        this.agencia_id = agencia_id;
    }

    public String getAutor_examen() {
        return autor_examen;
    }

    public void setAutor_examen(String autor_examen) {
        this.autor_examen = autor_examen;
    }
}
