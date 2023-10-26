package br.com.boucher.domain.model.tec;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Paginacao {

    public Paginacao(int page, int size) {
        this.page = page;
        this.size = size;
    }

    private int page;
    private int size;
    private long totalElements;
    private int totalPages;
    private boolean isLastPage;

}
