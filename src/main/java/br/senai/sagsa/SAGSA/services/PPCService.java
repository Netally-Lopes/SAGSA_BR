package br.senai.sagsa.SAGSA.services;

import org.springframework.stereotype.Service;

import br.senai.sagsa.SAGSA.models.PPC;
import br.senai.sagsa.SAGSA.repositories.PPCRepository;

@Service
public class PPCService {

    private final PPCRepository ppcRepository;

    public PPCService(PPCRepository ppcRepository) {
        this.ppcRepository = ppcRepository;
    }

    public PPC salvar(PPC ppc) {
        return ppcRepository.save(ppc);
    }
}