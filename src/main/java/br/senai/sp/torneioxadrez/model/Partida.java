package br.senai.sp.torneioxadrez.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Basic
    @Temporal(TemporalType.DATE)
    private Date dataPartida;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_jogador1_partida"))
    private Jogador jogador1;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_jogador2_partida"))
    private Jogador jogador2;

    @Column(scale = 1, precision = 2)
    private BigDecimal pontuacaoJogador1;

    @Column(scale = 1, precision = 2)
    private BigDecimal pontuacaoJogador2;
}
