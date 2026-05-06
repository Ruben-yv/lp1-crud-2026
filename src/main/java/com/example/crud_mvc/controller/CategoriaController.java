package com.example.crud_mvc.controller;

import com.example.crud_mvc.model.Categoria;
import com.example.crud_mvc.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;
    @Autowired
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("cats", categoriaService.readAll());
        model.addAttribute("categoria", new Categoria());
        return "categorias/listcat";
    }
    @PostMapping("/save")
    public String save(@Valid @ModelAttribute Categoria categoria, BindingResult result, Model model) {
        if(result.hasErrors()) {
            model.addAttribute("categorias", categoriaService.readAll());
        }
        categoriaService.create(categoria);
        return "redirect:/categorias";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        categoriaService.delete(id);
        return "redirect:/categorias";
    }

}
