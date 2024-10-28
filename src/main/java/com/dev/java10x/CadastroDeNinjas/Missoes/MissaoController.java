package com.dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/missao")
public class MissaoController {

    @GetMapping
    public String mensagem() {
        return "Teste endpoint missão";
    }

}
