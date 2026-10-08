package br.senai.sagsa.SAGSA.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sagsa.SAGSA.models.Capacidade;
import br.senai.sagsa.SAGSA.services.CapacidadeService;

@RestController
@RequestMapping("/capacidades")
public class CapacidadeController {

    private final CapacidadeService capacidadeService;

    public CapacidadeController(CapacidadeService capacidadeService) {
        this.capacidadeService = capacidadeService;
    }

    @PostMapping
    public Capacidade salvar(@RequestBody Capacidade capacidade) {
        return capacidadeService.salvar(capacidade);
    }
}