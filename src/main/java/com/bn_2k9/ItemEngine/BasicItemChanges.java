package com.bn_2k9.ItemEngine;

import com.bn_2k9.SimpleItemEdit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class BasicItemChanges {

    static Plugin pl = SimpleItemEdit.getPlugin(SimpleItemEdit.class);

    public static void ChangeItemName(Player p, String Name){
        if (p.getInventory().getItemInMainHand().getType() != Material.AIR) {
            ItemStack ie = p.getInventory().getItemInMainHand();
            ItemMeta im = ie.getItemMeta();
            im.setDisplayName(ChatColor.translateAlternateColorCodes('&', Name));
            ie.setItemMeta(im);
        } else {
            p.sendMessage(SimpleItemEdit.colorcode(pl.getConfig().getString("Messages.NoItemInHand")));
        }
    }

    public static void ChangeDurability(Player p, int Dura){
        if (p.getInventory().getItemInMainHand().getType() != Material.AIR) {
            ItemStack ie = p.getInventory().getItemInMainHand();
            ie.setDurability((short) Dura);
        } else {
            p.sendMessage(SimpleItemEdit.colorcode(pl.getConfig().getString("Messages.NoItemInHand")));
        }
    }

}
