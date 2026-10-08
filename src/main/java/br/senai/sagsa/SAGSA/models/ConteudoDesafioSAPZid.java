package br.senai.sagsa.SAGSA.models;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class ConteudoDesafioSAPZid implements Serializable {

    private Long id_contexto;

    private Long id_sapz;

}