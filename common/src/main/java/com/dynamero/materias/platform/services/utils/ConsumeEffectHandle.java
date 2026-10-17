package com.dynamero.materias.platform.services.utils;

import net.minecraft.world.item.consume_effects.ConsumeEffect;

public interface ConsumeEffectHandle<T extends ConsumeEffect.Type<?>> extends RegistryHandle<T, ConsumeEffect.Type<?>>{}