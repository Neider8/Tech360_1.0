package com.telas.tech360.service;

import com.telas.tech360.model.Produccion;
import com.telas.tech360.repository.ProduccionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduccionService {

    private final ProduccionRepository produccionRepository;

    public ProduccionService(ProduccionRepository produccionRepository) {
        this.produccionRepository = produccionRepository;
    }

    public List<Produccion> listarProducciones() {
        return produccionRepository.findAll();
    }

    public Produccion guardarProduccion(Produccion produccion) {
        return produccionRepository.save(produccion);
    }

    public Produccion obtenerProduccionPorId(Integer id) {
        return produccionRepository.findById(id).orElse(null);
    }

    public void eliminarProduccion(Integer id) {
        produccionRepository.deleteById(id);
    }
}
