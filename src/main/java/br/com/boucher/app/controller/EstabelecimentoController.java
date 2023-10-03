package br.com.boucher.app.controller;

import br.com.boucher.app.controller.dto.EstabelecimentoRequest;
import br.com.boucher.app.controller.mapper.EstabelecimentoMapper;
import br.com.boucher.domain.model.Estabelecimento;
import br.com.boucher.domain.port.EstabelecimentoServicePort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("boucher/v1/estabelecimento")
@RequiredArgsConstructor
public class EstabelecimentoController {

    private final EstabelecimentoServicePort estabelecimentoServicePort;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody @Valid EstabelecimentoRequest request){

        Estabelecimento estabelecimento = EstabelecimentoMapper.INSTANCE.mapFrom(request);
        return new ResponseEntity<>(estabelecimentoServicePort.save(estabelecimento),HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(estabelecimentoServicePort.getAll(),HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<?> get(UUID id){
        return new ResponseEntity<>(estabelecimentoServicePort.getById(id),HttpStatus.OK);
    }
}
