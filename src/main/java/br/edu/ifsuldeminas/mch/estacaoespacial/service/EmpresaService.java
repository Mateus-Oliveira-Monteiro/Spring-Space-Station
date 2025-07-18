package br.edu.ifsuldeminas.mch.estacaoespacial.service;

import br.edu.ifsuldeminas.mch.estacaoespacial.model.Empresa;
import br.edu.ifsuldeminas.mch.estacaoespacial.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {
    
    @Autowired
    private EmpresaRepository empresaRepository;
    
    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }
    
    public Optional<Empresa> findById(Long id) {
        return empresaRepository.findById(id);
    }
    
    public Optional<Empresa> findByCnpj(String cnpj) {
        return empresaRepository.findByCnpj(cnpj);
    }
    
    public Empresa save(Empresa empresa) {
        return empresaRepository.save(empresa);
    }
    
    public void deleteById(Long id) {
        empresaRepository.deleteById(id);
    }
}
