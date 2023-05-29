package com.donbaguette.arenaapi.managers;

import com.donbaguette.arenaapi.ArenaAPI;
import org.bukkit.configuration.file.FileConfiguration;

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

    public void createArena(String arenaName) {
        FileConfiguration config = configManager.getConfig();
        config.set(getNextID() + ".name", arenaName);
        configManager.saveConfig();
    }

}
