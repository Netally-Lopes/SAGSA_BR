package br.senai.sagsa.SAGSA.services;

import org.springframework.stereotype.Service;

import br.senai.sagsa.SAGSA.models.UnidadeCurricular;
import br.senai.sagsa.SAGSA.repositories.UnidadeCurricularRepository;

@Service
public class UnidadeCurricularService {

    private final UnidadeCurricularRepository unidadeCurricularRepository;

    public UnidadeCurricularService(UnidadeCurricularRepository unidadeCurricularRepository) {
        this.unidadeCurricularRepository = unidadeCurricularRepository;
    }

    public UnidadeCurricular salvar(UnidadeCurricular unidadeCurricular) {
        return unidadeCurricularRepository.save(unidadeCurricular);
    }
}