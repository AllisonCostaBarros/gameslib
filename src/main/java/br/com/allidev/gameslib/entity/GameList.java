package br.com.allidev.gameslib.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "game_list")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
