package com.dynamero.materias.datagen.base;

import com.dynamero.materias.MateriasConstants;
import com.dynamero.materias.platform.services.utils.BlockHandle;
import com.dynamero.materias.registries.base.ModBlocks;
import com.dynamero.materias.utils.BaseHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.references.BlockIds;
import net.minecraft.references.BlockItemIds;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import static com.dynamero.materias.MateriasConstants.LOG;
import static com.dynamero.materias.MateriasConstants.MODID;

public class ModBlockTagProvider extends BlockTagsProvider
{
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider)
    {
        super(output, lookupProvider, MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        LOG.logBlockTagDatagen();

        // .add(ModBlockItems.CARMINIS_BLOCK.block().key())

        tag(BlockTags.COPPER_ORES)
                .add(ModBlocks.ORE_NETHER_COPPER.key())
                ;

        tag(BlockTags.DEEPSLATE_ORE_REPLACEABLES)
                .add(ModBlocks.ORE_DEEP_CARMINIS.key())
                .add(ModBlocks.ORE_DEEP_FLAVUM.key())
                .add(ModBlocks.ORE_DEEP_GLAUCUS.key())
                ;

        tag(BlockTags.IRON_ORES)
                .add(ModBlocks.ORE_NETHER_IRON.key())
                ;

        tag(BlockTags.LEAVES)
                .add(ModBlocks.RUBBER_LEAVES.key())
                ;

        tag(BlockTags.LOGS)
                .add(ModBlocks.RUBBER_WOOD_LOG.key())
                ;

        tag(BlockTags.PLANKS)
                .add(ModBlocks.RUBBER_WOOD_PLANKS.key())
        ;

        tag(MateriasConstants.GEM_BLOCKS)
                .add(ModBlocks.CARMINIS_BLOCK.key())
                .add(ModBlocks.FLAVUM_BLOCK.key())
                .add(ModBlocks.GLAUCUS_BLOCK.key())
        ;

        tag(MateriasConstants.RED_GEM_BLOCKS)
                .add(ModBlocks.CARMINIS_BLOCK.key())
        ;

        tag(MateriasConstants.YELLOW_GEM_BLOCKS)
                .add(ModBlocks.FLAVUM_BLOCK.key())
        ;

        tag(MateriasConstants.BLUE_GEM_BLOCKS)
                .add(ModBlocks.GLAUCUS_BLOCK.key())
        ;

        tag(MateriasConstants.ORES)
                .add(ModBlocks.ORE_DEEP_CARMINIS.key())
                .add(ModBlocks.ORE_DEEP_FLAVUM.key())
                .add(ModBlocks.ORE_DEEP_GLAUCUS.key())
                .add(ModBlocks.ORE_END_CARMINIS.key())
                .add(ModBlocks.ORE_END_EXODIUM.key())
                .add(ModBlocks.ORE_END_EXODIUM_CRACKED.key())
                .add(ModBlocks.ORE_END_FLAVUM.key())
                .add(ModBlocks.ORE_END_GLAUCUS.key())
                .add(ModBlocks.ORE_EXODIUM.key())
                .add(ModBlocks.ORE_NETHER_CARMINIS.key())
                .add(ModBlocks.ORE_NETHER_COAL.key())
                .add(ModBlocks.ORE_NETHER_COPPER.key())
                .add(ModBlocks.ORE_NETHER_DIAMOND.key())
                .add(ModBlocks.ORE_NETHER_FLAVUM.key())
                .add(ModBlocks.ORE_NETHER_GLAUCUS.key())
                .add(ModBlocks.ORE_NETHER_IRON.key())
                .add(ModBlocks.ORE_NETHER_LAPIS.key())
                .add(ModBlocks.ORE_NETHER_REDSTONE.key())
                .add(ModBlocks.ORE_WORLD_CARMINIS.key())
                .add(ModBlocks.ORE_WORLD_FLAVUM.key())
                .add(ModBlocks.ORE_WORLD_GLAUCUS.key())
                ;

        tag(MateriasConstants.VANILLA_ORE)
                .add(BlockItemIds.GOLD_ORE.block())
                .add(BlockItemIds.DEEPSLATE_GOLD_ORE.block())
                .add(BlockItemIds.IRON_ORE.block())
                .add(BlockItemIds.DEEPSLATE_IRON_ORE.block())
                .add(BlockItemIds.COAL_ORE.block())
                .add(BlockItemIds.DEEPSLATE_COAL_ORE.block())
                .add(BlockItemIds.NETHER_GOLD_ORE.block())
                .add(BlockItemIds.LAPIS_ORE.block())
                .add(BlockItemIds.DEEPSLATE_LAPIS_ORE.block())
                .add(BlockItemIds.DIAMOND_ORE.block())
                .add(BlockItemIds.DEEPSLATE_DIAMOND_ORE.block())
                .add(BlockItemIds.REDSTONE_ORE.block())
                .add(BlockItemIds.DEEPSLATE_REDSTONE_ORE.block())
                .add(BlockItemIds.EMERALD_ORE.block())
                .add(BlockItemIds.DEEPSLATE_EMERALD_ORE.block())
                .add(BlockItemIds.NETHER_QUARTZ_ORE.block())
                .add(BlockItemIds.COPPER_ORE.block())
                .add(BlockItemIds.DEEPSLATE_COPPER_ORE.block())
                ;

        tag(MateriasConstants.MOD_ORE)
                .add(ModBlocks.ORE_DEEP_CARMINIS.key())
                .add(ModBlocks.ORE_DEEP_FLAVUM.key())
                .add(ModBlocks.ORE_DEEP_GLAUCUS.key())
                .add(ModBlocks.ORE_END_CARMINIS.key())
                .add(ModBlocks.ORE_END_EXODIUM.key())
                .add(ModBlocks.ORE_END_EXODIUM_CRACKED.key())
                .add(ModBlocks.ORE_END_FLAVUM.key())
                .add(ModBlocks.ORE_END_GLAUCUS.key())
                .add(ModBlocks.ORE_EXODIUM.key())
                .add(ModBlocks.ORE_NETHER_CARMINIS.key())
                .add(ModBlocks.ORE_NETHER_COAL.key())
                .add(ModBlocks.ORE_NETHER_COPPER.key())
                .add(ModBlocks.ORE_NETHER_DIAMOND.key())
                .add(ModBlocks.ORE_NETHER_FLAVUM.key())
                .add(ModBlocks.ORE_NETHER_GLAUCUS.key())
                .add(ModBlocks.ORE_NETHER_IRON.key())
                .add(ModBlocks.ORE_NETHER_LAPIS.key())
                .add(ModBlocks.ORE_NETHER_REDSTONE.key())
                .add(ModBlocks.ORE_WORLD_CARMINIS.key())
                .add(ModBlocks.ORE_WORLD_FLAVUM.key())
                .add(ModBlocks.ORE_WORLD_GLAUCUS.key())
                ;

        tag(MateriasConstants.DCLR_BORDER_REPLACE)
                .add(BlockIds.WATER)
                .add(BlockIds.LAVA)
                .add(BlockIds.KELP_PLANT)
                .add(BlockIds.TALL_SEAGRASS)
                .add(BlockIds.BUBBLE_COLUMN)
                .add(BaseHelper.ResourceKeys.get(Blocks.GLOW_LICHEN))
                .add(BaseHelper.ResourceKeys.get(Blocks.KELP))
                .add(BaseHelper.ResourceKeys.get(Blocks.SEAGRASS))
                .add(BaseHelper.ResourceKeys.get(Blocks.AIR))
                ;

        tag(MateriasConstants.RUBBER_LOGS_BLOCK_TAG)
                .add(ModBlocks.RUBBER_WOOD_LOG.key())
                .add(ModBlocks.RUBBER_WOOD.key())
                .add(ModBlocks.STRIPPED_RUBBER_WOOD_LOG.key())
                .add(ModBlocks.STRIPPED_RUBBER_WOOD.key())
        ;

        //TODO: Add Compressed Blocks
        
        //region MINEABLE WITH AXE
        var axeTag = tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.CARROT_BOX.key())
                .add(ModBlocks.LEATHER_CRATE.key())
                .add(ModBlocks.POTATO_BOX.key())
                .add(ModBlocks.SUGAR_CANE_CRATE.key())
                .add(ModBlocks.FEATHER_CRATE.key())
                .add(ModBlocks.GUNPOWDER_CRATE.key())
                .add(ModBlocks.ALIMENTOR.key())
                ;

        Stream.of(
                      //region LOGS
                      ModBlocks.COMPRESSED_LOG_ACACIA,
                      ModBlocks.COMPRESSED_LOG_BIRCH,
                      ModBlocks.COMPRESSED_LOG_CHERRY,
                      ModBlocks.COMPRESSED_LOG_CRIMSON,
                      ModBlocks.COMPRESSED_LOG_DARK_OAK,
                      ModBlocks.COMPRESSED_LOG_JUNGLE,
                      ModBlocks.COMPRESSED_LOG_MANGROVE,
                      ModBlocks.COMPRESSED_LOG_OAK,
                      ModBlocks.COMPRESSED_LOG_PALE_OAK,
                      ModBlocks.COMPRESSED_LOG_SPRUCE,
                      ModBlocks.COMPRESSED_LOG_WARPED,
                      ModBlocks.COMPRESSED_LOG_BAMBOO_BLOCK,
                      //endregion

                      //region MOD BLOCKS
                      ModBlocks.COMPRESSED_RUBBER_WOOD_LOG,
                      ModBlocks.COMPRESSED_RUBBER_WOOD_PLANKS,
                      ModBlocks.COMPRESSED_STRIPPED_RUBBER_WOOD_LOG,
                      //endregion

                      //region PLANKS
                      ModBlocks.COMPRESSED_PLANKS_ACACIA,
                      ModBlocks.COMPRESSED_PLANKS_BIRCH,
                      ModBlocks.COMPRESSED_PLANKS_CHERRY,
                      ModBlocks.COMPRESSED_PLANKS_CRIMSON,
                      ModBlocks.COMPRESSED_PLANKS_DARK_OAK,
                      ModBlocks.COMPRESSED_PLANKS_JUNGLE,
                      ModBlocks.COMPRESSED_PLANKS_MANGROVE,
                      ModBlocks.COMPRESSED_PLANKS_OAK,
                      ModBlocks.COMPRESSED_PLANKS_PALE_OAK,
                      ModBlocks.COMPRESSED_PLANKS_SPRUCE,
                      ModBlocks.COMPRESSED_PLANKS_WARPED,
                      ModBlocks.COMPRESSED_PLANKS_BAMBOO,
                      //endregion

                      //region STRIPPABED LOGS
                      ModBlocks.COMPRESSED_STRIPPED_LOG_ACACIA,
                      ModBlocks.COMPRESSED_STRIPPED_LOG_BIRCH,
                      ModBlocks.COMPRESSED_STRIPPED_LOG_CHERRY,
                      ModBlocks.COMPRESSED_STRIPPED_LOG_CRIMSON,
                      ModBlocks.COMPRESSED_STRIPPED_LOG_DARK_OAK,
                      ModBlocks.COMPRESSED_STRIPPED_LOG_JUNGLE,
                      ModBlocks.COMPRESSED_STRIPPED_LOG_MANGROVE,
                      ModBlocks.COMPRESSED_STRIPPED_LOG_OAK,
                      ModBlocks.COMPRESSED_STRIPPED_LOG_PALE_OAK,
                      ModBlocks.COMPRESSED_STRIPPED_LOG_SPRUCE,
                      ModBlocks.COMPRESSED_STRIPPED_LOG_WARPED,
                      ModBlocks.COMPRESSED_STRIPPED_LOG_BAMBOO
                      //endregion
              )
              .flatMap(map -> map.values().stream())
              .map(BlockHandle::key)
              .forEach(axeTag::add);
        //endregion

        //region MINEABLE WITH PICKAXE
        var pickaxeTag = tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RAW_CARMINIS_BLOCK.key())
                .add(ModBlocks.RAW_EXODIUM_BLOCK.key())
                .add(ModBlocks.RAW_FLAVUM_BLOCK.key())
                .add(ModBlocks.RAW_GLAUCUS_BLOCK.key())
                .add(ModBlocks.RAW_QUARTZ_BLOCK.key())

                .add(ModBlocks.CARMINIS_BLOCK.key())
                .add(ModBlocks.EXODIUM_BLOCK.key())
                .add(ModBlocks.FLAVUM_BLOCK.key())
                .add(ModBlocks.GLAUCUS_BLOCK.key())

                //region ORES
                .add(ModBlocks.ORE_DEEP_CARMINIS.key())
                .add(ModBlocks.ORE_DEEP_FLAVUM.key())
                .add(ModBlocks.ORE_DEEP_GLAUCUS.key())
                .add(ModBlocks.ORE_END_CARMINIS.key())
                .add(ModBlocks.ORE_END_EXODIUM_CRACKED.key())
                .add(ModBlocks.ORE_END_FLAVUM.key())
                .add(ModBlocks.ORE_END_GLAUCUS.key())
                .add(ModBlocks.ORE_EXODIUM.key())
                .add(ModBlocks.ORE_NETHER_CARMINIS.key())
                .add(ModBlocks.ORE_NETHER_COAL.key())
                .add(ModBlocks.ORE_NETHER_COPPER.key())
                .add(ModBlocks.ORE_NETHER_DIAMOND.key())
                .add(ModBlocks.ORE_NETHER_FLAVUM.key())
                .add(ModBlocks.ORE_NETHER_GLAUCUS.key())
                .add(ModBlocks.ORE_NETHER_IRON.key())
                .add(ModBlocks.ORE_NETHER_LAPIS.key())
                .add(ModBlocks.ORE_NETHER_REDSTONE.key())
                .add(ModBlocks.ORE_WORLD_CARMINIS.key())
                .add(ModBlocks.ORE_WORLD_FLAVUM.key())
                .add(ModBlocks.ORE_WORLD_GLAUCUS.key())
                //endregion
                ;

        Stream.of(
                      //region BRICKS
                      ModBlocks.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS,
                      ModBlocks.COMPRESSED_POLISHED_BLACKSTONE_BRICKS,
                      ModBlocks.COMPRESSED_BRICKS,
                      ModBlocks.COMPRESSED_CINNABAR_BRICKS,
                      ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_BRICKS,
                      ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_TILES,
                      ModBlocks.COMPRESSED_CRACKED_NETHER_BRICKS,
                      ModBlocks.COMPRESSED_CRACKED_STONE_BRICKS,
                      ModBlocks.COMPRESSED_DEEPSLATE_BRICKS,
                      ModBlocks.COMPRESSED_DEEPSLATE_TILES,
                      ModBlocks.COMPRESSED_ENDSTONE_BRICKS,
                      ModBlocks.COMPRESSED_MOSSY_STONE_BRICKS,
                      ModBlocks.COMPRESSED_MUD_BRICKS,
                      ModBlocks.COMPRESSED_NETHER_BRICKS,
                      ModBlocks.COMPRESSED_PRISMARINE_BRICKS,
                      ModBlocks.COMPRESSED_QUARTZ_BRICKS,
                      ModBlocks.COMPRESSED_RED_NETHER_BRICKS,
                      ModBlocks.COMPRESSED_RESIN_BRICKS,
                      ModBlocks.COMPRESSED_STONE_BRICKS,
                      ModBlocks.COMPRESSED_SULFUR_BRICKS,
                      ModBlocks.COMPRESSED_TUFF_BRICKS,
                      //endregion

                      //region CONCRETE
                      ModBlocks.COMPRESSED_CONCRETE_BLACK,
                      ModBlocks.COMPRESSED_CONCRETE_BLUE,
                      ModBlocks.COMPRESSED_CONCRETE_BROWN,
                      ModBlocks.COMPRESSED_CONCRETE_CYAN,
                      ModBlocks.COMPRESSED_CONCRETE_GRAY,
                      ModBlocks.COMPRESSED_CONCRETE_GREEN,
                      ModBlocks.COMPRESSED_CONCRETE_LIGHT_BLUE,
                      ModBlocks.COMPRESSED_CONCRETE_LIGHT_GRAY,
                      ModBlocks.COMPRESSED_CONCRETE_LIME,
                      ModBlocks.COMPRESSED_CONCRETE_MAGENTA,
                      ModBlocks.COMPRESSED_CONCRETE_ORANGE,
                      ModBlocks.COMPRESSED_CONCRETE_PINK,
                      ModBlocks.COMPRESSED_CONCRETE_PURPLE,
                      ModBlocks.COMPRESSED_CONCRETE_RED,
                      ModBlocks.COMPRESSED_CONCRETE_WHITE,
                      ModBlocks.COMPRESSED_CONCRETE_YELLOW,
                      //endregion

                      //region LOGS
                      //endregion

                      //region MISC
                      ModBlocks.COMPRESSED_DIAMOND_BLOCK,
                      ModBlocks.COMPRESSED_EMERALD_BLOCK,
                      ModBlocks.COMPRESSED_GOLD_BLOCK,
                      ModBlocks.COMPRESSED_ICE,
                      ModBlocks.COMPRESSED_LAPIS_BLOCK,
                      ModBlocks.COMPRESSED_AMETHYST_BLOCK,
                      ModBlocks.COMPRESSED_BLUE_ICE,
                      ModBlocks.COMPRESSED_DARK_PRISMARINE,
                      ModBlocks.COMPRESSED_IRON_BLOCK,
                      ModBlocks.COMPRESSED_PACKED_ICE,
                      ModBlocks.COMPRESSED_BONE_BLOCK,
                      ModBlocks.COMPRESSED_COAL_BLOCK,
                      ModBlocks.COMPRESSED_REDSTONE_BLOCK,
                      ModBlocks.COMPRESSED_COPPER_BLOCK,
                      ModBlocks.COMPRESSED_CUT_COPPER,
                      //endregion

                      //region MOD BLOCKS
                      ModBlocks.COMPRESSED_CARMINIS_BLOCK,
                      ModBlocks.COMPRESSED_EXODIUM_BLOCK,
                      ModBlocks.COMPRESSED_FLAVUM_BLOCK,
                      ModBlocks.COMPRESSED_GLAUCUS_BLOCK,
                      ModBlocks.COMPRESSED_ORE_DEEP_CARMINIS,
                      ModBlocks.COMPRESSED_ORE_DEEP_FLAVUM,
                      ModBlocks.COMPRESSED_ORE_DEEP_GLAUCUS,
                      ModBlocks.COMPRESSED_ORE_END_CARMINIS,
                      ModBlocks.COMPRESSED_ORE_END_EXODIUM_CRACKED,
                      ModBlocks.COMPRESSED_ORE_END_FLAVUM,
                      ModBlocks.COMPRESSED_ORE_END_GLAUCUS,
                      ModBlocks.COMPRESSED_ORE_EXODIUM,
                      ModBlocks.COMPRESSED_ORE_NETHER_CARMINIS,
                      ModBlocks.COMPRESSED_ORE_NETHER_COAL,
                      ModBlocks.COMPRESSED_ORE_NETHER_COPPER,
                      ModBlocks.COMPRESSED_ORE_NETHER_DIAMOND,
                      ModBlocks.COMPRESSED_ORE_NETHER_FLAVUM,
                      ModBlocks.COMPRESSED_ORE_NETHER_GLAUCUS,
                      ModBlocks.COMPRESSED_ORE_NETHER_IRON,
                      ModBlocks.COMPRESSED_ORE_NETHER_LAPIS,
                      ModBlocks.COMPRESSED_ORE_NETHER_REDSTONE,
                      ModBlocks.COMPRESSED_ORE_WORLD_CARMINIS,
                      ModBlocks.COMPRESSED_ORE_WORLD_FLAVUM,
                      ModBlocks.COMPRESSED_ORE_WORLD_GLAUCUS,
                      ModBlocks.COMPRESSED_RAW_CARMINIS_BLOCK,
                      ModBlocks.COMPRESSED_RAW_EXODIUM_BLOCK,
                      ModBlocks.COMPRESSED_RAW_FLAVUM_BLOCK,
                      ModBlocks.COMPRESSED_RAW_GLAUCUS_BLOCK,
                      ModBlocks.COMPRESSED_RAW_QUARTZ_BLOCK,
                      //endregion

                      //region ORES
                      ModBlocks.COMPRESSED_ORE_COAL,
                      ModBlocks.COMPRESSED_ORE_COPPER,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_COAL,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_COPPER,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_DIAMOND,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_EMERALD,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_GOLD,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_IRON,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_LAPIS,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_REDSTONE,
                      ModBlocks.COMPRESSED_ORE_DIAMOND,
                      ModBlocks.COMPRESSED_ORE_EMERALD,
                      ModBlocks.COMPRESSED_ORE_GOLD,
                      ModBlocks.COMPRESSED_ORE_IRON,
                      ModBlocks.COMPRESSED_ORE_LAPIS,
                      ModBlocks.COMPRESSED_ORE_NETHER_GOLD,
                      ModBlocks.COMPRESSED_ORE_NETHER_QUARTZ,
                      ModBlocks.COMPRESSED_ORE_RAW_COPPER,
                      ModBlocks.COMPRESSED_ORE_RAW_GOLD,
                      ModBlocks.COMPRESSED_ORE_RAW_IRON,
                      ModBlocks.COMPRESSED_ORE_REDSTONE,
                      //endregion

                      //region PLANKS
                      //endregion

                      //region STONE
                      ModBlocks.COMPRESSED_ANDESITE,
                      ModBlocks.COMPRESSED_BASALT,
                      ModBlocks.COMPRESSED_CALCITE,
                      ModBlocks.COMPRESSED_COBBLED_DEEPSLATE,
                      ModBlocks.COMPRESSED_COBBLESTONE,
                      ModBlocks.COMPRESSED_DEEPSLATE,
                      ModBlocks.COMPRESSED_DIORITE,
                      ModBlocks.COMPRESSED_END_STONE,
                      ModBlocks.COMPRESSED_MOSS_COBBLESTONE,
                      ModBlocks.COMPRESSED_NETHERRACK,
                      ModBlocks.COMPRESSED_OBSIDIAN,
                      ModBlocks.COMPRESSED_PALE_MOSS_BLOCK,
                      ModBlocks.COMPRESSED_SMOOTH_BASALT,
                      ModBlocks.COMPRESSED_SMOOTH_STONE,
                      ModBlocks.COMPRESSED_STONE,
                      ModBlocks.COMPRESSED_TUFF,
                      ModBlocks.COMPRESSED_GRANITE,
                      ModBlocks.COMPRESSED_SANDSTONE,
                      ModBlocks.COMPRESSED_ANCIENT_DEBRIS,
                      ModBlocks.COMPRESSED_BEDROCK,
                      ModBlocks.COMPRESSED_CRYING_OBSIDIAN,
                      ModBlocks.COMPRESSED_CUT_RED_SANDSTONE,
                      ModBlocks.COMPRESSED_CUT_SANDSTONE,
                      ModBlocks.COMPRESSED_NETHERITE_BLOCK,
                      ModBlocks.COMPRESSED_PRISMARINE,
                      ModBlocks.COMPRESSED_RED_SANDSTONE,
                      ModBlocks.COMPRESSED_CINNABAR,
                      ModBlocks.COMPRESSED_POLISHED_BLACKSTONE,
                      ModBlocks.COMPRESSED_POLISHED_ANDESITE,
                      ModBlocks.COMPRESSED_POLISHED_BASALT,
                      ModBlocks.COMPRESSED_POLISHED_CINNABAR,
                      ModBlocks.COMPRESSED_POLISHED_DEEPSLATE,
                      ModBlocks.COMPRESSED_POLISHED_DIORITE,
                      ModBlocks.COMPRESSED_POLISHED_GRANITE,
                      ModBlocks.COMPRESSED_POLISHED_SULFUR,
                      ModBlocks.COMPRESSED_POLISHED_TUFF,
                      ModBlocks.COMPRESSED_BLACKSTONE,
                      //endregion

                      //region STRIPPABED LOGS
                      //endregion

                      //region TERRACOTTA
                      ModBlocks.COMPRESSED_TERRACOTTA_SIMPLE,
                      ModBlocks.COMPRESSED_TERRACOTTA_BLACK,
                      ModBlocks.COMPRESSED_TERRACOTTA_BLUE,
                      ModBlocks.COMPRESSED_TERRACOTTA_BROWN,
                      ModBlocks.COMPRESSED_TERRACOTTA_CYAN,
                      ModBlocks.COMPRESSED_TERRACOTTA_GRAY,
                      ModBlocks.COMPRESSED_TERRACOTTA_GREEN,
                      ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_BLUE,
                      ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_GRAY,
                      ModBlocks.COMPRESSED_TERRACOTTA_LIME,
                      ModBlocks.COMPRESSED_TERRACOTTA_MAGENTA,
                      ModBlocks.COMPRESSED_TERRACOTTA_ORANGE,
                      ModBlocks.COMPRESSED_TERRACOTTA_PINK,
                      ModBlocks.COMPRESSED_TERRACOTTA_PURPLE,
                      ModBlocks.COMPRESSED_TERRACOTTA_RED,
                      ModBlocks.COMPRESSED_TERRACOTTA_WHITE,
                      ModBlocks.COMPRESSED_TERRACOTTA_YELLOW,
                      ModBlocks.COMPRESSED_TERRACOTTA_BLACK_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_BLUE_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_BROWN_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_CYAN_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_GRAY_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_GREEN_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_BLUE_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_GRAY_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_LIME_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_MAGENTA_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_ORANGE_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_PINK_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_PURPLE_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_RED_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_WHITE_GLAZED,
                      ModBlocks.COMPRESSED_TERRACOTTA_YELLOW_GLAZED
                      //endregion
              )
              .flatMap(map -> map.values().stream())
              .map(BlockHandle::key)
              .forEach(pickaxeTag::add);
        //endregion

        //region NEEDS DIAMOND TOOL
        var needDiamondToolTag = tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RAW_EXODIUM_BLOCK.key())
                .add(ModBlocks.EXODIUM_BLOCK.key())

                .add(ModBlocks.ORE_END_EXODIUM_CRACKED.key())
                .add(ModBlocks.ORE_EXODIUM.key())
                ;

        Stream.of(
                      //region MOD BLOCKS
                      ModBlocks.COMPRESSED_EXODIUM_BLOCK,
                      ModBlocks.COMPRESSED_ORE_END_EXODIUM_CRACKED,
                      ModBlocks.COMPRESSED_ORE_EXODIUM,
                      ModBlocks.COMPRESSED_RAW_EXODIUM_BLOCK,
                      //endregion

                      //region STONE
                      ModBlocks.COMPRESSED_OBSIDIAN,
                      ModBlocks.COMPRESSED_ANCIENT_DEBRIS,
                      ModBlocks.COMPRESSED_CRYING_OBSIDIAN,
                      ModBlocks.COMPRESSED_NETHERITE_BLOCK
                      //endregion
              )
              .flatMap(map -> map.values().stream())
              .map(BlockHandle::key)
              .forEach(needDiamondToolTag::add);
        //endregion

        //region NEEDS IRON TOOL
        var needIronToolTag = tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_CARMINIS_BLOCK.key())
                .add(ModBlocks.RAW_FLAVUM_BLOCK.key())
                .add(ModBlocks.RAW_GLAUCUS_BLOCK.key())

                .add(ModBlocks.CARMINIS_BLOCK.key())
                .add(ModBlocks.FLAVUM_BLOCK.key())
                .add(ModBlocks.GLAUCUS_BLOCK.key())

                .add(ModBlocks.ORE_NETHER_DIAMOND.key())
                .add(ModBlocks.ORE_NETHER_LAPIS.key())
                .add(ModBlocks.ORE_NETHER_REDSTONE.key())
                ;

        Stream.of(
                      //region MISC
                      ModBlocks.COMPRESSED_DIAMOND_BLOCK,
                      ModBlocks.COMPRESSED_EMERALD_BLOCK,
                      ModBlocks.COMPRESSED_GOLD_BLOCK,
                      //endregion

                      //region MOD BLOCKS
                      ModBlocks.COMPRESSED_CARMINIS_BLOCK,
                      ModBlocks.COMPRESSED_FLAVUM_BLOCK,
                      ModBlocks.COMPRESSED_GLAUCUS_BLOCK,
                      ModBlocks.COMPRESSED_ORE_DEEP_CARMINIS,
                      ModBlocks.COMPRESSED_ORE_DEEP_FLAVUM,
                      ModBlocks.COMPRESSED_ORE_DEEP_GLAUCUS,
                      ModBlocks.COMPRESSED_ORE_END_CARMINIS,
                      ModBlocks.COMPRESSED_ORE_END_FLAVUM,
                      ModBlocks.COMPRESSED_ORE_END_GLAUCUS,
                      ModBlocks.COMPRESSED_ORE_NETHER_CARMINIS,
                      ModBlocks.COMPRESSED_ORE_NETHER_COAL,
                      ModBlocks.COMPRESSED_ORE_NETHER_COPPER,
                      ModBlocks.COMPRESSED_ORE_NETHER_DIAMOND,
                      ModBlocks.COMPRESSED_ORE_NETHER_FLAVUM,
                      ModBlocks.COMPRESSED_ORE_NETHER_GLAUCUS,
                      ModBlocks.COMPRESSED_ORE_NETHER_IRON,
                      ModBlocks.COMPRESSED_ORE_NETHER_LAPIS,
                      ModBlocks.COMPRESSED_ORE_NETHER_REDSTONE,
                      ModBlocks.COMPRESSED_ORE_WORLD_CARMINIS,
                      ModBlocks.COMPRESSED_ORE_WORLD_FLAVUM,
                      ModBlocks.COMPRESSED_ORE_WORLD_GLAUCUS,
                      ModBlocks.COMPRESSED_RAW_CARMINIS_BLOCK,
                      ModBlocks.COMPRESSED_RAW_FLAVUM_BLOCK,
                      ModBlocks.COMPRESSED_RAW_GLAUCUS_BLOCK,
                      ModBlocks.COMPRESSED_RAW_QUARTZ_BLOCK,
                      //endregion

                      //region ORES
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_DIAMOND,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_EMERALD,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_GOLD,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_REDSTONE,
                      ModBlocks.COMPRESSED_ORE_DIAMOND,
                      ModBlocks.COMPRESSED_ORE_EMERALD,
                      ModBlocks.COMPRESSED_ORE_GOLD,
                      ModBlocks.COMPRESSED_ORE_NETHER_GOLD,
                      ModBlocks.COMPRESSED_ORE_RAW_GOLD,
                      ModBlocks.COMPRESSED_ORE_REDSTONE
                      //endregion
              )
              .flatMap(map -> map.values().stream())
              .map(BlockHandle::key)
              .forEach(needIronToolTag::add);
        //endregion

        //region NEEDS STONE TOOL
        var needStoneToolTag = tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RAW_QUARTZ_BLOCK.key())

                .add(ModBlocks.ORE_DEEP_CARMINIS.key())
                .add(ModBlocks.ORE_DEEP_FLAVUM.key())
                .add(ModBlocks.ORE_DEEP_GLAUCUS.key())
                .add(ModBlocks.ORE_END_CARMINIS.key())
                .add(ModBlocks.ORE_END_FLAVUM.key())
                .add(ModBlocks.ORE_END_GLAUCUS.key())
                .add(ModBlocks.ORE_NETHER_CARMINIS.key())
                .add(ModBlocks.ORE_NETHER_COAL.key())
                .add(ModBlocks.ORE_NETHER_COPPER.key())
                .add(ModBlocks.ORE_NETHER_FLAVUM.key())
                .add(ModBlocks.ORE_NETHER_GLAUCUS.key())
                .add(ModBlocks.ORE_NETHER_IRON.key())
                .add(ModBlocks.ORE_WORLD_CARMINIS.key())
                .add(ModBlocks.ORE_WORLD_FLAVUM.key())
                .add(ModBlocks.ORE_WORLD_GLAUCUS.key())
                ;

        Stream.of(
                      //region MISC
                      ModBlocks.COMPRESSED_LAPIS_BLOCK,
                      ModBlocks.COMPRESSED_IRON_BLOCK,
                      ModBlocks.COMPRESSED_COPPER_BLOCK,
                      ModBlocks.COMPRESSED_CUT_COPPER,
                      //endregion

                      //region MOD BLOCKS
                      ModBlocks.COMPRESSED_ORE_NETHER_COPPER,
                      ModBlocks.COMPRESSED_ORE_NETHER_LAPIS,
                      //endregion

                      //region ORES
                      ModBlocks.COMPRESSED_ORE_COPPER,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_COPPER,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_IRON,
                      ModBlocks.COMPRESSED_ORE_DEEPSLATE_LAPIS,
                      ModBlocks.COMPRESSED_ORE_IRON,
                      ModBlocks.COMPRESSED_ORE_LAPIS,
                      ModBlocks.COMPRESSED_ORE_RAW_COPPER,
                      ModBlocks.COMPRESSED_ORE_RAW_IRON
                      //endregion
              )
              .flatMap(map -> map.values().stream())
              .map(BlockHandle::key)
              .forEach(needStoneToolTag::add);
        //endregion
    }
}