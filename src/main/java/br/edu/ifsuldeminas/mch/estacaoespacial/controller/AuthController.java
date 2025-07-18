package br.edu.ifsuldeminas.mch.estacaoespacial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {
    
    @GetMapping("/")
    public String login() {
        return "login";
    }
    
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    
    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
    
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
