package br.com.boucher.app.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CategoriaEstabelecimentoSaveRequest {

    @JsonProperty("id")
    private Long id;
}
