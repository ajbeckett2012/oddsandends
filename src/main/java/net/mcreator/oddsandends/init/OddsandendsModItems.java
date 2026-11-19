/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oddsandends.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.oddsandends.item.*;
import net.mcreator.oddsandends.OddsandendsMod;

public class OddsandendsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(OddsandendsMod.MODID);
	public static final DeferredItem<Item> COMPACTED_DIAMOND;
	public static final DeferredItem<Item> COMPACTED_REDSTONE;
	public static final DeferredItem<Item> CHARGED_NETHER_STAR;
	public static final DeferredItem<Item> COBBLESTONE_CORE;
	public static final DeferredItem<Item> WOOD_CORE;
	public static final DeferredItem<Item> SAND_CORE;
	public static final DeferredItem<Item> REM_COBBLESTONE_CORE;
	public static final DeferredItem<Item> REM_WOOD_CORE;
	public static final DeferredItem<Item> REM_SAND_CORE;
	public static final DeferredItem<Item> COLLAPSED_STONE;
	public static final DeferredItem<Item> COLLAPSED_BARK;
	public static final DeferredItem<Item> COLLAPSED_SAND;
	static {
		COMPACTED_DIAMOND = block(OddsandendsModBlocks.COMPACTED_DIAMOND);
		COMPACTED_REDSTONE = block(OddsandendsModBlocks.COMPACTED_REDSTONE);
		CHARGED_NETHER_STAR = REGISTRY.register("charged_nether_star", ChargedNetherStarItem::new);
		COBBLESTONE_CORE = REGISTRY.register("cobblestone_core", CobblestoneCoreItem::new);
		WOOD_CORE = REGISTRY.register("wood_core", WoodCoreItem::new);
		SAND_CORE = REGISTRY.register("sand_core", SandCoreItem::new);
		REM_COBBLESTONE_CORE = REGISTRY.register("rem_cobblestone_core", RemCobblestoneCoreItem::new);
		REM_WOOD_CORE = REGISTRY.register("rem_wood_core", RemWoodCoreItem::new);
		REM_SAND_CORE = REGISTRY.register("rem_sand_core", RemSandCoreItem::new);
		COLLAPSED_STONE = REGISTRY.register("collapsed_stone", CollapsedStoneItem::new);
		COLLAPSED_BARK = REGISTRY.register("collapsed_bark", CollapsedBarkItem::new);
		COLLAPSED_SAND = REGISTRY.register("collapsed_sand", CollapsedSandItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}