package projeto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projeto.models.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository <Pessoa, Long> {

    
} 
