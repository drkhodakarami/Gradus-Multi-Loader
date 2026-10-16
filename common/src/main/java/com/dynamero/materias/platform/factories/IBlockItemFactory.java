package com.dynamero.materias.platform.factories;

import net.minecraft.world.level.block.Block;

/**
 * Represents a factory interface for creating item instances from blocks.
 *
 * @param <U> the type of the additional settings required to create the item
 * @param <R> the type of the created item instance
 */
public interface IBlockItemFactory<U, R>
{
    /**
     * Applies the factory to create an item from a block and additional settings.
     *
     * @param block The block to create an item for.
     * @param settings Additional settings required to create the item.
     * @return The created item instance.
     */
    R apply(Block block, U settings);
}