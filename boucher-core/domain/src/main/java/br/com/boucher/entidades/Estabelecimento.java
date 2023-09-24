package br.com.boucher.entidades;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
public class Estabelecimento {

    private UUID id;
    private String nome;
    @ManyToOne(fetch = FetchType.LAZY)
    private EnderecoEstabelecimento enderecoEstabelecimento;
    @ManyToOne(fetch = FetchType.LAZY)
    private CategoriaEstabelecimento categoriaEstabelecimento;
    @ManyToMany
    private List<Pagamento> pagamentos = new ArrayList<>();

}
