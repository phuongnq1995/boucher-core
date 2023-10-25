package br.com.boucher.domain.port;



import br.com.boucher.domain.model.FormaPagamento;

import java.util.List;


public interface FormaPagamentoServicePort {

    FormaPagamento get(Long id);
    List<FormaPagamento> getAll();
}
