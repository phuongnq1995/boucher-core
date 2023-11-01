package br.com.boucher.config.exception.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ExceptionDto {
    public ExceptionDto(HttpStatus httpStatus,String msg) {
        this.message = msg;
        this.httpStatus = httpStatus;
    }

    private String message;
    private HttpStatus httpStatus;
}
