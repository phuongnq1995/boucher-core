package br.com.boucher.app.controller.dto;

import br.com.boucher.domain.model.FormaPagamento;
import br.com.boucher.domain.model.Operador;
import br.com.boucher.domain.model.ProdutoPagamento;
import lombok.Data;

@Data
public class PagamentoSaveRequest {

    private ProdutoPagamento produtoPagamento;
    private FormaPagamento formaPagamento;
    private Operador operador;
}
