package com.dynamero.materias.datagen.base;

import net.minecraft.data.loot.LootTableSubProvider;

public class ModExtraLootProvider implements LootTableSubProvider
{
    private final LootTableSubProvider.Context context;

    public ModExtraLootProvider(LootTableSubProvider.Context context) {
        this.context = context;
    }

    @Override
    public void run()
    {

    }
}