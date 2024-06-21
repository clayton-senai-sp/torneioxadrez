package br.senai.sp.torneioxadrez.api;

import br.senai.sp.torneioxadrez.model.Campeonato;
import br.senai.sp.torneioxadrez.repository.CampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campeonato")
public class CampeonatoRestController {

    @Autowired
    private CampeonatoRepository campeonatoRepository;

    // Listar todos os campeonatos
    @GetMapping("/listar")
    public List<Campeonato> listar() {
        return campeonatoRepository.findAll();
    }

    // Inserir um campeonato
    @PostMapping("/inserir")
    public void inserir(@RequestBody Campeonato campeonato) {
        campeonatoRepository.save(campeonato);
    }

    // Alterar um campeonato
    @PutMapping("/alterar")
    public void alterar(@RequestBody Campeonato campeonato) {
        campeonatoRepository.save(campeonato);
    }

    // Excluir um campeonato
    @DeleteMapping("/excluir/{id}")
    public void excluir(@PathVariable Long id) {
        campeonatoRepository.deleteById(id);
    }

    // Inserir vários campeonatos
    @PostMapping("/inserir-varios")
    public void inserirVarios(@RequestBody List<Campeonato> campeonatos) {
        campeonatoRepository.saveAll(campeonatos);
    }
}
