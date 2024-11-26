package com.telas.tech360.service;

import com.telas.tech360.model.Operario;
import com.telas.tech360.repository.OperarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperarioService {

    private final OperarioRepository operarioRepository;

    public OperarioService(OperarioRepository operarioRepository) {
        this.operarioRepository = operarioRepository;
    }

    public List<Operario> listarOperarios() {
        return operarioRepository.findAll();
    }

    public Operario guardarOperario(Operario operario) {
        return operarioRepository.save(operario);
    }

    public Operario obtenerOperarioPorId(Integer id) {
        return operarioRepository.findById(id).orElse(null);
    }

    public void eliminarOperario(Integer id) {
        operarioRepository.deleteById(id);
    }
}
