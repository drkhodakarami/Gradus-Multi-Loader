package com.dynamero.materias.datagen.base;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;

import java.util.concurrent.CompletableFuture;

import static com.dynamero.materias.MateriasConstants.MODID;

public class ModGlobalLootModifierProvider extends GlobalLootModifierProvider
{
    public ModGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries)
    {
        super(output, registries, MODID);
    }

    @Override
    protected void start()
    {

    }
}