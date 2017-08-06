package me.flash1213.Plugins.Healing;

	

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

	public class HealingClass extends JavaPlugin {
	
		@Override
	public void onEnable() {
			
	}
	
		@Override
	public void onDisable() {

		}
		
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
			if (cmd.getName().equalsIgnoreCase("healplayer") && sender instanceof Player) {
				
					Player player = (Player) sender;
				
					//Arg 0 = first word entered after command, Arg 1 = second word, ect.
					int length = args.length;
					
					if (length == 1) {
						
						boolean playerFound = false;
						
						for (Player playerToHeal : Bukkit.getServer().getOnlinePlayers()) {
							if(playerToHeal.getName().equalsIgnoreCase(arg[0])) {
								playerToHeal.setHealth(20.0);
								playerToHeal.sendMessage(ChatColor.GREEN + "You have been healed by " + player.getName() + "!");
								player.sendMessage((ChatColor.GREEN + playerToHeal.getName() + " was healed successfully!");
								playerFound = true;
								break;
							}
						}
			
						if (playerFound == false) {
							player.sendMessage(ChatColor.RED + args [0] + "was not found!");
							
						}
						
						else player.sendMessage(ChatColor.RED + "Incorrect arguments!");
						}	
		
	
		
} 

			
	}
		
		
}