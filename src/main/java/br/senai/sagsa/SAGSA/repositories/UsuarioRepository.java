package br.senai.sagsa.SAGSA.repositories;

import br.senai.sagsa.SAGSA.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}