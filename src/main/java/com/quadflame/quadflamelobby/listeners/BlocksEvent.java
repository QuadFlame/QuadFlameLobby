package com.quadflame.quadflamelobby.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlocksEvent implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player p = event.getPlayer();
        if (!p.hasPermission("server.build")) {
            event.setCancelled(true);
            p.sendMessage(ChatColor.RED + "Sorry but you cannot build here!");
        }else{
            event.setCancelled(false);
        }
    }
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event){
        Player p = event.getPlayer();
        if (!p.hasPermission("server.build")) {
            event.setCancelled(true);
            p.sendMessage(ChatColor.RED + "Sorry but you cannot build here!");
        }else{
            event.setCancelled(false);
        }
    }
}