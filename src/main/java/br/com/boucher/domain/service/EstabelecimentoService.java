package br.com.boucher.domain.service;



import br.com.boucher.domain.model.Estabelecimento;
import br.com.boucher.domain.port.EstabelecimentoDatabasePort;
import br.com.boucher.domain.port.EstabelecimentoServicePort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EstabelecimentoService implements EstabelecimentoServicePort {

    private final EstabelecimentoDatabasePort estabelecimentoDatabasePort;

    public EstabelecimentoService(EstabelecimentoDatabasePort estabelecimentoDatabasePort) {
        this.estabelecimentoDatabasePort = estabelecimentoDatabasePort;
    }

    @Override
    public Estabelecimento save(Estabelecimento estabelecimento) {
        return estabelecimentoDatabasePort.save(estabelecimento);
    }

    @Override
    public Estabelecimento getById(UUID id) {

        return estabelecimentoDatabasePort.getById(id);
    }

    @Override
    public List<Estabelecimento> getAll() {
        return estabelecimentoDatabasePort.getAll();
    }
}
