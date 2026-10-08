package br.senai.sagsa.SAGSA.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sagsa.SAGSA.models.UnidadeCurricular;
import br.senai.sagsa.SAGSA.services.UnidadeCurricularService;

@RestController
@RequestMapping("/unidades-curriculares")
public class UnidadeCurricularController {

    private final UnidadeCurricularService unidadeCurricularService;

    public UnidadeCurricularController(UnidadeCurricularService unidadeCurricularService) {
        this.unidadeCurricularService = unidadeCurricularService;
    }

    @PostMapping
    public UnidadeCurricular salvar(@RequestBody UnidadeCurricular unidadeCurricular) {
        return unidadeCurricularService.salvar(unidadeCurricular);
    }
}