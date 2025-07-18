package br.edu.ifsuldeminas.mch.estacaoespacial.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;
    
    @Embedded
    private Address address;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    public enum Gender {
        MASCULINO, FEMININO, OUTRO
    }
}
