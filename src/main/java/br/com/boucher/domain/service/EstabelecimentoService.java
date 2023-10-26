package br.com.boucher.domain.service;



import br.com.boucher.domain.model.Estabelecimento;
import br.com.boucher.domain.model.tec.EstabelecimentoPaginacao;
import br.com.boucher.domain.model.tec.Paginacao;
import br.com.boucher.domain.port.EstabelecimentoDatabasePort;
import br.com.boucher.domain.port.EstabelecimentoServicePort;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;


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
    public Estabelecimento getById(Long id) {

        return estabelecimentoDatabasePort.getById(id);
    }

    @Override
    public List<Estabelecimento> getAll(Double latitude, Double longitude, Double raio) {
        return estabelecimentoDatabasePort.getAll(latitude,longitude,calcularVariacaoEmGrau(raio));
    }

    @Override
    public EstabelecimentoPaginacao getAllByRadius(Double latitude, Double longitude, Double raio, Paginacao paginacao) {
        return estabelecimentoDatabasePort.getAllByRadius(latitude,longitude,calcularVariacaoEmGrau(raio),paginacao);
    }

    public BigDecimal calcularVariacaoEmGrau(double raioEmKm) {
        double raioTerra = 6378.137;
        return BigDecimal.valueOf((raioEmKm/raioTerra) * 180 / Math.PI);
    }
}
