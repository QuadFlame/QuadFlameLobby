package com.quadflame.quadflamelobby;

import com.quadflame.quadflamelobby.commands.LobbyCommand;
import com.quadflame.quadflamelobby.commands.LobbyGUICommand;
import com.quadflame.quadflamelobby.listeners.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class QuadFlameLobby extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("---------------------------------------");
        System.out.println("QuadFlameLobby has successfully loaded!");
        System.out.println("---------------------------------------");
        getCommand("lobby").setExecutor(new LobbyCommand());
        getCommand("gui").setExecutor(new LobbyGUICommand());
        getServer().getPluginManager().registerEvents(new BlocksEvent(), this);
        getServer().getPluginManager().registerEvents(new JoinQuitEvent(), this);
        getServer().getPluginManager().registerEvents(new WeatherEvent(), this);
        getServer().getPluginManager().registerEvents(new ItemEvent(), this);
        getServer().getPluginManager().registerEvents(new ChatEvent(), this);
        getServer().getPluginManager().registerEvents(new DamageEvent(), this);
        getServer().getPluginManager().registerEvents(new ClickEvent(), this);

    }
    @Override
    public void onDisable() {
        System.out.println("-----------------------------------------");
        System.out.println("QuadFlameLobby has successfully unloaded!");
        System.out.println("-----------------------------------------");
    }
}