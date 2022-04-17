package com.quadflame.quadflamelobby.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class LobbyGUICommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            Inventory gui = Bukkit.createInventory(p, 9, ChatColor.BLUE + "Server Selector");

            ItemStack bridging = new ItemStack(Material.SANDSTONE);
            ItemStack reduce = new ItemStack(Material.BLAZE_ROD);
            ItemStack mlgrush = new ItemStack(Material.STICK);
            ItemStack clutch = new ItemStack(Material.RED_SANDSTONE_STAIRS);
            ItemStack knockbackffa = new ItemStack(Material.REDSTONE_BLOCK);

            ItemMeta bridging_meta = bridging.getItemMeta();
            bridging_meta.setDisplayName(ChatColor.BLUE + "Fast Builder");
            ArrayList<String> bridging_lore = new ArrayList<>();
            bridging_lore.add(ChatColor.GOLD + "Practice your bridging skills!");
            bridging_meta.setLore(bridging_lore);
            bridging.setItemMeta(bridging_meta);

            ItemMeta reduce_meta = reduce.getItemMeta();
            reduce_meta.setDisplayName(ChatColor.RED + "Reducer");
            ArrayList<String> reduce_lore = new ArrayList<>();
            reduce_lore.add(ChatColor.GOLD + "Practice drag clicking against a bot!");
            reduce_meta.setLore(reduce_lore);
            reduce.setItemMeta(reduce_meta);

            ItemMeta mlgrush_meta = mlgrush.getItemMeta();
            mlgrush_meta.setDisplayName(ChatColor.LIGHT_PURPLE + "MLGRush");
            ArrayList<String> mlgrush_lore = new ArrayList<>();
            mlgrush_lore.add(ChatColor.GOLD + "Drag click against real players!");
            mlgrush_meta.setLore(mlgrush_lore);
            mlgrush.setItemMeta(mlgrush_meta);

            ItemMeta clutch_meta = clutch.getItemMeta();
            clutch_meta.setDisplayName(ChatColor.YELLOW + "Clutch");
            ArrayList<String> clutch_lore = new ArrayList<>();
            clutch_lore.add(ChatColor.GOLD + "Place blocks as fast as you can to save yourself!");
            clutch_meta.setLore(clutch_lore);
            clutch.setItemMeta(clutch_meta);

            ItemMeta knockbackffa_meta = knockbackffa.getItemMeta();
            knockbackffa_meta.setDisplayName(ChatColor.DARK_PURPLE + "Knockback FFA");
            ArrayList<String> knockbackffa_lore = new ArrayList<>();
            knockbackffa_lore.add(ChatColor.GOLD + "MLGRush but even more insane!");
            knockbackffa_meta.setLore(knockbackffa_lore);
            knockbackffa.setItemMeta(knockbackffa_meta);

            gui.setItem(0, clutch);
            gui.setItem(2, reduce);
            gui.setItem(4, bridging);
            gui.setItem(6, mlgrush);
            gui.setItem(8, knockbackffa);
            //ItemStack[] menu_items = {bridging, reduce, mlgrush, clutch, knockbackffa};
            //gui.setContents(menu_items);
            p.openInventory(gui);
        }




        return true;
    }
}
