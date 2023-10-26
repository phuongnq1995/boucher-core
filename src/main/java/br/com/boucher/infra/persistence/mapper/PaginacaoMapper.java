package br.com.boucher.infra.persistence.mapper;

import br.com.boucher.domain.model.tec.Paginacao;
import br.com.boucher.infra.persistence.entity.EstabelecimentoEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;

@Mapper
public interface PaginacaoMapper {

    PaginacaoMapper INSTANCE = Mappers.getMapper(PaginacaoMapper.class);

    Paginacao mapFrom(Page<EstabelecimentoEntity> page);

    @AfterMapping
    default void afterMapping(@MappingTarget Paginacao paginacao, Page<EstabelecimentoEntity> page){
        paginacao.setSize(page.getSize());
        paginacao.setPage(page.getNumber());
        paginacao.setTotalElements(page.getTotalElements());
        paginacao.setTotalPages(page.getTotalPages());
        paginacao.setLastPage(page.isLast());
    }
}
