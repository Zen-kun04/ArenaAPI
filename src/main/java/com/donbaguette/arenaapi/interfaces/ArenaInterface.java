package com.donbaguette.arenaapi.interfaces;

import com.donbaguette.arenaapi.enums.ArenaState;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public interface ArenaInterface {

    public ArenaState getState();
    public void setState(ArenaState state);
    public ArrayList<Player> getPlayers();
    public void addPlayer(Player player);
    public void removePlayer(Player player);
    public boolean isPlayer(Player player);

}
