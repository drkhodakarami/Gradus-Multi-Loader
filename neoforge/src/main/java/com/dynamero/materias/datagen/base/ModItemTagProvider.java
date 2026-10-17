package com.dynamero.materias.datagen.base;

import com.dynamero.materias.MateriasConstants;
import com.dynamero.materias.registries.base.ModBlockItems;
import com.dynamero.materias.registries.base.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import org.jspecify.annotations.NonNull;

import java.util.concurrent.CompletableFuture;

import static com.dynamero.materias.MateriasConstants.LOG;
import static com.dynamero.materias.MateriasConstants.MODID;

public class ModItemTagProvider extends ItemTagsProvider
{
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider)
    {
        super(output, lookupProvider, MODID);
    }

    @Override
    protected void addTags(HolderLookup.@NonNull Provider provider)
    {
        LOG.logItemTagDatagen();

        tag(MateriasConstants.GEMS)
                .add(ModItems.CARMINIS.key())
                .add(ModItems.FLAVUM.key())
                .add(ModItems.GLAUCUS.key())
        ;

        tag(MateriasConstants.RED_GEMS)
                .add(ModItems.CARMINIS.key())
        ;

        tag(MateriasConstants.YELLOW_GEMS)
                .add(ModItems.FLAVUM.key())
        ;

        tag(MateriasConstants.BLUE_GEMS)
                .add(ModItems.GLAUCUS.key())
        ;

        tag(MateriasConstants.RAWS)
                .add(ModItems.RAW_CARMINIS.key())
                .add(ModItems.RAW_FLAVUM.key())
                .add(ModItems.RAW_GLAUCUS.key())
                .add(ModItems.RAW_QUARTZ.key())
                .add(ModItems.RAW_RUBBER.key())
                .add(ModItems.RAW_EXODIUM.key())
        ;

        tag(MateriasConstants.GEARS)
                .add(ModItems.GEAR_COPPER.key())
                .add(ModItems.GEAR_DIAMOND.key())
                .add(ModItems.GEAR_EMERALD.key())
                .add(ModItems.GEAR_EXODIUM.key())
                .add(ModItems.GEAR_ENERGIZED.key())
                .add(ModItems.GEAR_GOLD.key())
                .add(ModItems.GEAR_IRON.key())
                .add(ModItems.GEAR_LAPIS.key())
                .add(ModItems.GEAR_NETHERITE.key())
                .add(ModItems.GEAR_OBSIDIAN.key())
                .add(ModItems.GEAR_PRISMARINE.key())
                .add(ModItems.GEAR_QUARTZ.key())
                .add(ModItems.GEAR_CARMINIS.key())
                .add(ModItems.GEAR_GLAUCUS.key())
                .add(ModItems.GEAR_SHULKER.key())
                .add(ModItems.GEAR_STONE.key())
                .add(ModItems.GEAR_VIBRANT.key())
                .add(ModItems.GEAR_WOOD.key())
        ;

        tag(MateriasConstants.RED_GEM_GEARS)
                .add(ModItems.CARMINIS.key())
        ;

        tag(MateriasConstants.YELLOW_GEM_GEARS);

        tag(MateriasConstants.BLUE_GEM_GEARS)
                .add(ModItems.GLAUCUS.key())
        ;

        tag(MateriasConstants.INGOTS)
                .add(ModItems.INGOT_EXODIUM.key())
        ;

        tag(MateriasConstants.PLATES)
                .add(ModItems.PLATE_AMETHYST.key())
                .add(ModItems.PLATE_FLAVUM.key())
                .add(ModItems.PLATE_COPPER.key())
                .add(ModItems.PLATE_DIAMOND.key())
                .add(ModItems.PLATE_EMERALD.key())
                .add(ModItems.PLATE_EXODIUM.key())
                .add(ModItems.PLATE_GOLD.key())
                .add(ModItems.PLATE_IRON.key())
                .add(ModItems.PLATE_NETHERITE.key())
                .add(ModItems.PLATE_CARMINIS.key())
                .add(ModItems.PLATE_GLAUCUS.key())
                .add(ModItems.PLATE_SHULKER.key())
                .add(ModItems.PLATE_STONE.key())
        ;

        tag(MateriasConstants.REINFORCED)
                .add(ModItems.REINFORCED_PLATE_AMETHYST.key())
                .add(ModItems.REINFORCED_PLATE_FLAVUM.key())
                .add(ModItems.REINFORCED_PLATE_COPPER.key())
                .add(ModItems.REINFORCED_PLATE_DIAMOND.key())
                .add(ModItems.REINFORCED_PLATE_EMERALD.key())
                .add(ModItems.REINFORCED_PLATE_EXODIUM.key())
                .add(ModItems.REINFORCED_PLATE_GOLD.key())
                .add(ModItems.REINFORCED_PLATE_IRON.key())
                .add(ModItems.REINFORCED_PLATE_NETHERITE.key())
                .add(ModItems.REINFORCED_PLATE_CARMINIS.key())
                .add(ModItems.REINFORCED_PLATE_GLAUCUS.key())
                .add(ModItems.REINFORCED_PLATE_SHULKER.key())
        ;

        tag(MateriasConstants.RODS)
                .add(ModItems.ROD_COPPER.key())
                .add(ModItems.ROD_EXODIUM.key())
                .add(ModItems.ROD_GLOWSTONE.key())
                .add(ModItems.ROD_GOLD.key())
                .add(ModItems.ROD_IRON.key())
                .add(ModItems.ROD_OBSIDIAN.key())
                .add(ModItems.ROD_REDSTONE.key())
                .add(ModItems.ROD_SHULKER.key())
        ;

        tag(MateriasConstants.RUBBER_LOGS_ITEM_TAG)
                .add(ModBlockItems.RUBBER_WOOD_LOG.item().key())
                .add(ModBlockItems.RUBBER_WOOD.item().key())
                .add(ModBlockItems.STRIPPED_RUBBER_WOOD_LOG.item().key())
                .add(ModBlockItems.STRIPPED_RUBBER_WOOD.item().key());

        tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlockItems.RUBBER_WOOD_LOG.item().key())
        ;

        tag(ItemTags.LOGS)
                .add(ModBlockItems.RUBBER_WOOD_LOG.item().key())
                .add(ModBlockItems.STRIPPED_RUBBER_WOOD_LOG.item().key())
        ;

        tag(ItemTags.PLANKS)
                .add(ModBlockItems.RUBBER_WOOD_PLANKS.item().key())
        ;

        tag(ItemTags.LEAVES)
                .add(ModBlockItems.RUBBER_LEAVES.item().key())
        ;

        tag(ItemTags.SAPLINGS)
                .add(ModBlockItems.RUBBER_SAPLING.item().key())
                ;
    }
}