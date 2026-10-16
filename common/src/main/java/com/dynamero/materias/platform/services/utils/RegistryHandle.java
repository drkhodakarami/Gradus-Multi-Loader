package com.dynamero.materias.platform.services.utils;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

import java.util.function.Supplier;

public interface RegistryHandle<T> extends Supplier<T>
{
    Identifier id();
    ResourceKey<? super T> key();
}