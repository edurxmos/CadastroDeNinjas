package com.dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository repository;

    public List<NinjaModel> listarNinjas() {
        return repository.findAll();
    }

    public NinjaModel ninjaPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public NinjaModel criarNinja(NinjaModel ninja) {
        return repository.save(ninja);

        /*NinjaModel novoNinja = new NinjaModel(ninja.getNome(), ninja.getIdade(), ninja.getEmail());
        repository.save(novoNinja);
        return novoNinja;*/
    }

    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado) {
        if (repository.existsById(id)) {
            NinjaModel ninja = repository.getReferenceById(id);
            ninja.setNome(ninjaAtualizado.getNome());
            ninja.setEmail(ninjaAtualizado.getEmail());
            ninja.setIdade(ninjaAtualizado.getIdade());
            ninja.setMissao(ninjaAtualizado.getMissao());
            return repository.save(ninja);
        }
        return null;
    }

    public void deletarNinja(Long id) {
        repository.deleteById(id);
    }

}
