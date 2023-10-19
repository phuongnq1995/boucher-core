package br.com.boucher.infra.persistence.repository;

import br.com.boucher.infra.persistence.entity.ProdutoPagamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProdutoPagamentoRepository extends JpaRepository<ProdutoPagamentoEntity, UUID> {
}
