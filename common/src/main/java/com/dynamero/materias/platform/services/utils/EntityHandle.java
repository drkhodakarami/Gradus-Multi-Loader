package com.dynamero.materias.platform.services.utils;

import net.minecraft.world.entity.EntityType;

public interface EntityHandle<T extends EntityType<?>> extends RegistryHandle<T, EntityType<?>>{}