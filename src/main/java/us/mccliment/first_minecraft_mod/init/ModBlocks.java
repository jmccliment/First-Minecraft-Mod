package us.mccliment.first_minecraft_mod.init;

import net.minecraft.block.*;
import us.mccliment.first_minecraft_mod.blocks.BlockFirst_Minecraft_Mod;
import us.mccliment.first_minecraft_mod.help.RegisterHelper;

public class ModBlocks {

	public static Block adamantium_block = new BlockFirst_Minecraft_Mod(1000.0F, 3000.0F, "pickaxe", 1, 0.5F).setUnlocalizedName("adamantium_block");
	
	public static void registerBlocks() {
		RegisterHelper.registerBlock(adamantium_block);
	}
	
	public static void registerBlockRenderer() {
		RegisterHelper.registerBlockRenderer(adamantium_block);
	}
}
