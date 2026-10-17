package com.dynamero.materias.platform.services.registrars;

import com.dynamero.materias.platform.services.utils.ConsumeEffectHandle;
import com.dynamero.materias.utils.BaseHelper;
import com.mojang.serialization.MapCodec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.consume_effects.ConsumeEffect;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.dynamero.materias.MateriasConstants.MODID;

public class NeoForgeConsumeEffectRegistrar implements IConsumeEffectRegistrar
{

    public static final DeferredRegister<ConsumeEffect.Type<?>> EFFECTS = DeferredRegister.create(Registries.CONSUME_EFFECT_TYPE, MODID);

    public static void register(IEventBus eventBus)
    {
        EFFECTS.register(eventBus);
    }

    @Override
    public ResourceKey<ConsumeEffect.Type<?>> key(String name)
    {
        return BaseHelper.ResourceKeys.create(MODID, name, Registries.CONSUME_EFFECT_TYPE);
    }

    @Override
    public <T extends ConsumeEffect> ConsumeEffectHandle<ConsumeEffect.Type<T>> register(String name, MapCodec<T> codec, StreamCodec<RegistryFriendlyByteBuf, T> streamCodec)
    {
        var key = key(name);

        var deferred = EFFECTS.register(name, () -> new ConsumeEffect.Type<>(codec, streamCodec));

        return new ConsumeEffectHandle<>()
        {
            @Override
            public Identifier id()
            {
                return key.identifier();
            }

            @Override
            public ResourceKey<ConsumeEffect.Type<?>> key()
            {
                return key;
            }

            @Override
            public ConsumeEffect.Type<T> get()
            {
                return deferred.get();
            }
        };
    }
}