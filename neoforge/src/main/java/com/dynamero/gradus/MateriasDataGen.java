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

package com.dynamero.gradus;

import static com.dynamero.gradus.MateriasConstants.LOG;

import net.neoforged.neoforge.data.event.GatherDataEvent;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;

import com.dynamero.contracts.exceptions.Exceptions;
import com.dynamero.gradus.datagen.base.*;
import com.dynamero.gradus.datagen.extra.ModGlobalLootModifierProvider;
import com.dynamero.gradus.datagen.extra.ModSoundsProvider;
import com.dynamero.gradus.datagen.misc.ModPaintingTagsProvider;
import com.dynamero.gradus.datagen.villagers.ModPOITags;
import com.dynamero.gradus.datagen.villagers.ModVillagerTradeTags;

public final class MateriasDataGen
{
    public MateriasDataGen()
    {
        Exceptions.throwCtorAssertion();
    }

    public static void onGatherClientData(GatherDataEvent.Client event)
    {
        LOG.logO("Generating Data: Client");
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getReloadableLookupProvider();

        generator.addProvider(true, new ModModelProvider(packOutput));
        generator.addProvider(true, new ModEnLanguageProvider(packOutput));

        generator.addProvider(true, new ModEquipmentAssetProvider(packOutput));

        generator.addProvider(true, new ModBlockTagProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModItemTagProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModPaintingTagsProvider(packOutput, lookupProvider));

        generator.addProvider(true, new ModSoundsProvider(packOutput));

        generator.addProvider(true, new ModVillagerTradeTags(packOutput, lookupProvider));
        generator.addProvider(true, new ModPOITags(packOutput, lookupProvider));

        generator.addProvider(true, new ModGlobalLootModifierProvider(packOutput, lookupProvider));

        generator.addProvider(true, new ModDataMapProvider(packOutput, lookupProvider));

        event.createWorldRegistryObjects(ModDatapackProvider.WORLD_BUILDER);
        event.createReloadableRegistryObjects(ModDatapackProvider.RELOADABLE_BUILDER);
    }
}