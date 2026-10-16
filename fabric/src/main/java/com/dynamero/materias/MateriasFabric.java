package com.dynamero.materias;

import com.dynamero.materias.platform.Services;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.SharedConstants;

import static com.dynamero.materias.MateriasConstants.LOGGER;

public class MateriasFabric implements ModInitializer {

    @Override
    public void onInitialize()
    {
        LOGGER.logFabric();

        MateriasCommon.init();

        if(Services.PLATFORM.isDevelopmentEnvironment())
            SharedConstants.IS_RUNNING_IN_IDE = true;
    }
}