package br.com.boucher.app.controller;

import br.com.boucher.domain.model.ProdutoPagamento;
import br.com.boucher.domain.port.ProdutoPagamentoServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("boucher/v1/produto_pagamento")
@RequiredArgsConstructor
public class ProdutoPagamentoController {

    private ProdutoPagamentoServicePort produtoPagamentoServicePort;

    @PostMapping
    public ResponseEntity<?> save(ProdutoPagamento request){
        produtoPagamentoServicePort.save(request);
        return new ResponseEntity<>(request, HttpStatus.CREATED);
    }
}
