package com.telas.tech360.controller;

import com.telas.tech360.model.MateriaPrima;
import com.telas.tech360.service.MateriaPrimaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materiasprimas")
public class MateriaPrimaController {
    private final MateriaPrimaService materiaPrimaService;

    public MateriaPrimaController(MateriaPrimaService materiaPrimaService) {
        this.materiaPrimaService = materiaPrimaService;
    }

    @GetMapping
    public List<MateriaPrima> listarMateriasPrimas() {
        return materiaPrimaService.listarMateriasPrimas();
    }

    @GetMapping("/{id}")
    public MateriaPrima obtenerMateriaPrima(@PathVariable Integer id) {
        return materiaPrimaService.obtenerMateriaPrimaPorId(id);
    }

    @PostMapping
    public MateriaPrima guardarMateriaPrima(@RequestBody MateriaPrima materiaPrima) {
        return materiaPrimaService.guardarMateriaPrima(materiaPrima);
    }

    @DeleteMapping("/{id}")
    public void eliminarMateriaPrima(@PathVariable Integer id) {
        materiaPrimaService.eliminarMateriaPrima(id);
    }
}
