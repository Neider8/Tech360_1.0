package com.telas.tech360.service;

import com.telas.tech360.model.Factura;
import com.telas.tech360.repository.FacturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaService {

    private final FacturaRepository facturaRepository;

    public FacturaService(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    public List<Factura> listarFacturas() {
        return facturaRepository.findAll();
    }

    public Factura guardarFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    public Factura obtenerFacturaPorId(Integer id) {
        return facturaRepository.findById(id).orElse(null);
    }

    public void eliminarFactura(Integer id) {
        facturaRepository.deleteById(id);
    }
}
