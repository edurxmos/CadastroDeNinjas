package com.dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MissaoController {

    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada";
    }

    @GetMapping("/listar")
    public String listarMissoes() {
        return "Mostrar Missoes";
    }

    @GetMapping("/missao")
    public String mostrarMissaoPorIdd() {
        return "Mostrar Missao por id";
    }

    @PutMapping("/alterar")
    public String atualizarMissao() {
        return "Missao atualizada";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missao deletada por id";
    }

}
