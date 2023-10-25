package br.com.boucher.app.controller;

import br.com.boucher.app.controller.dto.EstabelecimentoSaveRequest;
import br.com.boucher.app.controller.mapper.EstabelecimentoMapper;
import br.com.boucher.domain.model.Estabelecimento;
import br.com.boucher.domain.port.EstabelecimentoServicePort;
import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("boucher/v1/estabelecimento")
@RequiredArgsConstructor
public class EstabelecimentoController {

    private final EstabelecimentoServicePort estabelecimentoServicePort;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody @Valid EstabelecimentoSaveRequest request){

        Estabelecimento estabelecimento = estabelecimentoServicePort.save(EstabelecimentoMapper.INSTANCE.mapFrom(request));
        return new ResponseEntity<>(estabelecimento,HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<?> getAll(@PathParam("latitude") Double latitude,
                                    @PathParam("longitude") Double longitude,
                                    @PathParam("raio") Double raio){

        List<Estabelecimento> estabelecimentos = estabelecimentoServicePort.getAll(latitude,longitude,raio);
        return new ResponseEntity<>(estabelecimentos,HttpStatus.OK);
    }
    @GetMapping("{id}")
    public ResponseEntity<?> get(Long id){
        return new ResponseEntity<>(estabelecimentoServicePort.getById(id),HttpStatus.OK);
    }
}
