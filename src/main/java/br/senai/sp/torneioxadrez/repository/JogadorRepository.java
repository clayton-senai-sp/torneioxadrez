package br.senai.sp.torneioxadrez.repository;

import br.senai.sp.torneioxadrez.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}
