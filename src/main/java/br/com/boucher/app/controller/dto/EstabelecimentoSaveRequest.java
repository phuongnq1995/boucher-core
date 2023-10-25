package br.com.boucher.app.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EstabelecimentoSaveRequest {

    @JsonProperty("name")
    @NotEmpty
    private String nome;
    @JsonProperty("urlImage")
    private String urlImagem;
    @JsonProperty("geolocation")
    private EnderecoEstabelecimentoSaveRequest enderecoEstabelecimento;
    @JsonProperty("category")
    private CategoriaEstabelecimentoSaveRequest categoriaEstabelecimento;
    @JsonProperty
    private List<PagamentoSaveRequest> pagamentos = new ArrayList<>();
}
