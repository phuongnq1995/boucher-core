package br.com.boucher.persistence.mapper;

import br.com.boucher.persistence.entity.FormaPagamentoEntity;
import br.com.boucher.entidades.FormaPagamento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FormaPagamentoMapper {

    FormaPagamentoMapper INSTANCE = Mappers.getMapper(FormaPagamentoMapper.class);

    FormaPagamento mapFrom(FormaPagamentoEntity entity);
}
