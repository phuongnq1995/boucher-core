package br.com.boucher.app.controller;

import br.com.boucher.app.controller.dto.EstabelecimentoSaveRequest;
import br.com.boucher.app.controller.mapper.EstabelecimentoMapper;
import br.com.boucher.domain.model.Estabelecimento;
import br.com.boucher.domain.model.tec.Paginacao;
import br.com.boucher.domain.port.EstabelecimentoServicePort;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
    public ResponseEntity<?> getAll(@RequestParam("latitude") Double latitude,
                                    @RequestParam("longitude") Double longitude,
                                    @RequestParam("raio") Double raio,
                                    @RequestParam(name = "page", required = false, defaultValue = "0") int page,
                                    @RequestParam(name = "size", required = false, defaultValue = "10") int size){

        Paginacao paginacao = new Paginacao(page,size);
        var estabelecimentos = estabelecimentoServicePort.getAllByRadius(latitude,longitude,raio,paginacao);
        return new ResponseEntity<>(estabelecimentos,HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable Long id){
        return new ResponseEntity<>(estabelecimentoServicePort.getById(id),HttpStatus.OK);
    }
}
