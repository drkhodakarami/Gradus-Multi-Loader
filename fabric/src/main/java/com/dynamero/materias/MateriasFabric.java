package com.dynamero.materias;

import com.dynamero.materias.platform.Services;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.SharedConstants;

import static com.dynamero.materias.MateriasConstants.LOG;

public class MateriasFabric implements ModInitializer {

    @Override
    public void onInitialize()
    {
        LOG.logFabric();

        MateriasCommon.init();

        Services.ENTITIE_ATTRIBUTES.applyEntityAttributeRegistrations(FabricDefaultAttributeRegistry::register);

        if(Services.PLATFORM.isDevelopmentEnvironment())
            SharedConstants.IS_RUNNING_IN_IDE = true;
    }
}