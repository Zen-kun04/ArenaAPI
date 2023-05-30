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
    public String getArenaID();
    public String getArenaName();
    public void setArenaID(String id);
    public void setArenaName(String name);
    public int getMinPlayers();
    public int getMaxPlayers();
    public int getMinStartPlayers();
    public void setMinPlayers(int min);
    public void setMaxPlayers(int max);
    public void setMinStartPlayers(int minStart);

}
