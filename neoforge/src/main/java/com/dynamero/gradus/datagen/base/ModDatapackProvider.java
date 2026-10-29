/*
 * Copyright (c) 2026 Alireza Khodakarami
 *
 * Licensed under the LPGL-3.0, (read the "LICENSE" file in repo);
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.gnu.org/licenses/lgpl-3.0.en.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dynamero.gradus.datagen.base;

import java.util.List;
import java.util.Set;

import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import com.dynamero.gradus.datagen.extra.ModDamageTypes;
import com.dynamero.gradus.datagen.extra.ModEnchantments;
import com.dynamero.gradus.datagen.extra.ModExtraLootProvider;
import com.dynamero.gradus.datagen.misc.ModJukeboxSongs;
import com.dynamero.gradus.datagen.villagers.ModTradeSets;
import com.dynamero.gradus.datagen.villagers.ModVillagerTrades;

public class ModDatapackProvider
{
    public static final RegistrySetBuilder WORLD_BUILDER;
    public static final RegistrySetBuilder RELOADABLE_BUILDER;

    static
    {
        WORLD_BUILDER = new RegistrySetBuilder()
                .add(Registries.JUKEBOX_SONG, ModJukeboxSongs::bootstrap)
                .add(Registries.DAMAGE_TYPE, ModDamageTypes::bootstrap)
                .add(Registries.ENCHANTMENT, ModEnchantments::bootstrap)

                .add(Registries.VILLAGER_TRADE, ModVillagerTrades::bootstrap)
                .add(Registries.TRADE_SET, ModTradeSets::bootstrap);

        RELOADABLE_BUILDER = new RegistrySetBuilder()
                .add(Registries.LOOT_TABLE, new LootTableProvider(Set.of(), List.of(
                        new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK),
                        new LootTableProvider.SubProviderEntry(ModExtraLootProvider::new, LootContextParamSets.ALL_PARAMS),
                        new LootTableProvider.SubProviderEntry(ModEntityLootTableProvider::new, LootContextParamSets.ENTITY)
                )))
                .add(ModRecipeProvider.create());
    }
}