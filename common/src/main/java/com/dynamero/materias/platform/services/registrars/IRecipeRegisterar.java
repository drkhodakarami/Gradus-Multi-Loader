package com.dynamero.materias.platform.services.registrars;

import com.dynamero.contracts.annotations.*;
import org.jetbrains.annotations.NotNull;

import net.minecraft.world.item.crafting.*;

/**
 * Registers custom recipes and recipe serializers for Minecraft.
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
public interface IRecipeRegisterar
{
    /**
     * Registers a recipe serializer.
     *
     * @param <R>             the type of the recipe
     * @param <D>             the type of the recipe input
     * @param name            the name of the recipe serializer
     * @param serializer      the recipe serializer to register
     * @return the registered recipe serializer
     */
    <R extends Recipe<@NotNull D>, D extends RecipeInput> RecipeSerializer<@NotNull R> register(String name, RecipeSerializer<@NotNull R> serializer);

    /**
     * Registers a recipe type.
     *
     * @param <R>             the type of the recipe
     * @param name            the name of the recipe type
     * @param recipeType      the recipe type to register
     * @return the registered recipe type
     */
    <R extends Recipe<@NotNull D>, D extends RecipeInput> RecipeType<@NotNull R> register(String name, RecipeType<@NotNull R> recipeType);

    /**
     * Registers a new recipe book category.
     *
     * @param name the name of the recipe book category
     * @return the registered RecipeBookCategory instance
     */
    RecipeBookCategory registerCategory(String name);
}