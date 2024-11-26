package com.telas.tech360.service;

import com.telas.tech360.model.Gerente;
import com.telas.tech360.repository.GerenteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerenteService {

    private final GerenteRepository gerenteRepository;

    public GerenteService(GerenteRepository gerenteRepository) {
        this.gerenteRepository = gerenteRepository;
    }

    public List<Gerente> listarGerentes() {
        return gerenteRepository.findAll();
    }

    public Gerente guardarGerente(Gerente gerente) {
        return gerenteRepository.save(gerente);
    }

    public Gerente obtenerGerentePorId(Integer id) {
        return gerenteRepository.findById(id).orElse(null);
    }

    public void eliminarGerente(Integer id) {
        gerenteRepository.deleteById(id);
    }
}
