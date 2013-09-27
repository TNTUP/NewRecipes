package eu.algent.newrecipes;

import org.bukkit.DyeColor;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

public class Recipes {
	private NewRecipes plugin;

	public Recipes(NewRecipes plugin) {
		this.plugin = plugin;
		initRecipes();
	}

	// Init recipes enabled in conf
	private void initRecipes() {
		ConfigurationSection recipeConfig = plugin.getConfig().getConfigurationSection("recipes");
		if (recipeConfig.getBoolean("grass-block", true)) shapelessGrassBlock();
		if (recipeConfig.getBoolean("mycelium", true)) shapedMycelium();
		if (recipeConfig.getBoolean("moss-stone", true)) shapelessMossStone();
		if (recipeConfig.getBoolean("moss-stonebrick", true)) shapelessMossStoneBrick();
		if (recipeConfig.getBoolean("cracked-stonebrick", true)) shapelessCrackedStoneBrick();
		if (recipeConfig.getBoolean("chiseled-stonebrick", true)) shapedChiseledStoneBrick();
		if (recipeConfig.getBoolean("seamless-doubleslab", true)) shapedSeamlessDoubleSlab();
		if (recipeConfig.getBoolean("soulsand", true)) shapelessSoulSand();	
		if (recipeConfig.getBoolean("string", true)) shapelessString();
		if (recipeConfig.getBoolean("cobweb", true)) shapedCobweb();
		if (recipeConfig.getBoolean("sand", true)) shapelessSand();
		if (recipeConfig.getBoolean("clay", true)) shapelessClay();
		if (recipeConfig.getBoolean("sponge", true)) shapedSponge();
		if (recipeConfig.getBoolean("ice", true)) shapedIce();
		if (recipeConfig.getBoolean("slimeball", true)) shapelessSlimeball();
		if (recipeConfig.getBoolean("glowstone", true)) shapedGlowstoneBlock();
		if (recipeConfig.getBoolean("chain-armor", true)) shapedChainArmor();
		if (recipeConfig.getBoolean("water", true)) shapelessWater();
		if (recipeConfig.getBoolean("lava", true)) shapelessLava();
		if (recipeConfig.getBoolean("locked-chest", true)) shapedLockedChest();
		if (recipeConfig.getBoolean("dyed-deadbush", true)) shapelessDyedDeadBush();
	}

	// Grass Block(1): shapeless, 1 Dirt + 1 Seed
	private void shapelessGrassBlock() {
		ShapelessRecipe recipe =  new ShapelessRecipe(new ItemStack(Material.GRASS));
		recipe.addIngredient(Material.DIRT).addIngredient(Material.SEEDS);
		plugin.getServer().addRecipe(recipe);
	}

	// Mycelium(1): shaped, 1 Brown Mushroom + 1 Red Mushroom + 1 Dirt vertically
	private void shapedMycelium() {
		ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.MYCEL));
		recipe.shape("b", "r", "d").setIngredient('d', Material.DIRT);
		recipe.setIngredient('r', Material.RED_MUSHROOM).setIngredient('b', Material.BROWN_MUSHROOM);
		plugin.getServer().addRecipe(recipe);
	}

	// Moss Stone(1): shapeless, 1 Cobblestone + 1 Seed
	private void shapelessMossStone() {
		ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.MOSSY_COBBLESTONE));
		recipe.addIngredient(Material.COBBLESTONE).addIngredient(Material.SEEDS);
		plugin.getServer().addRecipe(recipe);
	}

	// Mossy Stone Brick(1): shapeless, 1 Stone Brick + 1 Seed
	private void shapelessMossStoneBrick() {
		ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.SMOOTH_BRICK, 1, (short) 1));
		recipe.addIngredient(Material.SMOOTH_BRICK, 0).addIngredient(Material.SEEDS);
		plugin.getServer().addRecipe(recipe);
	}

	// Cracked Stone Brick(1): shapeless, 1 Stone Brick + 1 Flint
	private void shapelessCrackedStoneBrick() {
		ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.SMOOTH_BRICK, 1, (short) 2));
		recipe.addIngredient(Material.SMOOTH_BRICK, 0).addIngredient(Material.FLINT);
		plugin.getServer().addRecipe(recipe);
	}

	// Chiseled Stone Brick(1): shaped, 2 Stone Bricks Slab vertically
	private void shapedChiseledStoneBrick() {
		ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.SMOOTH_BRICK, 1, (short) 3));
		recipe.shape("o", "o").setIngredient('o', Material.STEP, 5);
		plugin.getServer().addRecipe(recipe);
	}

	// Seamless Double Slab(1): shaped, 2 Stone Slab vertically
	private void shapedSeamlessDoubleSlab() {
		ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.DOUBLE_STEP, 1, (short) 8));
		recipe.shape("o", "o").setIngredient('o', Material.STEP, 0);
		plugin.getServer().addRecipe(recipe);
	}

	// Soul Sand(1): shapeless, 1 Netherrack + 1 Gravel
	private void shapelessSoulSand() {
		ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.SOUL_SAND, 1));
		recipe.addIngredient(Material.NETHERRACK).addIngredient(Material.GRAVEL);
		plugin.getServer().addRecipe(recipe);
	}

	// String(4): shapeless, 1 Wool
	private void shapelessString() {
		ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.STRING, 4));
		recipe.addIngredient(Material.WOOL);
		plugin.getServer().addRecipe(recipe);
	}

	// Cobweb(2): shaped, 5 strings in X
	private void shapedCobweb() {
		ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.WEB, 2));
		recipe.shape("o o", " o ", "o o").setIngredient('o', Material.STRING);
		plugin.getServer().addRecipe(recipe);
	}

	// Sand(4): shapeless, 1 Sandstone
	private void shapelessSand() {
		ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.SAND, 4));
		recipe.addIngredient(Material.SANDSTONE);
		plugin.getServer().addRecipe(recipe);
	}

	// Clay(1): shapeless, 1 Dirt + 1 Gravel
	private void shapelessClay() {
		ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.CLAY));
		recipe.addIngredient(Material.DIRT).addIngredient(Material.GRAVEL);
		plugin.getServer().addRecipe(recipe);
	}

	// Sponge(1): shaped, 1 Yellow Dye + 8 Leaves with dye in center
	private void shapedSponge() {
		ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.SPONGE));
		recipe.shape("lll", "lyl", "lll");
		recipe.setIngredient('y', Material.INK_SACK, DyeColor.YELLOW.getDyeData());
		recipe.setIngredient('l', Material.LEAVES, Short.MAX_VALUE);
		plugin.getServer().addRecipe(recipe);
	}

	// Ice(1): shaped, 2 Snow Block vertically
	private void shapedIce() {
		ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.ICE));
		recipe.shape("o", "o").setIngredient('o', Material.SNOW_BLOCK);
		plugin.getServer().addRecipe(recipe);
	}

	// Slimeball(1): shapeless, 1 Milk + 1 Lime Dye
	public void shapelessSlimeball() {
		ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.SLIME_BALL));
		recipe.addIngredient(Material.MILK_BUCKET);
		recipe.addIngredient(Material.INK_SACK, DyeColor.LIME.getDyeData());
		plugin.getServer().addRecipe(recipe);
	}

	// Glowstone(1): shapeless, 1 Yellow Dye + 1 Torch + 1 Glass
	public void shapedGlowstoneBlock() {
		ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.GLOWSTONE));
		recipe.addIngredient(Material.INK_SACK, DyeColor.YELLOW.getDyeData());
		recipe.addIngredient(Material.TORCH);
		recipe.addIngredient(Material.GLASS);
		plugin.getServer().addRecipe(recipe);
	}

	// Full Chain Armor
	public void shapedChainArmor() {
		// Chain Helmet
		ShapedRecipe recipeH = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_HELMET));
		recipeH.shape("ooo", "o o").setIngredient('o', Material.IRON_FENCE);
		plugin.getServer().addRecipe(recipeH);
		// Chain Chestplate
		ShapedRecipe recipeC = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		recipeC.shape("o o", "ooo", "ooo").setIngredient('o', Material.IRON_FENCE);
		plugin.getServer().addRecipe(recipeC);
		// Chain Leggings
		ShapedRecipe recipeL = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_LEGGINGS));
		recipeL.shape("ooo", "o o", "o o").setIngredient('o', Material.IRON_FENCE);
		plugin.getServer().addRecipe(recipeL);
		// Chain Boots
		ShapedRecipe recipeB = new ShapedRecipe(new ItemStack(Material.CHAINMAIL_BOOTS));
		recipeB.shape("o o", "o o").setIngredient('o', Material.IRON_FENCE);
		plugin.getServer().addRecipe(recipeB);
	}

	// Lava(1): shapeless, 1 Lava Bucket
	private void shapelessLava() {
		ShapelessRecipe recipe =  new ShapelessRecipe(new ItemStack(Material.STATIONARY_LAVA));
		recipe.addIngredient(Material.LAVA_BUCKET);
		plugin.getServer().addRecipe(recipe);
	}

	// Water(1): shapeless, 1 Water Bucket
	private void shapelessWater() {
		ShapelessRecipe recipe =  new ShapelessRecipe(new ItemStack(Material.STATIONARY_WATER));
		recipe.addIngredient(Material.WATER_BUCKET);
		plugin.getServer().addRecipe(recipe);
	}

	// Locked Chest(2): 1 magenta wool + 1 black wool, 1 black wool + 1 magenta wool
	private void shapedLockedChest() {
		ShapedRecipe recipe = new ShapedRecipe(new ItemStack(Material.LOCKED_CHEST));
		recipe.shape("mb", "mb");
		recipe.setIngredient('m', Material.WOOL, DyeColor.MAGENTA.getWoolData());
		recipe.setIngredient('b', Material.WOOL, DyeColor.BLACK.getWoolData());
		plugin.getServer().addRecipe(recipe);
	}

	// Dyed Dead Bush(1): 1 cactus green dye + 1 dead bush
	private void shapelessDyedDeadBush() {
		ShapelessRecipe recipe = new ShapelessRecipe(new ItemStack(Material.LONG_GRASS, 1, (short) 3));
		recipe.addIngredient(Material.DEAD_BUSH);
		recipe.addIngredient(Material.INK_SACK, 2);
		plugin.getServer().addRecipe(recipe);
	}
}
