package com.bn_2k9.Listeners;

import com.bn_2k9.ItemEngine.BasicItemChanges;
import com.bn_2k9.SimpleItemEdit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String s, String[] args) {
        if (sender instanceof Player) {
            if (args.length <= 1) {
                SimpleItemEdit.SendHelp(((Player) sender).getPlayer());
            } else {
                switch (args[0]) {
                    case "Name" ->{
                        if (args.length == 2) {
                            BasicItemChanges.ChangeItemName(((Player) sender).getPlayer(), args[1]);
                        } else {
                            SimpleItemEdit.SendHelp(((Player) sender).getPlayer());
                        }
                    }
                    case "Durability" ->{
                        if (args.length == 2) {
                            BasicItemChanges.ChangeDurability(((Player) sender).getPlayer(), Integer.valueOf(args[1]));
                        } else {
                            SimpleItemEdit.SendHelp(((Player) sender).getPlayer());
                        }
                    }
                }
            }
        }

        return true;
    }
}
