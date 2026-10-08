package br.senai.sagsa.SAGSA.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sagsa.SAGSA.models.Conhecimento;
import br.senai.sagsa.SAGSA.services.ConhecimentoService;

@RestController
@RequestMapping("/conhecimentos")
public class ConhecimentoController {

    private final ConhecimentoService conhecimentoService;

    public ConhecimentoController(ConhecimentoService conhecimentoService) {
        this.conhecimentoService = conhecimentoService;
    }

    @PostMapping
    public Conhecimento salvar(@RequestBody Conhecimento conhecimento) {
        return conhecimentoService.salvar(conhecimento);
    }
}