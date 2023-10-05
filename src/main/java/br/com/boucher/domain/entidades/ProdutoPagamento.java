package br.com.boucher.domain.entidades;

import lombok.Data;

import java.util.UUID;

@Data
public class ProdutoPagamento {

    private UUID id;
    private String nome;
    private String descricao;
}