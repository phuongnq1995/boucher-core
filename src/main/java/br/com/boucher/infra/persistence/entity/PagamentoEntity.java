package br.com.boucher.infra.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "pagamento")
public class PagamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProdutoPagamentoEntity produtoPagamento;
    @ManyToOne(fetch = FetchType.LAZY)
    private FormaPagamentoEntity formaPagamento;
    @ManyToOne(fetch = FetchType.LAZY)
    private OperadorEntity operador;
}
