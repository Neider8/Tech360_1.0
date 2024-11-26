package com.telas.tech360.service;

import com.telas.tech360.model.Pedido;
import com.telas.tech360.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido guardarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido obtenerPedidoPorId(Integer id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public void eliminarPedido(Integer id) {
        pedidoRepository.deleteById(id);
    }
}
