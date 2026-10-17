package com.dynamero.materias.platform.services.client.registrars;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class FabricEntityRendererRegistrar implements IEntityRendererRegistrar
{
    private final List<EntityRendererEntry<?>> entityRenderers = new ArrayList<>();
    private final List<ModelLayerEntry> modelLayers = new ArrayList<>();

    @Override
    public <T extends Entity> void register(EntityType<T> entityType, EntityRendererProvider<T> provider)
    {
        this.entityRenderers.add(new EntityRendererEntry<>(entityType, provider));
    }

    @Override
    public void registerModelLayer(ModelLayerLocation location, Supplier<LayerDefinition> supplier)
    {
        this.modelLayers.add(new ModelLayerEntry(location, supplier));
    }

    @Override
    public void applyEntityRendererRegistrations(EntityRendererRegistrar registrar)
    {
        for (EntityRendererEntry<?> renderer : this.entityRenderers)
            renderer.register(registrar);
    }

    @Override
    public void applyModelLayerRegistration(ModelLayerRegistrar registrar)
    {
        for (ModelLayerEntry layer : this.modelLayers)
            layer.register(registrar);
    }

    private record EntityRendererEntry<T extends Entity>(EntityType<T> entityType, EntityRendererProvider<T> provider)
    {
        private void register(EntityRendererRegistrar registrar)
        {
            registrar.register(this.entityType, this.provider);
        }
    }

    private record ModelLayerEntry(ModelLayerLocation location, Supplier<LayerDefinition> supplier)
    {
        private void register(ModelLayerRegistrar registrar)
        {
            registrar.register(this.location, this.supplier);
        }
    }
}