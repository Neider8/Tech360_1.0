package com.telas.tech360.controller;

import com.telas.tech360.model.Operario;
import com.telas.tech360.service.OperarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/operarios")
public class OperarioController {
    private final OperarioService operarioService;

    public OperarioController(OperarioService operarioService) {
        this.operarioService = operarioService;
    }

    @GetMapping
    public List<Operario> listarOperarios() {
        return operarioService.listarOperarios();
    }

    @GetMapping("/{id}")
    public Operario obtenerOperario(@PathVariable Integer id) {
        return operarioService.obtenerOperarioPorId(id);
    }

    @PostMapping
    public Operario guardarOperario(@RequestBody Operario operario) {
        return operarioService.guardarOperario(operario);
    }

    @DeleteMapping("/{id}")
    public void eliminarOperario(@PathVariable Integer id) {
        operarioService.eliminarOperario(id);
    }
}
