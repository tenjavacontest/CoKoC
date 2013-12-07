package cokoc.entitygraph;

import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;

public class GraphMapRenderer extends MapRenderer {	
	public void render(MapView view, MapCanvas canvas, Player triggeringPlayer) {
		int numberOfSheepsNearby = GraphDataCollector.getNumberOfSheepsAroundPlayer(triggeringPlayer, 10);
		
	}
}
