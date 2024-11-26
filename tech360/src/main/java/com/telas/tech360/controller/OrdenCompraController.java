package com.telas.tech360.controller;

import com.telas.tech360.model.OrdenCompra;
import com.telas.tech360.service.OrdenCompraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ordenescompra")
public class OrdenCompraController {
    private final OrdenCompraService ordenCompraService;

    public OrdenCompraController(OrdenCompraService ordenCompraService) {
        this.ordenCompraService = ordenCompraService;
    }

    @GetMapping
    public List<OrdenCompra> listarOrdenesCompra() {
        return ordenCompraService.listarOrdenes();
    }

    @GetMapping("/{id}")
    public OrdenCompra obtenerOrdenCompra(@PathVariable Integer id) {
        return ordenCompraService.obtenerOrdenPorId(id);
    }

    @PostMapping
    public OrdenCompra guardarOrdenCompra(@RequestBody OrdenCompra ordenCompra) {
        return ordenCompraService.guardarOrden(ordenCompra);
    }

    @DeleteMapping("/{id}")
    public void eliminarOrdenCompra(@PathVariable Integer id) {
        ordenCompraService.eliminarOrden(id);
    }
}
