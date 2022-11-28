package io.github.bilektugrul.uhcffa.game;

import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

public class Game {

    private final Area arena;
    private final Set<Player> players = new HashSet<>();

    public Game(Area arena) {
        this.arena = arena;
    }

    public void join(Player player) {
        this.players.add(player);
    }

    public void quit(Player player) {
        this.players.remove(player);
    }

    public boolean isInGame(Player player) {
        return this.players.contains(player);
    }

    public Set<Player> getPlayers() {
        return players;
    }

}