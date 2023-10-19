package br.com.boucher.app.controller.dto;

import br.com.boucher.domain.model.CategoriaEstabelecimento;
import br.com.boucher.domain.model.EnderecoEstabelecimento;
import br.com.boucher.domain.model.Pagamento;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EstabelecimentoRequest {

    private String nome;
    private EnderecoEstabelecimento enderecoEstabelecimento;
    private CategoriaEstabelecimento categoriaEstabelecimento;
    private List<Pagamento> pagamentos = new ArrayList<>();
}
