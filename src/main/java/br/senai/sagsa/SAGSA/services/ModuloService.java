package br.senai.sagsa.SAGSA.services;

import org.springframework.stereotype.Service;

import br.senai.sagsa.SAGSA.models.Modulo;
import br.senai.sagsa.SAGSA.repositories.ModuloRepository;

@Service
public class ModuloService {

    private final ModuloRepository moduloRepository;

    public ModuloService(ModuloRepository moduloRepository) {
        this.moduloRepository = moduloRepository;
    }

    public Modulo salvar(Modulo modulo) {
        return moduloRepository.save(modulo);
    }
}