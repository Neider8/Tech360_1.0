package com.telas.tech360.controller;

import com.telas.tech360.model.DetallePedido;
import com.telas.tech360.service.DetallePedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalles")
public class DetallePedidoController {
    private final DetallePedidoService detallePedidoService;

    public DetallePedidoController(DetallePedidoService detallePedidoService) {
        this.detallePedidoService = detallePedidoService;
    }

    @GetMapping
    public List<DetallePedido> listarDetalles() {
        return detallePedidoService.listarDetalles();
    }

    @GetMapping("/{id}")
    public DetallePedido obtenerDetalle(@PathVariable Integer id) {
        return detallePedidoService.obtenerDetallePorId(id);
    }

    @PostMapping
    public DetallePedido guardarDetalle(@RequestBody DetallePedido detalle) {
        return detallePedidoService.guardarDetalle(detalle);
    }

    @DeleteMapping("/{id}")
    public void eliminarDetalle(@PathVariable Integer id) {
        detallePedidoService.eliminarDetalle(id);
    }
}
