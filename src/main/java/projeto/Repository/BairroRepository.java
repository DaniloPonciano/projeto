package projeto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import projeto.models.Bairro;

@Repository
public interface BairroRepository extends JpaRepository<Bairro, Long>{
    
}
