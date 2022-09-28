package com.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Blank plugin is working!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Shutting down server!");
    }
}