package br.com.boucher.domain.port;

import br.com.boucher.domain.model.ProdutoPagamento;

public interface ProdutoPagamentoDatabasePort {

    ProdutoPagamento save(ProdutoPagamento produtoPagamento);
}
