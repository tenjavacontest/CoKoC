package cokoc.entitygraph;

import java.util.List;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;

public class GraphDataCollector {
	public static int getNumberOfSheepsAroundPlayer(Player player, double radius) {
		List<Entity> nearbyEntities = player.getNearbyEntities(radius / 2, radius / 2, radius / 2);
		int numberOfSheeps = 0;
		for(Entity entity : nearbyEntities)
			if(entity instanceof Sheep)
				++numberOfSheeps;
		return numberOfSheeps;
	}
}
