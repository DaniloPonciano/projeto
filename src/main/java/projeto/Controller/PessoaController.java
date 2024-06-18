package projeto.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import projeto.Repository.PessoaRepository;
import projeto.models.Pessoa;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping("/pessoa/create")
        public String create(){
            return "pessoa/create";
        }

    @PostMapping("/pessoa/create")
    public String create(Pessoa pessoa){
                pessoaRepository.save(pessoa);
        
        return "pessoa/create";
    }
}
