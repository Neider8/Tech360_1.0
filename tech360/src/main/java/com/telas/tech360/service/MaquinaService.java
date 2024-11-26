package com.telas.tech360.service;

import com.telas.tech360.model.Maquina;
import com.telas.tech360.repository.MaquinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaquinaService {

    private final MaquinaRepository maquinaRepository;

    public MaquinaService(MaquinaRepository maquinaRepository) {
        this.maquinaRepository = maquinaRepository;
    }

    public List<Maquina> listarMaquinas() {
        return maquinaRepository.findAll();
    }

    public Maquina guardarMaquina(Maquina maquina) {
        return maquinaRepository.save(maquina);
    }

    public Maquina obtenerMaquinaPorId(Integer id) {
        return maquinaRepository.findById(id).orElse(null);
    }

    public void eliminarMaquina(Integer id) {
        maquinaRepository.deleteById(id);
    }
}
