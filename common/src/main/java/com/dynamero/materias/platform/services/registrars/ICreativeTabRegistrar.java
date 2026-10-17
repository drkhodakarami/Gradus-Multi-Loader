package com.dynamero.materias.platform.services.registrars;

import com.dynamero.materias.platform.services.utils.CreativeTabHandle;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface ICreativeTabRegistrar
{
    ResourceKey<CreativeModeTab> key(String name);

    CreativeTabHandle<CreativeModeTab> register(String name, String translationKey, Supplier<ItemStack> icon, Consumer<CreativeTabOutput> entries);

    @FunctionalInterface
    interface CreativeTabOutput
    {
        void accept(ItemLike itemLike);
    }
}