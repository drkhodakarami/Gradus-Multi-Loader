package com.dynamero.materias;

import com.dynamero.materias.platform.services.registrars.NeoForgeBlockRegisterar;
import com.dynamero.materias.platform.services.registrars.NeoForgeItemRegisterar;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import static com.dynamero.materias.MateriasConstants.LOGGER;

@Mod(MateriasConstants.MODID)
public class MateriasNeoForge
{
    public MateriasNeoForge(IEventBus eventBus)
    {
        LOGGER.logNeoForge();

        MateriasCommon.init();

        NeoForgeItemRegisterar.register(eventBus);
        NeoForgeBlockRegisterar.register(eventBus);
    }
}