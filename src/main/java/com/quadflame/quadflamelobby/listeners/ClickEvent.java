package com.quadflame.quadflamelobby.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class ClickEvent implements Listener {
    @EventHandler
    public void onClickEvent(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        e.setCancelled(!p.hasPermission("server.inventory.click"));
        if (e.getClickedInventory().getTitle().equalsIgnoreCase(ChatColor.BLUE + "Server Selector")){
            switch(e.getCurrentItem().getType()){
                case SANDSTONE:
                    p.closeInventory();
                    p.performCommand("server bridging");
                    break;
                case BLAZE_ROD:
                    p.closeInventory();
                    p.performCommand("server practice");
                    break;
                case STICK:
                    p.closeInventory();
                    p.performCommand("server mlgrush");
                    break;
                case RED_SANDSTONE_STAIRS:
                    p.closeInventory();
                    p.performCommand("server clutch");
                    break;
                case REDSTONE_BLOCK:
                    p.closeInventory();
                    p.performCommand("server kbffa");
                    break;
            }
            e.setCancelled(true);
        }
    }
    @EventHandler
    public void onClickCompass(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(p.getItemInHand().getType() == Material.COMPASS){
            p.performCommand("gui");
        }
    }
}
