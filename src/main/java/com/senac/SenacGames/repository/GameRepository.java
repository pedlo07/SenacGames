package com.senac.SenacGames.repository;

import com.senac.SenacGames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {


}
