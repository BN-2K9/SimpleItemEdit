package com.bn_2k9.Listeners;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class CommandSuggestion implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] args) {
        List<String> list = new ArrayList<>();
        if (args.length == 1) {
            list.add("Name");
            list.add("Durability");
        }
        return list;
    }
}
