package br.edu.ifsuldeminas.mch.estacaoespacial.repository;

import br.edu.ifsuldeminas.mch.estacaoespacial.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    Optional<Empresa> findByCnpj(String cnpj);
}
