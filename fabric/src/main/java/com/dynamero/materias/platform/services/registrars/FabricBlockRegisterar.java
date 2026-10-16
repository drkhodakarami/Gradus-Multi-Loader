package com.dynamero.materias.platform.services.registrars;

import com.dynamero.materias.platform.factories.IToolFactory;
import com.dynamero.materias.platform.services.utils.RegistryHandle;
import com.dynamero.materias.utils.BaseHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.function.Function;

import static com.dynamero.materias.MateriasConstants.MODID;

public class FabricBlockRegisterar implements IBlockRegisterar
{
    @Override
    public ResourceKey<Block> key(String name)
    {
        return BaseHelper.ResourceKeys.create(MODID, name, Registries.BLOCK);
    }

    public <R extends Block> RegistryHandle<R> register(ResourceKey<Block> key, R block)
    {
        var registered = Registry.register(BuiltInRegistries.BLOCK, key, block);

        return new RegistryHandle<R>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<? super R> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return registered;
            }
        };
    }

    public <R extends Block> RegistryHandle<R> register(ResourceKey<Block> key, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        R block = factory.apply(BlockBehaviour.Properties.of().setId(key));
        var registered = Registry.register(BuiltInRegistries.BLOCK, key, block);



        return new RegistryHandle<R>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<? super R> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return registered;
            }
        };
    }

    public <R extends Block> RegistryHandle<R> register(ResourceKey<Block> key, BlockBehaviour.Properties settings, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        R block = factory.apply(settings.setId(key));
        var registered = Registry.register(BuiltInRegistries.BLOCK, key, block);



        return new RegistryHandle<R>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<? super R> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return registered;
            }
        };
    }

    public <R extends Block> RegistryHandle<R> registerCopy(Block copyBlock, ResourceKey<Block> key, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        R block = factory.apply(BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key));
        var registered = Registry.register(BuiltInRegistries.BLOCK, key, block);



        return new RegistryHandle<R>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<? super R> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return registered;
            }
        };
    }

    public RegistryHandle<StairBlock> registerStair(String name, Block stateBlock, Block copyBlock)
    {
        return registerBlock(name,
                             new StairBlock(
                                     stateBlock.defaultBlockState(),
                                     BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public RegistryHandle<SlabBlock> registerSlab(String name, Block copyBlock)
    {
        return registerBlock(name,
                             new SlabBlock(
                                     BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public RegistryHandle<ButtonBlock> registerButton(String name, BlockSetType blockType, int pressureTicks, Block copyBlock)
    {
        return registerBlock(name,
                             new ButtonBlock(
                                     blockType, pressureTicks,
                                     BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public RegistryHandle<PressurePlateBlock> registerPressurePlate(String name, BlockSetType blockType, Block copyBlock)
    {
        return registerBlock(name,
                             new PressurePlateBlock(
                                     blockType,
                                     BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public RegistryHandle<FenceBlock> registerFence(String name, Block copyBlock)
    {
        return registerBlock(name,
                             new FenceBlock(
                                     BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public RegistryHandle<FenceGateBlock> registerFenceGate(String name, WoodType woodType, Block copyBlock)
    {
        return registerBlock(name,
                             new FenceGateBlock(
                                     woodType,
                                     BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public RegistryHandle<WallBlock> registerWall(String name, Block copyBlock)
    {
        return registerBlock(name,
                             new WallBlock(
                                     BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public RegistryHandle<DoorBlock> registerDoor(String name, BlockSetType blockType, Block copyBlock)
    {
        return registerBlock(name,
                             new DoorBlock(
                                     blockType,
                                     BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public RegistryHandle<TrapDoorBlock> registerTrapdoor(String name, BlockSetType blockType, Block copyBlock)
    {
        return registerBlock(name,
                             new TrapDoorBlock(
                                     blockType,
                                     BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }
}