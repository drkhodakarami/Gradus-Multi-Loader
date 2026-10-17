package com.dynamero.materias.datagen.extra;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.PoiTypeTagsProvider;
import net.minecraft.tags.PoiTypeTags;

import java.util.concurrent.CompletableFuture;

import static com.dynamero.materias.MateriasConstants.MODID;

public class ModPOITags extends PoiTypeTagsProvider
{
    public ModPOITags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider)
    {
        super(output, lookupProvider, MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries)
    {
        getOrCreateRawBuilder(PoiTypeTags.ACQUIRABLE_JOB_SITE);
    }
}