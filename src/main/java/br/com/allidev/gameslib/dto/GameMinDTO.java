package br.com.allidev.gameslib.dto;

import br.com.allidev.gameslib.entity.Game;
import br.com.allidev.gameslib.projection.GameMinProjection;

public record GameMinDTO(Long id, String title, Integer yearRelease, String imgUrl, String shortDescription) {

    public GameMinDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getYearRelease(), game.getImgUrl(), game.getShortDescription());
    }

    public GameMinDTO(GameMinProjection projection) {
        this(projection.getId(), projection.getTitle(), projection.getYearRelease(), projection.getImgUrl(), projection.getShortDescription());
    }
}
