package com.telas.tech360.service;

import com.telas.tech360.model.VarianteProducto;
import com.telas.tech360.repository.VarianteProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VarianteProductoService {

    private final VarianteProductoRepository varianteProductoRepository;

    public VarianteProductoService(VarianteProductoRepository varianteProductoRepository) {
        this.varianteProductoRepository = varianteProductoRepository;
    }

    public List<VarianteProducto> listarVariantes() {
        return varianteProductoRepository.findAll();
    }

    public VarianteProducto guardarVariante(VarianteProducto variante) {
        return varianteProductoRepository.save(variante);
    }

    public VarianteProducto obtenerVariantePorId(Integer id) {
        return varianteProductoRepository.findById(id).orElse(null);
    }

    public void eliminarVariante(Integer id) {
        varianteProductoRepository.deleteById(id);
    }
}
