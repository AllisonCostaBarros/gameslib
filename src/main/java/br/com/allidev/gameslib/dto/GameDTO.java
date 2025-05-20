package br.com.allidev.gameslib.dto;

import br.com.allidev.gameslib.entity.Game;

public record GameDTO(Long id, String title, Integer yearRelease, String genre, String platforms, double score,
                      String imgUrl, String shortDescription, String longDescription) {

    public GameDTO(Game game) {
        this(game.getId(), game.getTitle(), game.getYearRelease(), game.getGenre(), game.getPlatforms(), game.getScore(),
                game.getImgUrl(), game.getShortDescription(), game.getLongDescription());
    }
}
