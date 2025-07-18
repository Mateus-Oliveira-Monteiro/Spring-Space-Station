package br.edu.ifsuldeminas.mch.estacaoespacial.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
