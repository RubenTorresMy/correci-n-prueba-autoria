package org.example.beans;

public class Detalle_Satelite {
    private int id;
    private String velocidad_maxima;
    private String combusitble;
    private String vida_util;
    private String temperatura_maxima;
    private int satelite_id;
    private String autor_examen;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVelocidad_maxima() {
        return velocidad_maxima;
    }

    public void setVelocidad_maxima(String velocidad_maxima) {
        this.velocidad_maxima = velocidad_maxima;
    }

    public String getCombusitble() {
        return combusitble;
    }

    public void setCombusitble(String combusitble) {
        this.combusitble = combusitble;
    }

    public String getVida_util() {
        return vida_util;
    }

    public void setVida_util(String vida_util) {
        this.vida_util = vida_util;
    }

    public String getTemperatura_maxima() {
        return temperatura_maxima;
    }

    public void setTemperatura_maxima(String temperatura_maxima) {
        this.temperatura_maxima = temperatura_maxima;
    }

    public int getSatelite_id() {
        return satelite_id;
    }

    public void setSatelite_id(int satelite_id) {
        this.satelite_id = satelite_id;
    }

    public String getAutor_examen() {
        return autor_examen;
    }

    public void setAutor_examen(String autor_examen) {
        this.autor_examen = autor_examen;
    }
}
