package com.dynamero.materias.datagen.base;

import com.dynamero.materias.registries.base.ModBlocks;
import com.dynamero.materias.registries.base.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.data.PackOutput;
import org.jspecify.annotations.NonNull;

import java.util.function.Supplier;

import static com.dynamero.materias.MateriasConstants.LOG;
import static com.dynamero.materias.MateriasConstants.MODID;

public class ModModelProvider extends ModelProvider
{
    public ModModelProvider(PackOutput output)
    {
        super(output, MODID);
    }

    @Override
    protected void registerModels(@NonNull BlockModelGenerators blockModels, @NonNull ItemModelGenerators itemModels)
    {
        registerBlockModels(blockModels);
        registerItemModels(itemModels);
    }

    private void registerBlockModels(BlockModelGenerators generators)
    {
        LOG.logBlockModelDatagen();

        //region BASE
        generators.createTrivialBlock(ModBlocks.CARROT_BOX.get(), TexturedModel.CUBE_BOTTOM_TOP);
        generators.createTrivialBlock(ModBlocks.POTATO_BOX.get(), TexturedModel.CUBE_BOTTOM_TOP);

        generators.createTrivialBlock(ModBlocks.LEATHER_CRATE.get(), TexturedModel.CUBE_TOP);
        generators.createTrivialBlock(ModBlocks.SUGAR_CANE_CRATE.get(), TexturedModel.CUBE_TOP);
        generators.createTrivialBlock(ModBlocks.FEATHER_CRATE.get(), TexturedModel.CUBE_TOP);
        generators.createTrivialBlock(ModBlocks.GUNPOWDER_CRATE.get(), TexturedModel.CUBE_TOP);

        generators.createNonTemplateModelBlock(ModBlocks.ALIMENTOR.get());

        generators.createTrivialCube(ModBlocks.ORE_DEEP_CARMINIS.get());
        generators.createTrivialCube(ModBlocks.ORE_DEEP_FLAVUM.get());
        generators.createTrivialCube(ModBlocks.ORE_DEEP_GLAUCUS.get());
        generators.createTrivialCube(ModBlocks.ORE_END_CARMINIS.get());
        generators.createTrivialCube(ModBlocks.ORE_END_EXODIUM.get());
        generators.createTrivialCube(ModBlocks.ORE_END_EXODIUM_CRACKED.get());
        generators.createTrivialCube(ModBlocks.ORE_END_FLAVUM.get());
        generators.createTrivialCube(ModBlocks.ORE_END_GLAUCUS.get());
        generators.createTrivialCube(ModBlocks.ORE_NETHER_CARMINIS.get());
        generators.createTrivialCube(ModBlocks.ORE_NETHER_COAL.get());
        generators.createTrivialCube(ModBlocks.ORE_NETHER_COPPER.get());
        generators.createTrivialCube(ModBlocks.ORE_NETHER_DIAMOND.get());
        generators.createTrivialCube(ModBlocks.ORE_NETHER_FLAVUM.get());
        generators.createTrivialCube(ModBlocks.ORE_NETHER_GLAUCUS.get());
        generators.createTrivialCube(ModBlocks.ORE_NETHER_IRON.get());
        generators.createTrivialCube(ModBlocks.ORE_NETHER_LAPIS.get());
        generators.createTrivialCube(ModBlocks.ORE_NETHER_REDSTONE.get());
        generators.createTrivialCube(ModBlocks.ORE_WORLD_CARMINIS.get());
        generators.createTrivialCube(ModBlocks.ORE_WORLD_FLAVUM.get());
        generators.createTrivialCube(ModBlocks.ORE_WORLD_GLAUCUS.get());

        generators.createTrivialBlock(ModBlocks.ORE_EXODIUM.get(), TexturedModel.CUBE_TOP);

        generators.createTrivialCube(ModBlocks.RAW_CARMINIS_BLOCK.get());
        generators.createTrivialCube(ModBlocks.RAW_EXODIUM_BLOCK.get());
        generators.createTrivialCube(ModBlocks.RAW_FLAVUM_BLOCK.get());
        generators.createTrivialCube(ModBlocks.RAW_GLAUCUS_BLOCK.get());
        generators.createTrivialCube(ModBlocks.RAW_QUARTZ_BLOCK.get());

        generators.createTrivialCube(ModBlocks.CARMINIS_BLOCK.get());
        generators.createTrivialCube(ModBlocks.EXODIUM_BLOCK.get());
        generators.createTrivialCube(ModBlocks.FLAVUM_BLOCK.get());
        generators.createTrivialCube(ModBlocks.GLAUCUS_BLOCK.get());
        //endregion

        //region COMPRESSED
        //region MOD BLOCKS
        ModBlocks.COMPRESSED_CARMINIS_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_EXODIUM_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_FLAVUM_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_GLAUCUS_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_DEEP_CARMINIS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_DEEP_FLAVUM.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_DEEP_GLAUCUS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_END_CARMINIS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_END_EXODIUM_CRACKED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_END_FLAVUM.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_END_GLAUCUS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_EXODIUM.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_NETHER_CARMINIS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_NETHER_COAL.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_NETHER_COPPER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_NETHER_DIAMOND.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_NETHER_FLAVUM.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_NETHER_GLAUCUS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_NETHER_IRON.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_NETHER_LAPIS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_NETHER_REDSTONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_WORLD_CARMINIS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_WORLD_FLAVUM.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_WORLD_GLAUCUS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_RAW_CARMINIS_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_RAW_EXODIUM_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_RAW_FLAVUM_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_RAW_GLAUCUS_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_RAW_QUARTZ_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_RUBBER_WOOD_LOG.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_RUBBER_WOOD_PLANKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STRIPPED_RUBBER_WOOD_LOG.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        //endregion

        //region WOOL
        ModBlocks.COMPRESSED_WOOL_BLACK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_BLUE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_BROWN.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_CYAN.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_GRAY.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_GREEN.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_LIGHT_BLUE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_LIGHT_GRAY.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_LIME.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_MAGENTA.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_ORANGE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_PINK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_PURPLE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_RED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_WHITE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_WOOL_YELLOW.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        //endregion

        //region STONE
        ModBlocks.COMPRESSED_ANDESITE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_BASALT.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CALCITE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_COBBLED_DEEPSLATE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_COBBLESTONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_DEEPSLATE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_DIORITE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_DIRT.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_END_STONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_GRAVEL.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_MOSS_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_MOSS_COBBLESTONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_MUD.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_NETHERRACK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_OBSIDIAN.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PALE_MOSS_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_SAND.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_SMOOTH_BASALT.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_SMOOTH_STONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_SOUL_SAND.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_SOUL_SOIL.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TUFF.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_GRANITE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_GRASS_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_SANDSTONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ANCIENT_DEBRIS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_BEDROCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CRYING_OBSIDIAN.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CUT_RED_SANDSTONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CUT_SANDSTONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_NETHERITE_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PACKED_MUD.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PRISMARINE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PURPUR_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PURPUR_PILLAR.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_RED_SAND.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_RED_SANDSTONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CINNABAR.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_POLISHED_BLACKSTONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_POLISHED_ANDESITE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_POLISHED_BASALT.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_POLISHED_CINNABAR.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_POLISHED_DEEPSLATE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_POLISHED_DIORITE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_POLISHED_GRANITE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_POLISHED_SULFUR.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_POLISHED_TUFF.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_SULFUR.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_BLACKSTONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        //endregion

        //region CONCRETE
        ModBlocks.COMPRESSED_CONCRETE_BLACK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_BLUE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_BROWN.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_CYAN.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_GRAY.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_GREEN.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_LIGHT_BLUE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_LIGHT_GRAY.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_LIME.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_MAGENTA.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_ORANGE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_PINK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_PURPLE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_RED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_WHITE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_YELLOW.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_BLACK_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_BLUE_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_BROWN_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_CYAN_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_GRAY_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_GREEN_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_LIGHT_BLUE_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_LIGHT_GRAY_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_LIME_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_MAGENTA_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_ORANGE_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_PINK_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_PURPLE_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_RED_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_WHITE_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CONCRETE_YELLOW_POWDER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        //endregion

        //region TERRACOTTA
        ModBlocks.COMPRESSED_TERRACOTTA_SIMPLE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_BLACK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_BLUE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_BROWN.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_CYAN.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_GRAY.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_GREEN.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_BLUE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_GRAY.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_LIME.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_MAGENTA.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_ORANGE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_PINK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_PURPLE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_RED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_WHITE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_YELLOW.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_BLACK_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_BLUE_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_BROWN_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_CYAN_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_GRAY_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_GREEN_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_BLUE_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_GRAY_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_LIME_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_MAGENTA_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_ORANGE_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_PINK_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_PURPLE_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_RED_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_WHITE_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TERRACOTTA_YELLOW_GLAZED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        //endregion

        //region BRICKS
        ModBlocks.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CINNABAR_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_TILES.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CRACKED_NETHER_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CRACKED_STONE_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_DEEPSLATE_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_DEEPSLATE_TILES.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ENDSTONE_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_MOSSY_STONE_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_MUD_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_NETHER_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PRISMARINE_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_QUARTZ_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_RED_NETHER_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_RESIN_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STONE_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_SULFUR_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TUFF_BRICKS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        //endregion

        //region MISC
        ModBlocks.COMPRESSED_DIAMOND_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_EMERALD_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_GLOWSTONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_GOLD_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_HAY_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_HONEY_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_HONEYCOMB_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ICE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_LAPIS_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_RESIN_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_SLIME_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_TNT.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_AMETHYST_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_BLUE_ICE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_DARK_PRISMARINE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_DRIED_KELP.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_IRON_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_MELON.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PACKED_ICE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_BONE_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CLAY.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_COAL_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_REDSTONE_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_HORN_CORAL_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_COPPER_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_CUT_COPPER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_BAMBOO_MOSAIC.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        //endregion

        //region LOGS
        ModBlocks.COMPRESSED_LOG_ACACIA.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_LOG_BIRCH.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_LOG_CHERRY.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_LOG_CRIMSON.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_LOG_DARK_OAK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_LOG_JUNGLE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_LOG_MANGROVE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_LOG_OAK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_LOG_PALE_OAK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_LOG_SPRUCE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_LOG_WARPED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_LOG_BAMBOO_BLOCK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        //endregion

        //region PLANKS
        ModBlocks.COMPRESSED_PLANKS_ACACIA.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PLANKS_BIRCH.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PLANKS_CHERRY.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PLANKS_CRIMSON.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PLANKS_DARK_OAK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PLANKS_JUNGLE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PLANKS_MANGROVE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PLANKS_OAK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PLANKS_PALE_OAK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PLANKS_SPRUCE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PLANKS_WARPED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_PLANKS_BAMBOO.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        //endregion

        //region STRIPPED
        ModBlocks.COMPRESSED_STRIPPED_LOG_ACACIA.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STRIPPED_LOG_BIRCH.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STRIPPED_LOG_CHERRY.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STRIPPED_LOG_CRIMSON.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STRIPPED_LOG_DARK_OAK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STRIPPED_LOG_JUNGLE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STRIPPED_LOG_MANGROVE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STRIPPED_LOG_OAK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STRIPPED_LOG_PALE_OAK.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STRIPPED_LOG_SPRUCE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STRIPPED_LOG_WARPED.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_STRIPPED_LOG_BAMBOO.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        //endregion

        //region VANILLA ORE
        ModBlocks.COMPRESSED_ORE_COAL.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_COPPER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_COAL.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_COPPER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_DIAMOND.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_EMERALD.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_GOLD.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_IRON.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_LAPIS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_REDSTONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_DIAMOND.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_EMERALD.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_GOLD.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_IRON.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_LAPIS.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_NETHER_GOLD.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_NETHER_QUARTZ.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_RAW_COPPER.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_RAW_GOLD.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_RAW_IRON.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        ModBlocks.COMPRESSED_ORE_REDSTONE.values().stream().map(Supplier::get).forEach(generators::createTrivialCube);
        //endregion
        //endregion

        generators.woodProvider(ModBlocks.RUBBER_WOOD_LOG.get()).log(ModBlocks.RUBBER_WOOD_LOG.get()).wood(ModBlocks.RUBBER_WOOD.get());
        generators.woodProvider(ModBlocks.STRIPPED_RUBBER_WOOD_LOG.get()).log(ModBlocks.STRIPPED_RUBBER_WOOD_LOG.get()).wood(ModBlocks.STRIPPED_RUBBER_WOOD.get());

        generators.createTrivialCube(ModBlocks.RUBBER_WOOD_PLANKS.get());
        generators.createTrivialBlock(ModBlocks.RUBBER_LEAVES.get(), TexturedModel.LEAVES);

        //generators.createPlantWithDefaultItem(ModBlocks.RUBBER_SAPLING, ModBlocks.POTTED_RUBBER_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
    }

    private void registerItemModels(ItemModelGenerators generators)
    {
        LOG.logItemModelDatagen();

        //region GEMS
        generators.generateFlatItem(ModItems.CARMINIS.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.FLAVUM.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GLAUCUS.get(), ModelTemplates.FLAT_ITEM);
        //endregion

        //region RAWS
        generators.generateFlatItem(ModItems.RAW_CARMINIS.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.RAW_FLAVUM.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.RAW_GLAUCUS.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.RAW_QUARTZ.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.RAW_RUBBER.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.RAW_EXODIUM.get(), ModelTemplates.FLAT_ITEM);
        //endregion

        //region GEARS
        generators.generateFlatItem(ModItems.GEAR_COPPER.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_DIAMOND.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_EMERALD.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_EXODIUM.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_ENERGIZED.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_GOLD.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_IRON.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_LAPIS.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_NETHERITE.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_OBSIDIAN.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_PRISMARINE.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_QUARTZ.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_CARMINIS.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_GLAUCUS.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_SHULKER.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_STONE.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_VIBRANT.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.GEAR_WOOD.get(), ModelTemplates.FLAT_ITEM);
        //endregion

        //region PLATES
        generators.generateFlatItem(ModItems.PLATE_AMETHYST.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.PLATE_FLAVUM.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.PLATE_COPPER.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.PLATE_DIAMOND.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.PLATE_EMERALD.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.PLATE_EXODIUM.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.PLATE_GOLD.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.PLATE_IRON.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.PLATE_NETHERITE.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.PLATE_CARMINIS.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.PLATE_GLAUCUS.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.PLATE_SHULKER.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.PLATE_STONE.get(), ModelTemplates.FLAT_ITEM);
        //endregion

        //region REINFORCED PLATES
        generators.generateFlatItem(ModItems.REINFORCED_PLATE_AMETHYST.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.REINFORCED_PLATE_FLAVUM.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.REINFORCED_PLATE_COPPER.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.REINFORCED_PLATE_DIAMOND.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.REINFORCED_PLATE_EMERALD.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.REINFORCED_PLATE_EXODIUM.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.REINFORCED_PLATE_GOLD.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.REINFORCED_PLATE_IRON.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.REINFORCED_PLATE_NETHERITE.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.REINFORCED_PLATE_CARMINIS.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.REINFORCED_PLATE_GLAUCUS.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.REINFORCED_PLATE_SHULKER.get(), ModelTemplates.FLAT_ITEM);
        //endregion

        //region RODS
        generators.generateFlatItem(ModItems.ROD_COPPER.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.ROD_EXODIUM.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.ROD_GLOWSTONE.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.ROD_GOLD.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.ROD_IRON.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.ROD_OBSIDIAN.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.ROD_REDSTONE.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.ROD_SHULKER.get(), ModelTemplates.FLAT_ITEM);
        //endregion

        //region MISC
        generators.generateFlatItem(ModItems.BINDING_STRING.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.RUBBER.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.SOLIDIFIED_EXPERIENCE.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.THERMAL_CORE.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.HOT_COAL.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.ENDER_CHARM.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.ENDERMAN_EYE.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.ENDERMAN_GLAND.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.ENDERMAN_HEART.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.MOLTEN_EXODIUM_BUCKET.get(), ModelTemplates.FLAT_ITEM);
        //endregion

        //region FOOD
        generators.generateFlatItem(ModItems.COOKED_EGG.get(), ModelTemplates.FLAT_ITEM);
        generators.generateFlatItem(ModItems.EGG_AND_BREAD.get(), ModelTemplates.FLAT_ITEM);
        //endregion

        generators.generateFlatItem(ModItems.INGOT_EXODIUM.get(), ModelTemplates.FLAT_ITEM);
    }
}