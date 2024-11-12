package com.dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    @GetMapping("/listar")
    public String mostrarNinjas() {
        return "Mostrar Ninjas";
    }

    @GetMapping("/ninjaId")
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
