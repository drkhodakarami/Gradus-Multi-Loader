package com.dynamero.materias.platform.services.registrars;

import java.util.function.BiFunction;

import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;

/**
 * Registers custom status effects for Minecraft.
 */
public interface IStatusEffectRegisterar
{
    /**
     * Registers a status effect using a factory function.
     *
     * @param name          the name of the status effect
     * @param category      the category of the status effect (e.g., BENEFICIAL, HARMFUL)
     * @param color         the color of the status effect icon
     * @param factory       the factory used to create instances of the status effect
     * @return the registered status effect entry
     */
    Holder<MobEffect> register(String name, MobEffectCategory category, int color,
                                            BiFunction<MobEffectCategory, Integer, MobEffect> factory);
}