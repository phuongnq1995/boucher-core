package br.com.boucher.infra.persistence.repository;

import br.com.boucher.infra.persistence.entity.EstabelecimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EstabelecimentoRepository extends JpaRepository<EstabelecimentoEntity, UUID> {
}
