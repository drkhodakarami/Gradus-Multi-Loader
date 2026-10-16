package com.dynamero.materias.platform.services.registrars;

import com.dynamero.materias.platform.factories.IBlockItemFactory;
import com.dynamero.materias.platform.services.utils.RegistryHandle;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * Provides utility methods for registering block items in Minecraft.
 */
public interface IBlockItemRegisterar
{
    //region Helper Overloads
    /**
     * Registers a block item using default settings.
     *
     * @param block The block to register as an item.
     * @return The registered block item.
     */
    public RegistryHandle<BlockItem> register(Block block);

    /**
     * Registers a block item using a custom IBlockItemFactory.
     *
     * @param block The block to register as an item.
     * @param factory The factory to create the block item with custom settings.
     * @return The registered block item.
     */
    public <R extends BlockItem> RegistryHandle<R> register(Block block, IBlockItemFactory<Item.Properties, R> factory);

    /**
     * Registers a block item with custom settings using a custom IBlockItemFactory.
     *
     * @param block The block to register as an item.
     * @param settings Custom settings for the block item.
     * @param factory The factory to create the block item with custom settings.
     * @return The registered block item.
     */
    public <R extends BlockItem> RegistryHandle<R> register(Block block, Item.Properties settings, IBlockItemFactory<Item.Properties, R> factory);
    //endregion

    //region Main Overloads

    /**
     * Registers a block item for the specified block using a ResourceKey.
     *
     * @param block the block to register as an item
     * @param key   the resource key for the item registry
     * @return the registered BlockItem instance
     */
    public <B extends Block> RegistryHandle<BlockItem> register(B block, ResourceKey<Item> key);

    /**
     * Registers a block item for the specified block using a BlockItemId.
     *
     * @param block       the block to register as an item
     * @param blockItemId the block item identifier
     * @return the registered BlockItem instance
     */
    public <B extends Block> RegistryHandle<BlockItem> register(B block, BlockItemId blockItemId);

    /**
     * Registers a block item for the specified block using a ResourceKey and custom factory.
     *
     * @param <R>     the concrete BlockItem type
     * @param block   the block to register as an item
     * @param key     the resource key for the item registry
     * @param factory the factory creating the block item
     * @return the registered BlockItem instance
     */
    public <B extends Block, R extends BlockItem> RegistryHandle<R> register(B block, ResourceKey<Item> key, IBlockItemFactory<Item.Properties, R> factory);

    /**
     * Registers a block item for the specified block using a BlockItemId and custom factory.
     *
     * @param <R>         the concrete BlockItem type
     * @param block       the block to register as an item
     * @param blockItemId the block item identifier
     * @param factory     the factory creating the block item
     * @return the registered BlockItem instance
     */
    public <B extends Block, R extends BlockItem> RegistryHandle<R> register(B block, BlockItemId blockItemId, IBlockItemFactory<Item.Properties, R> factory);

    /**
     * Registers a block item with custom settings using a ResourceKey and custom factory.
     *
     * @param <R>      the concrete BlockItem type
     * @param block    the block to register as an item
     * @param key      the resource key for the item registry
     * @param settings the custom item properties to use
     * @param factory  the factory creating the block item
     * @return the registered BlockItem instance
     */
    public <B extends Block, R extends BlockItem> RegistryHandle<R> register(B block, ResourceKey<Item> key, Item.Properties settings, IBlockItemFactory<Item.Properties, R> factory);

    /**
     * Registers a block item with custom settings using a BlockItemId and custom factory.
     *
     * @param <R>         the concrete BlockItem type
     * @param block       the block to register as an item
     * @param blockItemId the block item identifier
     * @param settings    the custom item properties to use
     * @param factory     the factory creating the block item
     * @return the registered BlockItem instance
     */
    public <B extends Block, R extends BlockItem> RegistryHandle<R> register(B block, BlockItemId blockItemId, Item.Properties settings, IBlockItemFactory<Item.Properties, R> factory);
    //endregion
}