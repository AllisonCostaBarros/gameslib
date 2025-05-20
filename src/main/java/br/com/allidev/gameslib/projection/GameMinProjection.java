package br.com.allidev.gameslib.projection;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getYearRelease();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
