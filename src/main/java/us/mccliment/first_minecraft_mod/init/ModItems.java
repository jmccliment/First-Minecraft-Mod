package us.mccliment.first_minecraft_mod.init;

import net.minecraft.item.Item;
import us.mccliment.first_minecraft_mod.help.RegisterHelper;
import us.mccliment.first_minecraft_mod.items.ItemFirst_Minecraft_Mod;

public class ModItems {

	public static Item foo = new ItemFirst_Minecraft_Mod().setUnlocalizedName("foo");
	
	public static void registerItems(){
		RegisterHelper.registerItem(foo);
	}
	
	public static void registerItemRenderer() {
		RegisterHelper.registerItemRenderer(foo);
	}
}
