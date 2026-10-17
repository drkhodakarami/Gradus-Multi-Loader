package com.dynamero.materias.platform.services.registrars;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class NeoForgeEntityAttributeRegisterar implements IEntityAttributeRegisterar
{
    private final List<AttributeEntry<?>> attributes = new ArrayList<>();

    @Override
    public <T extends LivingEntity> void register(Supplier<EntityType<T>> entityTypeSupplier, Supplier<AttributeSupplier.Builder> builderSupplier)
    {
        this.attributes.add(new AttributeEntry<>(entityTypeSupplier, builderSupplier));
    }

    @Override
    public void applyEntityAttributeRegistrations(EntityAttributeRegistrar registrar)
    {
        for (var attribute : this.attributes)
            attribute.register(registrar);
    }

    private record AttributeEntry<T extends LivingEntity>(Supplier<EntityType<T>> entityTypeSupplier, Supplier<AttributeSupplier.Builder> builderSupplier)
    {
        private void register(EntityAttributeRegistrar registrar)
        {
            registrar.register(this.entityTypeSupplier.get(), this.builderSupplier.get());
        }
    }
}