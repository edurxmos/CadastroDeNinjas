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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return service.criarNinja(ninja);
    }

    @GetMapping("/listar")
    public List<NinjaModel> mostrarNinjas() {
        return service.listarNinjas();
    }

    @GetMapping("/{id}")
    public NinjaModel ninjaPorId(@PathVariable Long id) {
        return service.ninjaPorId(id);
    }

    @PutMapping("/{id}")
    public NinjaModel atualizarNinja(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado) {
        return service.atualizarNinja(id, ninjaAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletarNinja(@PathVariable Long id) {
        service.deletarNinja(id);
    }

}
