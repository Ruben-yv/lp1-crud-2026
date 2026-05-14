package com.example.crud_mvc.controller;

import com.example.crud_mvc.model.Categoria;
import com.example.crud_mvc.model.Cliente;
import com.example.crud_mvc.service.CategoriaService;
import com.example.crud_mvc.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
    private final ClienteService clienteService;
    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("clients", clienteService.readAll());
        model.addAttribute("cliente", new Cliente());
        return "clientes/listclients";
    }
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Cliente cliente, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("clientes", clienteService.readAll());
        }
        clienteService.create(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        clienteService.delete(id);
        return "redirect:/clientes";
    }
}
