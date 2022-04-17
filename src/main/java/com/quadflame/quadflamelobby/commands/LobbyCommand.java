package com.quadflame.quadflamelobby.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class LobbyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // /lobby - teleports player to lobby
        if (command.getName().equalsIgnoreCase("lobby")){
            if (sender instanceof Player){
                Player p = (Player) sender;
                Location l = new Location(p.getWorld(), 0.5, 100.0, 0.5);
                p.teleport(l);
                p.sendMessage(ChatColor.LIGHT_PURPLE + "You have been teleported to the spawn");
            }else if (sender instanceof ConsoleCommandSender){
                System.out.println("This is a player command only!");
            }
        }
        return true;
    }

}
