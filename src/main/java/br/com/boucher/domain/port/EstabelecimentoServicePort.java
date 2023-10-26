package br.com.boucher.domain.port;

import br.com.boucher.domain.model.Estabelecimento;
import br.com.boucher.domain.model.tec.EstabelecimentoPaginacao;
import br.com.boucher.domain.model.tec.Paginacao;

import java.util.List;


public interface EstabelecimentoServicePort {

    Estabelecimento save(Estabelecimento estabelecimento);
    Estabelecimento getById(Long id);
    List<Estabelecimento> getAll(Double latitude, Double longitude, Double raio);
    EstabelecimentoPaginacao getAllByRadius(Double latitude, Double longitude, Double raio, Paginacao paginacao);
}
