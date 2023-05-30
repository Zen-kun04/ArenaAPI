package com.donbaguette.arenaapi.managers;

import com.donbaguette.arenaapi.ArenaAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class ConfigManager {

    private File file;
    private FileConfiguration configuration;
    private JavaPlugin arenaAPI;

    public ConfigManager(JavaPlugin plugin) {
        this.arenaAPI = plugin;
    }

    public FileConfiguration getConfig() {
        return this.configuration;
    }

    public void createConfig(JavaPlugin plugin) {
        this.file = new File(plugin.getDataFolder(), "arenas.yml");
        if(!this.file.exists()) {
            this.file.getParentFile().mkdirs();
            plugin.saveResource("arenas.yml", false);
        }

        this.configuration = YamlConfiguration.loadConfiguration(this.file);

    }

    public void saveConfig() {
        try {
            this.getConfig().save(this.file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
