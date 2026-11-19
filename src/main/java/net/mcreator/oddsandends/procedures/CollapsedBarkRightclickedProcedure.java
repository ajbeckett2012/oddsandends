package net.mcreator.oddsandends.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class CollapsedBarkRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(Blocks.OAK_LOG).copy();
			_setstack.setCount(3);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}