package com.dynamero.materias.registries.base;

import com.dynamero.contracts.annotations.*;
import com.dynamero.contracts.exceptions.Exceptions;
import com.dynamero.materias.blocks.misc.Alimentor;
import com.dynamero.materias.blocks.misc.EndExodiumOre;
import com.dynamero.materias.platform.Services;
import com.dynamero.materias.platform.services.utils.BlockHandle;
import com.dynamero.materias.platform.services.utils.RegistryHandle;
import com.dynamero.materias.registries.world.worldgen.ModTreeGrowers;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.sounds.AmbientLeavesBlockSoundPlayer;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static com.dynamero.materias.MateriasConstants.LOG;

@Developer("TheMentor")
@CreatedAt("2026-10-16")
@ModifiedAt("2026-10-16")
@ModifiedBy("TheMentor")
@Website("https://dynamero.com")
@Repository("https://github.com/drkhodakarami/")
@Discord("https://discord.gg/pmM4emCbuH")
@Youtube("https://www.youtube.com/@TheMentorCodeLab")
@Modrinth("https://modrinth.com/user/jiraiyah")
public class ModBlocks
{
    public static final BlockHandle<Alimentor> ALIMENTOR;
    public static final BlockHandle<EndExodiumOre> ORE_END_EXODIUM;

    public static final BlockHandle<Block>
            //region BASE
            CARROT_BOX, LEATHER_CRATE, POTATO_BOX, SUGAR_CANE_CRATE, FEATHER_CRATE, GUNPOWDER_CRATE,

            RAW_CARMINIS_BLOCK, RAW_EXODIUM_BLOCK, RAW_FLAVUM_BLOCK, RAW_GLAUCUS_BLOCK, RAW_QUARTZ_BLOCK,

            CARMINIS_BLOCK, EXODIUM_BLOCK, FLAVUM_BLOCK, GLAUCUS_BLOCK,

            RUBBER_WOOD_LOG, RUBBER_WOOD, STRIPPED_RUBBER_WOOD_LOG, STRIPPED_RUBBER_WOOD, RUBBER_WOOD_PLANKS, RUBBER_LEAVES,

            RUBBER_SAPLING,
            //endregion

            //region ORE
            ORE_DEEP_CARMINIS, ORE_DEEP_FLAVUM, ORE_DEEP_GLAUCUS,

            ORE_END_CARMINIS, ORE_END_EXODIUM_CRACKED, ORE_END_FLAVUM, ORE_END_GLAUCUS,

            ORE_EXODIUM,

            ORE_NETHER_CARMINIS, ORE_NETHER_COAL, ORE_NETHER_COPPER, ORE_NETHER_DIAMOND, ORE_NETHER_FLAVUM,
            ORE_NETHER_GLAUCUS, ORE_NETHER_IRON, ORE_NETHER_LAPIS, ORE_NETHER_REDSTONE,

            ORE_WORLD_CARMINIS, ORE_WORLD_FLAVUM, ORE_WORLD_GLAUCUS
            //endregion
            ;

    public static final Map<String, BlockHandle<Block>>
            //region COMPRESSED
            //region MOD BLOCKS
            COMPRESSED_CARMINIS_BLOCK, COMPRESSED_EXODIUM_BLOCK, COMPRESSED_FLAVUM_BLOCK, COMPRESSED_GLAUCUS_BLOCK,

            COMPRESSED_ORE_DEEP_CARMINIS, COMPRESSED_ORE_DEEP_FLAVUM, COMPRESSED_ORE_DEEP_GLAUCUS,

            COMPRESSED_ORE_END_CARMINIS, COMPRESSED_ORE_END_EXODIUM_CRACKED, COMPRESSED_ORE_END_FLAVUM, COMPRESSED_ORE_END_GLAUCUS,

            COMPRESSED_ORE_EXODIUM,

            COMPRESSED_ORE_NETHER_CARMINIS, COMPRESSED_ORE_NETHER_COAL, COMPRESSED_ORE_NETHER_COPPER, COMPRESSED_ORE_NETHER_DIAMOND,
            COMPRESSED_ORE_NETHER_FLAVUM, COMPRESSED_ORE_NETHER_GLAUCUS, COMPRESSED_ORE_NETHER_IRON, COMPRESSED_ORE_NETHER_LAPIS,
            COMPRESSED_ORE_NETHER_REDSTONE,

            COMPRESSED_ORE_WORLD_CARMINIS, COMPRESSED_ORE_WORLD_FLAVUM,  COMPRESSED_ORE_WORLD_GLAUCUS,

            COMPRESSED_RAW_CARMINIS_BLOCK, COMPRESSED_RAW_EXODIUM_BLOCK, COMPRESSED_RAW_FLAVUM_BLOCK, COMPRESSED_RAW_GLAUCUS_BLOCK,
            COMPRESSED_RAW_QUARTZ_BLOCK,

            COMPRESSED_RUBBER_WOOD_LOG, COMPRESSED_RUBBER_WOOD_PLANKS, COMPRESSED_STRIPPED_RUBBER_WOOD_LOG,
            //endregion

            //region LOGS
            COMPRESSED_LOG_ACACIA, COMPRESSED_LOG_BIRCH, COMPRESSED_LOG_CHERRY, COMPRESSED_LOG_CRIMSON, COMPRESSED_LOG_DARK_OAK,
            COMPRESSED_LOG_JUNGLE, COMPRESSED_LOG_MANGROVE, COMPRESSED_LOG_OAK, COMPRESSED_LOG_PALE_OAK, COMPRESSED_LOG_SPRUCE,
            COMPRESSED_LOG_WARPED, COMPRESSED_LOG_BAMBOO_BLOCK,
            //endregion

            //region PLANKS
            COMPRESSED_PLANKS_ACACIA, COMPRESSED_PLANKS_BIRCH, COMPRESSED_PLANKS_CHERRY, COMPRESSED_PLANKS_CRIMSON,
            COMPRESSED_PLANKS_DARK_OAK, COMPRESSED_PLANKS_JUNGLE, COMPRESSED_PLANKS_MANGROVE, COMPRESSED_PLANKS_OAK,
            COMPRESSED_PLANKS_PALE_OAK, COMPRESSED_PLANKS_SPRUCE, COMPRESSED_PLANKS_WARPED, COMPRESSED_PLANKS_BAMBOO,
            //endregion

            //region STRIPPED LOGS
            COMPRESSED_STRIPPED_LOG_ACACIA, COMPRESSED_STRIPPED_LOG_BIRCH, COMPRESSED_STRIPPED_LOG_CHERRY, COMPRESSED_STRIPPED_LOG_CRIMSON,
            COMPRESSED_STRIPPED_LOG_DARK_OAK, COMPRESSED_STRIPPED_LOG_JUNGLE, COMPRESSED_STRIPPED_LOG_MANGROVE, COMPRESSED_STRIPPED_LOG_OAK,
            COMPRESSED_STRIPPED_LOG_PALE_OAK, COMPRESSED_STRIPPED_LOG_SPRUCE, COMPRESSED_STRIPPED_LOG_WARPED, COMPRESSED_STRIPPED_LOG_BAMBOO,
            //endregion

            //region WOOLS
            COMPRESSED_WOOL_BLACK, COMPRESSED_WOOL_BLUE, COMPRESSED_WOOL_BROWN, COMPRESSED_WOOL_CYAN, COMPRESSED_WOOL_GRAY, 
            COMPRESSED_WOOL_GREEN, COMPRESSED_WOOL_LIGHT_BLUE, COMPRESSED_WOOL_LIGHT_GRAY, COMPRESSED_WOOL_LIME, COMPRESSED_WOOL_MAGENTA,
            COMPRESSED_WOOL_ORANGE, COMPRESSED_WOOL_PINK, COMPRESSED_WOOL_PURPLE, COMPRESSED_WOOL_RED, COMPRESSED_WOOL_WHITE, 
            COMPRESSED_WOOL_YELLOW,
            //endregion

            //region BRICKS
            COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS, COMPRESSED_POLISHED_BLACKSTONE_BRICKS, COMPRESSED_BRICKS,
            COMPRESSED_CINNABAR_BRICKS, COMPRESSED_CRACKED_DEEPSLATE_BRICKS,
            COMPRESSED_CRACKED_DEEPSLATE_TILES, COMPRESSED_CRACKED_NETHER_BRICKS, COMPRESSED_CRACKED_STONE_BRICKS,
            COMPRESSED_DEEPSLATE_BRICKS, COMPRESSED_DEEPSLATE_TILES, COMPRESSED_ENDSTONE_BRICKS,
            COMPRESSED_MOSSY_STONE_BRICKS, COMPRESSED_MUD_BRICKS, COMPRESSED_NETHER_BRICKS, COMPRESSED_PRISMARINE_BRICKS,
            COMPRESSED_QUARTZ_BRICKS, COMPRESSED_RED_NETHER_BRICKS, COMPRESSED_RESIN_BRICKS, COMPRESSED_STONE_BRICKS,
            COMPRESSED_SULFUR_BRICKS, COMPRESSED_TUFF_BRICKS,
            //endregion

            //region CONCRETE
            COMPRESSED_CONCRETE_BLACK, COMPRESSED_CONCRETE_BLUE, COMPRESSED_CONCRETE_BROWN, COMPRESSED_CONCRETE_CYAN,
            COMPRESSED_CONCRETE_GRAY, COMPRESSED_CONCRETE_GREEN, COMPRESSED_CONCRETE_LIGHT_BLUE, COMPRESSED_CONCRETE_LIGHT_GRAY,
            COMPRESSED_CONCRETE_LIME, COMPRESSED_CONCRETE_MAGENTA, COMPRESSED_CONCRETE_ORANGE, COMPRESSED_CONCRETE_PINK,
            COMPRESSED_CONCRETE_PURPLE, COMPRESSED_CONCRETE_RED, COMPRESSED_CONCRETE_WHITE, COMPRESSED_CONCRETE_YELLOW,

            COMPRESSED_CONCRETE_BLACK_POWDER, COMPRESSED_CONCRETE_BLUE_POWDER, COMPRESSED_CONCRETE_BROWN_POWDER,
            COMPRESSED_CONCRETE_CYAN_POWDER, COMPRESSED_CONCRETE_GRAY_POWDER, COMPRESSED_CONCRETE_GREEN_POWDER,
            COMPRESSED_CONCRETE_LIGHT_BLUE_POWDER, COMPRESSED_CONCRETE_LIGHT_GRAY_POWDER, COMPRESSED_CONCRETE_LIME_POWDER,
            COMPRESSED_CONCRETE_MAGENTA_POWDER, COMPRESSED_CONCRETE_ORANGE_POWDER, COMPRESSED_CONCRETE_PINK_POWDER,
            COMPRESSED_CONCRETE_PURPLE_POWDER, COMPRESSED_CONCRETE_RED_POWDER, COMPRESSED_CONCRETE_WHITE_POWDER,
            COMPRESSED_CONCRETE_YELLOW_POWDER,
            //endregion

            //region TERRACOTTA
            COMPRESSED_TERRACOTTA_SIMPLE,

            COMPRESSED_TERRACOTTA_BLACK, COMPRESSED_TERRACOTTA_BLUE, COMPRESSED_TERRACOTTA_BROWN, COMPRESSED_TERRACOTTA_CYAN,
            COMPRESSED_TERRACOTTA_GRAY, COMPRESSED_TERRACOTTA_GREEN, COMPRESSED_TERRACOTTA_LIGHT_BLUE, COMPRESSED_TERRACOTTA_LIGHT_GRAY,
            COMPRESSED_TERRACOTTA_LIME, COMPRESSED_TERRACOTTA_MAGENTA, COMPRESSED_TERRACOTTA_ORANGE, COMPRESSED_TERRACOTTA_PINK,
            COMPRESSED_TERRACOTTA_PURPLE, COMPRESSED_TERRACOTTA_RED, COMPRESSED_TERRACOTTA_WHITE, COMPRESSED_TERRACOTTA_YELLOW,

            COMPRESSED_TERRACOTTA_BLACK_GLAZED, COMPRESSED_TERRACOTTA_BLUE_GLAZED, COMPRESSED_TERRACOTTA_BROWN_GLAZED,
            COMPRESSED_TERRACOTTA_CYAN_GLAZED, COMPRESSED_TERRACOTTA_GRAY_GLAZED, COMPRESSED_TERRACOTTA_GREEN_GLAZED,
            COMPRESSED_TERRACOTTA_LIGHT_BLUE_GLAZED, COMPRESSED_TERRACOTTA_LIGHT_GRAY_GLAZED, COMPRESSED_TERRACOTTA_LIME_GLAZED,
            COMPRESSED_TERRACOTTA_MAGENTA_GLAZED, COMPRESSED_TERRACOTTA_ORANGE_GLAZED, COMPRESSED_TERRACOTTA_PINK_GLAZED,
            COMPRESSED_TERRACOTTA_PURPLE_GLAZED, COMPRESSED_TERRACOTTA_RED_GLAZED, COMPRESSED_TERRACOTTA_WHITE_GLAZED,
            COMPRESSED_TERRACOTTA_YELLOW_GLAZED,
            //endregion

            //region STONES
            COMPRESSED_ANDESITE, COMPRESSED_BASALT, COMPRESSED_CALCITE, COMPRESSED_COBBLED_DEEPSLATE, COMPRESSED_COBBLESTONE,
            COMPRESSED_DEEPSLATE, COMPRESSED_DIORITE, COMPRESSED_DIRT, COMPRESSED_END_STONE, COMPRESSED_GRAVEL,
            COMPRESSED_MOSS_BLOCK, COMPRESSED_MOSS_COBBLESTONE, COMPRESSED_MUD, COMPRESSED_NETHERRACK, COMPRESSED_OBSIDIAN,
            COMPRESSED_PALE_MOSS_BLOCK, COMPRESSED_SAND, COMPRESSED_SMOOTH_BASALT, COMPRESSED_SMOOTH_STONE, COMPRESSED_SOUL_SAND,
            COMPRESSED_SOUL_SOIL, COMPRESSED_STONE, COMPRESSED_TUFF, COMPRESSED_GRANITE, COMPRESSED_GRASS_BLOCK, COMPRESSED_SANDSTONE,
            COMPRESSED_ANCIENT_DEBRIS, COMPRESSED_BEDROCK, COMPRESSED_CRYING_OBSIDIAN, COMPRESSED_CUT_RED_SANDSTONE,
            COMPRESSED_CUT_SANDSTONE, COMPRESSED_NETHERITE_BLOCK, COMPRESSED_PACKED_MUD, COMPRESSED_PRISMARINE, COMPRESSED_PURPUR_BLOCK,
            COMPRESSED_PURPUR_PILLAR, COMPRESSED_RED_SAND, COMPRESSED_RED_SANDSTONE, COMPRESSED_CINNABAR,
            COMPRESSED_POLISHED_BLACKSTONE, COMPRESSED_POLISHED_ANDESITE, COMPRESSED_POLISHED_BASALT, COMPRESSED_POLISHED_CINNABAR,
            COMPRESSED_POLISHED_DEEPSLATE, COMPRESSED_POLISHED_DIORITE, COMPRESSED_POLISHED_GRANITE, COMPRESSED_POLISHED_SULFUR,
            COMPRESSED_POLISHED_TUFF, COMPRESSED_SULFUR, COMPRESSED_BLACKSTONE,
            //endregion

            //region VANILLA ORE
            COMPRESSED_ORE_COAL, COMPRESSED_ORE_COPPER, COMPRESSED_ORE_DEEPSLATE_COAL, COMPRESSED_ORE_DEEPSLATE_COPPER,
            COMPRESSED_ORE_DEEPSLATE_DIAMOND, COMPRESSED_ORE_DEEPSLATE_EMERALD, COMPRESSED_ORE_DEEPSLATE_GOLD,
            COMPRESSED_ORE_DEEPSLATE_IRON, COMPRESSED_ORE_DEEPSLATE_LAPIS, COMPRESSED_ORE_DEEPSLATE_REDSTONE, COMPRESSED_ORE_DIAMOND,
            COMPRESSED_ORE_EMERALD, COMPRESSED_ORE_GOLD, COMPRESSED_ORE_IRON, COMPRESSED_ORE_LAPIS, COMPRESSED_ORE_NETHER_GOLD,
            COMPRESSED_ORE_NETHER_QUARTZ, COMPRESSED_ORE_RAW_COPPER, COMPRESSED_ORE_RAW_GOLD, COMPRESSED_ORE_RAW_IRON,
            COMPRESSED_ORE_REDSTONE,
            //endregion

            //region MISC
            COMPRESSED_DIAMOND_BLOCK, COMPRESSED_EMERALD_BLOCK, COMPRESSED_GLOWSTONE, COMPRESSED_GOLD_BLOCK, COMPRESSED_HAY_BLOCK,
            COMPRESSED_HONEY_BLOCK, COMPRESSED_HONEYCOMB_BLOCK, COMPRESSED_ICE, COMPRESSED_LAPIS_BLOCK, COMPRESSED_RESIN_BLOCK,
            COMPRESSED_SLIME_BLOCK, COMPRESSED_TNT, COMPRESSED_AMETHYST_BLOCK, COMPRESSED_BLUE_ICE, COMPRESSED_DARK_PRISMARINE,
            COMPRESSED_DRIED_KELP, COMPRESSED_IRON_BLOCK, COMPRESSED_MELON, COMPRESSED_PACKED_ICE, COMPRESSED_BONE_BLOCK,
            COMPRESSED_CLAY, COMPRESSED_COAL_BLOCK, COMPRESSED_REDSTONE_BLOCK, COMPRESSED_HORN_CORAL_BLOCK,
            COMPRESSED_COPPER_BLOCK, COMPRESSED_BAMBOO_MOSAIC, COMPRESSED_CUT_COPPER
            //TODO: Handle Weathered.affected both copper and cut copper
            //TODO: Handle Weathered.exposed both copper and cut copper
            //TODO: Handle Weathered.oxidied both copper and cut copper
            //TODO: Handle Waxed.unaffected both copper and cut copper
            //TODO: Handle Waxed.affected both copper and cut copper
            //TODO: Handle Waxed.exposed both copper and cut copper
            //TODO: Handle Waxed.oxidized both copper and cut copper
            //endregion
            //endregion
            ;

    public ModBlocks()
    {
        Exceptions.throwCtorAssertion();
    }

    static
    {
        //region BASE
        CARROT_BOX = Services.BLOCKS.registerCopy("carrot_box", Blocks.OAK_PLANKS);
        LEATHER_CRATE = Services.BLOCKS.registerCopy("leather_crate", Blocks.OAK_PLANKS);
        POTATO_BOX = Services.BLOCKS.registerCopy("potato_box", Blocks.OAK_PLANKS);
        SUGAR_CANE_CRATE = Services.BLOCKS.registerCopy("sugar_cane_crate", Blocks.OAK_PLANKS);
        FEATHER_CRATE = Services.BLOCKS.registerCopy("feather_crate", Blocks.OAK_PLANKS);
        GUNPOWDER_CRATE = Services.BLOCKS.registerCopy("gunpowder_crate", Blocks.OAK_PLANKS);

        ALIMENTOR = Services.BLOCKS.registerCopy("alimentor", Blocks.OAK_PLANKS, Alimentor::new);

        RAW_CARMINIS_BLOCK = Services.BLOCKS.registerCopy("raw_carminis_block", Blocks.DIAMOND_BLOCK);
        RAW_EXODIUM_BLOCK = Services.BLOCKS.registerCopy("raw_exodium_block", Blocks.DIAMOND_BLOCK);
        RAW_FLAVUM_BLOCK = Services.BLOCKS.registerCopy("raw_flavum_block", Blocks.DIAMOND_BLOCK);
        RAW_GLAUCUS_BLOCK = Services.BLOCKS.registerCopy("raw_glaucus_block", Blocks.DIAMOND_BLOCK);
        RAW_QUARTZ_BLOCK = Services.BLOCKS.registerCopy("raw_quartz_block", Blocks.RAW_IRON_BLOCK);

        CARMINIS_BLOCK = Services.BLOCKS.registerCopy("carminis_block", Blocks.DIAMOND_BLOCK);
        EXODIUM_BLOCK = Services.BLOCKS.registerCopy("exodium_block", Blocks.DIAMOND_BLOCK);
        FLAVUM_BLOCK = Services.BLOCKS.registerCopy("flavum_block", Blocks.DIAMOND_BLOCK);
        GLAUCUS_BLOCK = Services.BLOCKS.registerCopy("glaucus_block", Blocks.DIAMOND_BLOCK);

        RUBBER_WOOD_LOG = Services.BLOCKS.registerCopy("rubber_log", Blocks.OAK_LOG, RotatedPillarBlock::new);
        RUBBER_WOOD = Services.BLOCKS.registerCopy("rubber_wood", Blocks.OAK_WOOD, RotatedPillarBlock::new);
        STRIPPED_RUBBER_WOOD_LOG = Services.BLOCKS.registerCopy("stripped_rubber_log", Blocks.STRIPPED_OAK_LOG, RotatedPillarBlock::new);
        STRIPPED_RUBBER_WOOD = Services.BLOCKS.registerCopy("stripped_rubber_wood", Blocks.STRIPPED_OAK_WOOD, RotatedPillarBlock::new);
        RUBBER_WOOD_PLANKS = Services.BLOCKS.registerCopy("rubber_planks", Blocks.OAK_PLANKS);
        RUBBER_LEAVES = Services.BLOCKS.registerCopy("rubber_leaves", Blocks.OAK_LEAVES,
                                                      properties ->
                                                              new UntintedParticleLeavesBlock(0.01F,
                                                                                              ParticleTypes.PALE_OAK_LEAVES,
                                                                                              AmbientLeavesBlockSoundPlayer.noAmbientSound(),
                                                                                              properties));

        RUBBER_SAPLING = Services.BLOCKS.registerCopy("rubber_sapling", Blocks.OAK_SAPLING,
                                                       properties ->
                                                               new SaplingBlock(ModTreeGrowers.RUBBER, properties));
        //endregion

        //region ORE
        ORE_DEEP_CARMINIS = Services.BLOCKS.registerCopy("ore_deep_carminis", Blocks.DEEPSLATE);
        ORE_DEEP_FLAVUM = Services.BLOCKS.registerCopy("ore_deep_flavum", Blocks.DEEPSLATE);
        ORE_DEEP_GLAUCUS = Services.BLOCKS.registerCopy("ore_deep_glaucus", Blocks.DEEPSLATE);
        ORE_END_CARMINIS = Services.BLOCKS.registerCopy("ore_end_carminis", Blocks.END_STONE);
        ORE_END_EXODIUM = Services.BLOCKS.register("ore_end_exodium", (Function<BlockBehaviour.Properties, EndExodiumOre>) EndExodiumOre::new);
        ORE_END_EXODIUM_CRACKED = Services.BLOCKS.registerCopy("ore_end_exodium_cracked", Blocks.END_STONE);
        ORE_END_FLAVUM = Services.BLOCKS.registerCopy("ore_end_flavum", Blocks.END_STONE);
        ORE_END_GLAUCUS = Services.BLOCKS.registerCopy("ore_end_glaucus", Blocks.END_STONE);
        ORE_EXODIUM = Services.BLOCKS.registerCopy("ore_exodium", Blocks.DIAMOND_ORE);
        ORE_NETHER_CARMINIS = Services.BLOCKS.registerCopy("ore_nether_carminis", Blocks.NETHERRACK);
        ORE_NETHER_COAL = Services.BLOCKS.registerCopy("ore_nether_coal", Blocks.NETHERRACK);
        ORE_NETHER_COPPER = Services.BLOCKS.registerCopy("ore_nether_copper", Blocks.NETHERRACK);
        ORE_NETHER_DIAMOND = Services.BLOCKS.registerCopy("ore_nether_diamond", Blocks.NETHERRACK);
        ORE_NETHER_FLAVUM = Services.BLOCKS.registerCopy("ore_nether_flavum", Blocks.NETHERRACK);
        ORE_NETHER_GLAUCUS = Services.BLOCKS.registerCopy("ore_nether_glaucus", Blocks.NETHERRACK);
        ORE_NETHER_IRON = Services.BLOCKS.registerCopy("ore_nether_iron", Blocks.NETHERRACK);
        ORE_NETHER_LAPIS = Services.BLOCKS.registerCopy("ore_nether_lapis", Blocks.NETHERRACK);
        ORE_NETHER_REDSTONE = Services.BLOCKS.registerCopy("ore_nether_redstone", Blocks.NETHERRACK);
        ORE_WORLD_CARMINIS = Services.BLOCKS.registerCopy("ore_world_carminis", Blocks.STONE);
        ORE_WORLD_FLAVUM = Services.BLOCKS.registerCopy("ore_world_flavum", Blocks.STONE);
        ORE_WORLD_GLAUCUS = Services.BLOCKS.registerCopy("ore_world_glaucus", Blocks.STONE);
        //endregion

        //region COMPRESSED
        //region MOD BLOCKS
        COMPRESSED_CARMINIS_BLOCK = compress("carminis_block", CARMINIS_BLOCK);
        COMPRESSED_EXODIUM_BLOCK = compress("exodium_block", EXODIUM_BLOCK);
        COMPRESSED_FLAVUM_BLOCK = compress("flavum_block", FLAVUM_BLOCK);
        COMPRESSED_GLAUCUS_BLOCK = compress("glaucus_block", GLAUCUS_BLOCK);
        COMPRESSED_ORE_DEEP_CARMINIS = compress("ore_deep_carminis", ORE_DEEP_CARMINIS);
        COMPRESSED_ORE_DEEP_FLAVUM = compress("ore_deep_flavum", ORE_DEEP_FLAVUM);
        COMPRESSED_ORE_DEEP_GLAUCUS = compress("ore_deep_glaucus", ORE_DEEP_GLAUCUS);
        COMPRESSED_ORE_END_CARMINIS = compress("ore_end_carminis", ORE_END_CARMINIS);
        COMPRESSED_ORE_END_EXODIUM_CRACKED = compress("ore_end_exodium_cracked", ORE_END_EXODIUM_CRACKED);
        COMPRESSED_ORE_END_FLAVUM = compress("ore_end_flavum", ORE_END_FLAVUM);
        COMPRESSED_ORE_END_GLAUCUS = compress("ore_end_glaucus", ORE_END_GLAUCUS);
        COMPRESSED_ORE_EXODIUM = compress("ore_exodium", ORE_EXODIUM);
        COMPRESSED_ORE_NETHER_CARMINIS = compress("ore_nether_carminis", ORE_NETHER_CARMINIS);
        COMPRESSED_ORE_NETHER_COAL = compress("ore_nether_coal", ORE_NETHER_COAL);
        COMPRESSED_ORE_NETHER_COPPER = compress("ore_nether_copper", ORE_NETHER_COPPER);
        COMPRESSED_ORE_NETHER_DIAMOND = compress("ore_nether_diamond", ORE_NETHER_DIAMOND);
        COMPRESSED_ORE_NETHER_FLAVUM = compress("ore_nether_flavum", ORE_NETHER_FLAVUM);
        COMPRESSED_ORE_NETHER_GLAUCUS = compress("ore_nether_glaucus", ORE_NETHER_GLAUCUS);
        COMPRESSED_ORE_NETHER_IRON = compress("ore_nether_iron", ORE_NETHER_IRON);
        COMPRESSED_ORE_NETHER_LAPIS = compress("ore_nether_lapis", ORE_NETHER_LAPIS);
        COMPRESSED_ORE_NETHER_REDSTONE = compress("ore_nether_redstone", ORE_NETHER_REDSTONE);
        COMPRESSED_ORE_WORLD_CARMINIS = compress("ore_world_carminis", ORE_WORLD_CARMINIS);
        COMPRESSED_ORE_WORLD_FLAVUM = compress("ore_world_flavum", ORE_WORLD_FLAVUM);
        COMPRESSED_ORE_WORLD_GLAUCUS = compress("ore_world_glaucus", ORE_WORLD_GLAUCUS);
        COMPRESSED_RAW_CARMINIS_BLOCK = compress("raw_carminis_block", RAW_CARMINIS_BLOCK);
        COMPRESSED_RAW_EXODIUM_BLOCK = compress("raw_exodium_block", RAW_EXODIUM_BLOCK);
        COMPRESSED_RAW_FLAVUM_BLOCK = compress("raw_flavum_block", RAW_FLAVUM_BLOCK);
        COMPRESSED_RAW_GLAUCUS_BLOCK = compress("raw_glaucus_block", RAW_GLAUCUS_BLOCK);
        COMPRESSED_RAW_QUARTZ_BLOCK = compress("raw_quartz_block", RAW_QUARTZ_BLOCK);
        COMPRESSED_RUBBER_WOOD_LOG = compress("rubber_wood_log", RUBBER_WOOD_LOG);
        COMPRESSED_RUBBER_WOOD_PLANKS = compress("rubber_wood_planks", RUBBER_WOOD_PLANKS);
        COMPRESSED_STRIPPED_RUBBER_WOOD_LOG = compress("stripped_rubber_wood_log", STRIPPED_RUBBER_WOOD_LOG);
        //endregion

        //region LOGS
        COMPRESSED_LOG_ACACIA = compress("acacia_log", Blocks.ACACIA_LOG);
        COMPRESSED_LOG_BIRCH = compress("birch_log", Blocks.BIRCH_LOG);
        COMPRESSED_LOG_CHERRY = compress("cherry_log", Blocks.CHERRY_LOG);
        COMPRESSED_LOG_CRIMSON = compress("crimson_log", Blocks.CRIMSON_STEM);
        COMPRESSED_LOG_DARK_OAK = compress("dark_oak_log", Blocks.DARK_OAK_LOG);
        COMPRESSED_LOG_JUNGLE = compress("jungle_log", Blocks.JUNGLE_LOG);
        COMPRESSED_LOG_MANGROVE = compress("mangrove_log", Blocks.MANGROVE_LOG);
        COMPRESSED_LOG_OAK = compress("oak_log", Blocks.OAK_LOG);
        COMPRESSED_LOG_PALE_OAK = compress("pale_oak_log", Blocks.PALE_OAK_LOG);
        COMPRESSED_LOG_SPRUCE = compress("spruce_log", Blocks.SPRUCE_LOG);
        COMPRESSED_LOG_WARPED = compress("warped_log", Blocks.WARPED_STEM);
        COMPRESSED_LOG_BAMBOO_BLOCK = compress("bamboo_block", Blocks.BAMBOO_BLOCK);
        //endregion

        //region PLANKS
        COMPRESSED_PLANKS_ACACIA = compress("acacia_planks", Blocks.ACACIA_PLANKS);
        COMPRESSED_PLANKS_BIRCH = compress("birch_planks", Blocks.BIRCH_PLANKS);
        COMPRESSED_PLANKS_CHERRY = compress("cherry_planks", Blocks.CHERRY_PLANKS);
        COMPRESSED_PLANKS_CRIMSON = compress("crimson_planks", Blocks.CRIMSON_PLANKS);
        COMPRESSED_PLANKS_DARK_OAK = compress("dark_oak_planks", Blocks.DARK_OAK_PLANKS);
        COMPRESSED_PLANKS_JUNGLE = compress("jungle_planks", Blocks.JUNGLE_PLANKS);
        COMPRESSED_PLANKS_MANGROVE = compress("mangrove_planks", Blocks.MANGROVE_PLANKS);
        COMPRESSED_PLANKS_OAK = compress("oak_planks", Blocks.OAK_PLANKS);
        COMPRESSED_PLANKS_PALE_OAK = compress("pale_oak_planks", Blocks.PALE_OAK_PLANKS);
        COMPRESSED_PLANKS_SPRUCE = compress("spruce_planks", Blocks.SPRUCE_PLANKS);
        COMPRESSED_PLANKS_WARPED = compress("warped_planks", Blocks.WARPED_PLANKS);
        COMPRESSED_PLANKS_BAMBOO = compress("bamboo_planks", Blocks.BAMBOO_PLANKS);
        //endregion

        //region STRIPPED LOGS
        COMPRESSED_STRIPPED_LOG_ACACIA = compress("stripped_acacia_log", Blocks.ACACIA_LOG);
        COMPRESSED_STRIPPED_LOG_BIRCH = compress("stripped_birch_log", Blocks.BIRCH_LOG);
        COMPRESSED_STRIPPED_LOG_CHERRY = compress("stripped_cherry_log", Blocks.CHERRY_LOG);
        COMPRESSED_STRIPPED_LOG_CRIMSON = compress("stripped_crimson_log", Blocks.CRIMSON_STEM);
        COMPRESSED_STRIPPED_LOG_DARK_OAK = compress("stripped_dark_oak_log", Blocks.DARK_OAK_LOG);
        COMPRESSED_STRIPPED_LOG_JUNGLE = compress("stripped_jungle_log", Blocks.JUNGLE_LOG);
        COMPRESSED_STRIPPED_LOG_MANGROVE = compress("stripped_mangrove_log", Blocks.MANGROVE_LOG);
        COMPRESSED_STRIPPED_LOG_OAK = compress("stripped_oak_log", Blocks.OAK_LOG);
        COMPRESSED_STRIPPED_LOG_PALE_OAK = compress("stripped_pale_oak_log", Blocks.PALE_OAK_LOG);
        COMPRESSED_STRIPPED_LOG_SPRUCE = compress("stripped_spruce_log", Blocks.SPRUCE_LOG);
        COMPRESSED_STRIPPED_LOG_WARPED = compress("stripped_warped_log", Blocks.WARPED_STEM);
        COMPRESSED_STRIPPED_LOG_BAMBOO = compress("stripped_bamboo", Blocks.BAMBOO_BLOCK);
        //endregion

        //region WOOLS
        COMPRESSED_WOOL_BLACK = compress("black_wool", Blocks.WOOL.black());
        COMPRESSED_WOOL_BLUE = compress("blue_wool", Blocks.WOOL.blue());
        COMPRESSED_WOOL_BROWN = compress("brown_wool", Blocks.WOOL.brown());
        COMPRESSED_WOOL_CYAN = compress("cyan_wool", Blocks.WOOL.cyan());
        COMPRESSED_WOOL_GRAY = compress("gray_wool", Blocks.WOOL.gray());
        COMPRESSED_WOOL_GREEN = compress("green_wool", Blocks.WOOL.green());
        COMPRESSED_WOOL_LIGHT_BLUE = compress("light_blue_wool", Blocks.WOOL.lightBlue());
        COMPRESSED_WOOL_LIGHT_GRAY = compress("light_gray_wool", Blocks.WOOL.lightGray());
        COMPRESSED_WOOL_LIME = compress("lime_wool", Blocks.WOOL.lime());
        COMPRESSED_WOOL_MAGENTA = compress("magenta_wool", Blocks.WOOL.magenta());
        COMPRESSED_WOOL_ORANGE = compress("orange_wool", Blocks.WOOL.orange());
        COMPRESSED_WOOL_PINK = compress("pink_wool", Blocks.WOOL.pink());
        COMPRESSED_WOOL_PURPLE = compress("purple_wool", Blocks.WOOL.purple());
        COMPRESSED_WOOL_RED = compress("red_wool", Blocks.WOOL.red());
        COMPRESSED_WOOL_WHITE = compress("white_wool", Blocks.WOOL.white());
        COMPRESSED_WOOL_YELLOW = compress("yellow_wool", Blocks.WOOL.yellow());
        //endregion

        //region BRICKS
        COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS = compress("cracked_polished_blackstone_bricks",
                                                                 Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        COMPRESSED_POLISHED_BLACKSTONE_BRICKS = compress("polished_blackstone_bricks", Blocks.POLISHED_BLACKSTONE_BRICKS);
        COMPRESSED_BRICKS = compress("bricks", Blocks.BRICKS);
        COMPRESSED_CINNABAR_BRICKS = compress("cinnabar_bricks", Blocks.CINNABAR_BRICKS);
        COMPRESSED_CRACKED_DEEPSLATE_BRICKS = compress("cracked_deepslate_bricks", Blocks.CRACKED_DEEPSLATE_BRICKS);
        COMPRESSED_CRACKED_DEEPSLATE_TILES = compress("cracked_deepslate_tiles", Blocks.CRACKED_DEEPSLATE_TILES);
        COMPRESSED_CRACKED_NETHER_BRICKS = compress("cracked_nether_bricks", Blocks.CRACKED_NETHER_BRICKS);
        COMPRESSED_CRACKED_STONE_BRICKS = compress("cracked_stone_bricks", Blocks.CRACKED_STONE_BRICKS);
        COMPRESSED_DEEPSLATE_BRICKS = compress("deepslate_bricks", Blocks.DEEPSLATE_BRICKS);
        COMPRESSED_DEEPSLATE_TILES = compress("deepslate_tiles", Blocks.DEEPSLATE_TILES);
        COMPRESSED_ENDSTONE_BRICKS = compress("endstone_bricks", Blocks.END_STONE_BRICKS);
        COMPRESSED_MOSSY_STONE_BRICKS = compress("mossy_stone_bricks", Blocks.MOSSY_STONE_BRICKS);
        COMPRESSED_MUD_BRICKS = compress("mud_bricks", Blocks.MUD_BRICKS);
        COMPRESSED_NETHER_BRICKS = compress("nether_bricks", Blocks.NETHER_BRICKS);
        COMPRESSED_PRISMARINE_BRICKS = compress("prismarine_bricks", Blocks.PRISMARINE_BRICKS);
        COMPRESSED_QUARTZ_BRICKS = compress("quartz_bricks", Blocks.QUARTZ_BRICKS);
        COMPRESSED_RED_NETHER_BRICKS = compress("red_nether_bricks", Blocks.RED_NETHER_BRICKS);
        COMPRESSED_RESIN_BRICKS = compress("resin_bricks", Blocks.RESIN_BRICKS);
        COMPRESSED_STONE_BRICKS = compress("stone_bricks", Blocks.STONE_BRICKS);
        COMPRESSED_SULFUR_BRICKS = compress("sulfur_bricks", Blocks.SULFUR_BRICKS);
        COMPRESSED_TUFF_BRICKS = compress("tuff_bricks", Blocks.TUFF_BRICKS);
        //endregion

        //region CONCRETE
        COMPRESSED_CONCRETE_BLACK = compress("black_concrete", Blocks.CONCRETE.black());
        COMPRESSED_CONCRETE_BLUE = compress("blue_concrete", Blocks.CONCRETE.blue());
        COMPRESSED_CONCRETE_BROWN = compress("brown_concrete", Blocks.CONCRETE.brown());
        COMPRESSED_CONCRETE_CYAN = compress("cyan_concrete", Blocks.CONCRETE.cyan());
        COMPRESSED_CONCRETE_GRAY = compress("gray_concrete", Blocks.CONCRETE.gray());
        COMPRESSED_CONCRETE_GREEN = compress("green_concrete", Blocks.CONCRETE.green());
        COMPRESSED_CONCRETE_LIGHT_BLUE = compress("light_blue_concrete", Blocks.CONCRETE.lightBlue());
        COMPRESSED_CONCRETE_LIGHT_GRAY = compress("light_gray_concrete", Blocks.CONCRETE.lightGray());
        COMPRESSED_CONCRETE_LIME = compress("lime_concrete", Blocks.CONCRETE.lime());
        COMPRESSED_CONCRETE_MAGENTA = compress("magenta_concrete", Blocks.CONCRETE.magenta());
        COMPRESSED_CONCRETE_ORANGE = compress("orange_concrete", Blocks.CONCRETE.orange());
        COMPRESSED_CONCRETE_PINK = compress("pink_concrete", Blocks.CONCRETE.pink());
        COMPRESSED_CONCRETE_PURPLE = compress("purple_concrete", Blocks.CONCRETE.purple());
        COMPRESSED_CONCRETE_RED = compress("red_concrete", Blocks.CONCRETE.red());
        COMPRESSED_CONCRETE_WHITE = compress("white_concrete", Blocks.CONCRETE.white());
        COMPRESSED_CONCRETE_YELLOW = compress("yellow_concrete", Blocks.CONCRETE.yellow());
        COMPRESSED_CONCRETE_BLACK_POWDER = compress("black_concrete_powder", Blocks.CONCRETE_POWDER.black());
        COMPRESSED_CONCRETE_BLUE_POWDER = compress("blue_concrete_powder", Blocks.CONCRETE_POWDER.blue());
        COMPRESSED_CONCRETE_BROWN_POWDER = compress("brown_concrete_powder", Blocks.CONCRETE_POWDER.brown());
        COMPRESSED_CONCRETE_CYAN_POWDER = compress("cyan_concrete_powder", Blocks.CONCRETE_POWDER.cyan());
        COMPRESSED_CONCRETE_GRAY_POWDER = compress("gray_concrete_powder", Blocks.CONCRETE_POWDER.gray());
        COMPRESSED_CONCRETE_GREEN_POWDER = compress("green_concrete_powder", Blocks.CONCRETE_POWDER.green());
        COMPRESSED_CONCRETE_LIGHT_BLUE_POWDER = compress("light_blue_concrete_powder", Blocks.CONCRETE_POWDER.lightBlue());
        COMPRESSED_CONCRETE_LIGHT_GRAY_POWDER = compress("light_gray_concrete_powder", Blocks.CONCRETE_POWDER.lightGray());
        COMPRESSED_CONCRETE_LIME_POWDER = compress("lime_concrete_powder", Blocks.CONCRETE_POWDER.lime());
        COMPRESSED_CONCRETE_MAGENTA_POWDER = compress("magenta_concrete_powder", Blocks.CONCRETE_POWDER.magenta());
        COMPRESSED_CONCRETE_ORANGE_POWDER = compress("orange_concrete_powder", Blocks.CONCRETE_POWDER.orange());
        COMPRESSED_CONCRETE_PINK_POWDER = compress("pink_concrete_powder", Blocks.CONCRETE_POWDER.pink());
        COMPRESSED_CONCRETE_PURPLE_POWDER = compress("purple_concrete_powder", Blocks.CONCRETE_POWDER.purple());
        COMPRESSED_CONCRETE_RED_POWDER = compress("red_concrete_powder", Blocks.CONCRETE_POWDER.red());
        COMPRESSED_CONCRETE_WHITE_POWDER = compress("white_concrete_powder", Blocks.CONCRETE_POWDER.white());
        COMPRESSED_CONCRETE_YELLOW_POWDER = compress("yellow_concrete_powder", Blocks.CONCRETE_POWDER.yellow());
        //endregion

        //region TERRACOTTA
        COMPRESSED_TERRACOTTA_SIMPLE = compress("terracotta", Blocks.TERRACOTTA);
        COMPRESSED_TERRACOTTA_BLACK = compress("black_terracotta", Blocks.DYED_TERRACOTTA.black());
        COMPRESSED_TERRACOTTA_BLUE = compress("blue_terracotta", Blocks.DYED_TERRACOTTA.blue());
        COMPRESSED_TERRACOTTA_BROWN = compress("brown_terracotta", Blocks.DYED_TERRACOTTA.brown());
        COMPRESSED_TERRACOTTA_CYAN = compress("cyan_terracotta", Blocks.DYED_TERRACOTTA.cyan());
        COMPRESSED_TERRACOTTA_GRAY = compress("gray_terracotta", Blocks.DYED_TERRACOTTA.gray());
        COMPRESSED_TERRACOTTA_GREEN = compress("green_terracotta", Blocks.DYED_TERRACOTTA.green());
        COMPRESSED_TERRACOTTA_LIGHT_BLUE = compress("light_blue_terracotta", Blocks.DYED_TERRACOTTA.lightBlue());
        COMPRESSED_TERRACOTTA_LIGHT_GRAY = compress("light_gray_terracotta", Blocks.DYED_TERRACOTTA.lightGray());
        COMPRESSED_TERRACOTTA_LIME = compress("lime_terracotta", Blocks.DYED_TERRACOTTA.lime());
        COMPRESSED_TERRACOTTA_MAGENTA = compress("magenta_terracotta", Blocks.DYED_TERRACOTTA.magenta());
        COMPRESSED_TERRACOTTA_ORANGE = compress("orange_terracotta", Blocks.DYED_TERRACOTTA.orange());
        COMPRESSED_TERRACOTTA_PINK = compress("pink_terracotta", Blocks.DYED_TERRACOTTA.pink());
        COMPRESSED_TERRACOTTA_PURPLE = compress("purple_terracotta", Blocks.DYED_TERRACOTTA.purple());
        COMPRESSED_TERRACOTTA_RED = compress("red_terracotta", Blocks.DYED_TERRACOTTA.red());
        COMPRESSED_TERRACOTTA_WHITE = compress("white_terracotta", Blocks.DYED_TERRACOTTA.white());
        COMPRESSED_TERRACOTTA_YELLOW = compress("yellow_terracotta", Blocks.DYED_TERRACOTTA.yellow());
        COMPRESSED_TERRACOTTA_BLACK_GLAZED = compress("black_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.black());
        COMPRESSED_TERRACOTTA_BLUE_GLAZED = compress("blue_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.blue());
        COMPRESSED_TERRACOTTA_BROWN_GLAZED = compress("brown_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.brown());
        COMPRESSED_TERRACOTTA_CYAN_GLAZED = compress("cyan_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.cyan());
        COMPRESSED_TERRACOTTA_GRAY_GLAZED = compress("gray_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.gray());
        COMPRESSED_TERRACOTTA_GREEN_GLAZED = compress("green_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.green());
        COMPRESSED_TERRACOTTA_LIGHT_BLUE_GLAZED = compress("light_blue_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.lightBlue());
        COMPRESSED_TERRACOTTA_LIGHT_GRAY_GLAZED = compress("light_gray_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.lightGray());
        COMPRESSED_TERRACOTTA_LIME_GLAZED = compress("lime_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.lime());
        COMPRESSED_TERRACOTTA_MAGENTA_GLAZED = compress("magenta_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.magenta());
        COMPRESSED_TERRACOTTA_ORANGE_GLAZED = compress("orange_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.orange());
        COMPRESSED_TERRACOTTA_PINK_GLAZED = compress("pink_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.pink());
        COMPRESSED_TERRACOTTA_PURPLE_GLAZED = compress("purple_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.purple());
        COMPRESSED_TERRACOTTA_RED_GLAZED = compress("red_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.red());
        COMPRESSED_TERRACOTTA_WHITE_GLAZED = compress("white_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.white());
        COMPRESSED_TERRACOTTA_YELLOW_GLAZED = compress("yellow_glazed_terracotta", Blocks.GLAZED_TERRACOTTA.yellow());
        //endregion

        //region STONES
        COMPRESSED_ANDESITE = compress("andesite", Blocks.ANDESITE);
        COMPRESSED_BASALT = compress("basalt", Blocks.BASALT);
        COMPRESSED_CALCITE = compress("calcite", Blocks.CALCITE);
        COMPRESSED_COBBLED_DEEPSLATE = compress("cobbled_deepslate", Blocks.COBBLED_DEEPSLATE);
        COMPRESSED_COBBLESTONE = compress("cobblestone", Blocks.COBBLESTONE);
        COMPRESSED_DEEPSLATE = compress("deepslate", Blocks.DEEPSLATE);
        COMPRESSED_DIORITE = compress("diorite", Blocks.DIORITE);
        COMPRESSED_DIRT = compress("dirt", Blocks.DIRT);
        COMPRESSED_END_STONE = compress("end_stone", Blocks.END_STONE);
        COMPRESSED_GRAVEL = compress("gravel", Blocks.GRAVEL);
        COMPRESSED_MOSS_BLOCK = compress("moss_block", Blocks.MOSS_BLOCK);
        COMPRESSED_MOSS_COBBLESTONE = compress("mossy_cobblestone", Blocks.MOSSY_COBBLESTONE);
        COMPRESSED_MUD = compress("mud", Blocks.MUD);
        COMPRESSED_NETHERRACK = compress("netherrack", Blocks.NETHERRACK);
        COMPRESSED_OBSIDIAN = compress("obsidian", Blocks.OBSIDIAN);
        COMPRESSED_PALE_MOSS_BLOCK = compress("pale_moss_block", Blocks.PALE_MOSS_BLOCK);
        COMPRESSED_SAND = compress("sand", Blocks.SAND);
        COMPRESSED_SMOOTH_BASALT = compress("smooth_basalt", Blocks.SMOOTH_BASALT);
        COMPRESSED_SMOOTH_STONE = compress("smooth_stone", Blocks.SMOOTH_STONE);
        COMPRESSED_SOUL_SAND = compress("soul_sand", Blocks.SOUL_SAND);
        COMPRESSED_SOUL_SOIL = compress("soul_soil", Blocks.SOUL_SOIL);
        COMPRESSED_STONE = compress("stone", Blocks.STONE);
        COMPRESSED_TUFF = compress("tuff", Blocks.TUFF);
        COMPRESSED_GRANITE = compress("granite", Blocks.GRANITE);
        COMPRESSED_GRASS_BLOCK = compress("grass_block", Blocks.GRASS_BLOCK);
        COMPRESSED_SANDSTONE = compress("sandstone", Blocks.SANDSTONE);
        COMPRESSED_ANCIENT_DEBRIS = compress("ancient_debris", Blocks.ANCIENT_DEBRIS);
        COMPRESSED_BEDROCK = compress("bedrock", Blocks.NETHERITE_BLOCK);
        COMPRESSED_CRYING_OBSIDIAN = compress("crying_obsidian", Blocks.CRYING_OBSIDIAN);
        COMPRESSED_CUT_RED_SANDSTONE = compress("cut_red_sandstone", Blocks.CUT_RED_SANDSTONE);
        COMPRESSED_CUT_SANDSTONE = compress("cut_sandstone", Blocks.CUT_SANDSTONE);
        COMPRESSED_NETHERITE_BLOCK = compress("netherite_block", Blocks.NETHERITE_BLOCK);
        COMPRESSED_PACKED_MUD = compress("packed_mud", Blocks.PACKED_MUD);
        COMPRESSED_PRISMARINE = compress("prismarine", Blocks.PRISMARINE);
        COMPRESSED_PURPUR_BLOCK = compress("purpur_block", Blocks.PURPUR_BLOCK);
        COMPRESSED_PURPUR_PILLAR = compress("purpur_pillar", Blocks.PURPUR_PILLAR);
        COMPRESSED_RED_SAND = compress("red_sand", Blocks.RED_SAND);
        COMPRESSED_RED_SANDSTONE = compress("red_sandstone", Blocks.RED_SANDSTONE);
        COMPRESSED_CINNABAR = compress("cinnabar", Blocks.CINNABAR);
        COMPRESSED_POLISHED_BLACKSTONE = compress("polished_blackstone", Blocks.POLISHED_BLACKSTONE);
        COMPRESSED_POLISHED_ANDESITE = compress("polished_andesite", Blocks.POLISHED_ANDESITE);
        COMPRESSED_POLISHED_BASALT = compress("polished_basalt", Blocks.POLISHED_BASALT);
        COMPRESSED_POLISHED_CINNABAR = compress("polished_cinnabar", Blocks.POLISHED_CINNABAR);
        COMPRESSED_POLISHED_DEEPSLATE = compress("polished_deepslate", Blocks.POLISHED_DEEPSLATE);
        COMPRESSED_POLISHED_DIORITE = compress("polished_diorite", Blocks.POLISHED_DIORITE);
        COMPRESSED_POLISHED_GRANITE = compress("polished_granite", Blocks.POLISHED_GRANITE);
        COMPRESSED_POLISHED_SULFUR = compress("polished_sulfur", Blocks.POLISHED_SULFUR);
        COMPRESSED_POLISHED_TUFF = compress("polished_tuff", Blocks.POLISHED_TUFF);
        COMPRESSED_SULFUR = compress("sulfur", Blocks.SULFUR);
        COMPRESSED_BLACKSTONE = compress("blackstone", Blocks.BLACKSTONE);
        //endregion

        //region VANILLA ORE
        COMPRESSED_ORE_COAL = compress("coal_ore", Blocks.COAL_ORE);
        COMPRESSED_ORE_COPPER = compress("copper_ore", Blocks.COPPER_ORE);
        COMPRESSED_ORE_DEEPSLATE_COAL = compress("deepslate_coal_ore", Blocks.DEEPSLATE_COAL_ORE);
        COMPRESSED_ORE_DEEPSLATE_COPPER = compress("deepslate_copper_ore", Blocks.DEEPSLATE_COPPER_ORE);
        COMPRESSED_ORE_DEEPSLATE_DIAMOND = compress("deepslate_diamond_ore", Blocks.DEEPSLATE_DIAMOND_ORE);
        COMPRESSED_ORE_DEEPSLATE_EMERALD = compress("deepslate_emerald_ore", Blocks.DEEPSLATE_EMERALD_ORE);
        COMPRESSED_ORE_DEEPSLATE_GOLD = compress("deepslate_gold_ore", Blocks.DEEPSLATE_GOLD_ORE);
        COMPRESSED_ORE_DEEPSLATE_IRON = compress("deepslate_iron_ore", Blocks.DEEPSLATE_IRON_ORE);
        COMPRESSED_ORE_DEEPSLATE_LAPIS = compress("deepslate_lapis_ore", Blocks.DEEPSLATE_LAPIS_ORE);
        COMPRESSED_ORE_DEEPSLATE_REDSTONE = compress("deepslate_redstone_ore", Blocks.DEEPSLATE_DIAMOND_ORE);
        COMPRESSED_ORE_DIAMOND = compress("diamond_ore", Blocks.DIAMOND_ORE);
        COMPRESSED_ORE_EMERALD = compress("emerald_ore", Blocks.EMERALD_ORE);
        COMPRESSED_ORE_GOLD = compress("gold_ore", Blocks.GOLD_ORE);
        COMPRESSED_ORE_IRON = compress("iron_ore", Blocks.IRON_ORE);
        COMPRESSED_ORE_LAPIS = compress("lapis_ore", Blocks.LAPIS_ORE);
        COMPRESSED_ORE_NETHER_GOLD = compress("nether_gold_ore", Blocks.NETHER_GOLD_ORE);
        COMPRESSED_ORE_NETHER_QUARTZ = compress("nether_quartz_ore", Blocks.NETHER_QUARTZ_ORE);
        COMPRESSED_ORE_RAW_COPPER = compress("raw_copper_ore", Blocks.RAW_COPPER_BLOCK);
        COMPRESSED_ORE_RAW_GOLD = compress("raw_gold_ore", Blocks.RAW_GOLD_BLOCK);
        COMPRESSED_ORE_RAW_IRON = compress("raw_iron_ore", Blocks.RAW_IRON_BLOCK);
        COMPRESSED_ORE_REDSTONE = compress("redstone_ore", Blocks.DIAMOND_ORE);
        //endregion

        //region MISC
        COMPRESSED_DIAMOND_BLOCK = compress("diamond_block", Blocks.DIAMOND_BLOCK);
        COMPRESSED_EMERALD_BLOCK = compress("emerald_block", Blocks.EMERALD_BLOCK);
        COMPRESSED_GLOWSTONE = compress("glowstone", Blocks.GLOWSTONE);
        COMPRESSED_GOLD_BLOCK = compress("gold_block", Blocks.GOLD_BLOCK);
        COMPRESSED_HAY_BLOCK = compress("hay_block", Blocks.HAY_BLOCK);
        COMPRESSED_HONEY_BLOCK = compress("honey_block", Blocks.HONEY_BLOCK);
        COMPRESSED_HONEYCOMB_BLOCK = compress("honeycomb_block", Blocks.HONEYCOMB_BLOCK);
        COMPRESSED_ICE = compress("ice", Blocks.ICE);
        COMPRESSED_LAPIS_BLOCK = compress("lapis_block", Blocks.LAPIS_BLOCK);
        COMPRESSED_RESIN_BLOCK = compress("resin_block", Blocks.RESIN_BLOCK);
        COMPRESSED_SLIME_BLOCK = compress("slime_block", Blocks.SLIME_BLOCK);
        COMPRESSED_TNT = compress("tnt", Blocks.TNT);
        COMPRESSED_AMETHYST_BLOCK = compress("amethyst_block", Blocks.AMETHYST_BLOCK);
        COMPRESSED_BLUE_ICE = compress("blue_ice", Blocks.BLUE_ICE);
        COMPRESSED_DARK_PRISMARINE = compress("dark_prismarine", Blocks.DARK_PRISMARINE);
        COMPRESSED_DRIED_KELP = compress("dried_kelp", Blocks.DRIED_KELP_BLOCK);
        COMPRESSED_IRON_BLOCK = compress("iron_block", Blocks.IRON_BLOCK);
        COMPRESSED_MELON = compress("melon", Blocks.MELON);
        COMPRESSED_PACKED_ICE = compress("packed_ice", Blocks.PACKED_ICE);
        COMPRESSED_BONE_BLOCK = compress("bone_block", Blocks.BONE_BLOCK);
        COMPRESSED_CLAY = compress("clay", Blocks.CLAY);
        COMPRESSED_COAL_BLOCK = compress("coal_block", Blocks.COAL_BLOCK);
        COMPRESSED_REDSTONE_BLOCK = compress("redstone_block", Blocks.REDSTONE_BLOCK);
        COMPRESSED_HORN_CORAL_BLOCK = compress("horn_coral_block", Blocks.HORN_CORAL_BLOCK);
        COMPRESSED_COPPER_BLOCK = compress("copper_block", Blocks.COPPER_BLOCK.weathering().unaffected());
        COMPRESSED_CUT_COPPER = compress("cut_copper", Blocks.CUT_COPPER.weathering().unaffected());
        COMPRESSED_BAMBOO_MOSAIC = compress("bamboo_mosaic", Blocks.BAMBOO_MOSAIC);
        //endregion
        //endregion
    }

    public static void load()
    {
        LOG.logBlockInit();
    }

    public static <B extends Block> Map<String, BlockHandle<Block>> compress(String name, BlockHandle<B> copy)
    {
        Map<String, BlockHandle<Block>> temp = new HashMap<>();
        for (int i = 1; i < 6; i++)
            temp.put(String.valueOf(i), Services.BLOCKS.registerCopy("compressed_" + name + "_" + i, copy));
        return temp;
    }

    public static <B extends Block> Map<String, BlockHandle<Block>> compress(String name, B copy)
    {
        Map<String, BlockHandle<Block>> temp = new HashMap<>();
        for (int i = 1; i < 6; i++)
            temp.put(String.valueOf(i), Services.BLOCKS.registerCopy("compressed_" + name + "_" + i, copy));
        return temp;
    }
}