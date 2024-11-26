package com.telas.tech360.service;

import com.telas.tech360.model.Inventario;
import com.telas.tech360.repository.InventarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    private final InventarioRepository inventarioRepository;

    public InventarioService(InventarioRepository inventarioRepository) {
        this.inventarioRepository = inventarioRepository;
    }

    public List<Inventario> listarInventarios() {
        return inventarioRepository.findAll();
    }

    public Inventario guardarInventario(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    public Inventario obtenerInventarioPorId(Integer id) {
        return inventarioRepository.findById(id).orElse(null);
    }

    public void eliminarInventario(Integer id) {
        inventarioRepository.deleteById(id);
    }
}
