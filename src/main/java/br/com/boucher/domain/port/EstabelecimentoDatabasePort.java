package br.com.boucher.domain.port;

import br.com.boucher.domain.model.Estabelecimento;

import java.math.BigDecimal;
import java.util.List;


public interface EstabelecimentoDatabasePort {

    Estabelecimento getById(Long id);
    List<Estabelecimento> getAll(Double latitude, Double longitude, BigDecimal variacao);
    Estabelecimento save(Estabelecimento estabelecimento);
}
