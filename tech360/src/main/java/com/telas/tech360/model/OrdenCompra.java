package com.telas.tech360.model;

import jakarta.persistence.*;

@Entity
public class OrdenCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOrdenCompra;

    private Integer cantidad;

    @ManyToOne
    @JoinColumn(name = "idGerente", referencedColumnName = "idGerente")
    private Gerente gerente;

    @ManyToOne
    @JoinColumn(name = "idMateriaPrima", referencedColumnName = "idMateriaPrima")
    private MateriaPrima materiaPrima;

    // Getters y setters
    public Integer getIdOrdenCompra() {
        return idOrdenCompra;
    }

    public void setIdOrdenCompra(Integer idOrdenCompra) {
        this.idOrdenCompra = idOrdenCompra;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public MateriaPrima getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriaPrima materiaPrima) {
        this.materiaPrima = materiaPrima;
    }
}