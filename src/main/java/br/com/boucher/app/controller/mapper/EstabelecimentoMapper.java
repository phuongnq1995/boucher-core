package br.com.boucher.app.controller.mapper;

import br.com.boucher.app.controller.dto.EstabelecimentoSaveRequest;
import br.com.boucher.domain.model.Estabelecimento;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EstabelecimentoMapper {

    EstabelecimentoMapper INSTANCE = Mappers.getMapper(EstabelecimentoMapper.class);

    @Mapping(target = "id", ignore = true)
    Estabelecimento mapFrom(EstabelecimentoSaveRequest request);

    @AfterMapping
    default void afterMapping(@MappingTarget Estabelecimento estabelecimento, EstabelecimentoSaveRequest request){

        estabelecimento.setPagamentos(request.getPagamentos().stream().map(PagamentoMapper.INSTANCE::mapFrom).toList());

    }
}
