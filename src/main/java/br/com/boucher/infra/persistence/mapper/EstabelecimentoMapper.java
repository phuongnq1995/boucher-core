package br.com.boucher.infra.persistence.mapper;

import br.com.boucher.domain.model.Estabelecimento;
import br.com.boucher.infra.persistence.entity.EstabelecimentoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EstabelecimentoMapper {

    EstabelecimentoMapper INSTANCE = Mappers.getMapper(EstabelecimentoMapper.class);

    Estabelecimento mapFrom(EstabelecimentoEntity entity);
    EstabelecimentoEntity mapFrom(Estabelecimento estabelecimento);

}
