package com.telas.tech360.controller;

import com.telas.tech360.model.Gerente;
import com.telas.tech360.service.GerenteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gerentes")
public class GerenteController {
    private final GerenteService gerenteService;

    public GerenteController(GerenteService gerenteService) {
        this.gerenteService = gerenteService;
    }

    @GetMapping
    public List<Gerente> listarGerentes() {
        return gerenteService.listarGerentes();
    }

    @GetMapping("/{id}")
    public Gerente obtenerGerente(@PathVariable Integer id) {
        return gerenteService.obtenerGerentePorId(id);
    }

    @PostMapping
    public Gerente guardarGerente(@RequestBody Gerente gerente) {
        return gerenteService.guardarGerente(gerente);
    }

    @DeleteMapping("/{id}")
    public void eliminarGerente(@PathVariable Integer id) {
        gerenteService.eliminarGerente(id);
    }
}
