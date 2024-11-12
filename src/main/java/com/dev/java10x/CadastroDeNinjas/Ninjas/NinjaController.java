package com.dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }

    @PostMapping("/adicionar")
    public String criarNinja() {
        return "Ninja criado";
    }

    @GetMapping("/todos")
    public String mostrarNinjas() {
        return "Mostrar Ninjas";
    }

    @GetMapping("/todosID")
    public String mostrarNinjaPorIdd() {
        return "Mostrar Ninja por id";
    }

    @PutMapping("/alterarID")
    public String atualizarNinja() {
        return "Ninja atualizado";
    }

    @DeleteMapping("/deletarID")
    public String deletarNinja() {
        return "Ninja deletado por id";
    }

}
