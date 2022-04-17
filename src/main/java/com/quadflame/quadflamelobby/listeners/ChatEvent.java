package com.quadflame.quadflamelobby.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener {

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){
        Player p = e.getPlayer();
        p.sendMessage(ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "[" + ChatColor.BOLD + "" + ChatColor.LIGHT_PURPLE + "QuadFlame" + ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "]");
    }
}
