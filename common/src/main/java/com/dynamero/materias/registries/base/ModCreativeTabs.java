package com.dynamero.materias.registries.base;

import com.dynamero.contracts.annotations.*;
import com.dynamero.contracts.exceptions.Exceptions;
import com.dynamero.materias.platform.Services;
import com.dynamero.materias.platform.services.utils.CreativeTabHandle;
import net.minecraft.world.item.CreativeModeTab;

import java.util.function.Supplier;

import static com.dynamero.materias.MateriasConstants.*;

@Developer("TheMentor")
@CreatedAt("2026-10-16")
@ModifiedAt("2026-10-16")
@ModifiedBy("TheMentor")
@Website("https://dynamero.com")
@Repository("https://github.com/drkhodakarami/")
@Discord("https://discord.gg/pmM4emCbuH")
@Youtube("https://www.youtube.com/@TheMentorCodeLab")
@Modrinth("https://modrinth.com/user/jiraiyah")
public class ModCreativeTabs
{
    public static final CreativeTabHandle<CreativeModeTab> INGREDIENTS, BLOCKS, COMPONENTS, MISC;

    public ModCreativeTabs()
    {
        Exceptions.throwCtorAssertion();
    }

    static
    {
        //region INGREDIENTS
        INGREDIENTS =
                Services.CREATIVE_TAB_REGISTRAR.register(
                        "materia_ingredients_tab",
                        INGREDIENTS_CREATIVE_TAB,
                        ModItems.ENDERMAN_HEART.get()::getDefaultInstance,
                        output ->
                        {
                            //region GEMS
                            output.accept(ModItems.CARMINIS.get());
                            output.accept(ModItems.FLAVUM.get());
                            output.accept(ModItems.GLAUCUS.get());
                            //endregion

                            //region RAWS
                            output.accept(ModItems.RAW_CARMINIS.get());
                            output.accept(ModItems.RAW_FLAVUM.get());
                            output.accept(ModItems.RAW_GLAUCUS.get());
                            output.accept(ModItems.RAW_QUARTZ.get());
                            output.accept(ModItems.RAW_RUBBER.get());
                            output.accept(ModItems.RAW_EXODIUM.get());
                            //endregion

                            //region FOOD
                            output.accept(ModItems.COOKED_EGG.get());
                            output.accept(ModItems.EGG_AND_BREAD.get());
                            //endregion

                            //region MISC
                            output.accept(ModItems.BINDING_STRING.get());
                            output.accept(ModItems.RUBBER.get());
                            output.accept(ModItems.SOLIDIFIED_EXPERIENCE.get());
                            output.accept(ModItems.THERMAL_CORE.get());
                            output.accept(ModItems.HOT_COAL.get());
                            output.accept(ModItems.ENDER_CHARM.get());
                            output.accept(ModItems.ENDERMAN_EYE.get());
                            output.accept(ModItems.ENDERMAN_GLAND.get());
                            output.accept(ModItems.ENDERMAN_HEART.get());
                            output.accept(ModItems.MOLTEN_EXODIUM_BUCKET.get());
                            //endregion

                            output.accept(ModItems.INGOT_EXODIUM.get());
                        });
        //endregion

        //region BLOCKS
        BLOCKS =
                Services.CREATIVE_TAB_REGISTRAR.register(
                        "materia_blocks_tab",
                        BLOCKS_CREATIVE_TAB,
                        ModBlocks.ORE_END_EXODIUM.get().asItem()::getDefaultInstance,
                        output ->
                        {
                            output.accept(ModBlocks.CARROT_BOX.get());
                            output.accept(ModBlocks.LEATHER_CRATE.get());
                            output.accept(ModBlocks.POTATO_BOX.get());
                            output.accept(ModBlocks.SUGAR_CANE_CRATE.get());
                            output.accept(ModBlocks.FEATHER_CRATE.get());
                            output.accept(ModBlocks.GUNPOWDER_CRATE.get());

                            output.accept(ModBlocks.ALIMENTOR.get());

                            output.accept(ModBlocks.ORE_DEEP_CARMINIS.get());
                            output.accept(ModBlocks.ORE_DEEP_FLAVUM.get());
                            output.accept(ModBlocks.ORE_DEEP_GLAUCUS.get());
                            output.accept(ModBlocks.ORE_END_CARMINIS.get());
                            output.accept(ModBlocks.ORE_END_EXODIUM.get());
                            output.accept(ModBlocks.ORE_END_EXODIUM_CRACKED.get());
                            output.accept(ModBlocks.ORE_END_FLAVUM.get());
                            output.accept(ModBlocks.ORE_END_GLAUCUS.get());
                            output.accept(ModBlocks.ORE_EXODIUM.get());
                            output.accept(ModBlocks.ORE_NETHER_CARMINIS.get());
                            output.accept(ModBlocks.ORE_NETHER_COAL.get());
                            output.accept(ModBlocks.ORE_NETHER_COPPER.get());
                            output.accept(ModBlocks.ORE_NETHER_DIAMOND.get());
                            output.accept(ModBlocks.ORE_NETHER_FLAVUM.get());
                            output.accept(ModBlocks.ORE_NETHER_GLAUCUS.get());
                            output.accept(ModBlocks.ORE_NETHER_IRON.get());
                            output.accept(ModBlocks.ORE_NETHER_LAPIS.get());
                            output.accept(ModBlocks.ORE_NETHER_REDSTONE.get());
                            output.accept(ModBlocks.ORE_WORLD_CARMINIS.get());
                            output.accept(ModBlocks.ORE_WORLD_FLAVUM.get());
                            output.accept(ModBlocks.ORE_WORLD_GLAUCUS.get());

                            output.accept(ModBlocks.RAW_CARMINIS_BLOCK.get());
                            output.accept(ModBlocks.RAW_EXODIUM_BLOCK.get());
                            output.accept(ModBlocks.RAW_FLAVUM_BLOCK.get());
                            output.accept(ModBlocks.RAW_GLAUCUS_BLOCK.get());
                            output.accept(ModBlocks.RAW_QUARTZ_BLOCK.get());

                            output.accept(ModBlocks.CARMINIS_BLOCK.get());
                            output.accept(ModBlocks.EXODIUM_BLOCK.get());
                            output.accept(ModBlocks.FLAVUM_BLOCK.get());
                            output.accept(ModBlocks.GLAUCUS_BLOCK.get());

                            output.accept(ModBlocks.RUBBER_WOOD_LOG.get());
                            output.accept(ModBlocks.RUBBER_WOOD.get());
                            output.accept(ModBlocks.STRIPPED_RUBBER_WOOD_LOG.get());
                            output.accept(ModBlocks.STRIPPED_RUBBER_WOOD.get());
                            output.accept(ModBlocks.RUBBER_WOOD_PLANKS.get());
                            output.accept(ModBlocks.RUBBER_LEAVES.get());
                            output.accept(ModBlocks.RUBBER_SAPLING.get());

                            //region COMPRESSED
                            //region Mod Blocks
                            ModBlocks.COMPRESSED_CARMINIS_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_EXODIUM_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_FLAVUM_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_GLAUCUS_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_DEEP_CARMINIS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_DEEP_FLAVUM.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_DEEP_GLAUCUS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_END_CARMINIS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_END_EXODIUM_CRACKED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_END_FLAVUM.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_END_GLAUCUS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_EXODIUM.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_NETHER_CARMINIS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_NETHER_COAL.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_NETHER_COPPER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_NETHER_DIAMOND.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_NETHER_FLAVUM.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_NETHER_GLAUCUS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_NETHER_IRON.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_NETHER_LAPIS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_NETHER_REDSTONE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_WORLD_CARMINIS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_WORLD_FLAVUM.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_WORLD_GLAUCUS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_RAW_CARMINIS_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_RAW_EXODIUM_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_RAW_FLAVUM_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_RAW_GLAUCUS_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_RAW_QUARTZ_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_RUBBER_WOOD_LOG.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_RUBBER_WOOD_PLANKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STRIPPED_RUBBER_WOOD_LOG.values().stream().map(Supplier::get).forEach(output::accept);
                            //endregion

                            //region WOOL
                            ModBlocks.COMPRESSED_WOOL_BLACK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_BLUE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_BROWN.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_CYAN.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_GRAY.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_GREEN.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_LIGHT_BLUE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_LIGHT_GRAY.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_LIME.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_MAGENTA.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_ORANGE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_PINK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_PURPLE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_RED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_WHITE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_WOOL_YELLOW.values().stream().map(Supplier::get).forEach(output::accept);
                            //endregion

                            //region STONE / DIRT
                            ModBlocks.COMPRESSED_ANDESITE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_BASALT.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CALCITE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_COBBLED_DEEPSLATE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_COBBLESTONE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_DEEPSLATE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_DIORITE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_DIRT.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_END_STONE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_GRAVEL.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_MOSS_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_MOSS_COBBLESTONE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_MUD.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_NETHERRACK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_OBSIDIAN.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PALE_MOSS_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_SAND.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_SMOOTH_BASALT.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_SMOOTH_STONE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_SOUL_SAND.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_SOUL_SOIL.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STONE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TUFF.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_GRANITE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_GRASS_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_SANDSTONE.values().stream().map(Supplier::get).forEach(output::accept);

                            ModBlocks.COMPRESSED_TERRACOTTA_SIMPLE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_BLACK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_BLUE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_BROWN.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_CYAN.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_GRAY.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_GREEN.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_BLUE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_GRAY.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_LIME.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_MAGENTA.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_ORANGE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_PINK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_PURPLE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_RED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_WHITE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_YELLOW.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_BLACK_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_BLUE_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_BROWN_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_CYAN_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_GRAY_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_GREEN_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_BLUE_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_GRAY_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_LIME_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_MAGENTA_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_ORANGE_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_PINK_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_PURPLE_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_RED_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_WHITE_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TERRACOTTA_YELLOW_GLAZED.values().stream().map(Supplier::get).forEach(output::accept);

                            ModBlocks.COMPRESSED_CONCRETE_BLACK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_BLUE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_BROWN.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_CYAN.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_GRAY.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_GREEN.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_LIGHT_BLUE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_LIGHT_GRAY.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_LIME.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_MAGENTA.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_ORANGE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_PINK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_PURPLE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_RED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_WHITE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_YELLOW.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_BLACK_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_BLUE_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_BROWN_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_CYAN_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_GRAY_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_GREEN_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_LIGHT_BLUE_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_LIGHT_GRAY_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_LIME_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_MAGENTA_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_ORANGE_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_PINK_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_PURPLE_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_RED_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_WHITE_POWDER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CONCRETE_YELLOW_POWDER.values().stream().map(Supplier::get).forEach(output::accept);

                            ModBlocks.COMPRESSED_ANCIENT_DEBRIS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_BEDROCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CRYING_OBSIDIAN.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CUT_RED_SANDSTONE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CUT_SANDSTONE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_NETHERITE_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PACKED_MUD.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PRISMARINE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PURPUR_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PURPUR_PILLAR.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_RED_SAND.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_RED_SANDSTONE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CINNABAR.values().stream().map(Supplier::get).forEach(output::accept);

                            ModBlocks.COMPRESSED_POLISHED_BLACKSTONE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_POLISHED_ANDESITE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_POLISHED_BASALT.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_POLISHED_CINNABAR.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_POLISHED_DEEPSLATE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_POLISHED_DIORITE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_POLISHED_GRANITE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_POLISHED_SULFUR.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_POLISHED_TUFF.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_SULFUR.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_BLACKSTONE.values().stream().map(Supplier::get).forEach(output::accept);

                            ModBlocks.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CINNABAR_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_TILES.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CRACKED_NETHER_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CRACKED_STONE_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_DEEPSLATE_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_DEEPSLATE_TILES.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ENDSTONE_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_MOSSY_STONE_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_MUD_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_NETHER_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PRISMARINE_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_QUARTZ_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_RED_NETHER_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_RESIN_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STONE_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_SULFUR_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TUFF_BRICKS.values().stream().map(Supplier::get).forEach(output::accept);

                            //endregion

                            //region MISC
                            ModBlocks.COMPRESSED_DIAMOND_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_EMERALD_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_GLOWSTONE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_GOLD_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_HAY_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_HONEY_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_HONEYCOMB_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ICE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_LAPIS_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_RESIN_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_SLIME_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_TNT.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_AMETHYST_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_BLUE_ICE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_DARK_PRISMARINE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_DRIED_KELP.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_IRON_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_MELON.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PACKED_ICE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_BONE_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CLAY.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_COAL_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_REDSTONE_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_HORN_CORAL_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_COPPER_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_CUT_COPPER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_BAMBOO_MOSAIC.values().stream().map(Supplier::get).forEach(output::accept);

                            //endregion

                            //region LOGS
                            ModBlocks.COMPRESSED_LOG_ACACIA.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_LOG_BIRCH.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_LOG_CHERRY.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_LOG_CRIMSON.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_LOG_DARK_OAK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_LOG_JUNGLE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_LOG_MANGROVE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_LOG_OAK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_LOG_PALE_OAK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_LOG_SPRUCE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_LOG_WARPED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_LOG_BAMBOO_BLOCK.values().stream().map(Supplier::get).forEach(output::accept);
                            //endregion

                            //region STRIPPED LOGS
                            ModBlocks.COMPRESSED_STRIPPED_LOG_ACACIA.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STRIPPED_LOG_BIRCH.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STRIPPED_LOG_CHERRY.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STRIPPED_LOG_CRIMSON.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STRIPPED_LOG_DARK_OAK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STRIPPED_LOG_JUNGLE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STRIPPED_LOG_MANGROVE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STRIPPED_LOG_OAK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STRIPPED_LOG_PALE_OAK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STRIPPED_LOG_SPRUCE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STRIPPED_LOG_WARPED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_STRIPPED_LOG_BAMBOO.values().stream().map(Supplier::get).forEach(output::accept);
                            //endregion

                            //region PLANKS
                            ModBlocks.COMPRESSED_PLANKS_ACACIA.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PLANKS_BIRCH.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PLANKS_CHERRY.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PLANKS_CRIMSON.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PLANKS_DARK_OAK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PLANKS_JUNGLE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PLANKS_MANGROVE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PLANKS_OAK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PLANKS_PALE_OAK.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PLANKS_SPRUCE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PLANKS_WARPED.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_PLANKS_BAMBOO.values().stream().map(Supplier::get).forEach(output::accept);
                            //endregion

                            //region ORE
                            ModBlocks.COMPRESSED_ORE_COAL.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_COPPER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_DEEPSLATE_COAL.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_DEEPSLATE_COPPER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_DEEPSLATE_DIAMOND.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_DEEPSLATE_EMERALD.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_DEEPSLATE_GOLD.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_DEEPSLATE_IRON.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_DEEPSLATE_LAPIS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_DEEPSLATE_REDSTONE.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_DIAMOND.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_EMERALD.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_GOLD.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_IRON.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_LAPIS.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_NETHER_GOLD.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_NETHER_QUARTZ.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_RAW_COPPER.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_RAW_GOLD.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_RAW_IRON.values().stream().map(Supplier::get).forEach(output::accept);
                            ModBlocks.COMPRESSED_ORE_REDSTONE.values().stream().map(Supplier::get).forEach(output::accept);
                            //endregion
                            //endregion
                        });
        //endregion

        //region COMPONENTS
        COMPONENTS =
                Services.CREATIVE_TAB_REGISTRAR.register(
                        "materia_components_tab",
                        COMPONENTS_CREATIVE_TAB,
                        ModItems.REINFORCED_PLATE_DIAMOND.get()::getDefaultInstance,
                        output ->
                        {
                            //region GEARS
                            output.accept(ModItems.GEAR_COPPER.get());
                            output.accept(ModItems.GEAR_DIAMOND.get());
                            output.accept(ModItems.GEAR_EMERALD.get());
                            output.accept(ModItems.GEAR_EXODIUM.get());
                            output.accept(ModItems.GEAR_ENERGIZED.get());
                            output.accept(ModItems.GEAR_GOLD.get());
                            output.accept(ModItems.GEAR_IRON.get());
                            output.accept(ModItems.GEAR_LAPIS.get());
                            output.accept(ModItems.GEAR_NETHERITE.get());
                            output.accept(ModItems.GEAR_OBSIDIAN.get());
                            output.accept(ModItems.GEAR_PRISMARINE.get());
                            output.accept(ModItems.GEAR_QUARTZ.get());
                            output.accept(ModItems.GEAR_CARMINIS.get());
                            output.accept(ModItems.GEAR_GLAUCUS.get());
                            output.accept(ModItems.GEAR_SHULKER.get());
                            output.accept(ModItems.GEAR_STONE.get());
                            output.accept(ModItems.GEAR_VIBRANT.get());
                            output.accept(ModItems.GEAR_WOOD.get());
                            //endregion

                            //region PLATES
                            output.accept(ModItems.PLATE_AMETHYST.get());
                            output.accept(ModItems.PLATE_FLAVUM.get());
                            output.accept(ModItems.PLATE_COPPER.get());
                            output.accept(ModItems.PLATE_DIAMOND.get());
                            output.accept(ModItems.PLATE_EMERALD.get());
                            output.accept(ModItems.PLATE_EXODIUM.get());
                            output.accept(ModItems.PLATE_GOLD.get());
                            output.accept(ModItems.PLATE_IRON.get());
                            output.accept(ModItems.PLATE_NETHERITE.get());
                            output.accept(ModItems.PLATE_CARMINIS.get());
                            output.accept(ModItems.PLATE_GLAUCUS.get());
                            output.accept(ModItems.PLATE_SHULKER.get());
                            output.accept(ModItems.PLATE_STONE.get());
                            //endregion

                            //region REINFORCED PLATES
                            output.accept(ModItems.REINFORCED_PLATE_AMETHYST.get());
                            output.accept(ModItems.REINFORCED_PLATE_FLAVUM.get());
                            output.accept(ModItems.REINFORCED_PLATE_COPPER.get());
                            output.accept(ModItems.REINFORCED_PLATE_DIAMOND.get());
                            output.accept(ModItems.REINFORCED_PLATE_EMERALD.get());
                            output.accept(ModItems.REINFORCED_PLATE_EXODIUM.get());
                            output.accept(ModItems.REINFORCED_PLATE_GOLD.get());
                            output.accept(ModItems.REINFORCED_PLATE_IRON.get());
                            output.accept(ModItems.REINFORCED_PLATE_NETHERITE.get());
                            output.accept(ModItems.REINFORCED_PLATE_CARMINIS.get());
                            output.accept(ModItems.REINFORCED_PLATE_GLAUCUS.get());
                            output.accept(ModItems.REINFORCED_PLATE_SHULKER.get());
                            //endregion

                            //region RODS
                            output.accept(ModItems.ROD_COPPER.get());
                            output.accept(ModItems.ROD_EXODIUM.get());
                            output.accept(ModItems.ROD_GLOWSTONE.get());
                            output.accept(ModItems.ROD_GOLD.get());
                            output.accept(ModItems.ROD_IRON.get());
                            output.accept(ModItems.ROD_OBSIDIAN.get());
                            output.accept(ModItems.ROD_REDSTONE.get());
                            output.accept(ModItems.ROD_SHULKER.get());
                            //endregion
                        });
        //endregion

        //region MISC
        MISC =
                Services.CREATIVE_TAB_REGISTRAR.register(
                        "ars_mundi_misc_tab",
                        MISC_CREATIVE_TAB,
                        ModItems.HOT_COAL.get()::getDefaultInstance,
                        output ->
                        {
                            //This block will add everything from our mod in the order
                            //We register them to a single tab
                            /*BuiltInRegistries.ITEM
                                    .stream()
                                    .filter(item -> Objects.equals(BuiltInRegistries.ITEM.getKey(item).getNamespace(),
                                                                   MODID))
                                    .forEachOrdered(output::accept);*/
                        });
        //endregion
    }

    public static void load()
    {

    }
}