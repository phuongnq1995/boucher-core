package br.com.boucher.app.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class EstabelecimentoSaveRequest {

    @JsonProperty("name")
    @NotEmpty
    private String nome;
    @JsonProperty("urlImage")
    @NotEmpty
    private String urlImagem;
    @JsonProperty("geolocation")
    @NotNull
    private EnderecoEstabelecimentoSaveRequest enderecoEstabelecimento;
    @JsonProperty("category")
    @NotNull
    private CategoriaEstabelecimentoSaveRequest categoriaEstabelecimento;
    @JsonProperty
    @NotNull
    private List<PagamentoSaveRequest> pagamentos = new ArrayList<>();
}
