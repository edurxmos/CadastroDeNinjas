package com.dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @Autowired
    private NinjaService service;

    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    @GetMapping("/listar")
    public List<NinjaModel> mostrarNinjas() {
        return service.listarNinjas();
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
