package br.edu.ifsuldeminas.mch.estacaoespacial.controller;

import br.edu.ifsuldeminas.mch.estacaoespacial.model.User;
import br.edu.ifsuldeminas.mch.estacaoespacial.model.Address;
import br.edu.ifsuldeminas.mch.estacaoespacial.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @GetMapping
    public String listUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "users/list";
    }
    
    @GetMapping("/new")
    public String newUser(Model model) {
        User user = new User();
        user.setAddress(new Address());
        model.addAttribute("user", user);
        return "users/form";
    }
    
    @GetMapping("/{id}")
    public String viewUser(@PathVariable Long id, Model model) {
        userService.findById(id).ifPresent(user -> model.addAttribute("user", user));
        return "users/view";
    }
    
    @GetMapping("/{id}/edit")
    public String editUser(@PathVariable Long id, Model model) {
        userService.findById(id).ifPresent(user -> model.addAttribute("user", user));
        return "users/form";
    }
    
    @PostMapping
    public String saveUser(@ModelAttribute User user) {
        userService.save(user);
        return "redirect:/users";
    }
    
    @GetMapping("/{id}/delete")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
        return "redirect:/users";
    }
}
