package br.senai.sagsa.SAGSA.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PPC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_atributo;

    private String versao;

    private String data_criacao;

}