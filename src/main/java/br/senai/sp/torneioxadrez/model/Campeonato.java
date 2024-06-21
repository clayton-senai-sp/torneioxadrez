package br.senai.sp.torneioxadrez.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date dataInicio;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date dataFim;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_endereco_partida"))
    private Endereco endereco;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "campeonato_id", foreignKey = @ForeignKey(name = "fk_partidas_campeonato"))
    private List<Partida> partidas = new ArrayList<Partida>();
}
