package br.edu.ifsuldeminas.mch.estacaoespacial.config;

import br.edu.ifsuldeminas.mch.estacaoespacial.model.*;
import br.edu.ifsuldeminas.mch.estacaoespacial.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;

@Component
public class DataInitializer implements CommandLineRunner {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private EmpresaService empresaService;
    
    @Autowired
    private EstacaoService estacaoService;
    
    @Override
    public void run(String... args) throws Exception {
        // Criar usuários fake
        Address address1 = new Address("Rua das Estrelas, 123", "São Paulo", "SP", "01234-567", "Brasil");
        User user1 = new User(null, "João Silva", User.Gender.MASCULINO, address1, "joao@email.com");
        userService.save(user1);
        
        Address address2 = new Address("Av. Galáxia, 456", "Rio de Janeiro", "RJ", "02345-678", "Brasil");
        User user2 = new User(null, "Maria Santos", User.Gender.FEMININO, address2, "maria@email.com");
        userService.save(user2);
        
        Address address3 = new Address("Rua Nebulosa, 789", "Belo Horizonte", "MG", "03456-789", "Brasil");
        User user3 = new User(null, "Pedro Costa", User.Gender.MASCULINO, address3, "pedro@email.com");
        userService.save(user3);
        
        // Criar empresas fake
        Empresa empresa1 = new Empresa(null, "SpaceX Brasil", "12.345.678/0001-90", 500);
        empresaService.save(empresa1);
        
        Empresa empresa2 = new Empresa(null, "NASA Technologies", "23.456.789/0001-01", 1200);
        empresaService.save(empresa2);
        
        Empresa empresa3 = new Empresa(null, "Blue Origin SA", "34.567.890/0001-12", 800);
        empresaService.save(empresa3);
        
        // Criar estações espaciais fake
        Estacao estacao1 = new Estacao(null, "Estação Alpha", 85.5, LocalDate.of(2023, 3, 15), user1, empresa1);
        estacaoService.save(estacao1);
        
        Estacao estacao2 = new Estacao(null, "Estação Beta", 92.0, LocalDate.of(2023, 6, 22), user2, empresa2);
        estacaoService.save(estacao2);
        
        Estacao estacao3 = new Estacao(null, "Estação Gamma", 78.3, LocalDate.of(2023, 9, 10), user3, empresa3);
        estacaoService.save(estacao3);
        
        Estacao estacao4 = new Estacao(null, "Estação Delta", 96.7, LocalDate.of(2024, 1, 5), user1, empresa2);
        estacaoService.save(estacao4);
        
        Estacao estacao5 = new Estacao(null, "Estação Omega", 88.9, LocalDate.of(2024, 4, 18), user2, empresa3);
        estacaoService.save(estacao5);
        
        System.out.println("Dados fake inicializados com sucesso!");
    }
}
