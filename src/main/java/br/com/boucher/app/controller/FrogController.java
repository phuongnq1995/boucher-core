package br.com.boucher.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("boucher/v1/sapo")
public class FrogController {

    @GetMapping
    public ResponseEntity<String> get(){
        return new ResponseEntity<>("Sou um sapo na lagoa!", HttpStatus.OK);
    }
}
