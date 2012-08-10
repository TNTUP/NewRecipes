package eu.algent.NewRecipes;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public class NewRecipes extends JavaPlugin {

    public void onEnable() {
        // Check if config file exist
        if (!(new File(getDataFolder(), "config.yml").exists())) saveDefaultConfig();
        // Init recipes
        new Recipes(this);
        getLogger().info(getName() + " has been enabled.");
    }

    public void onDisable() {
        getLogger().info(getName() + " has been disabled.");
    }
}
