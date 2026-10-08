package br.senai.sagsa.SAGSA.services;

import org.springframework.stereotype.Service;

import br.senai.sagsa.SAGSA.models.CriterioAvaliacao;
import br.senai.sagsa.SAGSA.repositories.CriterioAvaliacaoRepository;

@Service
public class CriterioAvaliacaoService {

    private final CriterioAvaliacaoRepository criterioAvaliacaoRepository;

    public CriterioAvaliacaoService(CriterioAvaliacaoRepository criterioAvaliacaoRepository) {
        this.criterioAvaliacaoRepository = criterioAvaliacaoRepository;
    }

    public CriterioAvaliacao salvar(CriterioAvaliacao criterioAvaliacao) {
        return criterioAvaliacaoRepository.save(criterioAvaliacao);
    }
}