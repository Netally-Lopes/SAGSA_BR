package br.senai.sagsa.SAGSA.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@IdClass(ConteudoDesafioSAPZid.class)
public class ConteudoDesafioSAPZ {

    @Id
    private Long id_contexto;

    @Id
    private Long id_sapz;

    private LocalDate data_geracao;

    private String documento;

    private String formato;

}