package br.com.boucher.app.controller.mapper;

import br.com.boucher.app.controller.dto.EstabelecimentoRequest;
import br.com.boucher.domain.model.Estabelecimento;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EstabelecimentoMapper {

    EstabelecimentoMapper INSTANCE = Mappers.getMapper(EstabelecimentoMapper.class);

    Estabelecimento mapFrom(EstabelecimentoRequest request);
}
