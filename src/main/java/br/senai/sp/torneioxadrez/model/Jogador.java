package br.senai.sp.torneioxadrez.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "O nome é obrigatório")
    private String nome;

    @CPF
    @NotEmpty(message = "O CPF é obrigatório")
    private String cpf;

    @Email
    @NotEmpty(message = "O e-mail é obrigatório")
    private String email;

    //@OneToMany(cascade = CascadeType.ALL)
    //private List<Partida> partidas;
}
