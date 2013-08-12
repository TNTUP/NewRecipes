
package eu.algent.newrecipes;

import org.bukkit.plugin.java.JavaPlugin;

public class NewRecipes extends JavaPlugin {

	public void onEnable() {
		// save default config.yml if it is missing.
		saveDefaultConfig();
		// Init
		new Recipes(this);
		if (getConfig().getBoolean("extras.disable-locked-chest-decay", true)) {
			new LockedChestListener(this);
		};
	}
}
