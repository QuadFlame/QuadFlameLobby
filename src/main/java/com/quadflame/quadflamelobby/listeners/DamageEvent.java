package com.quadflame.quadflamelobby.listeners;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

public class DamageEvent implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){
        e.setDeathMessage("");
        Player p = e.getEntity().getPlayer();
        p.setHealth(20);
        Location l = new Location(p.getWorld(), 0.5, 100.0, 0.5);
        p.teleport(l);
    }
    @EventHandler
    public void onRespawn(PlayerRespawnEvent e){
        Player p = e.getPlayer();
        Location l = new Location(p.getWorld(), 0.5, 100.0, 0.5);
    }
    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        event.setCancelled(true);
    }
    @EventHandler
    public void onHunger(FoodLevelChangeEvent e){
        Player p = (Player) e.getEntity();
        if (p.getFoodLevel() == 20){
            e.setCancelled(true);
        }
    }
}
