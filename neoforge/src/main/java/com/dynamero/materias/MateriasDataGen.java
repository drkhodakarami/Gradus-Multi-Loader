package com.dynamero.materias;

import com.dynamero.contracts.exceptions.Exceptions;
import com.dynamero.materias.datagen.*;
import com.dynamero.materias.datagen.base.*;
import com.dynamero.materias.datagen.extra.ModPOITags;
import com.dynamero.materias.datagen.extra.ModSoundsProvider;
import com.dynamero.materias.datagen.extra.ModVillagerTradeTags;
import com.dynamero.materias.datagen.misc.ModPaintingTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public final class MateriasDataGen
{
    public MateriasDataGen()
    {
        Exceptions.throwCtorAssertion();
    }

    public static void onGatherClientData(GatherDataEvent.Client event)
    {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getReloadableLookupProvider();

        generator.addProvider(true, new ModModelProvider(packOutput));
        generator.addProvider(true, new ModEnLanguageProvider(packOutput));

        generator.addProvider(true, new ModBlockTagProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModItemTagProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModPaintingTagsProvider(packOutput, lookupProvider));

        generator.addProvider(true, new ModEquipmentAssetProvider(packOutput));

        generator.addProvider(true, new ModDataMapProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModSoundsProvider(packOutput));

        generator.addProvider(true, new ModVillagerTradeTags(packOutput, lookupProvider));
        generator.addProvider(true, new ModPOITags(packOutput, lookupProvider));

        event.createWorldRegistryObjects(ModDatapackProvider.WORLD_BUILDER);
        event.createReloadableRegistryObjects(ModDatapackProvider.RELOADABLE_BUILDER);

        generator.addProvider(true, new ModGlobalLootModifierProvider(packOutput, lookupProvider));
    }
}