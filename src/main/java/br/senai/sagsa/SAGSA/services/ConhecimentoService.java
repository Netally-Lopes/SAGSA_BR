package br.senai.sagsa.SAGSA.services;

import org.springframework.stereotype.Service;

import br.senai.sagsa.SAGSA.models.Conhecimento;
import br.senai.sagsa.SAGSA.repositories.ConhecimentoRepository;

@Service
public class ConhecimentoService {

    private final ConhecimentoRepository conhecimentoRepository;

    public ConhecimentoService(ConhecimentoRepository conhecimentoRepository) {
        this.conhecimentoRepository = conhecimentoRepository;
    }

    public Conhecimento salvar(Conhecimento conhecimento) {
        return conhecimentoRepository.save(conhecimento);
    }
}