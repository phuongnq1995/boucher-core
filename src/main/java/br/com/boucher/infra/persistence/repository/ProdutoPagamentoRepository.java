package br.com.boucher.infra.persistence.repository;

import br.com.boucher.infra.persistence.entity.ProdutoPagamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoPagamentoRepository extends JpaRepository<ProdutoPagamentoEntity, Long> {
}
