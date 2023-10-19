package br.com.boucher.infra.persistence.repository;


import br.com.boucher.infra.persistence.entity.FormaPagamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaPagamentoEntity, UUID> {
}
