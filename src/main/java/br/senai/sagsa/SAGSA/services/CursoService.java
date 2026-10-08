package br.senai.sagsa.SAGSA.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.senai.sagsa.SAGSA.models.Curso;
import br.senai.sagsa.SAGSA.repositories.CursoRepository;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public Curso salvar(Curso curso) {
        return cursoRepository.save(curso);
    }
}