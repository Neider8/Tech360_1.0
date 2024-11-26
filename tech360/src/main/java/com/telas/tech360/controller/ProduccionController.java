package com.telas.tech360.controller;

import com.telas.tech360.model.Produccion;
import com.telas.tech360.service.ProduccionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/producciones")
public class ProduccionController {
    private final ProduccionService produccionService;

    public ProduccionController(ProduccionService produccionService) {
        this.produccionService = produccionService;
    }

    @GetMapping
    public List<Produccion> listarProducciones() {
        return produccionService.listarProducciones();
    }

    @GetMapping("/{id}")
    public Produccion obtenerProduccion(@PathVariable Integer id) {
        return produccionService.obtenerProduccionPorId(id);
    }

    @PostMapping
    public Produccion guardarProduccion(@RequestBody Produccion produccion) {
        return produccionService.guardarProduccion(produccion);
    }

    @DeleteMapping("/{id}")
    public void eliminarProduccion(@PathVariable Integer id) {
        produccionService.eliminarProduccion(id);
    }
}
