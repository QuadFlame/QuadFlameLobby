package com.quadflame.quadflamelobby.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;

public class ItemEvent implements Listener {

    @EventHandler
    public void onItemDamage(PlayerItemDamageEvent event){
        Player p = event.getPlayer();
        event.setCancelled(!p.hasPermission("server.item.damage"));
    }
    @EventHandler
    public void onItemConsume(PlayerItemConsumeEvent event){
        Player p = event.getPlayer();
        event.setCancelled(!p.hasPermission("server.item.consume"));
    }
    @EventHandler
    public void onDrop(PlayerDropItemEvent e){
        Player p = e.getPlayer();
        e.setCancelled(!p.hasPermission("server.item.drop"));
    }
}
