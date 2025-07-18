package br.edu.ifsuldeminas.mch.estacaoespacial.repository;

import br.edu.ifsuldeminas.mch.estacaoespacial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
