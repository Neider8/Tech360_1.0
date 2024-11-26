package com.telas.tech360.service;

import com.telas.tech360.model.OrdenCompra;
import com.telas.tech360.repository.OrdenCompraRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdenCompraService {

    private final OrdenCompraRepository ordenCompraRepository;

    public OrdenCompraService(OrdenCompraRepository ordenCompraRepository) {
        this.ordenCompraRepository = ordenCompraRepository;
    }

    public List<OrdenCompra> listarOrdenes() {
        return ordenCompraRepository.findAll();
    }

    public OrdenCompra guardarOrden(OrdenCompra ordenCompra) {
        return ordenCompraRepository.save(ordenCompra);
    }

    public OrdenCompra obtenerOrdenPorId(Integer id) {
        return ordenCompraRepository.findById(id).orElse(null);
    }

    public void eliminarOrden(Integer id) {
        ordenCompraRepository.deleteById(id);
    }
}
