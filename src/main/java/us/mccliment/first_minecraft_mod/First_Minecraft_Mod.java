package us.mccliment.first_minecraft_mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import us.mccliment.first_minecraft_mod.help.*;
import us.mccliment.first_minecraft_mod.init.ModBlocks;
import us.mccliment.first_minecraft_mod.init.ModItems;
import us.mccliment.first_minecraft_mod.proxies.CommonProxy;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class First_Minecraft_Mod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	@Instance(Reference.MODID)
	public static First_Minecraft_Mod instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
