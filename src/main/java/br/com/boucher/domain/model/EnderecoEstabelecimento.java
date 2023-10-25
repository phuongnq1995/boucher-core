package br.com.boucher.domain.model;

import lombok.Data;



@Data
public class EnderecoEstabelecimento {

    private Long id;
    private String logradouro;
    private Double longitude;
    private Double latitude;
}
