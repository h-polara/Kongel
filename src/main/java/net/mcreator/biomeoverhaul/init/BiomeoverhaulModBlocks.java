
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.biomeoverhaul.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.biomeoverhaul.block.MudBlock;
import net.mcreator.biomeoverhaul.BiomeoverhaulMod;

public class BiomeoverhaulModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BiomeoverhaulMod.MODID);
	public static final RegistryObject<Block> MUD = REGISTRY.register("mud", () -> new MudBlock());
}
