package com.dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missao")
public class MissaoController {

    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada";
    }

    @GetMapping("/listar")
    public String listarMissoes() {
        return "Mostrar Missoes";
    }

    @GetMapping("/missaoID")
    public String mostrarMissaoPorId() {
        return "Mostrar Missao por id";
    }

    @PutMapping("/alterarID")
    public String atualizarMissao() {
        return "Missao atualizada";
    }

    @DeleteMapping("/deletarID")
    public String deletarMissao() {
        return "Missao deletada por id";
    }

}
