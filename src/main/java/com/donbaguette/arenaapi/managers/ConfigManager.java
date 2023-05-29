package com.donbaguette.arenaapi.managers;

import com.donbaguette.arenaapi.ArenaAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ConfigManager {

    private File file;
    private FileConfiguration configuration;
    private ArenaAPI arenaAPI;

    public ConfigManager(ArenaAPI arenaAPI) {
        this.arenaAPI = arenaAPI;
    }

    public FileConfiguration getConfig() {
        return this.configuration;
    }

    public void createConfig() {
        this.file = new File(arenaAPI.getDataFolder(), "arenas.yml");
        if(!this.file.exists()) {
            this.file.getParentFile().mkdirs();
            this.arenaAPI.saveResource("arenas.yml", false);
        }

        this.configuration = new YamlConfiguration();

        YamlConfiguration.loadConfiguration(this.file);

    }

    public void saveConfig() {
        try {
            this.getConfig().save(this.file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
