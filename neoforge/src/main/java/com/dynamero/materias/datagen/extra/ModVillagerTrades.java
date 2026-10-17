package com.dynamero.materias.datagen.extra;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.trading.VillagerTrade;

import static com.dynamero.materias.MateriasConstants.MODID;

public class ModVillagerTrades
{
    public static void bootstrap(BootstrapContext<VillagerTrade> context)
    {
        var items = context.lookup(Registries.ITEM);
        var enchantments = context.lookup(Registries.ENCHANTMENT);
    }

    private static ResourceKey<VillagerTrade> createKey(String name)
    {
        return ResourceKey.create(Registries.VILLAGER_TRADE, Identifier.fromNamespaceAndPath(MODID, name));
    }
}