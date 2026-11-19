/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oddsandends.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.oddsandends.client.model.Modeltraymeth;
import net.mcreator.oddsandends.client.model.Modeltray;
import net.mcreator.oddsandends.client.model.ModelTweaker;
import net.mcreator.oddsandends.client.model.ModelHatMan;
import net.mcreator.oddsandends.client.model.ModelCoke;

@EventBusSubscriber(Dist.CLIENT)
public class OddsandendsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelHatMan.LAYER_LOCATION, ModelHatMan::createBodyLayer);
		event.registerLayerDefinition(ModelTweaker.LAYER_LOCATION, ModelTweaker::createBodyLayer);
		event.registerLayerDefinition(Modeltraymeth.LAYER_LOCATION, Modeltraymeth::createBodyLayer);
		event.registerLayerDefinition(ModelCoke.LAYER_LOCATION, ModelCoke::createBodyLayer);
		event.registerLayerDefinition(Modeltray.LAYER_LOCATION, Modeltray::createBodyLayer);
	}
}