package com.telas.tech360.controller;

import com.telas.tech360.model.VarianteProducto;
import com.telas.tech360.service.VarianteProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/variantes")
public class VarianteProductoController {
    private final VarianteProductoService varianteProductoService;

    public VarianteProductoController(VarianteProductoService varianteProductoService) {
        this.varianteProductoService = varianteProductoService;
    }

    @GetMapping
    public List<VarianteProducto> listarVariantes() {
        return varianteProductoService.listarVariantes();
    }

    @GetMapping("/{id}")
    public VarianteProducto obtenerVariante(@PathVariable Integer id) {
        return varianteProductoService.obtenerVariantePorId(id);
    }

    @PostMapping
    public VarianteProducto guardarVariante(@RequestBody VarianteProducto variante) {
        return varianteProductoService.guardarVariante(variante);
    }

    @DeleteMapping("/{id}")
    public void eliminarVariante(@PathVariable Integer id) {
        varianteProductoService.eliminarVariante(id);
    }
}
