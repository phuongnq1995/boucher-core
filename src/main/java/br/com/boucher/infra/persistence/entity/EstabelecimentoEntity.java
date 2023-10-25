package br.com.boucher.infra.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity(name = "estabelecimento")
public class EstabelecimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String urlImagem;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private EnderecoEstabelecimentoEntity enderecoEstabelecimento;
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoriaEstabelecimentoEntity categoriaEstabelecimento;
    @ManyToMany(cascade=CascadeType.PERSIST)
    private List<PagamentoEntity> pagamentos;

}
