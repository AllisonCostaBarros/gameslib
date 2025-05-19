package br.com.allidev.gameslib.entities;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "games")
@Entity(name = "Game")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int yearRelease;
    private String genre;
    private String platforms;
    private double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;
}
