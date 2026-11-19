package net.mcreator.oddsandends.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class CompactedDiamondBlock extends Block {
	public CompactedDiamondBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.DIAMOND).sound(SoundType.METAL).strength(6f).requiresCorrectToolForDrops());
	}
}