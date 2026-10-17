package com.dynamero.materias;

import com.dynamero.materias.platform.Services;
import com.dynamero.materias.platform.services.registrars.*;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;

import static com.dynamero.materias.MateriasConstants.LOG;

@Mod(MateriasConstants.MODID)
public class MateriasNeoForge
{
    public MateriasNeoForge(IEventBus eventBus)
    {
        LOG.logNeoForge();

        MateriasCommon.init();
        eventBus.addListener(MateriasDataGen::onGatherClientData);

        NeoForgeItemRegisterar.register(eventBus);
        NeoForgeBlockRegisterar.register(eventBus);
        NeoForgeEntityRegisterar.register(eventBus);

        NeoForgeCreativeTabRegistrar.register(eventBus);
        NeoForgeConsumeEffectRegistrar.register(eventBus);

        eventBus.addListener(MateriasNeoForge::onEntityAttributeCreation);
    }

    private static void onEntityAttributeCreation(EntityAttributeCreationEvent event)
    {
        Services.ENTITIE_ATTRIBUTES.applyEntityAttributeRegistrations(new IEntityAttributeRegisterar.EntityAttributeRegistrar()
        {
            @Override
            public <T extends LivingEntity> void register(EntityType<T> entityType, AttributeSupplier.Builder builder)
            {
                event.put(entityType, builder.build());
            }
        });
    }
}