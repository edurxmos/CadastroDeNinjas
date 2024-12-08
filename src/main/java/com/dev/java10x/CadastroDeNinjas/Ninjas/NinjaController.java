package com.dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    @Autowired
    private NinjaService service;

    @PostMapping("/criar")
    public ResponseEntity<NinjaDTO> criarNinja(@RequestBody NinjaDTO ninja) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criarNinja(ninja));
    }

    @GetMapping("/listar")
    public ResponseEntity<List<NinjaDTO>> mostrarNinjas() {
        return ResponseEntity.ok(service.listarNinjas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> ninjaPorId(@PathVariable Long id) {
        if(service.ninjaPorId(id) != null) {
            return ResponseEntity.ok(service.ninjaPorId(id));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja com o ID "+ id +" não foi encontrado.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> atualizarNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {
        if(service.ninjaPorId(id) != null) {
            return ResponseEntity.ok(service.atualizarNinja(id, ninjaAtualizado););
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja com o ID "+ id +" não foi encontrado.");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletarNinja(@PathVariable Long id) {
        if(service.ninjaPorId(id) != null) {
            service.deletarNinja(id);
            return ResponseEntity.ok("Ninja com o ID "+ id +" deletado com sucesso!");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("O ninja com o ID "+ id +" não foi encontrado.");
    }

}
