package br.com.boucher.infra.persistence.adapter;

import br.com.boucher.domain.model.Estabelecimento;
import br.com.boucher.domain.model.tec.EstabelecimentoPaginacao;
import br.com.boucher.domain.model.tec.Paginacao;
import br.com.boucher.domain.port.EstabelecimentoDatabasePort;
import br.com.boucher.infra.persistence.entity.EstabelecimentoEntity;
import br.com.boucher.infra.persistence.mapper.EstabelecimentoMapper;
import br.com.boucher.infra.persistence.mapper.PaginacaoMapper;
import br.com.boucher.infra.persistence.repository.EstabelecimentoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;


@Component
public class EstabelecimentoDatabaseAdapter implements EstabelecimentoDatabasePort {

    private final EstabelecimentoRepository estabelecimentoRepository;

    public EstabelecimentoDatabaseAdapter(EstabelecimentoRepository estabelecimentoRepository) {
        this.estabelecimentoRepository = estabelecimentoRepository;
    }

    @Override
    public Estabelecimento save(Estabelecimento estabelecimento) {
        EstabelecimentoEntity entity = estabelecimentoRepository.save(EstabelecimentoMapper.INSTANCE.mapFrom(estabelecimento));
        return EstabelecimentoMapper.INSTANCE.mapFrom(entity);
    }
    @Override
    public Estabelecimento getById(Long id) {
        var entity = estabelecimentoRepository.findById(id).orElse(null);
        return EstabelecimentoMapper.INSTANCE.mapFrom(entity);
    }
    @Override
    public List<Estabelecimento> getAll(Double latitude, Double longitude, BigDecimal variacao) {
        var entities = estabelecimentoRepository.findAll(latitude, longitude, variacao)
                .stream().toList();
        return entities.stream().map(EstabelecimentoMapper.INSTANCE::mapFrom).toList();
    }

    @Override
    public EstabelecimentoPaginacao getAllByRadius(Double latitude, Double longitude, BigDecimal variacao, Paginacao paginacao) {
        PageRequest pageRequest = PageRequest.of(paginacao.getPage(),paginacao.getSize());
        var page = estabelecimentoRepository.findAllByRadius(latitude, longitude, variacao,pageRequest);
        return getEstabelecimentoPaginacao(page);
    }

    private EstabelecimentoPaginacao getEstabelecimentoPaginacao(Page<EstabelecimentoEntity> page){
        return new EstabelecimentoPaginacao(
                PaginacaoMapper.INSTANCE.mapFrom(page),
                page.stream().map(EstabelecimentoMapper.INSTANCE::mapFrom).toList()
        );
    }
}
