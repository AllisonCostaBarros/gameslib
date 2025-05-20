package br.com.allidev.gameslib.repository;

import br.com.allidev.gameslib.entity.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
