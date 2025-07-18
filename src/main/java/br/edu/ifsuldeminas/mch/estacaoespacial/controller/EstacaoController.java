package br.edu.ifsuldeminas.mch.estacaoespacial.controller;

import br.edu.ifsuldeminas.mch.estacaoespacial.model.Estacao;
import br.edu.ifsuldeminas.mch.estacaoespacial.service.EstacaoService;
import br.edu.ifsuldeminas.mch.estacaoespacial.service.UserService;
import br.edu.ifsuldeminas.mch.estacaoespacial.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estacoes")
public class EstacaoController {
    
    @Autowired
    private EstacaoService estacaoService;
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private EmpresaService empresaService;
    
    @GetMapping
    public String listEstacoes(Model model) {
        model.addAttribute("estacoes", estacaoService.findAll());
        return "estacoes/list";
    }
    
    @GetMapping("/new")
    public String newEstacao(Model model) {
        model.addAttribute("estacao", new Estacao());
        model.addAttribute("users", userService.findAll());
        model.addAttribute("empresas", empresaService.findAll());
        return "estacoes/form";
    }
    
    @GetMapping("/{id}")
    public String viewEstacao(@PathVariable Long id, Model model) {
        estacaoService.findById(id).ifPresent(estacao -> model.addAttribute("estacao", estacao));
        return "estacoes/view";
    }
    
    @GetMapping("/{id}/edit")
    public String editEstacao(@PathVariable Long id, Model model) {
        estacaoService.findById(id).ifPresent(estacao -> model.addAttribute("estacao", estacao));
        model.addAttribute("users", userService.findAll());
        model.addAttribute("empresas", empresaService.findAll());
        return "estacoes/form";
    }
    
    @PostMapping
    public String saveEstacao(@ModelAttribute Estacao estacao) {
        estacaoService.save(estacao);
        return "redirect:/estacoes";
    }
    
    @GetMapping("/{id}/delete")
    public String deleteEstacao(@PathVariable Long id) {
        estacaoService.deleteById(id);
        return "redirect:/estacoes";
    }
}
