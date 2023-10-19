package br.com.boucher.infra.persistence.adapter;

import br.com.boucher.domain.model.ProdutoPagamento;
import br.com.boucher.domain.port.ProdutoPagamentoDatabasePort;
import br.com.boucher.infra.persistence.entity.ProdutoPagamentoEntity;
import br.com.boucher.infra.persistence.mapper.ProdutoPagamentoMapper;
import br.com.boucher.infra.persistence.repository.ProdutoPagamentoRepository;
import org.springframework.stereotype.Component;

@Component
public class ProdutoPagamentoDatabaseAdapter implements ProdutoPagamentoDatabasePort {

    private ProdutoPagamentoRepository produtoPagamentoRepository;
    @Override
    public ProdutoPagamento save(ProdutoPagamento produtoPagamento) {
        ProdutoPagamentoEntity entity = produtoPagamentoRepository.save(ProdutoPagamentoMapper.INSTANCE.mapFrom(produtoPagamento));
        return ProdutoPagamentoMapper.INSTANCE.mapFrom(entity);
    }
}
