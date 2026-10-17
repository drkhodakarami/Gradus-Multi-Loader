package com.dynamero.materias.platform.services.registrars;

import com.dynamero.materias.platform.services.utils.CreativeTabHandle;
import com.dynamero.materias.utils.BaseHelper;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Consumer;
import java.util.function.Supplier;

import static com.dynamero.materias.MateriasConstants.CREATIVE_TAB_PREFIX;
import static com.dynamero.materias.MateriasConstants.MODID;

public class FabricCreativeTabRegistrar implements ICreativeTabRegistrar
{
    @Override
    public ResourceKey<CreativeModeTab> key(String name)
    {
        return BaseHelper.ResourceKeys.create(MODID, name, Registries.CREATIVE_MODE_TAB);
    }

    @Override
    public CreativeTabHandle<CreativeModeTab> register(String name, String translationKey, Supplier<ItemStack> icon, Consumer<CreativeTabOutput> entries)
    {
        var key = key(name);

        var registered = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, FabricCreativeModeTab.builder()
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
                return registered;
            }
        };
    }
}