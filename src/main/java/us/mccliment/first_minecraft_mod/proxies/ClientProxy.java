package us.mccliment.first_minecraft_mod.proxies;

import us.mccliment.first_minecraft_mod.init.ModBlocks;
import us.mccliment.first_minecraft_mod.init.ModItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenderers() {
		ModItems.registerItemRenderer();
		ModBlocks.registerBlockRenderer();
	}
}
