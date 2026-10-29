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

package com.dynamero.gradus.registries.base;

import static com.dynamero.gradus.MateriasConstants.*;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import com.dynamero.contracts.annotations.*;
import com.dynamero.contracts.exceptions.Exceptions;
import com.dynamero.gradus.platform.Services;
import com.dynamero.gradus.platform.services.utils.CreativeTabHandle;

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
    public static final CreativeTabHandle<CreativeModeTab> TAB;

    public ModCreativeTabs()
    {
        Exceptions.throwCtorAssertion();
    }

    static
    {
        TAB =
                Services.CREATIVE_TAB_REGISTRAR.register(
                        "materia_ingredients_tab",
                        CREATIVE_TAB,
                        () -> new ItemStack(ModBlocks.COUNTER_0.get()),// Lazy supplier for icon
                        output ->
                        {
                            output.accept(ModBlocks.COUNTER_0.get());
                            output.accept(ModBlocks.COUNTER_1.get());
                            output.accept(ModBlocks.COUNTER_2.get());
                            output.accept(ModBlocks.COUNTER_3.get());
                            output.accept(ModBlocks.COUNTER_4.get());
                            output.accept(ModBlocks.COUNTER_5.get());
                            output.accept(ModBlocks.COUNTER_6.get());
                            output.accept(ModBlocks.COUNTER_7.get());
                            output.accept(ModBlocks.COUNTER_8.get());
                            output.accept(ModBlocks.COUNTER_9.get());

                            output.accept(ModBlocks.COUNTER_10.get());
                            output.accept(ModBlocks.COUNTER_11.get());
                            output.accept(ModBlocks.COUNTER_12.get());
                            output.accept(ModBlocks.COUNTER_13.get());
                            output.accept(ModBlocks.COUNTER_14.get());
                            output.accept(ModBlocks.COUNTER_15.get());
                            output.accept(ModBlocks.COUNTER_16.get());
                            output.accept(ModBlocks.COUNTER_17.get());
                            output.accept(ModBlocks.COUNTER_18.get());
                            output.accept(ModBlocks.COUNTER_19.get());

                            output.accept(ModBlocks.COUNTER_20.get());
                            output.accept(ModBlocks.COUNTER_21.get());
                            output.accept(ModBlocks.COUNTER_22.get());
                            output.accept(ModBlocks.COUNTER_23.get());
                            output.accept(ModBlocks.COUNTER_24.get());
                            output.accept(ModBlocks.COUNTER_25.get());
                            output.accept(ModBlocks.COUNTER_26.get());
                            output.accept(ModBlocks.COUNTER_27.get());
                            output.accept(ModBlocks.COUNTER_28.get());
                            output.accept(ModBlocks.COUNTER_29.get());

                            output.accept(ModBlocks.COUNTER_30.get());
                            output.accept(ModBlocks.COUNTER_31.get());
                            output.accept(ModBlocks.COUNTER_32.get());
                            output.accept(ModBlocks.COUNTER_33.get());
                            output.accept(ModBlocks.COUNTER_34.get());
                            output.accept(ModBlocks.COUNTER_35.get());
                            output.accept(ModBlocks.COUNTER_36.get());
                            output.accept(ModBlocks.COUNTER_37.get());
                            output.accept(ModBlocks.COUNTER_38.get());
                            output.accept(ModBlocks.COUNTER_39.get());

                            output.accept(ModBlocks.COUNTER_40.get());
                            output.accept(ModBlocks.COUNTER_41.get());
                            output.accept(ModBlocks.COUNTER_42.get());
                            output.accept(ModBlocks.COUNTER_43.get());
                            output.accept(ModBlocks.COUNTER_44.get());
                            output.accept(ModBlocks.COUNTER_45.get());
                            output.accept(ModBlocks.COUNTER_46.get());
                            output.accept(ModBlocks.COUNTER_47.get());
                            output.accept(ModBlocks.COUNTER_48.get());
                            output.accept(ModBlocks.COUNTER_49.get());

                            output.accept(ModBlocks.COUNTER_50.get());
                        });
    }

    public static void load()
    {}
}