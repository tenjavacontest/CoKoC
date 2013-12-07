package cokoc.entitygraph;


import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.Material;

public class EntityGraph extends JavaPlugin {
	public void onEnable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(! (sender instanceof Player)) {
			sender.sendMessage(ChatColor.DARK_RED + "You must be a player to use this command!");
			return true;
		}
		
		if(command.getName().equalsIgnoreCase("test")) {
			ItemStack map = new ItemStack(Material.MAP);
			ItemMeta mapMeta = map.getItemMeta();
			
		}
		
		return true;
	}
}
