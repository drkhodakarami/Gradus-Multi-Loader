package com.dynamero.materias;

import com.dynamero.materias.platform.ClientServices;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.renderer.entity.EntityRenderers;

public class MateriasFabricClient implements ClientModInitializer
{
    @Override
    public void onInitializeClient()
    {
        MateriasCommonClient.init();

        ClientServices.ENTITY_RENDERER.applyModelLayerRegistration((location, supplier) ->
            ModelLayerRegistry.registerModelLayer(location, supplier::get));
        ClientServices.ENTITY_RENDERER.applyEntityRendererRegistrations(EntityRenderers::register);
    }
}