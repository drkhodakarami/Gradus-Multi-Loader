package com.dynamero.materias.platform.services.registrars;

import com.dynamero.contracts.annotations.*;
import com.dynamero.materias.platform.Services;
import com.dynamero.materias.platform.factories.IBlockItemFactory;
import com.dynamero.materias.platform.services.utils.BlockHandle;
import com.dynamero.materias.platform.services.utils.ModBlock;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * Provides utility methods for registering block items in Minecraft.
 */
@Developer("TheMentor")
@CreatedAt("2026-10-16")
@ModifiedAt("2026-10-16")
@ModifiedBy("TheMentor")
@Website("https://dynamero.com")
@Repository("https://github.com/drkhodakarami/")
@Discord("https://discord.gg/pmM4emCbuH")
@Youtube("https://www.youtube.com/@TheMentorCodeLab")
@Modrinth("https://modrinth.com/user/jiraiyah")
public interface IBlockItemRegisterar
{
    default BlockItemId key(String name)
    {
        return new BlockItemId(Services.BLOCKS.key(name), Services.ITEMS.key(name));
    }

    //region Helper Overloads
    /**
     * Registers a block item using default settings.
     *
     * @param block The block to register as an item.
     * @return The registered block item.
     */
    default <B extends Block> ModBlock<B, BlockItem> register(BlockHandle<B> block)
    {
        var key = key(block.key().identifier().getPath());
        return register(block, key);
    }

    /**
     * Registers a block item using a custom IBlockItemFactory.
     *
     * @param block The block to register as an item.
     * @param factory The factory to create the block item with custom settings.
     * @return The registered block item.
     */
    default  <B extends Block, I extends BlockItem> ModBlock<B, I> register(BlockHandle<B> block, IBlockItemFactory<Item.Properties, I> factory)
    {
        var key = key(block.key().identifier().getPath());
        return register(block, key, factory);
    }

    /**
     * Registers a block item with custom settings using a custom IBlockItemFactory.
     *
     * @param block The block to register as an item.
     * @param settings Custom settings for the block item.
     * @param factory The factory to create the block item with custom settings.
     * @return The registered block item.
     */
    default <B extends Block, I extends BlockItem> ModBlock<B, I> register(BlockHandle<B> block, Item.Properties settings, IBlockItemFactory<Item.Properties, I> factory)
    {
        var key = key(block.key().identifier().getPath());
        return register(block, key, settings, factory);
    }
    //endregion

    //region Main Overloads

    /**
     * Registers a block item for the specified block using a ResourceKey.
     *
     * @param block the block to register as an item
     * @param key   the resource key for the item registry
     * @return the registered BlockItem instance
     */
    default <B extends Block> ModBlock<B, BlockItem> register(BlockHandle<B> block, ResourceKey<Item> key)
    {
        var registered = Services.ITEMS.register(key,
                                                 properties ->
                                                         new BlockItem(block.get(),
                                                                       properties
                                                                               .useBlockDescriptionPrefix()
                                                                               .setId(key)));
        return new ModBlock<>(block, registered);
    }

    /**
     * Registers a block item for the specified block using a BlockItemId.
     *
     * @param block       the block to register as an item
     * @param blockItemId the block item identifier
     * @return the registered BlockItem instance
     */
    default <B extends Block> ModBlock<B, BlockItem> register(BlockHandle<B> block, BlockItemId blockItemId)
    {
        var registered = Services.ITEMS.register(blockItemId.item(),
                                                 properties ->
                                                         new BlockItem(block.get(),
                                                                       properties
                                                                               .useBlockDescriptionPrefix()
                                                                               .setId(blockItemId.item())));
        return new ModBlock<>(block, registered);
    }

    /**
     * Registers a block item for the specified block using a ResourceKey and custom factory.
     *
     * @param <R>     the concrete BlockItem type
     * @param block   the block to register as an item
     * @param key     the resource key for the item registry
     * @param factory the factory creating the block item
     * @return the registered BlockItem instance
     */
    default <B extends Block, R extends BlockItem> ModBlock<B, R> register(BlockHandle<B> block, ResourceKey<Item> key, IBlockItemFactory<Item.Properties, R> factory)
    {
        var item = factory.apply(block.get(),
                                 new Item.Properties()
                                         .useBlockDescriptionPrefix()
                                         .setId(key));
        var registered = Services.ITEMS.register(key, _ -> item);

        return new ModBlock<>(block, registered);
    }

    /**
     * Registers a block item for the specified block using a BlockItemId and custom factory.
     *
     * @param <R>         the concrete BlockItem type
     * @param block       the block to register as an item
     * @param blockItemId the block item identifier
     * @param factory     the factory creating the block item
     * @return the registered BlockItem instance
     */
    default <B extends Block, R extends BlockItem> ModBlock<B, R> register(BlockHandle<B> block, BlockItemId blockItemId, IBlockItemFactory<Item.Properties, R> factory)
    {
        var item = factory.apply(block.get(),
                                 new Item.Properties()
                                         .useBlockDescriptionPrefix()
                                         .setId(blockItemId.item()));
        var registered = Services.ITEMS.register(blockItemId.item(), _ -> item);

        return new ModBlock<>(block, registered);
    }

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
    default <B extends Block, R extends BlockItem> ModBlock<B, R> register(BlockHandle<B> block, ResourceKey<Item> key, Item.Properties settings, IBlockItemFactory<Item.Properties, R> factory)
    {
        var item = factory.apply(block.get(),
                                 settings
                                         .useBlockDescriptionPrefix()
                                         .setId(key));
        var registered = Services.ITEMS.register(key, _ -> item);

        return new ModBlock<>(block, registered);
    }

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
    default <B extends Block, R extends BlockItem> ModBlock<B, R> register(BlockHandle<B> block, BlockItemId blockItemId, Item.Properties settings, IBlockItemFactory<Item.Properties, R> factory)
    {
        var item = factory.apply(block.get(),
                                 settings
                                         .useBlockDescriptionPrefix()
                                         .setId(blockItemId.item()));
        var registered = Services.ITEMS.register(blockItemId.item(), _ -> item);

        return new ModBlock<>(block, registered);
    }
    //endregion
}