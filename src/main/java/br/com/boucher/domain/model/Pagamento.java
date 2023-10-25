package br.com.boucher.domain.model;

import lombok.Data;



@Data
public class Pagamento {
    private Long id;
    private ProdutoPagamento produtoPagamento;
    private FormaPagamento formaPagamento;
    private Operador operador;
}
