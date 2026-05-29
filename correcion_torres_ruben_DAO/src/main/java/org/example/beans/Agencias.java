package org.example.beans;

public class Agencias {
    private Agencias agencia;
    private String nombre_agencia;
    private String pais;
    private String fecha_fundacion;
    private String autor_examen;

    public Agencias getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencias agencia) {
        this.agencia = agencia;
    }

    public String getNombre_agencia() {
        return nombre_agencia;
    }

    public void setNombre_agencia(String nombre_agencia) {
        this.nombre_agencia = nombre_agencia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha_fundacion() {
        return fecha_fundacion;
    }

    public void setFecha_fundacion(String fecha_fundacion) {
        this.fecha_fundacion = fecha_fundacion;
    }

    public String getAutor_examen() {
        return autor_examen;
    }

    public void setAutor_examen(String autor_examen) {
        this.autor_examen = autor_examen;
    }
}
