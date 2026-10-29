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


import java.util.Set;

import org.jspecify.annotations.NonNull;

import net.minecraft.core.Holder;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import com.dynamero.gradus.MateriasConstants;
import com.dynamero.gradus.platform.services.registrars.NeoForgeBlockRegisterar;
import com.dynamero.gradus.registries.base.ModBlocks;

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

        dropSelf(ModBlocks.COUNTER_0.get());
        dropSelf(ModBlocks.COUNTER_1.get());
        dropSelf(ModBlocks.COUNTER_2.get());
        dropSelf(ModBlocks.COUNTER_3.get());
        dropSelf(ModBlocks.COUNTER_4.get());
        dropSelf(ModBlocks.COUNTER_5.get());
        dropSelf(ModBlocks.COUNTER_6.get());
        dropSelf(ModBlocks.COUNTER_7.get());
        dropSelf(ModBlocks.COUNTER_8.get());
        dropSelf(ModBlocks.COUNTER_9.get());

        dropSelf(ModBlocks.COUNTER_10.get());
        dropSelf(ModBlocks.COUNTER_11.get());
        dropSelf(ModBlocks.COUNTER_12.get());
        dropSelf(ModBlocks.COUNTER_13.get());
        dropSelf(ModBlocks.COUNTER_14.get());
        dropSelf(ModBlocks.COUNTER_15.get());
        dropSelf(ModBlocks.COUNTER_16.get());
        dropSelf(ModBlocks.COUNTER_17.get());
        dropSelf(ModBlocks.COUNTER_18.get());
        dropSelf(ModBlocks.COUNTER_19.get());

        dropSelf(ModBlocks.COUNTER_20.get());
        dropSelf(ModBlocks.COUNTER_21.get());
        dropSelf(ModBlocks.COUNTER_22.get());
        dropSelf(ModBlocks.COUNTER_23.get());
        dropSelf(ModBlocks.COUNTER_24.get());
        dropSelf(ModBlocks.COUNTER_25.get());
        dropSelf(ModBlocks.COUNTER_26.get());
        dropSelf(ModBlocks.COUNTER_27.get());
        dropSelf(ModBlocks.COUNTER_28.get());
        dropSelf(ModBlocks.COUNTER_29.get());

        dropSelf(ModBlocks.COUNTER_30.get());
        dropSelf(ModBlocks.COUNTER_31.get());
        dropSelf(ModBlocks.COUNTER_32.get());
        dropSelf(ModBlocks.COUNTER_33.get());
        dropSelf(ModBlocks.COUNTER_34.get());
        dropSelf(ModBlocks.COUNTER_35.get());
        dropSelf(ModBlocks.COUNTER_36.get());
        dropSelf(ModBlocks.COUNTER_37.get());
        dropSelf(ModBlocks.COUNTER_38.get());
        dropSelf(ModBlocks.COUNTER_39.get());

        dropSelf(ModBlocks.COUNTER_40.get());
        dropSelf(ModBlocks.COUNTER_41.get());
        dropSelf(ModBlocks.COUNTER_42.get());
        dropSelf(ModBlocks.COUNTER_43.get());
        dropSelf(ModBlocks.COUNTER_44.get());
        dropSelf(ModBlocks.COUNTER_45.get());
        dropSelf(ModBlocks.COUNTER_46.get());
        dropSelf(ModBlocks.COUNTER_47.get());
        dropSelf(ModBlocks.COUNTER_48.get());
        dropSelf(ModBlocks.COUNTER_49.get());

        dropSelf(ModBlocks.COUNTER_50.get());
    }

    @Override
    protected @NonNull Iterable<Block> getKnownBlocks()
    {
        return NeoForgeBlockRegisterar.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}