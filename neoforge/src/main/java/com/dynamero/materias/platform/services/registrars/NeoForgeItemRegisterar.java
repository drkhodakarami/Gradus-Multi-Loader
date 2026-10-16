package com.dynamero.materias.platform.services.registrars;

import com.dynamero.materias.platform.factories.IToolFactory;
import com.dynamero.materias.platform.services.utils.RegistryHandle;
import com.dynamero.materias.utils.BaseHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

import static com.dynamero.materias.MateriasConstants.MODID;

public class NeoForgeItemRegisterar implements IItemRegisterar
{
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

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
    public <R extends Item> RegistryHandle<R> registerTool(ResourceKey<Item> key, ToolMaterial material, float attackDamage, float attackSpeed, IToolFactory<Item.Properties, ? extends R> factory)
    {
        DeferredItem<R> deferredItem =
                ITEMS.register(key.identifier().getPath(),
                               () -> factory.apply(material, attackDamage, attackSpeed,
                                                   new Item.Properties().setId(key)));

        return new RegistryHandle<>()
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
    public <R extends Item> RegistryHandle<R> registerTool(ResourceKey<Item> key, ToolMaterial material, float attackDamage, float attackSpeed,
                                                           Item.Properties settings, IToolFactory<Item.Properties, ? extends R> factory)
    {
        DeferredItem<R> deferredItem =
                ITEMS.register(key.identifier().getPath(),
                               () -> factory.apply(material, attackDamage, attackSpeed, settings.setId(key)));

        return new RegistryHandle<>()
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
    public <R extends Item> RegistryHandle<R> register(ResourceKey<Item> key, Function<Item.Properties, ? extends R> factory)
    {
        DeferredItem<R> deferredItem = ITEMS.registerItem(key.identifier().getPath(), factory);

        return new RegistryHandle<>()
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
    public <R extends Item> RegistryHandle<R> register(ResourceKey<Item> key, int stackCount, Function<Item.Properties, ? extends R> factory)
    {
        DeferredItem<R> deferredItem =
                ITEMS.registerItem(key.identifier().getPath(), factory,
                                   () -> new Item.Properties().setId(key). stacksTo(stackCount));

        return new RegistryHandle<>()
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
    public <R extends Item> RegistryHandle<R> register(ResourceKey<Item> key, Item.Properties settings, Function<Item.Properties, ? extends R> factory)
    {
        DeferredItem<R> deferredItem =
                ITEMS.registerItem(key.identifier().getPath(), factory,
                                   () -> settings.setId(key));

        return new RegistryHandle<>()
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
    public <R extends Item> RegistryHandle<R> register(ResourceKey<Item> key, int stackCount, Item.Properties settings, Function<Item.Properties, ? extends R> factory)
    {
        DeferredItem<R> deferredItem =
                ITEMS.registerItem(key.identifier().getPath(), factory,
                                   () -> settings.setId(key). stacksTo(stackCount));

        return new RegistryHandle<>()
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