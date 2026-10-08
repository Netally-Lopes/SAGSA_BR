package br.senai.sagsa.SAGSA.repositories;

import br.senai.sagsa.SAGSA.models.ConteudoDesafioSAPZ;
import br.senai.sagsa.SAGSA.models.ConteudoDesafioSAPZid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConteudoDesafioSAPZRepository extends JpaRepository<ConteudoDesafioSAPZ, ConteudoDesafioSAPZid> {
}