package br.com.boucher.config.exception;

import br.com.boucher.config.exception.dto.ExceptionDto;
import br.com.boucher.config.exception.dto.ValidationExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler({IllegalArgumentException.class})
    public ResponseEntity<ExceptionDto> illegalArgumentException(IllegalArgumentException e){

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                new ExceptionDto(HttpStatus.BAD_REQUEST, e.getMessage())
        );
    }

    @ExceptionHandler({RuntimeException.class})
    public ResponseEntity<ExceptionDto> runTimeException(RuntimeException e){

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                new ExceptionDto(HttpStatus.BAD_REQUEST, e.getMessage())
        );
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<List<ValidationExceptionDto>> methodArgumentNotValidException(MethodArgumentNotValidException e){

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                getErrorsList(e.getBindingResult())
        );
    }

    private List<ValidationExceptionDto> getErrorsList(BindingResult b){
        List<ValidationExceptionDto> v = new ArrayList<>();
        b.getFieldErrors().forEach(x->
                v.add(new ValidationExceptionDto(x.getField(),x.getDefaultMessage())));
        return v;
    }

}
