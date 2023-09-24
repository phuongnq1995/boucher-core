package br.com.boucher.port;

import br.com.boucher.entidades.FormaPagamento;

import java.util.List;
import java.util.UUID;

public interface FormaPagamentoServicePort {

    FormaPagamento get(UUID id);
    List<FormaPagamento> getAll();
}
