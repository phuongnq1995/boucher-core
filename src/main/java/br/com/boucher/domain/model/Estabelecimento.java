package br.com.boucher.domain.model;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Estabelecimento {

    private UUID id;
    private String nome;
    private EnderecoEstabelecimento enderecoEstabelecimento;
    private CategoriaEstabelecimento categoriaEstabelecimento;
    private List<Pagamento> pagamentos = new ArrayList<>();

}
