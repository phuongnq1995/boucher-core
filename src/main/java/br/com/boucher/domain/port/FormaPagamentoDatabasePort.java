package br.com.boucher.domain.port;


import br.com.boucher.domain.entidades.FormaPagamento;

import java.util.List;
import java.util.UUID;

public interface FormaPagamentoDatabasePort {
    FormaPagamento get(UUID id);
    List<FormaPagamento> getAll();
}
