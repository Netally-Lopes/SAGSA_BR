package br.senai.sagsa.SAGSA.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senai.sagsa.SAGSA.models.Capacidade;
import br.senai.sagsa.SAGSA.repositories.CapacidadeRepository;

@Service
public class CapacidadeService {

    private final CapacidadeRepository capacidadeRepository;

    public CapacidadeService(CapacidadeRepository capacidadeRepository) {
        this.capacidadeRepository = capacidadeRepository;
    }

    public Capacidade salvar(Capacidade capacidade) {
        return capacidadeRepository.save(capacidade);
    }
}