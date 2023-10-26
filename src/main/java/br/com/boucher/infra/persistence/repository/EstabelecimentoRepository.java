package br.com.boucher.infra.persistence.repository;

import br.com.boucher.infra.persistence.entity.EstabelecimentoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.math.BigDecimal;
import java.util.List;

public interface EstabelecimentoRepository extends PagingAndSortingRepository<EstabelecimentoEntity, Long>,JpaRepository<EstabelecimentoEntity, Long> {

    @Query(nativeQuery = true,value = """
            select
                e.id,
                e.nome,
                e.categoria_estabelecimento_id,
                e.endereco_estabelecimento_id,
                e.url_imagem,
                enderecoEstabelecimento.id idEnd,
                enderecoEstabelecimento.latitude,
                enderecoEstabelecimento.longitude,
                enderecoEstabelecimento.logradouro,
                categoriaEstabelecimento.id idCat,
                categoriaEstabelecimento.nome nomeCat,
                (:latitude - :variacao) lat,
                :longitude - :variacao longi
            from estabelecimento e
            inner join endereco_estabelecimento enderecoEstabelecimento
                on enderecoEstabelecimento.id = e.endereco_estabelecimento_id
                and enderecoEstabelecimento.latitude between :latitude - :variacao and :latitude + :variacao
                and enderecoEstabelecimento.longitude between :longitude - :variacao and :longitude + :variacao
            inner join categoria_estabelecimento categoriaEstabelecimento
                on categoriaEstabelecimento.id = e.categoria_estabelecimento_id
            order by enderecoEstabelecimento.latitude - :latitude, enderecoEstabelecimento.longitude - :longitude ASC
            """)
    List<EstabelecimentoEntity> findAll(Double latitude, Double longitude, BigDecimal variacao);

    @Query(nativeQuery = true,value = """
            select
                e.id,
                e.nome,
                e.categoria_estabelecimento_id,
                e.endereco_estabelecimento_id,
                e.url_imagem,
                enderecoEstabelecimento.id idEnd,
                enderecoEstabelecimento.latitude,
                enderecoEstabelecimento.longitude,
                enderecoEstabelecimento.logradouro,
                categoriaEstabelecimento.id idCat,
                categoriaEstabelecimento.nome nomeCat,
                (:latitude - :variacao) lat,
                :longitude - :variacao longi
            from estabelecimento e
            inner join endereco_estabelecimento enderecoEstabelecimento
                on enderecoEstabelecimento.id = e.endereco_estabelecimento_id
                and enderecoEstabelecimento.latitude between :latitude - :variacao and :latitude + :variacao
                and enderecoEstabelecimento.longitude between :longitude - :variacao and :longitude + :variacao
            inner join categoria_estabelecimento categoriaEstabelecimento
                on categoriaEstabelecimento.id = e.categoria_estabelecimento_id
            order by enderecoEstabelecimento.latitude - :latitude, enderecoEstabelecimento.longitude - :longitude ASC
            """)
    Page<EstabelecimentoEntity> findAllByRadius(Double latitude, Double longitude, BigDecimal variacao, Pageable pageable);
}
