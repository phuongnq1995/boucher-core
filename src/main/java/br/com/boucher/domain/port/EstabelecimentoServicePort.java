package br.com.boucher.domain.port;

import br.com.boucher.domain.model.Estabelecimento;

import java.util.List;


public interface EstabelecimentoServicePort {

    Estabelecimento save(Estabelecimento estabelecimento);
    Estabelecimento getById(Long id);
    List<Estabelecimento> getAll(Double latitude, Double longitude, Double raio);
}
