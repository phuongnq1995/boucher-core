package br.com.boucher.domain.model;

import lombok.Data;

import java.util.UUID;

@Data
public class CategoriaEstabelecimento {

    private UUID id;
    private String nome;
}
