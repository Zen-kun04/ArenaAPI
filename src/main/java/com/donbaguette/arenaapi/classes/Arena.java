package com.donbaguette.arenaapi.classes;

import com.donbaguette.arenaapi.enums.ArenaState;
import com.donbaguette.arenaapi.interfaces.ArenaInterface;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Arena implements ArenaInterface {
    private ArenaState state;
    private String arenaName;
    private String arenaID;
    private int minPlayers;
    private int maxPlayers;
    private int minStartPlayers;
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

    @Override
    public String getArenaID() {
        return null;
    }

    @Override
    public String getArenaName() {
        return null;
    }

    @Override
    public void setArenaID(String id) {
        this.arenaID = id;
    }

    @Override
    public void setArenaName(String name) {
        this.arenaName = name;
    }

    @Override
    public int getMinPlayers() {
        return this.minPlayers;
    }

    @Override
    public int getMaxPlayers() {
        return this.maxPlayers;
    }

    @Override
    public int getMinStartPlayers() {
        return this.minStartPlayers;
    }

    @Override
    public void setMinPlayers(int min) {
        this.minPlayers = min;
    }

    @Override
    public void setMaxPlayers(int max) {
        this.maxPlayers = max;
    }

    @Override
    public void setMinStartPlayers(int minStart) {
        this.minStartPlayers = minStart;
    }

}
