package br.com.alura.LinguagemApi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LiguagemRepository extends MongoRepository <liguagem, String> {
      
}
