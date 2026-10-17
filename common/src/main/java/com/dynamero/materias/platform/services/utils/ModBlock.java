package com.dynamero.materias.platform.services.utils;

import net.minecraft.references.BlockItemId;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public record ModBlock<B extends Block, I extends BlockItem>(BlockHandle<B> block, ItemHandle<I> item)
{}