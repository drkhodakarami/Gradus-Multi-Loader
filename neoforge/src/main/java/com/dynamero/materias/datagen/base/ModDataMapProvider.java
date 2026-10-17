package com.dynamero.materias.datagen.base;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider
{
    public ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider)
    {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider)
    {
        /*builder(NeoForgeDataMaps.STRIPPABLES)
                .add(ModBlocks.RUBBER_WOOD_LOG.get(), new Strippable(ModBlocks.STRIPPED_RUBBER_WOOD_LOG.get()), false)
                .add(ModBlocks.RUBBER_WOOD.get(), new Strippable(ModBlocks.STRIPPED_RUBBER_WOOD.get()), false);*/
    }
}