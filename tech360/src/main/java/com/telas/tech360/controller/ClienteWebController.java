package com.telas.tech360.controller;

import com.telas.tech360.model.Cliente;
import com.telas.tech360.service.ClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class ClienteWebController {

    private final ClienteService clienteService;

    public ClienteWebController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public String listarClientes(Model model, @RequestParam(required = false) String mensaje, @RequestParam(required = false) String error) {
        model.addAttribute("clientes", clienteService.listarClientes());
        model.addAttribute("mensaje", mensaje); // Mensaje de éxito
        model.addAttribute("error", error);     // Mensaje de error
        return "clientes/lista";
    }

    @GetMapping("/crear")
    public String mostrarFormularioCrear(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "clientes/formulario";
    }

    @PostMapping("/guardar")
    public String guardarCliente(@ModelAttribute Cliente cliente) {
        clienteService.guardarCliente(cliente);
        return "redirect:/clientes?mensaje=Cliente guardado exitosamente.";
    }

    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Integer id, Model model) {
        Cliente cliente = clienteService.obtenerClientePorId(id);
        if (cliente != null) {
            model.addAttribute("cliente", cliente);
            return "clientes/formulario";
        }
        return "redirect:/clientes?error=Cliente no encontrado.";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable Integer id) {
        try {
            clienteService.eliminarCliente(id);
            return "redirect:/clientes?mensaje=Cliente eliminado correctamente.";
        } catch (Exception e) {
            return "redirect:/clientes?error=No se pudo eliminar el cliente.";
        }
    }
}
