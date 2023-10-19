package br.com.boucher.domain.service;

import br.com.boucher.domain.model.ProdutoPagamento;
import br.com.boucher.domain.port.ProdutoPagamentoDatabasePort;
import br.com.boucher.domain.port.ProdutoPagamentoServicePort;
import org.springframework.stereotype.Service;

@Service
public class ProdutoPagamentoService implements ProdutoPagamentoServicePort {

    private final ProdutoPagamentoDatabasePort produtoPagamentoDatabasePort;

    public ProdutoPagamentoService(ProdutoPagamentoDatabasePort produtoPagamentoDatabasePort) {
        this.produtoPagamentoDatabasePort = produtoPagamentoDatabasePort;
    }

    @Override
    public ProdutoPagamento save(ProdutoPagamento produtoPagamento) {
        return produtoPagamentoDatabasePort.save(produtoPagamento);
    }
}
