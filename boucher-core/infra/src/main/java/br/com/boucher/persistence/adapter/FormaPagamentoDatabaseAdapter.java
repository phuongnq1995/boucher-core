package br.com.boucher.persistence.adapter;

import br.com.boucher.persistence.mapper.FormaPagamentoMapper;
import br.com.boucher.persistence.repository.FormaPagamentoRepository;
import br.com.boucher.persistence.entity.FormaPagamentoEntity;
import br.com.boucher.entidades.FormaPagamento;
import br.com.boucher.port.FormaPagamentoDatabasePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class FormaPagamentoDatabaseAdapter implements FormaPagamentoDatabasePort {

    private final FormaPagamentoRepository formaPagamentoRepository;

    public FormaPagamentoDatabaseAdapter(FormaPagamentoRepository formaPagamentoRepository) {
        this.formaPagamentoRepository = formaPagamentoRepository;
    }

    @Override
    public FormaPagamento get(UUID id) {
        FormaPagamentoEntity entity = formaPagamentoRepository.findById(id).orElse(null);
        return FormaPagamentoMapper.INSTANCE.mapFrom(entity);
    }
    @Override
    public List<FormaPagamento> getAll() {
        List<FormaPagamentoEntity> entities = formaPagamentoRepository.findAll()
                .stream().toList();
        return entities.stream().map(FormaPagamentoMapper.INSTANCE::mapFrom).toList();
    }
}
