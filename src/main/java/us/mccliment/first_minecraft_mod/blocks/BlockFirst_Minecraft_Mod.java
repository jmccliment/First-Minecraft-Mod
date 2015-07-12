package us.mccliment.first_minecraft_mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockFirst_Minecraft_Mod extends Block {
	
	public BlockFirst_Minecraft_Mod(float hardness, float resistance, String harvestType, int harvestLevel, float lightLevel) {
		super(Material.rock);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setStepSound(soundTypeStone);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setHarvestLevel(harvestType, harvestLevel);
		this.setLightLevel(lightLevel);
	}
}
