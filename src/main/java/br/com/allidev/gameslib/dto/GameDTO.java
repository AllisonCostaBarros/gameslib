package br.com.allidev.gameslib.dto;

import br.com.allidev.gameslib.entity.Game;

public record GameDTO(Long id, String title, int yearRelease, String imgUrl, String shortDescription) {

    public GameDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getYearRelease(), game.getImgUrl(), game.getShortDescription());
    }
}
