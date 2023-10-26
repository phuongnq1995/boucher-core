package br.com.boucher.domain.model;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class Estabelecimento {

    private Long id;
    private String nome;
    private String urlImagem;
    private EnderecoEstabelecimento enderecoEstabelecimento;
    private CategoriaEstabelecimento categoriaEstabelecimento;
    private List<Pagamento> pagamentos = new ArrayList<>();

}
