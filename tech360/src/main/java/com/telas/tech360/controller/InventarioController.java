package com.telas.tech360.controller;

import com.telas.tech360.model.Inventario;
import com.telas.tech360.service.InventarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventarios")
public class InventarioController {
    private final InventarioService inventarioService;

    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @GetMapping
    public List<Inventario> listarInventarios() {
        return inventarioService.listarInventarios();
    }

    @GetMapping("/{id}")
    public Inventario obtenerInventario(@PathVariable Integer id) {
        return inventarioService.obtenerInventarioPorId(id);
    }

    @PostMapping
    public Inventario guardarInventario(@RequestBody Inventario inventario) {
        return inventarioService.guardarInventario(inventario);
    }

    @DeleteMapping("/{id}")
    public void eliminarInventario(@PathVariable Integer id) {
        inventarioService.eliminarInventario(id);
    }
}
