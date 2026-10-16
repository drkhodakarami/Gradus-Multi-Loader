package com.dynamero.materias.platform.services.registrars;

import java.util.function.Function;

import com.dynamero.materias.platform.services.utils.RegistryHandle;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

/**
 * Provides utility methods for registering blocks in Minecraft.
 */

public interface IBlockRegisterar
{
    ResourceKey<Block> key(String name);

    //region MAIN
    default <R extends Block> RegistryHandle<R> register(ResourceKey<Block> key, R block)
    {
        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    default <R extends Block> RegistryHandle<R> register(ResourceKey<Block> key, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        R block = factory.apply(BlockBehaviour.Properties.of().setId(key));
        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    default <R extends Block> RegistryHandle<R> register(ResourceKey<Block> key, BlockBehaviour.Properties settings, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        R block = factory.apply(settings.setId(key));
        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    <R extends Block> RegistryHandle<R> registerBlock(String name, R block);
    //ednregion

    //region HELPERS
    default RegistryHandle<Block> register(ResourceKey<Block> key)
    {
        return register(key, (Function<BlockBehaviour.Properties, Block>) Block::new);
    }

    default RegistryHandle<Block> register(BlockItemId blockItemId)
    {
        return register(blockItemId, (Function<BlockBehaviour.Properties, Block>) Block::new);
    }

    default <R extends Block> RegistryHandle<R> register(BlockItemId blockItemId, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        return register(blockItemId.block(), factory);
    }

    default RegistryHandle<Block> register(BlockItemId blockItemId, BlockBehaviour.Properties settings)
    {
        return register(blockItemId, settings, Block::new);
    }

    default <R extends Block> RegistryHandle<R> register(BlockItemId blockItemId, R block)
    {
        return register(blockItemId.block(), block);
    }

    default <R extends Block> RegistryHandle<R> register(BlockItemId blockItemId, BlockBehaviour.Properties settings, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        return register(blockItemId.block(), settings, factory);
    }
    //ednregion

    //region COPY
    default RegistryHandle<Block> registerCopy(BlockItemId blockItemId, Block copyBlock)
    {
        return registerCopy(blockItemId, copyBlock, Block::new);
    }

    default RegistryHandle<Block> registerCopy(ResourceKey<Block> key, Block copyBlock)
    {
        return registerCopy(copyBlock, key, Block::new);
    }

    default <R extends Block> RegistryHandle<R> registerCopy(BlockItemId blockItemId, Block copyBlock, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        return registerCopy(copyBlock, blockItemId.block(), factory);
    }

    default <R extends Block> RegistryHandle<R> registerCopy(ResourceKey<Block> key, Block copyBlock, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        return registerCopy(copyBlock, key, factory);
    }

    default <R extends Block> RegistryHandle<R> registerCopy(Block copyBlock, ResourceKey<Block> key, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        R block = factory.apply(BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key));
        return Registry.register(BuiltInRegistries.BLOCK, key, block);
    }

    default <R extends Block, C extends Block> RegistryHandle<R> registerCopy(C copyBlock, BlockItemId blockItemId, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        return registerCopy(copyBlock, blockItemId.block(), factory);
    }
    //endregion

    RegistryHandle<StairBlock> registerStair(String name, Block stateBlock, Block copyBlock);
    RegistryHandle<SlabBlock> registerSlab(String name, Block copyBlock);
    RegistryHandle<ButtonBlock> registerButton(String name, BlockSetType blockType, int pressureTicks, Block copyBlock);
    RegistryHandle<PressurePlateBlock> registerPressurePlate(String name, BlockSetType blockType, Block copyBlock);
    RegistryHandle<FenceBlock> registerFence(String name, Block copyBlock);
    RegistryHandle<FenceGateBlock> registerFenceGate(String name, WoodType woodType, Block copyBlock);
    RegistryHandle<WallBlock> registerWall(String name, Block copyBlock);
    RegistryHandle<DoorBlock> registerDoor(String name, BlockSetType blockType, Block copyBlock);
    RegistryHandle<TrapDoorBlock> registerTrapdoor(String name, BlockSetType blockType, Block copyBlock);


    default RegistryHandle<Block> registerXpBlock(String name, int minXp, int maxXp, BlockBehaviour.Properties settings)
    {
        return registerBlock(name, new DropExperienceBlock(UniformInt.of(minXp, maxXp), settings.requiresCorrectToolForDrops()));
    }

    default RegistryHandle<Block> registerXpBlock(String name, int minXp, int maxXp)
    {
        return registerXpBlock(name, minXp, maxXp, BlockBehaviour.Properties.of());
    }
}