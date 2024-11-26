package com.telas.tech360.controller;

import com.telas.tech360.model.Maquina;
import com.telas.tech360.service.MaquinaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/maquinas")
public class MaquinaController {
    private final MaquinaService maquinaService;

    public MaquinaController(MaquinaService maquinaService) {
        this.maquinaService = maquinaService;
    }

    @GetMapping
    public List<Maquina> listarMaquinas() {
        return maquinaService.listarMaquinas();
    }

    @GetMapping("/{id}")
    public Maquina obtenerMaquina(@PathVariable Integer id) {
        return maquinaService.obtenerMaquinaPorId(id);
    }

    @PostMapping
    public Maquina guardarMaquina(@RequestBody Maquina maquina) {
        return maquinaService.guardarMaquina(maquina);
    }

    @DeleteMapping("/{id}")
    public void eliminarMaquina(@PathVariable Integer id) {
        maquinaService.eliminarMaquina(id);
    }
}
