package br.senai.sp.torneioxadrez.controller;

import br.senai.sp.torneioxadrez.repository.CampeonatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {


    @Autowired
    private CampeonatoRepository campeonatoRepository;

    @GetMapping
    public String index(Model model) {

        // Adiciona a lista de campeonatos no model
        model.addAttribute("campeonatos", campeonatoRepository.findAll());

        return "index";
    }
}
