package com.dynamero.materias.platform.services.client.registrars;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

import java.util.function.Supplier;

public interface IEntityRendererRegistrar
{
    <T extends Entity> void register(EntityType<T> entityType, EntityRendererProvider<T> provider);

    void registerModelLayer(ModelLayerLocation location, Supplier<LayerDefinition> supplier);

    void applyEntityRendererRegistrations(EntityRendererRegistrar registrar);

    void applyModelLayerRegistration(ModelLayerRegistrar registrar);

    interface EntityRendererRegistrar
    {
        <T extends Entity> void register(EntityType<T> entityType, EntityRendererProvider<T> provider);
    }

    interface ModelLayerRegistrar
    {
        void register(ModelLayerLocation location, Supplier<LayerDefinition> supplier);
    }
}