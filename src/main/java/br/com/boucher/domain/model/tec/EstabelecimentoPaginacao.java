package br.com.boucher.domain.model.tec;

import br.com.boucher.domain.model.Estabelecimento;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class EstabelecimentoPaginacao {

    private Paginacao paginacao;
    private List<Estabelecimento> estabelecimentos;
}
