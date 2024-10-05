package com.bn_2k9;

import com.bn_2k9.Listeners.Command;
import com.bn_2k9.Listeners.CommandSuggestion;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleItemEdit extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.saveConfig();

        this.getCommand("Item").setExecutor(new Command());
        this.getCommand("Item").setTabCompleter(new CommandSuggestion());

        Bukkit.getLogger().info("[SimpleItemEdit] Started!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        Bukkit.getLogger().info("[SimpleItemEdit] Shutdown!");
    }

    public static String colorcode(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }

    public static void SendHelp(Player p) {
        for (String s: SimpleItemEdit.getPlugin(SimpleItemEdit.class).getConfig().getStringList("Messages.Help")) {
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', SimpleItemEdit.getPlugin(SimpleItemEdit.class).getConfig().getString("Plugin.Prefix") + s));
        }
    }
}
