package com.dynamero.materias.platform.services;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

import java.util.function.Supplier;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName()
    {
        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId)
    {
        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment()
    {
        return !FMLLoader.getCurrent().isProduction();
    }
}