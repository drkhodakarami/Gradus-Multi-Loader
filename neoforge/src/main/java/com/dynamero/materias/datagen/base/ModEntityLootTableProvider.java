package com.dynamero.materias.datagen.base;

import net.minecraft.data.loot.EntityLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;

public class ModEntityLootTableProvider extends EntityLootSubProvider
{
    public ModEntityLootTableProvider(Context output)
    {
        super(FeatureFlags.REGISTRY.allFlags(), output);
    }

    @Override
    public void generate()
    {

    }
}