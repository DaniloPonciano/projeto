package projeto.DataInitializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import projeto.Repository.CategoriaRepository;
import projeto.models.Categoria;

@DataInitilizerType
@Component
public class CategoriaInitializer {
    @Autowired
    private CategoriaRepository categoriaRepository;

    private String[] categorias = {
        "Deficiência Física",
        "Deficiência Visual",
        "Deficiência Auditiva",
        "Deficiência Intelectual",
        "Deficiência Psicossocial",
        "Deficiência Múltipla",
    };

    public void init(){
            if (categoriaRepository.count() == 0) {
                for (String nomeCategoria : categorias) {
                    categoriaRepository.save(new Categoria(nomeCategoria));
                }    
            }
    }
}
