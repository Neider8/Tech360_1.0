package com.telas.tech360.service;

import com.telas.tech360.model.DetallePedido;
import com.telas.tech360.repository.DetallePedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoService {

    private final DetallePedidoRepository detallePedidoRepository;

    public DetallePedidoService(DetallePedidoRepository detallePedidoRepository) {
        this.detallePedidoRepository = detallePedidoRepository;
    }

    public List<DetallePedido> listarDetalles() {
        return detallePedidoRepository.findAll();
    }

    public DetallePedido guardarDetalle(DetallePedido detalle) {
        return detallePedidoRepository.save(detalle);
    }

    public DetallePedido obtenerDetallePorId(Integer id) {
        return detallePedidoRepository.findById(id).orElse(null);
    }

    public void eliminarDetalle(Integer id) {
        detallePedidoRepository.deleteById(id);
    }
}
