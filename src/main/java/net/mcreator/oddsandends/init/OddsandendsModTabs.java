/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oddsandends.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.oddsandends.OddsandendsMod;

public class OddsandendsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, OddsandendsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> AUTOMATION_TAB = REGISTRY.register("automation_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.oddsandends.automation_tab")).icon(() -> new ItemStack(OddsandendsModItems.CHARGED_NETHER_STAR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(OddsandendsModBlocks.COMPACTED_DIAMOND.get().asItem());
				tabData.accept(OddsandendsModBlocks.COMPACTED_REDSTONE.get().asItem());
				tabData.accept(OddsandendsModItems.CHARGED_NETHER_STAR.get());
				tabData.accept(OddsandendsModItems.COBBLESTONE_CORE.get());
				tabData.accept(OddsandendsModItems.WOOD_CORE.get());
				tabData.accept(OddsandendsModItems.SAND_CORE.get());
				tabData.accept(OddsandendsModItems.REM_COBBLESTONE_CORE.get());
				tabData.accept(OddsandendsModItems.REM_WOOD_CORE.get());
				tabData.accept(OddsandendsModItems.REM_SAND_CORE.get());
				tabData.accept(OddsandendsModItems.COLLAPSED_STONE.get());
				tabData.accept(OddsandendsModItems.COLLAPSED_BARK.get());
				tabData.accept(OddsandendsModItems.COLLAPSED_SAND.get());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WIP = REGISTRY.register("wip",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.oddsandends.wip")).icon(() -> new ItemStack(Blocks.BARRIER)).displayItems((parameters, tabData) -> {
				tabData.accept(OddsandendsModBlocks.MACHINE_FRAME.get().asItem());
				tabData.accept(OddsandendsModBlocks.MACHINE_FRAME_CORNER.get().asItem());
				tabData.accept(OddsandendsModBlocks.MACHINE_FRAME_CORNER_BOTTOM.get().asItem());
			}).withTabsBefore(AUTOMATION_TAB.getId()).build());
}