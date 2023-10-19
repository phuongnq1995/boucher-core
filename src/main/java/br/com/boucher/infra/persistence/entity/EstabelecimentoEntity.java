package br.com.boucher.infra.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Data
@Entity(name = "estabelecimento")
public class EstabelecimentoEntity {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String nome;
    @ManyToOne(fetch = FetchType.LAZY)
    private EnderecoEstabelecimentoEntity enderecoEstabelecimento;
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoriaEstabelecimentoEntity categoriaEstabelecimento;
    @ManyToMany
    private List<PagamentoEntity> pagamentos;

}
