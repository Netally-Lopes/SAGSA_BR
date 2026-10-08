package br.senai.sagsa.SAGSA.services;

import org.springframework.stereotype.Service;

import br.senai.sagsa.SAGSA.models.ConteudoDesafioSAPZ;
import br.senai.sagsa.SAGSA.repositories.ConteudoDesafioSAPZRepository;

@Service
public class ConteudoDesafioSAPZService {

    private final ConteudoDesafioSAPZRepository conteudoDesafioSAPZRepository;

    public ConteudoDesafioSAPZService(ConteudoDesafioSAPZRepository conteudoDesafioSAPZRepository) {
        this.conteudoDesafioSAPZRepository = conteudoDesafioSAPZRepository;
    }

    public ConteudoDesafioSAPZ salvar(ConteudoDesafioSAPZ conteudoDesafioSAPZ) {
        return conteudoDesafioSAPZRepository.save(conteudoDesafioSAPZ);
    }
}