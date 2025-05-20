package br.com.allidev.gameslib.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Table(name = "belonging")
@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging(Game game, GameList list, Integer position) {
        id.setGame(game);
        id.setList(list);
        this.position = position;
    }
}
