package com.donbaguette.arenaapi;

import com.donbaguette.arenaapi.classes.Arena;
import com.donbaguette.arenaapi.enums.ArenaState;
import com.donbaguette.arenaapi.interfaces.ArenaInterface;
import com.donbaguette.arenaapi.managers.ArenaManager;
import com.donbaguette.arenaapi.managers.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class ArenaAPI extends JavaPlugin {
    public ArenaManager arenaManager;
    public Arena arena;
    public ConfigManager configManager;
    @Override
    public void onEnable() {
        // Plugin startup logic
        arena = new Arena();
        configManager = new ConfigManager(this);
        arenaManager = new ArenaManager(this, configManager);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
