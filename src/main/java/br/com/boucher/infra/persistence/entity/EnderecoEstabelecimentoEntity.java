package br.com.boucher.infra.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Data
@Entity(name = "endereco_estabelecimento")
public class EnderecoEstabelecimentoEntity {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String logradouro;
    private Double longitude;
    private Double latitude;
}
