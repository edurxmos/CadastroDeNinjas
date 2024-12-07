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
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja) {
        return service.criarNinja(ninja);
    }

    @GetMapping("/listar")
    public List<NinjaDTO> mostrarNinjas() {
        return service.listarNinjas();
    }

    @GetMapping("/{id}")
    public NinjaDTO ninjaPorId(@PathVariable Long id) {
        return service.ninjaPorId(id);
    }

    @PutMapping("/{id}")
    public NinjaDTO atualizarNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {
        return service.atualizarNinja(id, ninjaAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletarNinja(@PathVariable Long id) {
        service.deletarNinja(id);
    }

}
