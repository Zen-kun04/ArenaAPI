package com.donbaguette.arenaapi.classes;

import com.donbaguette.arenaapi.enums.ArenaState;
import com.donbaguette.arenaapi.interfaces.ArenaInterface;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Arena implements ArenaInterface {
    private ArenaState state;
    private ArrayList<Player> players = new ArrayList<>();
    @Override
    public ArenaState getState() {
        return null;
    }

    @Override
    public void setState(ArenaState state) {
        this.state = state;
    }

    @Override
    public ArrayList<Player> getPlayers() {
        return null;
    }

    @Override
    public void addPlayer(Player player) {
        this.players.add(player);
    }

    @Override
    public void removePlayer(Player player) {
        this.players.remove(player);
    }

    @Override
    public boolean isPlayer(Player player) {
        return this.players.contains(player);
    }

}
