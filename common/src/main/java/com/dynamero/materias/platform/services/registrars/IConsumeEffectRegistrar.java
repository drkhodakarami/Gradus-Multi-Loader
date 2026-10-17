package com.dynamero.materias.platform.services.registrars;

import com.dynamero.materias.platform.services.utils.ConsumeEffectHandle;
import com.mojang.serialization.MapCodec;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.consume_effects.ConsumeEffect;

public interface IConsumeEffectRegistrar
{
    ResourceKey<ConsumeEffect.Type<?>> key(String name);

    <T extends ConsumeEffect> ConsumeEffectHandle<ConsumeEffect.Type<T>> register(String name, MapCodec<T> codec, StreamCodec<RegistryFriendlyByteBuf, T> streamCodec);
}