package com.dynamero.materias;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import static com.dynamero.materias.MateriasConstants.LOGGER;

@Mod(MateriasConstants.MODID)
public class MateriasMain
{

    public MateriasMain(IEventBus eventBus)
    {
        LOGGER.info(">>> NeoForge Loading...");

        MateriasCommon.init();

    }
}