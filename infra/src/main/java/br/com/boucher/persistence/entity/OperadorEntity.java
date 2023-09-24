package br.com.boucher.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Data
@Entity(name = "operador")
public class OperadorEntity {

    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;
    private String nome;
}
