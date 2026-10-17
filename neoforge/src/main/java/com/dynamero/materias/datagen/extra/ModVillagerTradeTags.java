package com.dynamero.materias.datagen.extra;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VillagerTradesTagsProvider;
import net.minecraft.tags.VillagerTradeTags;

import java.util.concurrent.CompletableFuture;

import static com.dynamero.materias.MateriasConstants.MODID;

public class ModVillagerTradeTags extends VillagerTradesTagsProvider
{
    public ModVillagerTradeTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider)
    {
        super(output, lookupProvider, MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries)
    {
        getOrCreateRawBuilder(VillagerTradeTags.FARMER_LEVEL_1);
        getOrCreateRawBuilder(VillagerTradeTags.FARMER_LEVEL_2);
        getOrCreateRawBuilder(VillagerTradeTags.LIBRARIAN_LEVEL_1);
    }
}