package com.dynamero.materias.datagen.base;


import com.dynamero.materias.MateriasConstants;
import com.dynamero.materias.platform.services.registrars.NeoForgeBlockRegisterar;
import com.dynamero.materias.platform.services.utils.BlockHandle;
import com.dynamero.materias.platform.services.utils.ItemHandle;
import com.dynamero.materias.registries.base.ModBlocks;
import com.dynamero.materias.registries.base.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import org.jspecify.annotations.NonNull;

import java.util.Set;
import java.util.function.Supplier;

public class ModBlockLootTableProvider extends BlockLootSubProvider
{
    public ModBlockLootTableProvider(Context output)
    {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), output);
    }

    @Override
    protected void generate()
    {
        MateriasConstants.LOG.logLootTableDatagen();

        //region BASE
        dropSelf(ModBlocks.CARROT_BOX.get());
        dropSelf(ModBlocks.LEATHER_CRATE.get());
        dropSelf(ModBlocks.POTATO_BOX.get());
        dropSelf(ModBlocks.SUGAR_CANE_CRATE.get());
        dropSelf(ModBlocks.FEATHER_CRATE.get());
        dropSelf(ModBlocks.GUNPOWDER_CRATE.get());

        dropSelf(ModBlocks.ALIMENTOR.get());

        dropSelf(ModBlocks.RAW_CARMINIS_BLOCK.get());
        dropSelf(ModBlocks.RAW_EXODIUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_FLAVUM_BLOCK.get());
        dropSelf(ModBlocks.RAW_GLAUCUS_BLOCK.get());
        dropSelf(ModBlocks.RAW_QUARTZ_BLOCK.get());

        dropSelf(ModBlocks.CARMINIS_BLOCK.get());
        dropSelf(ModBlocks.EXODIUM_BLOCK.get());
        dropSelf(ModBlocks.FLAVUM_BLOCK.get());
        dropSelf(ModBlocks.GLAUCUS_BLOCK.get());

        dropSelf(ModBlocks.RUBBER_WOOD_LOG.get());
        dropSelf(ModBlocks.RUBBER_WOOD.get());
        dropSelf(ModBlocks.STRIPPED_RUBBER_WOOD_LOG.get());
        dropSelf(ModBlocks.STRIPPED_RUBBER_WOOD.get());
        dropSelf(ModBlocks.RUBBER_WOOD_PLANKS.get());

        add(ModBlocks.RUBBER_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.RUBBER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(ModBlocks.RUBBER_SAPLING.get());
        //add(ModBlocks.BASE.POTTED_RUBBER_SAPLING, block -> createPotFlowerItemTable(ModBlocks.BASE.RUBBER_SAPLING));
        //endregion

        //region ORES
        dropSelf(ModBlocks.ORE_END_EXODIUM_CRACKED.get());

        addOreDrops(ModBlocks.ORE_DEEP_CARMINIS, ModItems.RAW_CARMINIS, 2, 3);
        addOreDrops(ModBlocks.ORE_DEEP_FLAVUM, ModItems.RAW_FLAVUM, 2, 3);
        addOreDrops(ModBlocks.ORE_DEEP_GLAUCUS, ModItems.RAW_GLAUCUS, 2, 3);

        addOreDrops(ModBlocks.ORE_END_CARMINIS, ModItems.RAW_CARMINIS);
        addOreDrops(ModBlocks.ORE_END_FLAVUM, ModItems.RAW_FLAVUM);
        addOreDrops(ModBlocks.ORE_END_GLAUCUS, ModItems.RAW_GLAUCUS, 2, 5);

        addOreDrops(ModBlocks.ORE_EXODIUM, ModItems.RAW_EXODIUM, 1, 2);

        addOreDrops(ModBlocks.ORE_NETHER_CARMINIS, ModItems.RAW_CARMINIS, 2, 4);
        addOreDrops(ModBlocks.ORE_NETHER_COAL, Items.COAL, 2, 6);
        addOreDrops(ModBlocks.ORE_NETHER_COPPER, Items.RAW_COPPER);
        addOreDrops(ModBlocks.ORE_NETHER_DIAMOND, Items.DIAMOND, 1, 1);
        addOreDrops(ModBlocks.ORE_NETHER_FLAVUM, ModItems.RAW_FLAVUM, 2, 4);
        addOreDrops(ModBlocks.ORE_NETHER_GLAUCUS, ModItems.RAW_GLAUCUS, 2, 4);
        addOreDrops(ModBlocks.ORE_NETHER_IRON, Items.RAW_IRON);
        addOreDrops(ModBlocks.ORE_NETHER_LAPIS, Items.LAPIS_LAZULI, 2, 4);
        addOreDrops(ModBlocks.ORE_NETHER_REDSTONE, Items.REDSTONE, 2, 4);

        addOreDrops(ModBlocks.ORE_WORLD_CARMINIS, ModItems.RAW_CARMINIS, 2, 3);
        addOreDrops(ModBlocks.ORE_WORLD_FLAVUM, ModItems.RAW_FLAVUM, 2, 3);
        addOreDrops(ModBlocks.ORE_WORLD_GLAUCUS, ModItems.RAW_GLAUCUS, 2, 3);
        //endregion

        //region COMPRESSED
        ModBlocks.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_POLISHED_BLACKSTONE_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CINNABAR_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_TILES.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CRACKED_NETHER_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CRACKED_STONE_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_DEEPSLATE_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_DEEPSLATE_TILES.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ENDSTONE_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_MOSSY_STONE_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_MUD_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_NETHER_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PRISMARINE_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_QUARTZ_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_RED_NETHER_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_RESIN_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STONE_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_SULFUR_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TUFF_BRICKS.values().stream().map(Supplier::get).forEach(this::dropSelf);

        ModBlocks.COMPRESSED_CONCRETE_BLACK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_BLUE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_BROWN.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_CYAN.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_GRAY.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_GREEN.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_LIGHT_BLUE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_LIGHT_GRAY.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_LIME.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_MAGENTA.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_ORANGE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_PINK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_PURPLE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_RED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_WHITE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_YELLOW.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_BLACK_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_BLUE_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_BROWN_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_CYAN_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_GRAY_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_GREEN_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_LIGHT_BLUE_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_LIGHT_GRAY_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_LIME_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_MAGENTA_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_ORANGE_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_PINK_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_PURPLE_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_RED_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_WHITE_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CONCRETE_YELLOW_POWDER.values().stream().map(Supplier::get).forEach(this::dropSelf);

        ModBlocks.COMPRESSED_LOG_ACACIA.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_LOG_BIRCH.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_LOG_CHERRY.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_LOG_CRIMSON.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_LOG_DARK_OAK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_LOG_JUNGLE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_LOG_MANGROVE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_LOG_OAK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_LOG_PALE_OAK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_LOG_SPRUCE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_LOG_WARPED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_LOG_BAMBOO_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);

        ModBlocks.COMPRESSED_DIAMOND_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_EMERALD_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_GLOWSTONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_GOLD_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_HAY_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_HONEY_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_HONEYCOMB_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ICE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_LAPIS_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_RESIN_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_SLIME_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TNT.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_AMETHYST_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_BLUE_ICE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_DARK_PRISMARINE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_DRIED_KELP.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_IRON_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_MELON.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PACKED_ICE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_BONE_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CLAY.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_COAL_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_REDSTONE_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_HORN_CORAL_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_COPPER_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CUT_COPPER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_BAMBOO_MOSAIC.values().stream().map(Supplier::get).forEach(this::dropSelf);

        ModBlocks.COMPRESSED_CARMINIS_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_EXODIUM_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_FLAVUM_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_GLAUCUS_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_DEEP_CARMINIS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_DEEP_FLAVUM.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_DEEP_GLAUCUS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_END_CARMINIS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_END_EXODIUM_CRACKED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_END_FLAVUM.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_END_GLAUCUS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_EXODIUM.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_NETHER_CARMINIS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_NETHER_COAL.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_NETHER_COPPER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_NETHER_DIAMOND.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_NETHER_FLAVUM.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_NETHER_GLAUCUS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_NETHER_IRON.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_NETHER_LAPIS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_NETHER_REDSTONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_WORLD_CARMINIS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_WORLD_FLAVUM.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_WORLD_GLAUCUS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_RAW_CARMINIS_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_RAW_EXODIUM_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_RAW_FLAVUM_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_RAW_GLAUCUS_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_RAW_QUARTZ_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_RUBBER_WOOD_LOG.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_RUBBER_WOOD_PLANKS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STRIPPED_RUBBER_WOOD_LOG.values().stream().map(Supplier::get).forEach(this::dropSelf);

        ModBlocks.COMPRESSED_ORE_COAL.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_COPPER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_COAL.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_COPPER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_DIAMOND.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_EMERALD.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_GOLD.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_IRON.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_LAPIS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_DEEPSLATE_REDSTONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_DIAMOND.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_EMERALD.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_GOLD.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_IRON.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_LAPIS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_NETHER_GOLD.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_NETHER_QUARTZ.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_RAW_COPPER.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_RAW_GOLD.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_RAW_IRON.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ORE_REDSTONE.values().stream().map(Supplier::get).forEach(this::dropSelf);

        ModBlocks.COMPRESSED_PLANKS_ACACIA.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PLANKS_BIRCH.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PLANKS_CHERRY.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PLANKS_CRIMSON.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PLANKS_DARK_OAK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PLANKS_JUNGLE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PLANKS_MANGROVE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PLANKS_OAK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PLANKS_PALE_OAK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PLANKS_SPRUCE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PLANKS_WARPED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PLANKS_BAMBOO.values().stream().map(Supplier::get).forEach(this::dropSelf);

        ModBlocks.COMPRESSED_ANDESITE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_BASALT.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CALCITE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_COBBLED_DEEPSLATE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_COBBLESTONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_DEEPSLATE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_DIORITE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_DIRT.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_END_STONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_GRAVEL.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_MOSS_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_MOSS_COBBLESTONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_MUD.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_NETHERRACK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_OBSIDIAN.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PALE_MOSS_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_SAND.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_SMOOTH_BASALT.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_SMOOTH_STONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_SOUL_SAND.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_SOUL_SOIL.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TUFF.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_GRANITE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_GRASS_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_SANDSTONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_ANCIENT_DEBRIS.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_BEDROCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CRYING_OBSIDIAN.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CUT_RED_SANDSTONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CUT_SANDSTONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_NETHERITE_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PACKED_MUD.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PRISMARINE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PURPUR_BLOCK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_PURPUR_PILLAR.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_RED_SAND.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_RED_SANDSTONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_CINNABAR.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_POLISHED_BLACKSTONE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_POLISHED_ANDESITE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_POLISHED_BASALT.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_POLISHED_CINNABAR.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_POLISHED_DEEPSLATE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_POLISHED_DIORITE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_POLISHED_GRANITE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_POLISHED_SULFUR.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_POLISHED_TUFF.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_SULFUR.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_BLACKSTONE.values().stream().map(Supplier::get).forEach(this::dropSelf);

        ModBlocks.COMPRESSED_STRIPPED_LOG_ACACIA.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STRIPPED_LOG_BIRCH.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STRIPPED_LOG_CHERRY.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STRIPPED_LOG_CRIMSON.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STRIPPED_LOG_DARK_OAK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STRIPPED_LOG_JUNGLE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STRIPPED_LOG_MANGROVE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STRIPPED_LOG_OAK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STRIPPED_LOG_PALE_OAK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STRIPPED_LOG_SPRUCE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STRIPPED_LOG_WARPED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_STRIPPED_LOG_BAMBOO.values().stream().map(Supplier::get).forEach(this::dropSelf);

        ModBlocks.COMPRESSED_TERRACOTTA_SIMPLE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_BLACK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_BLUE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_BROWN.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_CYAN.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_GRAY.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_GREEN.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_BLUE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_GRAY.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_LIME.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_MAGENTA.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_ORANGE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_PINK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_PURPLE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_RED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_WHITE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_YELLOW.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_BLACK_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_BLUE_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_BROWN_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_CYAN_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_GRAY_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_GREEN_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_BLUE_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_GRAY_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_LIME_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_MAGENTA_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_ORANGE_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_PINK_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_PURPLE_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_RED_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_WHITE_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_TERRACOTTA_YELLOW_GLAZED.values().stream().map(Supplier::get).forEach(this::dropSelf);

        ModBlocks.COMPRESSED_WOOL_BLACK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_BLUE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_BROWN.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_CYAN.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_GRAY.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_GREEN.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_LIGHT_BLUE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_LIGHT_GRAY.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_LIME.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_MAGENTA.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_ORANGE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_PINK.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_PURPLE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_RED.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_WHITE.values().stream().map(Supplier::get).forEach(this::dropSelf);
        ModBlocks.COMPRESSED_WOOL_YELLOW.values().stream().map(Supplier::get).forEach(this::dropSelf);
        //endregion
    }

    @Override
    protected @NonNull Iterable<Block> getKnownBlocks()
    {
        return NeoForgeBlockRegisterar.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }

    protected void addOreDrops(BlockHandle<Block> block, ItemHandle<Item> item, int min, int max)
    {
        this.createSilkTouchDispatchTable(block.get(),
                                          this.applyExplosionDecay(
                                                  block.get(),
                                                  LootItem.lootTableItem(item.get())
                                                          .apply(SetItemCountFunction.setCount(ContextIntProviders.between(min, max)))
                                                          .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected void addOreDrops(BlockHandle<Block> block, Item item, int min, int max)
    {
        this.createSilkTouchDispatchTable(block.get(),
                                          this.applyExplosionDecay(
                                                  block.get(),
                                                  LootItem.lootTableItem(item)
                                                          .apply(SetItemCountFunction.setCount(ContextIntProviders.between(min, max)))
                                                          .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }

    protected void addOreDrops(BlockHandle<Block> block, ItemHandle<Item> item)
    {
        addOreDrops(block, item, 2, 5);
    }

    protected void addOreDrops(BlockHandle<Block> block, Item item)
    {
        addOreDrops(block, item, 2, 5);
    }
}