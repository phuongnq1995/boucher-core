package br.com.boucher.rest;

import br.com.boucher.entidades.FormaPagamento;
import br.com.boucher.port.FormaPagamentoServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("v1/boucher/forma_pagamento")
public class FormaPagamentoController {

    private final FormaPagamentoServicePort formaPagamentoServicePort;

    public FormaPagamentoController(FormaPagamentoServicePort formaPagamentoServicePort) {
        this.formaPagamentoServicePort = formaPagamentoServicePort;
    }

    @GetMapping("{id}")
    public ResponseEntity<?> get(@PathVariable UUID id){
        FormaPagamento formaPagamento = formaPagamentoServicePort.get(id);
        return new ResponseEntity<>(formaPagamento, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<?> getAll(){
        List<FormaPagamento> formaPagamentos = formaPagamentoServicePort.getAll();
        return new ResponseEntity<>(formaPagamentos, HttpStatus.OK);
    }

}
