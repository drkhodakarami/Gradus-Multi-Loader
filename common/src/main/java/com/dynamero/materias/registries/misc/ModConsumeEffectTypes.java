package com.dynamero.materias.registries.misc;

import com.dynamero.contracts.exceptions.Exceptions;
import com.dynamero.materias.food.SpawnEntityConsumeEffect;
import com.dynamero.materias.platform.Services;
import com.dynamero.materias.platform.services.utils.ConsumeEffectHandle;
import net.minecraft.world.item.consume_effects.ConsumeEffect;

public class ModConsumeEffectTypes
{
    public static final ConsumeEffectHandle<ConsumeEffect.Type<SpawnEntityConsumeEffect<?>>> SPAWN_ENTITY;

    public ModConsumeEffectTypes()
    {
        Exceptions.throwCtorAssertion();
    }

    static
    {
        SPAWN_ENTITY = Services.CONSUME_EFFECT_REGISTRAR.register("spawn_entity",
                                                                  SpawnEntityConsumeEffect.CODEC,
                                                                  SpawnEntityConsumeEffect.STREAM_CODEC);
    }

    public static void load()
    {

    }
}