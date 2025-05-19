package br.com.allidev.gameslib.repository;

import br.com.allidev.gameslib.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
