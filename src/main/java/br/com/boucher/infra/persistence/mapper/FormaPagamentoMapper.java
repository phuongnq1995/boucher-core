package br.com.boucher.infra.persistence.mapper;


import br.com.boucher.domain.model.FormaPagamento;
import br.com.boucher.infra.persistence.entity.FormaPagamentoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FormaPagamentoMapper {

    FormaPagamentoMapper INSTANCE = Mappers.getMapper(FormaPagamentoMapper.class);

    FormaPagamento mapFrom(FormaPagamentoEntity entity);
}
