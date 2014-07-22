package com.gmail.hardcoreblub123.testplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
	@override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player p = null;
		if(sender instanceof Player){
			p = (Player)sender;
			if(cmd.getName().equalsIgnoreCase("Test")){
				if(args.length == 0){
					p.sendMessage(ChatColor.GREEN + "Plugin funktioniert");
					return true;
				}
				return false;
			}
		return false;
	
		}
		return false;
	}
}
