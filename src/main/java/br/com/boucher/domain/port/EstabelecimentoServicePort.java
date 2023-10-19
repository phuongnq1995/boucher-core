package br.com.boucher.domain.port;

import br.com.boucher.domain.model.Estabelecimento;

import java.util.List;
import java.util.UUID;

public interface EstabelecimentoServicePort {

    Estabelecimento save(Estabelecimento estabelecimento);
    Estabelecimento getById(UUID id);
    List<Estabelecimento> getAll();
}
