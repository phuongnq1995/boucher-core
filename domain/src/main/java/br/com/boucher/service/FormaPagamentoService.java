package br.com.boucher.service;

import br.com.boucher.entidades.FormaPagamento;
import br.com.boucher.port.FormaPagamentoDatabasePort;
import br.com.boucher.port.FormaPagamentoServicePort;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
