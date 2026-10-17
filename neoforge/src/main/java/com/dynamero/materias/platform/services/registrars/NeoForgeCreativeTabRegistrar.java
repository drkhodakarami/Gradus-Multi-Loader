package com.dynamero.materias.platform.services.registrars;

import com.dynamero.materias.platform.services.utils.CreativeTabHandle;
import com.dynamero.materias.utils.BaseHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static com.dynamero.materias.MateriasConstants.CREATIVE_TAB_PREFIX;
import static com.dynamero.materias.MateriasConstants.MODID;

public class NeoForgeCreativeTabRegistrar implements ICreativeTabRegistrar
{
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static void register(IEventBus eventBus)
    {
        TABS.register(eventBus);
    }

    @Override
    public ResourceKey<CreativeModeTab> key(String name)
    {
        return BaseHelper.ResourceKeys.create(MODID, name, Registries.CREATIVE_MODE_TAB);
    }

    @Override
    public CreativeTabHandle<CreativeModeTab> register(String name, String translationKey, Supplier<ItemStack> icon, Consumer<CreativeTabOutput> entries)
    {
        var key = key(name);

        var deferred = TABS.register(name, () -> CreativeModeTab.builder()
                .title(Component.translatable(CREATIVE_TAB_PREFIX + "." + MODID + "." + translationKey))
                .icon(icon)
                .displayItems((_, output) -> entries.accept(output::accept))
                .build());

        return new CreativeTabHandle<>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<CreativeModeTab> key()
            {
                return key;
            }

            @Override
            public CreativeModeTab get()
            {
                return deferred.get();
            }
        };
    }
}