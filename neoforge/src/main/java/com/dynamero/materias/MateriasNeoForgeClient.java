package com.dynamero.materias;

import com.dynamero.contracts.exceptions.Exceptions;
import com.dynamero.materias.platform.ClientServices;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = MateriasConstants.MODID, value = Dist.CLIENT)
public final class MateriasNeoForgeClient
{
    public MateriasNeoForgeClient()
    {
        Exceptions.throwCtorAssertion();
    }

    @SubscribeEvent
    public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event)
    {
        MateriasCommonClient.init();
        ClientServices.ENTITY_RENDERER.applyEntityRendererRegistrations(event::registerEntityRenderer);
    }

    @SubscribeEvent
    public static void registerEntityLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        MateriasCommonClient.init();
        ClientServices.ENTITY_RENDERER.applyModelLayerRegistration(event::registerLayerDefinition);
    }
}