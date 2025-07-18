package br.edu.ifsuldeminas.mch.estacaoespacial.repository;

import br.edu.ifsuldeminas.mch.estacaoespacial.model.Estacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EstacaoRepository extends JpaRepository<Estacao, Long> {
    List<Estacao> findByUserId(Long userId);
    List<Estacao> findByEmpresaId(Long empresaId);
}
