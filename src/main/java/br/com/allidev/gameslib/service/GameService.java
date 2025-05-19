package br.com.allidev.gameslib.service;

import br.com.allidev.gameslib.dto.GameDTO;
import br.com.allidev.gameslib.entity.Game;
import br.com.allidev.gameslib.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameDTO(x)).toList();
    }
}
