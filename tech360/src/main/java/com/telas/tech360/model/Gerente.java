package com.telas.tech360.model;

import jakarta.persistence.*;

@Entity
public class Gerente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idGerente;

    private String nombreGerente;
    private String apellidoGerente;
    private String cedula;
    private String correo;

    // Getters y setters
    public Integer getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(Integer idGerente) {
        this.idGerente = idGerente;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public String getApellidoGerente() {
        return apellidoGerente;
    }

    public void setApellidoGerente(String apellidoGerente) {
        this.apellidoGerente = apellidoGerente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
