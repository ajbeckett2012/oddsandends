/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oddsandends.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.oddsandends.OddsandendsMod;

public class OddsandendsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, OddsandendsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> LILTMAN = REGISTRY.register("liltman", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("oddsandends", "liltman")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DOORKNOCK = REGISTRY.register("doorknock", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("oddsandends", "doorknock")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MUMBLING = REGISTRY.register("mumbling", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("oddsandends", "mumbling")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FART = REGISTRY.register("fart", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("oddsandends", "fart")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BONK = REGISTRY.register("bonk", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("oddsandends", "bonk")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HORRORVOICES = REGISTRY.register("horrorvoices", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("oddsandends", "horrorvoices")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FAN = REGISTRY.register("fan", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("oddsandends", "fan")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FAN2 = REGISTRY.register("fan2", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("oddsandends", "fan2")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MMERROR = REGISTRY.register("mmerror", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("oddsandends", "mmerror")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MONEYBANK = REGISTRY.register("moneybank", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("oddsandends", "moneybank")));
}