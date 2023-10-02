package br.com.boucher.infra.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Data
@Entity(name = "pagamento")
public class PagamentoEntity {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    @ManyToOne(fetch = FetchType.LAZY)
    private ProdutoPagamentoEntity produtoPagamentoEntity;
    @ManyToOne(fetch = FetchType.LAZY)
    private FormaPagamentoEntity formaPagamentoEntity;
    @ManyToOne(fetch = FetchType.LAZY)
    private OperadorEntity operadorEntity;
}
