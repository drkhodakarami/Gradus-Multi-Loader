package com.dynamero.materias.platform.services.registrars;

import com.dynamero.materias.platform.services.utils.BlockHandle;
import com.dynamero.materias.platform.services.utils.EntityHandle;
import com.dynamero.materias.utils.BaseHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.function.Function;

import static com.dynamero.materias.MateriasConstants.MODID;

public class FabricEntityRegisterar implements IEntityRegisterar
{
    @Override
    public ResourceKey<EntityType<?>> key(String name)
    {
        return BaseHelper.ResourceKeys.create(MODID, name, Registries.ENTITY_TYPE);
    }

    @Override
    public <R extends Entity> EntityHandle<EntityType<R>> register(String name, MobCategory spawnGroup, EntityType.EntityFactory<R> factory)
    {
        var key = key(name);
        var entityType = EntityType.Builder.of(factory, spawnGroup).build(key);
        var registered = Registry.register(BuiltInRegistries.ENTITY_TYPE, key, entityType);

        return new EntityHandle<>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<EntityType<?>> key()
            {
                return key;
            }

            @Override
            public EntityType<R> get()
            {
                return registered;
            }
        };
    }

    @Override
    public <R extends Entity> EntityHandle<EntityType<R>> register(String name, EntityType.Builder<R> type)
    {
        var key = key(name);
        var registered = Registry.register(BuiltInRegistries.ENTITY_TYPE, key, type.build(key));

        return new EntityHandle<>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<EntityType<?>> key()
            {
                return key;
            }

            @Override
            public EntityType<R> get()
            {
                return registered;
            }
        };
    }
}