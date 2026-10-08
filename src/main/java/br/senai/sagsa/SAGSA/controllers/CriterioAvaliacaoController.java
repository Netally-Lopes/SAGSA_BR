package br.senai.sagsa.SAGSA.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sagsa.SAGSA.models.CriterioAvaliacao;
import br.senai.sagsa.SAGSA.services.CriterioAvaliacaoService;

@RestController
@RequestMapping("/criterios-avaliacao")
public class CriterioAvaliacaoController {

    private final CriterioAvaliacaoService criterioAvaliacaoService;

    public CriterioAvaliacaoController(CriterioAvaliacaoService criterioAvaliacaoService) {
        this.criterioAvaliacaoService = criterioAvaliacaoService;
    }

    @PostMapping
    public CriterioAvaliacao salvar(@RequestBody CriterioAvaliacao criterioAvaliacao) {
        return criterioAvaliacaoService.salvar(criterioAvaliacao);
    }
}