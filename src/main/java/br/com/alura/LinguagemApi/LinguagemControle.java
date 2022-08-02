package br.com.alura.LinguagemApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemControle {
   @Autowired
    private LiguagemRepository repository ;
    
    @GetMapping  ("Liguagems")
    public List<Liguagem> obterLinguagens(){
        List<Liguagem> liguagem = repository.findAll();
        return  liguagem;
    }

  
}
