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

import static com.dynamero.gradus.MateriasConstants.LOG;
import static com.dynamero.gradus.MateriasConstants.MODID;

import net.neoforged.neoforge.common.data.LanguageProvider;

import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;

import com.dynamero.gradus.registries.base.ModBlocks;
import com.dynamero.gradus.registries.base.ModCreativeTabs;

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

        add(ModBlocks.COUNTER_0.get(), "Counter (0)");
        add(ModBlocks.COUNTER_1.get(), "Counter (1)");
        add(ModBlocks.COUNTER_2.get(), "Counter (2)");
        add(ModBlocks.COUNTER_3.get(), "Counter (3)");
        add(ModBlocks.COUNTER_4.get(), "Counter (4)");
        add(ModBlocks.COUNTER_5.get(), "Counter (5)");
        add(ModBlocks.COUNTER_6.get(), "Counter (6)");
        add(ModBlocks.COUNTER_7.get(), "Counter (7)");
        add(ModBlocks.COUNTER_8.get(), "Counter (8)");
        add(ModBlocks.COUNTER_9.get(), "Counter (9)");

        add(ModBlocks.COUNTER_10.get(), "Counter (10)");
        add(ModBlocks.COUNTER_11.get(), "Counter (11)");
        add(ModBlocks.COUNTER_12.get(), "Counter (12)");
        add(ModBlocks.COUNTER_13.get(), "Counter (13)");
        add(ModBlocks.COUNTER_14.get(), "Counter (14)");
        add(ModBlocks.COUNTER_15.get(), "Counter (15)");
        add(ModBlocks.COUNTER_16.get(), "Counter (16)");
        add(ModBlocks.COUNTER_17.get(), "Counter (17)");
        add(ModBlocks.COUNTER_18.get(), "Counter (18)");
        add(ModBlocks.COUNTER_19.get(), "Counter (19)");

        add(ModBlocks.COUNTER_20.get(), "Counter (20)");
        add(ModBlocks.COUNTER_21.get(), "Counter (21)");
        add(ModBlocks.COUNTER_22.get(), "Counter (22)");
        add(ModBlocks.COUNTER_23.get(), "Counter (23)");
        add(ModBlocks.COUNTER_24.get(), "Counter (24)");
        add(ModBlocks.COUNTER_25.get(), "Counter (25)");
        add(ModBlocks.COUNTER_26.get(), "Counter (26)");
        add(ModBlocks.COUNTER_27.get(), "Counter (27)");
        add(ModBlocks.COUNTER_28.get(), "Counter (28)");
        add(ModBlocks.COUNTER_29.get(), "Counter (29)");

        add(ModBlocks.COUNTER_30.get(), "Counter (30)");
        add(ModBlocks.COUNTER_31.get(), "Counter (31)");
        add(ModBlocks.COUNTER_32.get(), "Counter (32)");
        add(ModBlocks.COUNTER_33.get(), "Counter (33)");
        add(ModBlocks.COUNTER_34.get(), "Counter (34)");
        add(ModBlocks.COUNTER_35.get(), "Counter (35)");
        add(ModBlocks.COUNTER_36.get(), "Counter (36)");
        add(ModBlocks.COUNTER_37.get(), "Counter (37)");
        add(ModBlocks.COUNTER_38.get(), "Counter (38)");
        add(ModBlocks.COUNTER_39.get(), "Counter (39)");

        add(ModBlocks.COUNTER_40.get(), "Counter (40)");
        add(ModBlocks.COUNTER_41.get(), "Counter (41)");
        add(ModBlocks.COUNTER_42.get(), "Counter (42)");
        add(ModBlocks.COUNTER_43.get(), "Counter (43)");
        add(ModBlocks.COUNTER_44.get(), "Counter (44)");
        add(ModBlocks.COUNTER_45.get(), "Counter (45)");
        add(ModBlocks.COUNTER_46.get(), "Counter (46)");
        add(ModBlocks.COUNTER_47.get(), "Counter (47)");
        add(ModBlocks.COUNTER_48.get(), "Counter (48)");
        add(ModBlocks.COUNTER_49.get(), "Counter (49)");

        add(ModBlocks.COUNTER_50.get(), "Counter (50)");

        add(ModCreativeTabs.TAB.get().getDisplayName(), "Gradus");
    }

    private void add(Component component, String value)
    {
        if(component.getContents() instanceof TranslatableContents translatableContents)
            add(translatableContents.getKey(), value);
    }
}