package br.com.boucher.app.controller.mapper;

import br.com.boucher.app.controller.dto.PagamentoSaveRequest;
import br.com.boucher.domain.model.Pagamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PagamentoMapper {

    PagamentoMapper INSTANCE = Mappers.getMapper(PagamentoMapper.class);

    @Mapping(target = "id", ignore = true)
    Pagamento mapFrom(PagamentoSaveRequest request);

}
