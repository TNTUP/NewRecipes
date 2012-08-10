package eu.algent.NewRecipes;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;

public class Recipes {
    private NewRecipes plugin;

    public Recipes(NewRecipes plugin) {
        this.plugin = plugin;
        initRecipes();
    }

    // Init each recipe enabled in conf
    private void initRecipes() {
        if (plugin.getConfig().getBoolean("grass-block", true)) shapelessGrassBlock();
        if (plugin.getConfig().getBoolean("moss-stone", true)) shapelessMossStone();
    }

    // Grass Block: shapeless, 1 Dirt + 1 Seed
    private void shapelessGrassBlock() {
        ShapelessRecipe recipe =  new ShapelessRecipe(new ItemStack(Material.GRASS));
        recipe.addIngredient(Material.DIRT).addIngredient(Material.SEEDS);
        plugin.getServer().addRecipe(recipe);
    }

    // Moss Stone: shapeless, 1 Cobblestone + 1 seed
    private void shapelessMossStone() {
        ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.MOSSY_COBBLESTONE));
        recipe.addIngredient(Material.COBBLESTONE).addIngredient(Material.SEEDS);
        plugin.getServer().addRecipe(recipe);
    }
}
