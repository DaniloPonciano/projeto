package projeto.DataInitializer;


import org.springframework.stereotype.Component;

import projeto.models.Categoria;
import projeto.Repository.CategoriaRepository;


@Component
public class CategoriaInitializer {

    @DataInitializerType(repository = CategoriaRepository.class, model = Categoria.class)
    private String[] categorias = {
        "Físicas", 
        "Intelectuais", 
        "Sensoriais",
        "Psicossociais ou Mentais",
        "Neurológicas", 
        "Múltiplas",
        "Aprendizagem"
    };
}