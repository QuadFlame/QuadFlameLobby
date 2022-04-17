package com.quadflame.quadflamelobby.listeners;


import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

public class JoinQuitEvent implements Listener{
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player p = event.getPlayer();
        Location l = new Location(p.getWorld(), 0.5, 100.0, 0.5);
        event.setJoinMessage("");
        p.teleport(l);
        p.playSound(p.getLocation(), Sound.ORB_PICKUP, 100, 100);
        p.getInventory().clear();
        p.getInventory().setItem(4, new ItemStack(Material.COMPASS));
    }
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event){
        event.setQuitMessage("");
    }
}
