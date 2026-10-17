package com.dynamero.materias.platform.services.registrars;

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
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.dynamero.materias.MateriasConstants.MODID;

public class NeoForgeEntityRegisterar implements IEntityRegisterar
{
    public static final DeferredRegister.Entities ENTITIES = DeferredRegister.createEntities(MODID);

    public static void register(IEventBus eventBus)
    {
        ENTITIES.register(eventBus);
    }

    @Override
    public ResourceKey<EntityType<?>> key(String name)
    {
        return BaseHelper.ResourceKeys.create(MODID, name, Registries.ENTITY_TYPE);
    }

    @Override
    public <R extends Entity> EntityHandle<EntityType<R>> register(String name, MobCategory spawnGroup, EntityType.EntityFactory<R> factory)
    {
        var key = key(name);
        var deferred = ENTITIES.register(name, () -> EntityType.Builder.of(factory, spawnGroup).build(key));

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
                return deferred.get();
            }
        };
    }

    @Override
    public <R extends Entity> EntityHandle<EntityType<R>> register(String name, EntityType.Builder<R> type)
    {
        var key = key(name);
        var deferred = ENTITIES.register(name, () -> type.build(key));

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
                return deferred.get();
            }
        };
    }
}