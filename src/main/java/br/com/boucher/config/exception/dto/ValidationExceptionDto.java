package br.com.boucher.config.exception.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ValidationExceptionDto {

    public ValidationExceptionDto(String field, String errorMessage) {
        this.field = field;
        this.errorMessage = errorMessage;
    }

    private String field;
    private String errorMessage;
}
