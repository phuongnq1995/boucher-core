package br.com.boucher.domain.model;

import lombok.Data;

import java.util.UUID;

@Data
public class EnderecoEstabelecimento {

    private UUID id;
    private String logradouro;
    private Double longitude;
    private Double latitude;
}
