package br.com.allidev.gameslib.controller;

import br.com.allidev.gameslib.dto.GameDTO;
import br.com.allidev.gameslib.dto.GameListDTO;
import br.com.allidev.gameslib.dto.GameMinDTO;
import br.com.allidev.gameslib.service.GameListService;
import br.com.allidev.gameslib.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }

}
