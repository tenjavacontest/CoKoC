package cokoc.entitygraph;

import org.bukkit.entity.Player;
import org.bukkit.map.MapCanvas;
import org.bukkit.map.MapRenderer;
import org.bukkit.map.MapView;
import org.bukkit.map.MapPalette;

public class GraphMapRenderer extends MapRenderer {
	private final int canvasSizeX = 128;
	private final int canvasSizeY = 128;
	
	private void clear(MapCanvas canvas) {
		for(int x = 0; x < canvasSizeX; ++x)
			for(int y = 0; y < canvasSizeY; ++y)
				canvas.setPixel(x, y, MapPalette.TRANSPARENT);
	}
	
	public void render(MapView view, MapCanvas canvas, Player triggeringPlayer) {
		clear(canvas);
		
		int numberOfNearbySheeps = GraphDataCollector.getNumberOfSheepsAroundPlayer(triggeringPlayer, 10);
		
		float maxNumberOfCountedSheeps = 10;
		float sheepColumnPercentage = numberOfNearbySheeps / maxNumberOfCountedSheeps;
		
		int columnWidth = 20;
		int columnHeight = (int) (sheepColumnPercentage * canvasSizeX);
		
		for(int x = 0; x < columnWidth; ++x)
			for(int y = 0; y < columnHeight; ++y)
				canvas.setPixel(x, 128 - y, MapPalette.BLUE);
	}
}
