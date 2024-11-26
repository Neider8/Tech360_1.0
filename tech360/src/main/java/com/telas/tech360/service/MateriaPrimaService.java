package com.telas.tech360.service;

import com.telas.tech360.model.MateriaPrima;
import com.telas.tech360.repository.MateriaPrimaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaPrimaService {

    private final MateriaPrimaRepository materiaPrimaRepository;

    public MateriaPrimaService(MateriaPrimaRepository materiaPrimaRepository) {
        this.materiaPrimaRepository = materiaPrimaRepository;
    }

    public List<MateriaPrima> listarMateriasPrimas() {
        return materiaPrimaRepository.findAll();
    }

    public MateriaPrima guardarMateriaPrima(MateriaPrima materiaPrima) {
        return materiaPrimaRepository.save(materiaPrima);
    }

    public MateriaPrima obtenerMateriaPrimaPorId(Integer id) {
        return materiaPrimaRepository.findById(id).orElse(null);
    }

    public void eliminarMateriaPrima(Integer id) {
        materiaPrimaRepository.deleteById(id);
    }
}
