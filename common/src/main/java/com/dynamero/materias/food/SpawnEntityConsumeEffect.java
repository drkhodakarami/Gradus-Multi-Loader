package com.dynamero.materias.food;

import com.dynamero.materias.registries.misc.ModConsumeEffectTypes;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.Holder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.consume_effects.ConsumeEffect;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jspecify.annotations.NonNull;

import java.util.function.Supplier;

public record SpawnEntityConsumeEffect<T extends Entity>
        (Supplier<EntityType<T>> supplier,
         Holder<MobEffect> mobEffect, int duration, int amplifier)
        implements ConsumeEffect
{
    public static final MapCodec<SpawnEntityConsumeEffect<?>> CODEC = RecordCodecBuilder.mapCodec
    (
        ins -> ins.group
        (
            EntityType.CODEC.fieldOf("entityType").forGetter(effect -> effect.supplier().get()),
            MobEffect.CODEC.fieldOf("mobEffect").forGetter(SpawnEntityConsumeEffect::mobEffect),
            Codec.INT.fieldOf("effect_duration").forGetter(SpawnEntityConsumeEffect::duration),
            Codec.INT.fieldOf("effect_amplifier").forGetter(SpawnEntityConsumeEffect::amplifier)
        )
        .apply(ins, (entityType, effect, duration, amplifier) ->
                new SpawnEntityConsumeEffect<>(() -> entityType, effect, duration, amplifier))
    );

    public static final StreamCodec<RegistryFriendlyByteBuf, SpawnEntityConsumeEffect<?>> STREAM_CODEC = StreamCodec.composite
    (
        EntityType.STREAM_CODEC, effect -> effect.supplier().get(),
        MobEffect.STREAM_CODEC, SpawnEntityConsumeEffect::mobEffect,
        ByteBufCodecs.INT, SpawnEntityConsumeEffect::duration,
        ByteBufCodecs.INT, SpawnEntityConsumeEffect::amplifier,

        (entityType, effect, duration, amplifier) ->
                new SpawnEntityConsumeEffect<>(() -> entityType, effect, duration, amplifier)
    );

    @Override
    public @NonNull Type<? extends ConsumeEffect> getType()
    {
        return ModConsumeEffectTypes.SPAWN_ENTITY.get();
    }

    @Override
    public boolean apply(@NonNull Level level, @NonNull ItemStack itemStack, @NonNull LivingEntity consumer)
    {
        EntityType<T> entityType = supplier.get();

        if(entityType == null)
            return false;

        if(!(level instanceof ServerLevel serverLevel))
            return false;

        T spawned = entityType.spawn(serverLevel, consumer.blockPosition(), EntitySpawnReason.SPAWN_ITEM_USE);

        if(spawned == null)
            return false;

        spawned.addDeltaMovement(new Vec3(serverLevel.getRandom().nextInt(0, 6),
                                          serverLevel.getRandom().nextInt(1, 6),
                                          serverLevel.getRandom().nextInt(0, 6)));

        if(mobEffect != null && spawned instanceof LivingEntity living)
            living.addEffect(new MobEffectInstance(mobEffect(), duration(), amplifier()), living);

        return true;
    }
}