/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oddsandends.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.oddsandends.block.CompactedRedstoneBlock;
import net.mcreator.oddsandends.block.CompactedDiamondBlock;
import net.mcreator.oddsandends.OddsandendsMod;

public class OddsandendsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(OddsandendsMod.MODID);
	public static final DeferredBlock<Block> COMPACTED_DIAMOND;
	public static final DeferredBlock<Block> COMPACTED_REDSTONE;
	static {
		COMPACTED_DIAMOND = REGISTRY.register("compacted_diamond", CompactedDiamondBlock::new);
		COMPACTED_REDSTONE = REGISTRY.register("compacted_redstone", CompactedRedstoneBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}