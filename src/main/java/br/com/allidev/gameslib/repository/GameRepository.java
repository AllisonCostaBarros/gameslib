package br.com.allidev.gameslib.repository;

import br.com.allidev.gameslib.entity.Game;
import br.com.allidev.gameslib.projection.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
		SELECT games.id, games.title, games.year_release AS yearRelease, games.img_url AS imgUrl,
		games.short_description AS shortDescription, belonging.position
		FROM games
		INNER JOIN belonging ON games.id = belonging.game_id
		WHERE belonging.list_id = :listId
		ORDER BY belonging.position
		""")
    List<GameMinProjection> searchByList(Long listId);
}
