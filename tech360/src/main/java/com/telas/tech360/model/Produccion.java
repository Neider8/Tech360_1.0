package com.telas.tech360.model;

import jakarta.persistence.*;

@Entity
public class Produccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduccion;

    private String estadoProduccion;
    private String fechaInicio;
    private String fechaFin;

    @ManyToOne
    @JoinColumn(name = "idOperario", referencedColumnName = "idOperario")
    private Operario operario;

    @ManyToOne
    @JoinColumn(name = "idMaquina", referencedColumnName = "idMaquina")
    private Maquina maquina;

    @ManyToOne
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto")
    private Producto producto;

    // Getters y setters
    public Integer getIdProduccion() {
        return idProduccion;
    }

    public void setIdProduccion(Integer idProduccion) {
        this.idProduccion = idProduccion;
    }

    public String getEstadoProduccion() {
        return estadoProduccion;
    }

    public void setEstadoProduccion(String estadoProduccion) {
        this.estadoProduccion = estadoProduccion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Operario getOperario() {
        return operario;
    }

    public void setOperario(Operario operario) {
        this.operario = operario;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
