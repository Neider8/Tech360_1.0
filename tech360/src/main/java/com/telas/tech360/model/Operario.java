package com.telas.tech360.model;

import jakarta.persistence.*;

@Entity
public class Operario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOperario;

    private String nombreOperario;
    private String apellidoOperario;
    private String cedula;
    private String correo;
    private String celular;

    // Getters y setters
    public Integer getIdOperario() {
        return idOperario;
    }

    public void setIdOperario(Integer idOperario) {
        this.idOperario = idOperario;
    }

    public String getNombreOperario() {
        return nombreOperario;
    }

    public void setNombreOperario(String nombreOperario) {
        this.nombreOperario = nombreOperario;
    }

    public String getApellidoOperario() {
        return apellidoOperario;
    }

    public void setApellidoOperario(String apellidoOperario) {
        this.apellidoOperario = apellidoOperario;
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

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
}
