package com.dynamero.materias.platform.services.registrars;

import java.util.function.UnaryOperator;

import net.minecraft.core.component.DataComponentType;

/**
 * Registers custom component types for Minecraft data.
 */
public interface IComponentTypeRegisterar
{

    /**
     * Registers a new component type.
     *
     * @param <R>           the type of the component
     * @param name          the name of the component type
     * @param buildOperator an operator that builds the component type
     * @return the registered component type
     */
    <R> DataComponentType<R> register(String name, UnaryOperator<DataComponentType.Builder<R>> buildOperator);
}