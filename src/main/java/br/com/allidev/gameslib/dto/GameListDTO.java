package br.com.allidev.gameslib.dto;

import br.com.allidev.gameslib.entity.GameList;

public record GameListDTO(Long id, String name) {

    public GameListDTO(GameList gameList) {
        this(gameList.getId(), gameList.getName());
    }
}
