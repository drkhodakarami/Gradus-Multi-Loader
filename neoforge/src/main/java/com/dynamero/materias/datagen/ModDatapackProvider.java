package com.dynamero.materias.datagen;

import com.dynamero.materias.datagen.base.ModBlockLootTableProvider;
import com.dynamero.materias.datagen.base.ModEntityLootTableProvider;
import com.dynamero.materias.datagen.base.ModExtraLootProvider;
import com.dynamero.materias.datagen.base.ModRecipeProvider;
import com.dynamero.materias.datagen.extra.ModAdvancements;
import com.dynamero.materias.datagen.extra.ModDamageTypes;
import com.dynamero.materias.datagen.extra.ModTradeSets;
import com.dynamero.materias.datagen.extra.ModVillagerTrades;
import com.dynamero.materias.datagen.misc.ModJukeboxSongs;
import com.dynamero.materias.datagen.misc.ModPaintings;
import com.dynamero.materias.registries.world.ModDimensions;
import com.dynamero.materias.registries.world.worldgen.ModFeatures;
import com.dynamero.materias.registries.world.worldgen.ModPlacedFeatures;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;
import java.util.Set;

public class ModDatapackProvider
{
    public static final RegistrySetBuilder WORLD_BUILDER = new RegistrySetBuilder()
            .add(Registries.PAINTING_VARIANT, ModPaintings::bootstrap)
            .add(Registries.JUKEBOX_SONG, ModJukeboxSongs::bootstrap)
            .add(Registries.DAMAGE_TYPE, ModDamageTypes::bootstrap)

            .add(Registries.VILLAGER_TRADE, ModVillagerTrades::bootstrap)
            .add(Registries.TRADE_SET, ModTradeSets::bootstrap)

            .add(Registries.FEATURE, ModFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            //TODO: Use services for the biom modifiers
            //.add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap)//<<< NEOFORGE !

            .add(Registries.DIMENSION_TYPE, ModDimensions::bootstrapType)
            .add(Registries.LEVEL_STEM, ModDimensions::bootstrapStem);

    //TODO: Uncomment if you need them in future
    public static final RegistrySetBuilder RELOADABLE_BUILDER = new RegistrySetBuilder()
            .add(Registries.LOOT_TABLE, new LootTableProvider(Set.of(), List.of(
                    new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK),
                    new LootTableProvider.SubProviderEntry(ModExtraLootProvider::new, LootContextParamSets.ALL_PARAMS),
                    new LootTableProvider.SubProviderEntry(ModEntityLootTableProvider::new, LootContextParamSets.ENTITY))))
            .add(Registries.ADVANCEMENT, ModAdvancements::new)
            .add(ModRecipeProvider.create());
}