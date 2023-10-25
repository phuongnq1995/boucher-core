package br.com.boucher.app.controller.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EnderecoEstabelecimentoSaveRequest {

    @JsonProperty("address")
    private String logradouro;
    @JsonProperty("lon")
    private Double longitude;
    @JsonProperty("lat")
    private Double latitude;
}
