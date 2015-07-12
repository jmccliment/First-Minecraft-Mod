package us.mccliment.first_minecraft_mod.help;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterHelper {

	public static void registerBlock(Block block) {
		GameRegistry.registerBlock(block,  block.getUnlocalizedName().substring(5));
	}
	
	public static void registerItem(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}
	
	public static void registerItemRenderer(Item item) {
		ModelResourceLocation location = new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory");
		Minecraft.getMinecraft()
			     .getRenderItem()
			     .getItemModelMesher()
			     .register(item, 0, location);
	}
	
	public static void registerBlockRenderer(Block block) {
		Item item = Item.getItemFromBlock(block);
		ModelResourceLocation location = new ModelResourceLocation(Reference.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory");
		Minecraft.getMinecraft()
				 .getRenderItem()
				 .getItemModelMesher()
				 .register(item,  0, location);
	}
}
