package br.senai.sagsa.SAGSA.repositories;

import br.senai.sagsa.SAGSA.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}