package br.com.boucher.port;

import br.com.boucher.entidades.FormaPagamento;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

public interface FormaPagamentoDatabasePort {
    FormaPagamento get(UUID id);
    List<FormaPagamento> getAll();
}
