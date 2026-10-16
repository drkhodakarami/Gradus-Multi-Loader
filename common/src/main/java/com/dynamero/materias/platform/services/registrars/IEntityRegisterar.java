package com.dynamero.materias.platform.services.registrars;

//import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

/**
 * Registers custom block entities and entity types for Minecraft.
 */
public interface IEntityRegisterar
{
    /**
     * Registers a new block entity type.
     *
     * @param <R>             the type of the block entity
     * @param name            the name of the block entity type
     * @param block           the block associated with the block entity
     * @param factory         the factory used to create instances of the block entity
     * @return the registered block entity type
     */
    //<R extends BlockEntity> BlockEntityType<R> register(String name, Block block, FabricBlockEntityTypeBuilder.Factory<R> factory);

    /**
     * Registers a new entity type.
     *
     * @param <R>             the type of the entity
     * @param name            the name of the entity type
     * @param spawnGroup      the spawn group for the entity
     * @param factory         the factory used to create instances of the entity
     * @return the registered entity type
     */
    <R extends Entity> EntityType<R> register(String name, MobCategory spawnGroup, EntityType.EntityFactory<R> factory);

    /**
     * Registers a new entity type.
     *
     * @param <R>             the type of the entity
     * @param name            the name of the entity type
     * @param type            the entity type builder used to create instances of the entity
     * @return the registered entity type
     */
    <R extends Entity> EntityType<R> register(String name, EntityType.Builder<R> type);
}