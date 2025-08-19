package com.olegari.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.ManyToAny;

import java.util.Objects;

@Embeddable
public class BelongingPK {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList List;

    public BelongingPK() {
    }

    public BelongingPK(Game game, GameList List) {
        this.game = game;
        this.List = List;
    }

    public Game getGame() {
        return game;
    }
    public void setGame(Game game) {
        this.game = game;
    }
    public GameList getList() {
        return List;
    }
    public void setList(GameList List) {
        this.List = List;
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, List);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BelongingPK other = (BelongingPK) obj;
        return Objects.equals(game, other.game) && Objects.equals(List, other.List);
    }
}
