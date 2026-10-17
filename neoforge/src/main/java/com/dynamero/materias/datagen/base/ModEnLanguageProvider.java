package com.dynamero.materias.datagen.base;

import com.dynamero.materias.MateriasConstants;
import com.dynamero.materias.platform.services.utils.BlockHandle;
import com.dynamero.materias.registries.base.ModBlocks;
import com.dynamero.materias.registries.base.ModCreativeTabs;
import com.dynamero.materias.registries.base.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.Map;

import static com.dynamero.materias.MateriasConstants.LOG;
import static com.dynamero.materias.MateriasConstants.MODID;

public class ModEnLanguageProvider extends LanguageProvider
{
    public ModEnLanguageProvider(PackOutput output)
    {
        super(output, MODID, "en_us");
    }

    @Override
    protected void addTranslations()
    {
        LOG.logEnLanguageDatagen();

        //region ITEMS
        //region GEMS
        add(ModItems.CARMINIS.get(), "Carminis Gem");
        add(ModItems.FLAVUM.get(), "Flavum Gem");
        add(ModItems.GLAUCUS.get(), "Glaucus Gem");
        //endregion

        //region RAWS
        add(ModItems.RAW_CARMINIS.get(), "Raw Carminis");
        add(ModItems.RAW_FLAVUM.get(), "Raw Flavum Gem");
        add(ModItems.RAW_GLAUCUS.get(), "Raw Glaucus Gem");
        add(ModItems.RAW_QUARTZ.get(), "Raw Quartz");
        add(ModItems.RAW_RUBBER.get(), "Raw Rubber");
        add(ModItems.RAW_EXODIUM.get(), "Raw Exodium");
        //endregion

        //region GEARS
        add(ModItems.GEAR_COPPER.get(), "Copper Gear");
        add(ModItems.GEAR_DIAMOND.get(), "Diamond Gear");
        add(ModItems.GEAR_EMERALD.get(), "Emerald Gear");
        add(ModItems.GEAR_EXODIUM.get(), "Exodium Gear");
        add(ModItems.GEAR_ENERGIZED.get(), "Energized Gear");
        add(ModItems.GEAR_GOLD.get(), "Gold Gear");
        add(ModItems.GEAR_IRON.get(), "Iron Gear");
        add(ModItems.GEAR_LAPIS.get(), "Lapis Gear");
        add(ModItems.GEAR_NETHERITE.get(), "Netherite Gear");
        add(ModItems.GEAR_OBSIDIAN.get(), "Obsidian Gear");
        add(ModItems.GEAR_PRISMARINE.get(), "Prismarine Gear");
        add(ModItems.GEAR_QUARTZ.get(), "Quartz Gear");
        add(ModItems.GEAR_CARMINIS.get(), "Carminis Gear");
        add(ModItems.GEAR_GLAUCUS.get(), "Glaucus Gear");
        add(ModItems.GEAR_SHULKER.get(), "Shulker Gear");
        add(ModItems.GEAR_STONE.get(), "Stone Gear");
        add(ModItems.GEAR_VIBRANT.get(), "Vibrant Gear");
        add(ModItems.GEAR_WOOD.get(), "Wood Gear");
        //endregion

        //region PLATES
        add(ModItems.PLATE_AMETHYST.get(), "Amethyst Plate");
        add(ModItems.PLATE_FLAVUM.get(), "Flavum Plate");
        add(ModItems.PLATE_COPPER.get(), "Copper Plate");
        add(ModItems.PLATE_DIAMOND.get(), "Diamond Plate");
        add(ModItems.PLATE_EMERALD.get(), "Emerald Plate");
        add(ModItems.PLATE_EXODIUM.get(), "Exodium Plate");
        add(ModItems.PLATE_GOLD.get(), "Gold Plate");
        add(ModItems.PLATE_IRON.get(), "Iron Plate");
        add(ModItems.PLATE_NETHERITE.get(), "Netherite Plate");
        add(ModItems.PLATE_CARMINIS.get(), "Carminis Plate");
        add(ModItems.PLATE_GLAUCUS.get(), "Glaucus Plate");
        add(ModItems.PLATE_SHULKER.get(), "Shulker Plate");
        add(ModItems.PLATE_STONE.get(), "Stone Plate");
        //endregion

        //region REINFORCED PLATES
        add(ModItems.REINFORCED_PLATE_AMETHYST.get(), "Amethyst Reinforced Plate");
        add(ModItems.REINFORCED_PLATE_FLAVUM.get(), "Flavum Reinforced Plate");
        add(ModItems.REINFORCED_PLATE_COPPER.get(), "Copper Reinforced Plate");
        add(ModItems.REINFORCED_PLATE_DIAMOND.get(), "Diamond Reinforced Plate");
        add(ModItems.REINFORCED_PLATE_EMERALD.get(), "Emerald Reinforced Plate");
        add(ModItems.REINFORCED_PLATE_EXODIUM.get(), "Exodium Reinforced Plate");
        add(ModItems.REINFORCED_PLATE_GOLD.get(), "Gold Reinforced Plate");
        add(ModItems.REINFORCED_PLATE_IRON.get(), "Iron Reinforced Plate");
        add(ModItems.REINFORCED_PLATE_NETHERITE.get(), "Netherite Reinforced Plate");
        add(ModItems.REINFORCED_PLATE_CARMINIS.get(), "Carminis Reinforced Plate");
        add(ModItems.REINFORCED_PLATE_GLAUCUS.get(), "Glaucus Reinforced Plate");
        add(ModItems.REINFORCED_PLATE_SHULKER.get(), "Shulker Reinforced Plate");
        //endregion

        //region RODS
        add(ModItems.ROD_COPPER.get(), "Copper Rod");
        add(ModItems.ROD_EXODIUM.get(), "Exodium Rod");
        add(ModItems.ROD_GLOWSTONE.get(), "Glowstone Rod");
        add(ModItems.ROD_GOLD.get(), "Gold Rod");
        add(ModItems.ROD_IRON.get(), "Iron Rod");
        add(ModItems.ROD_OBSIDIAN.get(), "Obsidian Rod");
        add(ModItems.ROD_REDSTONE.get(), "Redstone Rod");
        add(ModItems.ROD_SHULKER.get(), "Shulker Rod");
        //endregion

        //region MISC
        add(ModItems.BINDING_STRING.get(), "Binding String");
        add(ModItems.RUBBER.get(), "Rubber");
        add(ModItems.SOLIDIFIED_EXPERIENCE.get(), "Solidified EXP");
        add(ModItems.THERMAL_CORE.get(), "Thermal Core");
        add(ModItems.HOT_COAL.get(), "Hot Coal");
        add(ModItems.ENDER_CHARM.get(), "Ender Charm");
        add(ModItems.ENDERMAN_EYE.get(), "Enderman Eye");
        add(ModItems.ENDERMAN_GLAND.get(), "Enderman Gland");
        add(ModItems.ENDERMAN_HEART.get(), "Enderman Heart");
        add(ModItems.MOLTEN_EXODIUM_BUCKET.get(), "Molten Exodium");
        //endregion

        //region FOOD
        add(ModItems.COOKED_EGG.get(), "Cooked Egg");
        add(ModItems.EGG_AND_BREAD.get(), "Egg & Bread");
        //endregion

        add(ModItems.INGOT_EXODIUM.get(), "Exodium Ingot");
        //endregion

        //region BLOCKS
        //region BASE
        add(ModBlocks.CARROT_BOX.get(), "Carrot Box");
        add(ModBlocks.LEATHER_CRATE.get(), "Leather Crate");
        add(ModBlocks.POTATO_BOX.get(), "Potato Box");
        add(ModBlocks.SUGAR_CANE_CRATE.get(), "Sugarcane Crate");

        add(ModBlocks.ALIMENTOR.get(), "Alimentor");

        add(ModBlocks.ORE_DEEP_CARMINIS.get(), "Carminis Deep Ore");
        add(ModBlocks.ORE_DEEP_FLAVUM.get(), "Flavum Deep Ore");
        add(ModBlocks.ORE_DEEP_GLAUCUS.get(), "Glaucus Deep Ore");
        add(ModBlocks.ORE_END_CARMINIS.get(), "Carminis End Ore");
        add(ModBlocks.ORE_END_EXODIUM.get(), "Exodium End Ore");
        add(ModBlocks.ORE_END_EXODIUM_CRACKED.get(), "Cracked Exodium End Ore");
        add(ModBlocks.ORE_END_FLAVUM.get(), "Flavum End Ore");
        add(ModBlocks.ORE_END_GLAUCUS.get(), "Glaucus End Ore");
        add(ModBlocks.ORE_EXODIUM.get(), "Exodium Ore");
        add(ModBlocks.ORE_NETHER_CARMINIS.get(), "Carminis Nether Ore");
        add(ModBlocks.ORE_NETHER_COAL.get(), "Coal Nether Ore");
        add(ModBlocks.ORE_NETHER_COPPER.get(), "Copper Nether Ore");
        add(ModBlocks.ORE_NETHER_DIAMOND.get(), "Diamond Nether Ore");
        add(ModBlocks.ORE_NETHER_FLAVUM.get(), "Flavum Nether Ore");
        add(ModBlocks.ORE_NETHER_GLAUCUS.get(), "Glaucus Nether Ore");
        add(ModBlocks.ORE_NETHER_IRON.get(), "Iron Nether Ore");
        add(ModBlocks.ORE_NETHER_LAPIS.get(), "Lapis Nether Ore");
        add(ModBlocks.ORE_NETHER_REDSTONE.get(), "Redstone Nether Ore");
        add(ModBlocks.ORE_WORLD_CARMINIS.get(), "Carminis Ore");
        add(ModBlocks.ORE_WORLD_FLAVUM.get(), "Flavum Ore");
        add(ModBlocks.ORE_WORLD_GLAUCUS.get(), "Glaucus Ore");
        
        add(ModBlocks.RAW_CARMINIS_BLOCK.get(), "Raw Carminis Block");
        add(ModBlocks.RAW_EXODIUM_BLOCK.get(), "Raw Exodium Block");
        add(ModBlocks.RAW_FLAVUM_BLOCK.get(), "Raw Flavum Block");
        add(ModBlocks.RAW_GLAUCUS_BLOCK.get(), "RawGlaucus Block");
        add(ModBlocks.RAW_QUARTZ_BLOCK.get(), "Raw Quartz Block");
        add(ModBlocks.CARMINIS_BLOCK.get(), "Carminis Block");
        add(ModBlocks.EXODIUM_BLOCK.get(), "Exodium Block");
        add(ModBlocks.FLAVUM_BLOCK.get(), "Flavum Block");
        add(ModBlocks.GLAUCUS_BLOCK.get(), "Glaucus Block");
        //endregion

        //region COMPRESSED
        //region MOD BLOCKS
        generateEnMap(ModBlocks.COMPRESSED_CARMINIS_BLOCK, "Carminis Block");
        generateEnMap(ModBlocks.COMPRESSED_EXODIUM_BLOCK, "Exodium Block");
        generateEnMap(ModBlocks.COMPRESSED_FLAVUM_BLOCK, "Flavum Block");
        generateEnMap(ModBlocks.COMPRESSED_GLAUCUS_BLOCK, "Glaucus Block");
        generateEnMap(ModBlocks.COMPRESSED_ORE_DEEP_CARMINIS, "Deep Carminis Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_DEEP_FLAVUM, "Deep Flavum Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_DEEP_GLAUCUS, "Deep Glaucus Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_END_CARMINIS, "End Carminis Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_END_EXODIUM_CRACKED, "End Cracked Exodium Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_END_FLAVUM, "End Flavum Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_END_GLAUCUS, "End Glaucus Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_EXODIUM, "Exodium Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_NETHER_CARMINIS, "Nether Carminis Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_NETHER_COAL, "Nether Coal Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_NETHER_COPPER, "Nether Copper Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_NETHER_DIAMOND, "Nether Diamond Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_NETHER_FLAVUM, "Nether Flavum Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_NETHER_GLAUCUS, "Nether Glaucus Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_NETHER_IRON, "Nether Iron Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_NETHER_LAPIS, "Nether Lapis Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_NETHER_REDSTONE, "Nether Redstone Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_WORLD_CARMINIS, "Carminis Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_WORLD_FLAVUM, "Flavum Ore");
        generateEnMap(ModBlocks.COMPRESSED_ORE_WORLD_GLAUCUS, "Glaucus Ore");
        generateEnMap(ModBlocks.COMPRESSED_RAW_CARMINIS_BLOCK, "Raw Carminis Block");
        generateEnMap(ModBlocks.COMPRESSED_RAW_EXODIUM_BLOCK, "Raw Exodium Block");
        generateEnMap(ModBlocks.COMPRESSED_RAW_FLAVUM_BLOCK, "Raw Flavum Block");
        generateEnMap(ModBlocks.COMPRESSED_RAW_GLAUCUS_BLOCK, "Raw Glaucus Block");
        generateEnMap(ModBlocks.COMPRESSED_RAW_QUARTZ_BLOCK, "Raw Quartz Block");
        generateEnMap(ModBlocks.COMPRESSED_RUBBER_WOOD_LOG, "Rubber Wood Log");
        generateEnMap(ModBlocks.COMPRESSED_RUBBER_WOOD_PLANKS, "Rubber Wood Planks");
        generateEnMap(ModBlocks.COMPRESSED_STRIPPED_RUBBER_WOOD_LOG, "Stripped Rubber Wood Log");
        //endregion
        
        //region WOOL
        generateEnMap( ModBlocks.COMPRESSED_WOOL_BLACK, "Black Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_BLUE, "Blue Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_BROWN, "Brown Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_CYAN, "Cyan Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_GRAY, "Gray Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_GREEN, "Green Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_LIGHT_BLUE, "Light Blue Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_LIGHT_GRAY, "Light Gray Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_LIME, "Lime Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_MAGENTA, "Magenta Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_ORANGE, "Orange Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_PINK, "Pink Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_PURPLE, "Purple Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_RED, "Red Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_WHITE, "White Wool");
        generateEnMap( ModBlocks.COMPRESSED_WOOL_YELLOW, "Yellow Wool");
        //endregion
        
        //region MISC
        generateEnMap( ModBlocks.COMPRESSED_DIAMOND_BLOCK, "Diamond Block");
        generateEnMap( ModBlocks.COMPRESSED_EMERALD_BLOCK, "Emerald Block");
        generateEnMap( ModBlocks.COMPRESSED_GLOWSTONE, "Glowstone");
        generateEnMap( ModBlocks.COMPRESSED_GOLD_BLOCK, "Gold Block");
        generateEnMap( ModBlocks.COMPRESSED_HAY_BLOCK, "Hay Block");
        generateEnMap( ModBlocks.COMPRESSED_HONEY_BLOCK, "Honey Block");
        generateEnMap( ModBlocks.COMPRESSED_HONEYCOMB_BLOCK, "Honeycomb Block");
        generateEnMap( ModBlocks.COMPRESSED_ICE, "Ice");
        generateEnMap( ModBlocks.COMPRESSED_LAPIS_BLOCK, "Lapis Block");
        generateEnMap( ModBlocks.COMPRESSED_RESIN_BLOCK, "Resin Block");
        generateEnMap( ModBlocks.COMPRESSED_SLIME_BLOCK, "Slime Block");
        generateEnMap( ModBlocks.COMPRESSED_TNT, "TNT");
        generateEnMap( ModBlocks.COMPRESSED_AMETHYST_BLOCK, "Amethyst Block");
        generateEnMap( ModBlocks.COMPRESSED_BLUE_ICE, "Blue Ice");
        generateEnMap( ModBlocks.COMPRESSED_DARK_PRISMARINE, "Dark Prismarine");
        generateEnMap( ModBlocks.COMPRESSED_DRIED_KELP, "Dried Kelp");
        generateEnMap( ModBlocks.COMPRESSED_IRON_BLOCK, "Iron Block");
        generateEnMap( ModBlocks.COMPRESSED_MELON, "Melon");
        generateEnMap( ModBlocks.COMPRESSED_PACKED_ICE, "Packed Ice");
        generateEnMap( ModBlocks.COMPRESSED_BONE_BLOCK, "Bone Block");
        generateEnMap( ModBlocks.COMPRESSED_CLAY, "Clay");
        generateEnMap( ModBlocks.COMPRESSED_COAL_BLOCK, "Coal Block");
        generateEnMap( ModBlocks.COMPRESSED_REDSTONE_BLOCK, "Redstone Block");
        generateEnMap( ModBlocks.COMPRESSED_HORN_CORAL_BLOCK, "Horn Coral Block");
        generateEnMap( ModBlocks.COMPRESSED_COPPER_BLOCK, "Copper Block");
        generateEnMap( ModBlocks.COMPRESSED_CUT_COPPER, "Cut Copper");
        generateEnMap( ModBlocks.COMPRESSED_BAMBOO_MOSAIC, "Bamboo Mosaic");
        //endregion
        
        //region LOG
        generateEnMap( ModBlocks.COMPRESSED_LOG_ACACIA, "Acacia Log");
        generateEnMap( ModBlocks.COMPRESSED_LOG_BIRCH, "Birch Log");
        generateEnMap( ModBlocks.COMPRESSED_LOG_CHERRY, "Cherry Log");
        generateEnMap( ModBlocks.COMPRESSED_LOG_CRIMSON, "Crimson Log");
        generateEnMap( ModBlocks.COMPRESSED_LOG_DARK_OAK, "Dark Oak Log");
        generateEnMap( ModBlocks.COMPRESSED_LOG_JUNGLE, "Jungle Log");
        generateEnMap( ModBlocks.COMPRESSED_LOG_MANGROVE, "Mangrove Log");
        generateEnMap( ModBlocks.COMPRESSED_LOG_OAK, "Oak Log");
        generateEnMap( ModBlocks.COMPRESSED_LOG_PALE_OAK, "Pale Oak Log");
        generateEnMap( ModBlocks.COMPRESSED_LOG_SPRUCE, "Spruce Log");
        generateEnMap( ModBlocks.COMPRESSED_LOG_WARPED, "Warped Log");
        generateEnMap( ModBlocks.COMPRESSED_LOG_BAMBOO_BLOCK, "Bamboo Block");
        //endregion
        
        //region PLANKS
        generateEnMap( ModBlocks.COMPRESSED_PLANKS_ACACIA, "Acacia Planks");
        generateEnMap( ModBlocks.COMPRESSED_PLANKS_BIRCH, "Birch Planks");
        generateEnMap( ModBlocks.COMPRESSED_PLANKS_CHERRY, "Cherry Planks");
        generateEnMap( ModBlocks.COMPRESSED_PLANKS_CRIMSON, "Crimson Planks");
        generateEnMap( ModBlocks.COMPRESSED_PLANKS_DARK_OAK, "Dark Oak Planks");
        generateEnMap( ModBlocks.COMPRESSED_PLANKS_JUNGLE, "Jungle Planks");
        generateEnMap( ModBlocks.COMPRESSED_PLANKS_MANGROVE, "Mangrove Planks");
        generateEnMap( ModBlocks.COMPRESSED_PLANKS_OAK, "Oak Planks");
        generateEnMap( ModBlocks.COMPRESSED_PLANKS_PALE_OAK, "Pale Oak Planks");
        generateEnMap( ModBlocks.COMPRESSED_PLANKS_SPRUCE, "Spruce Planks");
        generateEnMap( ModBlocks.COMPRESSED_PLANKS_WARPED, "Warped Planks");
        generateEnMap( ModBlocks.COMPRESSED_PLANKS_BAMBOO, "Bamboo Planks");
        //endregion
        
        //region STRIPPED
        generateEnMap( ModBlocks.COMPRESSED_STRIPPED_LOG_ACACIA, "Stripped Acacia Log");
        generateEnMap( ModBlocks.COMPRESSED_STRIPPED_LOG_BIRCH, "Stripped Birch Log");
        generateEnMap( ModBlocks.COMPRESSED_STRIPPED_LOG_CHERRY, "Stripped Cherry Log");
        generateEnMap( ModBlocks.COMPRESSED_STRIPPED_LOG_CRIMSON, "Stripped Crimson Log");
        generateEnMap( ModBlocks.COMPRESSED_STRIPPED_LOG_DARK_OAK, "Stripped Dark Oak Log");
        generateEnMap( ModBlocks.COMPRESSED_STRIPPED_LOG_JUNGLE, "Stripped Jungle Log");
        generateEnMap( ModBlocks.COMPRESSED_STRIPPED_LOG_MANGROVE, "Stripped Mangrove Log");
        generateEnMap( ModBlocks.COMPRESSED_STRIPPED_LOG_OAK, "Stripped Oak Log");
        generateEnMap( ModBlocks.COMPRESSED_STRIPPED_LOG_PALE_OAK, "Stripped Pale Oak Log");
        generateEnMap( ModBlocks.COMPRESSED_STRIPPED_LOG_SPRUCE, "Stripped Spruce Log");
        generateEnMap( ModBlocks.COMPRESSED_STRIPPED_LOG_WARPED, "Stripped Warped Log");
        generateEnMap( ModBlocks.COMPRESSED_STRIPPED_LOG_BAMBOO, "Stripped Bamboo");
        //endregion
        
        //region VANILLA ORE
        generateEnMap( ModBlocks.COMPRESSED_ORE_COAL, "Coal Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_COPPER, "Copper Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_DEEPSLATE_COAL, "Deepslate Coal Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_DEEPSLATE_COPPER, "Deepslate Copper Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_DEEPSLATE_DIAMOND, "Deepslate Diamond Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_DEEPSLATE_EMERALD, "Deepslate Emerald Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_DEEPSLATE_GOLD, "Deepslate Gold Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_DEEPSLATE_IRON, "Deepslate Iron Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_DEEPSLATE_LAPIS, "Deepslate Lapis Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_DEEPSLATE_REDSTONE, "Deepslate Redstone Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_DIAMOND, "Diamond Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_EMERALD, "Emerald Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_GOLD, "Gold Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_IRON, "Iron Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_LAPIS, "Lapis Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_NETHER_GOLD, "Nether Gold Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_NETHER_QUARTZ, "Nether Quartz Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_RAW_COPPER, "Raw Copper Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_RAW_GOLD, "Raw Gold Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_RAW_IRON, "Raw Iron Ore");
        generateEnMap( ModBlocks.COMPRESSED_ORE_REDSTONE, "Redstone Ore");
        //endregion
        
        //region TERRACOTTA
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_SIMPLE, "Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_BLACK, "Black Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_BLUE, "Blue Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_BROWN, "Brown Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_CYAN, "Cyan Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_GRAY, "Gray Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_GREEN, "Green Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_BLUE, "Light Blue Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_GRAY, "Light Gray Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_LIME, "Lime Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_MAGENTA, "Magenta Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_ORANGE, "Orange Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_PINK, "Pink Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_PURPLE, "Purple Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_RED, "Red Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_WHITE, "White Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_YELLOW, "Yellow Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_BLACK_GLAZED, "Black Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_BLUE_GLAZED, "Blue Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_BROWN_GLAZED, "Brown Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_CYAN_GLAZED, "Cyan Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_GRAY_GLAZED, "Gray Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_GREEN_GLAZED, "Green Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_BLUE_GLAZED, "Light Blue Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_GRAY_GLAZED, "Light Gray Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_LIME_GLAZED, "Lime Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_MAGENTA_GLAZED, "Magenta Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_ORANGE_GLAZED, "Orange Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_PINK_GLAZED, "Pink Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_PURPLE_GLAZED, "Purple Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_RED_GLAZED, "Red Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_WHITE_GLAZED, "White Glazed Terracotta");
        generateEnMap( ModBlocks.COMPRESSED_TERRACOTTA_YELLOW_GLAZED, "Yellow Glazed Terracotta");
        //endregion
        
        //region BRICKS
        generateEnMap(ModBlocks.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS, "Cracked Polished Blackstone Bricks");
        generateEnMap(ModBlocks.COMPRESSED_POLISHED_BLACKSTONE_BRICKS, "Polished Blackstone Bricks");
        generateEnMap(ModBlocks.COMPRESSED_BRICKS, "Bricks");
        generateEnMap(ModBlocks.COMPRESSED_CINNABAR_BRICKS, "Cinnabar Bricks");
        generateEnMap(ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_BRICKS, "Cracked Deepslate Bricks");
        generateEnMap(ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_TILES, "Cracked Deepslate Tiles");
        generateEnMap(ModBlocks.COMPRESSED_CRACKED_NETHER_BRICKS, "Cracked Nether Bricks");
        generateEnMap(ModBlocks.COMPRESSED_CRACKED_STONE_BRICKS, "Cracked Stone Bricks");
        generateEnMap(ModBlocks.COMPRESSED_DEEPSLATE_BRICKS, "Deepslate Bricks");
        generateEnMap(ModBlocks.COMPRESSED_DEEPSLATE_TILES, "Deepslate Tiles");
        generateEnMap(ModBlocks.COMPRESSED_ENDSTONE_BRICKS, "Endstone Bricks");
        generateEnMap(ModBlocks.COMPRESSED_MOSSY_STONE_BRICKS, "Mossy Stone Bricks");
        generateEnMap(ModBlocks.COMPRESSED_MUD_BRICKS, "Mud Bricks");
        generateEnMap(ModBlocks.COMPRESSED_NETHER_BRICKS, "Nether Bricks");
        generateEnMap(ModBlocks.COMPRESSED_PRISMARINE_BRICKS, "Prismarine Bricks");
        generateEnMap(ModBlocks.COMPRESSED_QUARTZ_BRICKS, "Quartz Bricks");
        generateEnMap(ModBlocks.COMPRESSED_RED_NETHER_BRICKS, "Red Nether Bricks");
        generateEnMap(ModBlocks.COMPRESSED_RESIN_BRICKS, "Resin Bricks");
        generateEnMap(ModBlocks.COMPRESSED_STONE_BRICKS, "Stone Bricks");
        generateEnMap(ModBlocks.COMPRESSED_SULFUR_BRICKS, "Sulfur Bricks");
        generateEnMap(ModBlocks.COMPRESSED_TUFF_BRICKS, "Tuff Bricks");
        //endregion
        
        //region CONCRETE
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_BLACK, "Black Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_BLUE, "Blue Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_BROWN, "Brown Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_CYAN, "Cyan Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_GRAY, "Gray Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_GREEN, "Green Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_LIGHT_BLUE, "Light Blue Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_LIGHT_GRAY, "Light Gray Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_LIME, "Lime Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_MAGENTA, "Magenta Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_ORANGE, "Orange Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_PINK, "Pink Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_PURPLE, "Purple Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_RED, "Red Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_WHITE, "White Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_YELLOW, "Yellow Concrete");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_BLACK_POWDER, "Black Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_BLUE_POWDER, "Blue Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_BROWN_POWDER, "Brown Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_CYAN_POWDER, "Cyan Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_GRAY_POWDER, "Gray Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_GREEN_POWDER, "Green Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_LIGHT_BLUE_POWDER, "Light Blue Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_LIGHT_GRAY_POWDER, "Light Gray Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_LIME_POWDER, "Lime Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_MAGENTA_POWDER, "Magenta Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_ORANGE_POWDER, "Orange Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_PINK_POWDER, "Pink Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_PURPLE_POWDER, "Purple Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_RED_POWDER, "Red Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_WHITE_POWDER, "White Concrete Powder");
        generateEnMap( ModBlocks.COMPRESSED_CONCRETE_YELLOW_POWDER, "Yellow Concrete Powder");
        //endregion
        
        //region STONE
        generateEnMap( ModBlocks.COMPRESSED_ANDESITE, "Andesite");
        generateEnMap( ModBlocks.COMPRESSED_BASALT, "Basalt");
        generateEnMap( ModBlocks.COMPRESSED_CALCITE, "Calcite");
        generateEnMap( ModBlocks.COMPRESSED_COBBLED_DEEPSLATE, "Cobbled Deepslate");
        generateEnMap( ModBlocks.COMPRESSED_COBBLESTONE, "Cobblestone");
        generateEnMap( ModBlocks.COMPRESSED_DEEPSLATE, "Deepslate");
        generateEnMap( ModBlocks.COMPRESSED_DIORITE, "Diorite");
        generateEnMap( ModBlocks.COMPRESSED_DIRT, "Dirt");
        generateEnMap( ModBlocks.COMPRESSED_END_STONE, "End Stone");
        generateEnMap( ModBlocks.COMPRESSED_GRAVEL, "Gravel");
        generateEnMap( ModBlocks.COMPRESSED_MOSS_BLOCK, "Moss Block");
        generateEnMap( ModBlocks.COMPRESSED_MOSS_COBBLESTONE, "Moss Cobblestone");
        generateEnMap( ModBlocks.COMPRESSED_MUD, "Mud");
        generateEnMap( ModBlocks.COMPRESSED_NETHERRACK, "Netherrack");
        generateEnMap( ModBlocks.COMPRESSED_OBSIDIAN, "Obsidian");
        generateEnMap( ModBlocks.COMPRESSED_PALE_MOSS_BLOCK, "Pale Moss Block");
        generateEnMap( ModBlocks.COMPRESSED_SAND, "Sand");
        generateEnMap( ModBlocks.COMPRESSED_SMOOTH_BASALT, "Smooth Basalt");
        generateEnMap( ModBlocks.COMPRESSED_SMOOTH_STONE, "Smooth Stone");
        generateEnMap( ModBlocks.COMPRESSED_SOUL_SAND, "Soul Sand");
        generateEnMap( ModBlocks.COMPRESSED_SOUL_SOIL, "Soul Soil");
        generateEnMap( ModBlocks.COMPRESSED_STONE, "Stone");
        generateEnMap( ModBlocks.COMPRESSED_TUFF, "Tuff");
        generateEnMap( ModBlocks.COMPRESSED_GRANITE, "Granite");
        generateEnMap( ModBlocks.COMPRESSED_GRASS_BLOCK, "Grass Block");
        generateEnMap( ModBlocks.COMPRESSED_SANDSTONE, "Sandstone");
        generateEnMap( ModBlocks.COMPRESSED_ANCIENT_DEBRIS, "Ancient Debris");
        generateEnMap( ModBlocks.COMPRESSED_BEDROCK, "Bedrock");
        generateEnMap( ModBlocks.COMPRESSED_CRYING_OBSIDIAN, "Crying Obsidian");
        generateEnMap( ModBlocks.COMPRESSED_CUT_RED_SANDSTONE, "Cut Red Sandstone");
        generateEnMap( ModBlocks.COMPRESSED_CUT_SANDSTONE, "Cut Sandstone");
        generateEnMap( ModBlocks.COMPRESSED_NETHERITE_BLOCK, "Netherite Block");
        generateEnMap( ModBlocks.COMPRESSED_PACKED_MUD, "Packed Mud");
        generateEnMap( ModBlocks.COMPRESSED_PRISMARINE, "Prismarine");
        generateEnMap( ModBlocks.COMPRESSED_PURPUR_BLOCK, "Purpur Block");
        generateEnMap( ModBlocks.COMPRESSED_PURPUR_PILLAR, "Purpur Pillar");
        generateEnMap( ModBlocks.COMPRESSED_RED_SAND, "Red Sand");
        generateEnMap( ModBlocks.COMPRESSED_RED_SANDSTONE, "Red Sandstone");
        generateEnMap( ModBlocks.COMPRESSED_CINNABAR, "Cinnabar");
        generateEnMap( ModBlocks.COMPRESSED_POLISHED_BLACKSTONE, "Polished Blackstone");
        generateEnMap( ModBlocks.COMPRESSED_POLISHED_ANDESITE, "Polished Andesite");
        generateEnMap( ModBlocks.COMPRESSED_POLISHED_BASALT, "Polished Basalt");
        generateEnMap( ModBlocks.COMPRESSED_POLISHED_CINNABAR, "Polished Cinnabar");
        generateEnMap( ModBlocks.COMPRESSED_POLISHED_DEEPSLATE, "Polished Deepslate");
        generateEnMap( ModBlocks.COMPRESSED_POLISHED_DIORITE, "Polished Diorite");
        generateEnMap( ModBlocks.COMPRESSED_POLISHED_GRANITE, "Polished Granite");
        generateEnMap( ModBlocks.COMPRESSED_POLISHED_SULFUR, "Polished Sulfur");
        generateEnMap( ModBlocks.COMPRESSED_POLISHED_TUFF, "Polished Tuff");
        generateEnMap( ModBlocks.COMPRESSED_SULFUR, "Sulfur");
        generateEnMap( ModBlocks.COMPRESSED_BLACKSTONE, "Blackstone");
        //endregion
        //endregion

        add(ModBlocks.RUBBER_WOOD_LOG.get(), "Rubber Log");
        add(ModBlocks.RUBBER_WOOD.get(), "Rubber Wood");
        add(ModBlocks.STRIPPED_RUBBER_WOOD_LOG.get(), "Stripped_Rubber Log");
        add(ModBlocks.STRIPPED_RUBBER_WOOD.get(), "Stripped_Rubber Wood");
        add(ModBlocks.RUBBER_WOOD_PLANKS.get(), "Rubber Planks");
        add(ModBlocks.RUBBER_LEAVES.get(), "Rubber Leaves");
        add(ModBlocks.RUBBER_SAPLING.get(), "Rubber Sapling");
        //endregion

        add(MODID + "." + MateriasConstants.DCLR_ERROR_ID, "Wrong Type, it should be one of the choices: ore, all");
        add(MODID + "." + MateriasConstants.DCLR_START_ID, "DCLR: Starting to clean");
        add(MODID + "." + MateriasConstants.DCLR_END_ID, "DCLR: Finished cleaning");

        add(ModCreativeTabs.INGREDIENTS.get().getDisplayName(), "Ingredients");
        add(ModCreativeTabs.BLOCKS.get().getDisplayName(), "Blocks");
        add(ModCreativeTabs.COMPONENTS.get().getDisplayName(), "Components");
        add(ModCreativeTabs.MISC.get().getDisplayName(), "Miscellaneous");
    }

    private void add(Component component, String value)
    {
        if(component.getContents() instanceof TranslatableContents translatableContents)
            add(translatableContents.getKey(), value);
    }

    private void generateEnMap(Map<String, BlockHandle<Block>> map, String text)
    {
        for (int i = 1; i < 6; i++)
            add(map.get(String.valueOf(i)).get(), "Compressed " + text + " (" + i + ")");
    }
}