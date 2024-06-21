package br.senai.sp.torneioxadrez.repository;

import br.senai.sp.torneioxadrez.model.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
}
