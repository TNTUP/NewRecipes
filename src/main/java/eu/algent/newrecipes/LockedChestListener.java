
package eu.algent.newrecipes;

import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.Material;

public class LockedChestListener implements Listener {

	public LockedChestListener(NewRecipes plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	};

	@EventHandler(ignoreCancelled = true)
	public void onBlockFade(BlockFadeEvent event) {
		if (Material.LOCKED_CHEST.equals(event.getBlock().getType())) {
			event.setCancelled(true);
		};
	};
};
