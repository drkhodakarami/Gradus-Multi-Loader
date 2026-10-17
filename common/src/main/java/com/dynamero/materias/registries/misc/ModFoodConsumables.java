package com.dynamero.materias.registries.misc;

import com.dynamero.contracts.exceptions.Exceptions;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.consume_effects.RemoveStatusEffectsConsumeEffect;

public class ModFoodConsumables
{
    public static final Consumable COOKED_EGG, EGG_AND_BREAD;

    public ModFoodConsumables()
    {
        Exceptions.throwCtorAssertion();
    }

    static
    {
        COOKED_EGG = Consumable.builder()
                .consumeSeconds(0.5F)
                .onConsume(new RemoveStatusEffectsConsumeEffect(MobEffects.POISON))
                .build();

        EGG_AND_BREAD = Consumable.builder()
                .consumeSeconds(2F)
                .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.REGENERATION, 100, 1)))
                .build();

    }
}