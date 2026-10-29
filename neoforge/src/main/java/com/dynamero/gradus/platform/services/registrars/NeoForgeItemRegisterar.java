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
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

import com.dynamero.gradus.platform.factories.IToolFactory;
import com.dynamero.gradus.platform.services.utils.ItemHandle;
import com.dynamero.gradus.utils.BaseHelper;

public class NeoForgeItemRegisterar implements IItemRegisterar
{
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

    @Override
    public ResourceKey<Item> key(String name)
    {
        return BaseHelper.ResourceKeys.create(MODID, name, Registries.ITEM);
    }

    @Override
    public <R extends Item> ItemHandle<R> registerTool(ResourceKey<Item> key, ToolMaterial material, float attackDamage, float attackSpeed, IToolFactory<Item.Properties, ? extends R> factory)
    {
        DeferredItem<R> deferredItem =
                ITEMS.register(key.identifier().getPath(),
                               () -> factory.apply(material, attackDamage, attackSpeed,
                                                   new Item.Properties().setId(key)));

        return new ItemHandle<>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<Item> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return deferredItem.get();
            }
        };
    }

    @Override
    public <R extends Item> ItemHandle<R> registerTool(ResourceKey<Item> key, ToolMaterial material, float attackDamage, float attackSpeed,
                                                           Item.Properties settings, IToolFactory<Item.Properties, ? extends R> factory)
    {
        DeferredItem<R> deferredItem =
                ITEMS.register(key.identifier().getPath(),
                               () -> factory.apply(material, attackDamage, attackSpeed, settings.setId(key)));

        return new ItemHandle<>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<Item> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return deferredItem.get();
            }
        };
    }

    @Override
    public <R extends Item> ItemHandle<R> register(ResourceKey<Item> key, Function<Item.Properties, ? extends R> factory)
    {
        DeferredItem<R> deferredItem = ITEMS.registerItem(key.identifier().getPath(), factory);

        return new ItemHandle<>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<Item> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return deferredItem.get();
            }
        };
    }

    @Override
    public <R extends Item> ItemHandle<R> register(ResourceKey<Item> key, int stackCount, Function<Item.Properties, ? extends R> factory)
    {
        DeferredItem<R> deferredItem =
                ITEMS.registerItem(key.identifier().getPath(), factory,
                                   () -> new Item.Properties().setId(key). stacksTo(stackCount));

        return new ItemHandle<>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<Item> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return deferredItem.get();
            }
        };
    }

    @Override
    public <R extends Item> ItemHandle<R> register(ResourceKey<Item> key, Item.Properties settings, Function<Item.Properties, ? extends R> factory)
    {
        DeferredItem<R> deferredItem =
                ITEMS.registerItem(key.identifier().getPath(), factory,
                                   () -> settings.setId(key));

        return new ItemHandle<>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<Item> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return deferredItem.get();
            }
        };
    }

    @Override
    public <R extends Item> ItemHandle<R> register(ResourceKey<Item> key, int stackCount, Item.Properties settings, Function<Item.Properties, ? extends R> factory)
    {
        DeferredItem<R> deferredItem =
                ITEMS.registerItem(key.identifier().getPath(), factory,
                                   () -> settings.setId(key). stacksTo(stackCount));

        return new ItemHandle<>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<Item> key()
            {
                return key;
            }

            @Override
            public R get()
            {
                return deferredItem.get();
            }
        };
    }
}