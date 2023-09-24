package br.com.boucher.entidades;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class EnderecoEstabelecimento {

    private UUID id;
    private String logradouro;
    private BigDecimal longitude;
    private BigDecimal latitude;
}
