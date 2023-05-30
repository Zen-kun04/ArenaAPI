package com.donbaguette.arenaapi.managers;

import com.donbaguette.arenaapi.ArenaAPI;
import com.donbaguette.arenaapi.classes.Arena;
import com.donbaguette.arenaapi.enums.ArenaState;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.Objects;

public class ArenaManager {
    ArenaAPI arenaAPI;

    ConfigManager configManager;

    public ArenaManager(ArenaAPI arenaAPI, ConfigManager configManager) {
        this.arenaAPI = arenaAPI;
        this.configManager = configManager;
    }

    public int getNextID() {
        int size = configManager.getConfig().getKeys(false).size();
        if(size > 0){
            return size;
        }
        return 0;
    }

    public void createArena(String arenaName, int minPlayers, int maxPlayers, int minStartPlayers) {
        FileConfiguration config = configManager.getConfig();
        int nextID = getNextID();
        config.set(nextID + ".name", arenaName);
        config.set(nextID + ".min-players", minPlayers);
        config.set(nextID + ".max-players", maxPlayers);
        config.set(nextID + ".min-start-players", minStartPlayers);
        config.set(nextID + ".state", ArenaState.DISABLED.toString());
        configManager.saveConfig();
    }

    public boolean arenaExists(String arenaName) {
        FileConfiguration config = configManager.getConfig();
        for(String id : config.getKeys(false)){
            if(Objects.requireNonNull(config.getString(id + ".name")).equalsIgnoreCase(arenaName)){
                return true;
            }
        }
        return false;
    }

    public Arena getArena(String id) {
        FileConfiguration config = configManager.getConfig();
        Arena arena = new Arena();
        arena.setArenaID(id);
        arena.setArenaName(config.getString(id + ".name"));
        arena.setMinPlayers(config.getInt(id + ".min-players"));
        arena.setMaxPlayers(config.getInt(id + ".max-players"));
        arena.setMinStartPlayers(config.getInt(id + ".min-start-players"));
        arena.setState(ArenaState.valueOf(config.getString(id + ".state")));
        return arena;
    }

}
