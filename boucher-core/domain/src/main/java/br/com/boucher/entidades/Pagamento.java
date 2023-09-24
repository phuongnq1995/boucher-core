package br.com.boucher.entidades;

import lombok.Data;

import java.util.UUID;

@Data
public class Pagamento {
    private UUID id;


    private ProdutoPagamento produtoPagamento;
    private FormaPagamento formaPagamento;
    private Operador operador;
}
