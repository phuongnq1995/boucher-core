package br.com.boucher.domain.entidades;

import lombok.Data;

import java.util.UUID;

@Data
public class CategoriaEstabelecimento {

    private UUID id;
    private String nome;
}
