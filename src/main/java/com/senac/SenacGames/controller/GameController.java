package com.senac.SenacGames.controller;

import com.senac.SenacGames.entities.Game;
import com.senac.SenacGames.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
@PostMapping
    public Game createGame(@RequestBody Game game){return gameRepository.save(game);}
    @PutMapping("/{id}")
    public ResponseEntity<Game> updateGame(@PathVariable Long id, @RequestBody Game updatedGame) {
        Optional<Game> optionalGame = gameRepository.findById(id);

        if (!optionalGame.isPresent()) {
            return ResponseEntity.notFound().build();
        }

        Game existingGame = optionalGame.get();
        existingGame.setTitle(updatedGame.getTitle());
        existingGame.setGenre(updatedGame.getGenre());

        Game updated = gameRepository.save(existingGame);
        return ResponseEntity.ok(updated);
    }


    @DeleteMapping("/{id}")
    public void deleteGame(@PathVariable Long id) {
        gameRepository.deleteById(id);
    }

}

