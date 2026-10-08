package br.senai.sagsa.SAGSA.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sagsa.SAGSA.models.ConteudoDesafioSAPZ;
import br.senai.sagsa.SAGSA.services.ConteudoDesafioSAPZService;

@RestController
@RequestMapping("/conteudos-desafios-sapz")
public class ConteudoDesafioSAPZController {

    private final ConteudoDesafioSAPZService conteudoDesafioSAPZService;

    public ConteudoDesafioSAPZController(
            ConteudoDesafioSAPZService conteudoDesafioSAPZService) {
        this.conteudoDesafioSAPZService = conteudoDesafioSAPZService;
    }

    @PostMapping
    public ConteudoDesafioSAPZ salvar(
            @RequestBody ConteudoDesafioSAPZ conteudoDesafioSAPZ) {
        return conteudoDesafioSAPZService.salvar(conteudoDesafioSAPZ);
    }
}