package br.edu.ifsuldeminas.mch.estacaoespacial.service;

import br.edu.ifsuldeminas.mch.estacaoespacial.model.Estacao;
import br.edu.ifsuldeminas.mch.estacaoespacial.repository.EstacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EstacaoService {
    
    @Autowired
    private EstacaoRepository estacaoRepository;
    
    public List<Estacao> findAll() {
        return estacaoRepository.findAll();
    }
    
    public Optional<Estacao> findById(Long id) {
        return estacaoRepository.findById(id);
    }
    
    public List<Estacao> findByUserId(Long userId) {
        return estacaoRepository.findByUserId(userId);
    }
    
    public List<Estacao> findByEmpresaId(Long empresaId) {
        return estacaoRepository.findByEmpresaId(empresaId);
    }
    
    public Estacao save(Estacao estacao) {
        return estacaoRepository.save(estacao);
    }
    
    public void deleteById(Long id) {
        estacaoRepository.deleteById(id);
    }
}
