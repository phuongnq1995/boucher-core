package br.com.boucher.domain.port;

import br.com.boucher.domain.model.Estabelecimento;
import br.com.boucher.domain.model.tec.EstabelecimentoPaginacao;
import br.com.boucher.domain.model.tec.Paginacao;

import java.math.BigDecimal;
import java.util.List;


public interface EstabelecimentoDatabasePort {

    Estabelecimento save(Estabelecimento estabelecimento);
    Estabelecimento getById(Long id);
    List<Estabelecimento> getAll(Double latitude, Double longitude, BigDecimal variacao);
    EstabelecimentoPaginacao getAllByRadius(Double latitude, Double longitude, BigDecimal variacao, Paginacao paginacao);
}
