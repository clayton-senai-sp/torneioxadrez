package br.senai.sp.torneioxadrez.repository;

import br.senai.sp.torneioxadrez.model.Campeonato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampeonatoRepository extends JpaRepository<Campeonato, Long> {
}
