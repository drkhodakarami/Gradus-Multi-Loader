package com.dynamero.materias.platform.services.registrars;

import java.util.function.UnaryOperator;

import com.dynamero.contracts.annotations.*;
import net.minecraft.core.component.DataComponentType;

/**
 * Registers custom component types for Minecraft data.
 */
@Developer("TheMentor")
@CreatedAt("2026-10-16")
@ModifiedAt("2026-10-16")
@ModifiedBy("TheMentor")
@Website("https://dynamero.com")
@Repository("https://github.com/drkhodakarami/")
@Discord("https://discord.gg/pmM4emCbuH")
@Youtube("https://www.youtube.com/@TheMentorCodeLab")
@Modrinth("https://modrinth.com/user/jiraiyah")
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