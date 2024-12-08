package com.dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository repository;
    @Autowired
    private NinjaMapper ninjaMapper;

    public List<NinjaDTO> listarNinjas() {
        List<NinjaModel> ninjas = repository.findAll();
        return ninjas.stream().map(x -> ninjaMapper.map(x)).toList();
    }

    public NinjaDTO ninjaPorId(Long id) {
        Optional<NinjaModel> ninja = repository.findById(id);
        return ninja.map(x -> ninjaMapper.map(x)).orElse(null);
    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = repository.save(ninja);
        return ninjaMapper.map(ninja);
        /*NinjaModel novoNinja = new NinjaModel(ninja.getNome(), ninja.getIdade(), ninja.getEmail());
        repository.save(novoNinja);
        return novoNinja;*/
    }

    public NinjaDTO atualizarNinja(Long id, NinjaDTO ninjaAtualizado) {
        if (repository.existsById(id)) {
            NinjaModel ninja = repository.getReferenceById(id);
            ninja.setNome(ninjaAtualizado.getNome());
            ninja.setEmail(ninjaAtualizado.getEmail());
            ninja.setIdade(ninjaAtualizado.getIdade());
            ninja.setMissao(ninjaAtualizado.getMissao());
            NinjaModel ninjaSalvo = repository.save(ninja);
            return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }

    public void deletarNinja(Long id) {
        repository.deleteById(id);
    }

}
