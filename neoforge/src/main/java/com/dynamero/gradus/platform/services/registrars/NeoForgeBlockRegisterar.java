/*
 * Copyright (c) 2026 Alireza Khodakarami
 *
 * Licensed under the LPGL-3.0, (read the "LICENSE" file in repo);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.gnu.org/licenses/lgpl-3.0.en.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dynamero.gradus.platform.services.registrars;

import static com.dynamero.gradus.MateriasConstants.MODID;

import java.util.function.Function;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import com.dynamero.gradus.platform.services.utils.BlockHandle;
import com.dynamero.gradus.utils.BaseHelper;

public class NeoForgeBlockRegisterar implements IBlockRegisterar
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }

    @Override
    public ResourceKey<Block> key(String name)
    {
        return BaseHelper.ResourceKeys.create(MODID, name, Registries.BLOCK);
    }

    public <R extends Block> BlockHandle<R> register(ResourceKey<Block> key, R block)
    {
        var deferred = BLOCKS.register(key.identifier().getPath(), () -> block);

        return new BlockHandle<R>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<Block> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return deferred.get();
            }
        };
    }

    public <R extends Block> BlockHandle<R> register(ResourceKey<Block> key, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        var deferred = BLOCKS.registerBlock(key.identifier().getPath(), factory,
                                            () -> BlockBehaviour.Properties.of().setId(key));

        return new BlockHandle<R>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<Block> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return deferred.get();
            }
        };
    }

    public <R extends Block> BlockHandle<R> register(ResourceKey<Block> key, BlockBehaviour.Properties settings, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        var deferred = BLOCKS.registerBlock(key.identifier().getPath(), factory,
                                            () -> settings.setId(key));

        return new BlockHandle<R>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<Block> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return deferred.get();
            }
        };
    }

    public <R extends Block> BlockHandle<R> registerCopy(ResourceKey<Block> key, Block copyBlock, Function<BlockBehaviour.Properties, ? extends R> factory)
    {
        var deferred = BLOCKS.registerBlock(key.identifier().getPath(), factory,
                                            () -> BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key));

        return new BlockHandle<R>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<Block> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return deferred.get();
            }
        };
    }

    public BlockHandle<StairBlock> registerStair(String name, Block stateBlock, Block copyBlock)
    {
        return register(name,
                        new StairBlock(
                                stateBlock.defaultBlockState(),
                                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public BlockHandle<SlabBlock> registerSlab(String name, Block copyBlock)
    {
        return register(name,
                        new SlabBlock(
                                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public BlockHandle<ButtonBlock> registerButton(String name, BlockSetType blockType, int pressureTicks, Block copyBlock)
    {
        return register(name,
                        new ButtonBlock(
                                blockType, pressureTicks,
                                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public BlockHandle<PressurePlateBlock> registerPressurePlate(String name, BlockSetType blockType, Block copyBlock)
    {
        return register(name,
                        new PressurePlateBlock(
                                blockType,
                                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public BlockHandle<FenceBlock> registerFence(String name, Block copyBlock)
    {
        return register(name,
                        new FenceBlock(
                                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public BlockHandle<FenceGateBlock> registerFenceGate(String name, WoodType woodType, Block copyBlock)
    {
        return register(name,
                        new FenceGateBlock(
                                woodType,
                                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public BlockHandle<WallBlock> registerWall(String name, Block copyBlock)
    {
        return register(name,
                        new WallBlock(
                                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public BlockHandle<DoorBlock> registerDoor(String name, BlockSetType blockType, Block copyBlock)
    {
        return register(name,
                        new DoorBlock(
                                blockType,
                                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }

    public BlockHandle<TrapDoorBlock> registerTrapdoor(String name, BlockSetType blockType, Block copyBlock)
    {
        return register(name,
                        new TrapDoorBlock(
                                blockType,
                                BlockBehaviour.Properties.ofFullCopy(copyBlock).setId(key(name))));
    }
}