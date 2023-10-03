package br.com.boucher.domain.service;



import br.com.boucher.domain.model.FormaPagamento;
import br.com.boucher.domain.port.FormaPagamentoDatabasePort;
import br.com.boucher.domain.port.FormaPagamentoServicePort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FormaPagamentoService implements FormaPagamentoServicePort {

    private final FormaPagamentoDatabasePort pagamentoDatabasePort;

    public FormaPagamentoService(FormaPagamentoDatabasePort pagamentoDatabasePort) {
        this.pagamentoDatabasePort = pagamentoDatabasePort;
    }

    @Override
    public FormaPagamento get(UUID id) {

        return pagamentoDatabasePort.get(id);
    }

    @Override
    public List<FormaPagamento> getAll() {
        return pagamentoDatabasePort.getAll();
    }
}
