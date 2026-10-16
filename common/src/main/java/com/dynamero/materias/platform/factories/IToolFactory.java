package com.dynamero.materias.platform.factories;

import net.minecraft.world.item.ToolMaterial;
/**
 * Represents a factory interface for creating tool instances from materials and settings.
 *
 * @param <U> the type of the additional settings required to create the tool
 * @param <R> the type of the created tool instance
 */
public interface IToolFactory<U, R>
{
    /**
     * Applies the factory to create a tool from a material, damage stat, speed stat, and additional settings.
     *
     * @param material The material of the tool.
     * @param damage The base damage stat of the tool.
     * @param speed The attack speed stat of the tool.
     * @param settings Additional settings required to create the tool.
     * @return The created tool instance.
     */
    R apply(ToolMaterial material, Float damage, float speed, U settings);
}