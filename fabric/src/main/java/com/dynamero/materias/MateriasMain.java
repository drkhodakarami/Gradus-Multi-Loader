package com.dynamero.materias;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.SharedConstants;

import static com.dynamero.materias.MateriasConstants.LOGGER;

public class MateriasMain implements ModInitializer {

    @Override
    public void onInitialize()
    {
        LOGGER.info(">>> Fabric Loading...");
        MateriasCommon.init();

        if(FabricLoader.getInstance().isDevelopmentEnvironment())
            SharedConstants.IS_RUNNING_IN_IDE = true;
    }
}