package com.senac.SenacGames.controller;

import com.senac.SenacGames.entities.Game;
import com.senac.SenacGames.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameRepository gameRepository;
    // 4 principais Operações
    //-Get(mostrar, trazer, pegar); -Put(Substituir, Alterar); -Delete(Deletar, Apagar); -Post(Criar)

    @GetMapping
    public List<Game> getTodosOsJogos(){
        return gameRepository.findAll();
    }

}
