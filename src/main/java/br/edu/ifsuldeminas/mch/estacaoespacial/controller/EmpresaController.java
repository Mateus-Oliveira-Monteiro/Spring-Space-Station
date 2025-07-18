package br.edu.ifsuldeminas.mch.estacaoespacial.controller;

import br.edu.ifsuldeminas.mch.estacaoespacial.model.Empresa;
import br.edu.ifsuldeminas.mch.estacaoespacial.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/empresas")
public class EmpresaController {
    
    @Autowired
    private EmpresaService empresaService;
    
    @GetMapping
    public String listEmpresas(Model model) {
        model.addAttribute("empresas", empresaService.findAll());
        return "empresas/list";
    }
    
    @GetMapping("/new")
    public String newEmpresa(Model model) {
        model.addAttribute("empresa", new Empresa());
        return "empresas/form";
    }
    
    @GetMapping("/{id}")
    public String viewEmpresa(@PathVariable Long id, Model model) {
        empresaService.findById(id).ifPresent(empresa -> model.addAttribute("empresa", empresa));
        return "empresas/view";
    }
    
    @GetMapping("/{id}/edit")
    public String editEmpresa(@PathVariable Long id, Model model) {
        empresaService.findById(id).ifPresent(empresa -> model.addAttribute("empresa", empresa));
        return "empresas/form";
    }
    
    @PostMapping
    public String saveEmpresa(@ModelAttribute Empresa empresa) {
        empresaService.save(empresa);
        return "redirect:/empresas";
    }
    
    @GetMapping("/{id}/delete")
    public String deleteEmpresa(@PathVariable Long id) {
        empresaService.deleteById(id);
        return "redirect:/empresas";
    }
}
