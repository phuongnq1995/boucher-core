package br.com.boucher.infra.persistence.mapper;

import br.com.boucher.domain.model.ProdutoPagamento;
import br.com.boucher.infra.persistence.entity.ProdutoPagamentoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProdutoPagamentoMapper {

    ProdutoPagamentoMapper INSTANCE = Mappers.getMapper(ProdutoPagamentoMapper.class);
    ProdutoPagamento mapFrom(ProdutoPagamentoEntity entity);
    ProdutoPagamentoEntity mapFrom(ProdutoPagamento produtoPagamento);
}
