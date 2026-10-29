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

import static com.dynamero.gradus.MateriasConstants.LOG;

import net.minecraft.world.level.block.*;

import com.dynamero.contracts.annotations.*;
import com.dynamero.contracts.exceptions.Exceptions;
import com.dynamero.gradus.blocks.BaseBlock;
import com.dynamero.gradus.platform.Services;
import com.dynamero.gradus.platform.services.utils.BlockHandle;

@Developer("TheMentor")
@CreatedAt("2026-10-16")
@ModifiedAt("2026-10-16")
@ModifiedBy("TheMentor")
@Website("https://dynamero.com")
@Repository("https://github.com/drkhodakarami/")
@Discord("https://discord.gg/pmM4emCbuH")
@Youtube("https://www.youtube.com/@TheMentorCodeLab")
@Modrinth("https://modrinth.com/user/jiraiyah")
public class ModBlocks
{
    public static final BlockHandle<Block>
            COUNTER_0,
            COUNTER_1, COUNTER_2, COUNTER_3, COUNTER_4, COUNTER_5, COUNTER_6, COUNTER_7, COUNTER_8, COUNTER_9, COUNTER_10,
            COUNTER_11, COUNTER_12, COUNTER_13, COUNTER_14, COUNTER_15, COUNTER_16, COUNTER_17, COUNTER_18, COUNTER_19, COUNTER_20,
            COUNTER_21, COUNTER_22, COUNTER_23, COUNTER_24, COUNTER_25, COUNTER_26, COUNTER_27, COUNTER_28, COUNTER_29, COUNTER_30,
            COUNTER_31, COUNTER_32, COUNTER_33, COUNTER_34, COUNTER_35, COUNTER_36, COUNTER_37, COUNTER_38, COUNTER_39, COUNTER_40,
            COUNTER_41, COUNTER_42, COUNTER_43, COUNTER_44, COUNTER_45, COUNTER_46, COUNTER_47, COUNTER_48, COUNTER_49, COUNTER_50
            ;

    public ModBlocks()
    {
        Exceptions.throwCtorAssertion();
    }

    static
    {
        COUNTER_0 = Services.BLOCKS.registerCopy("counter_0", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_1 = Services.BLOCKS.registerCopy("counter_1", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_2 = Services.BLOCKS.registerCopy("counter_2", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_3 = Services.BLOCKS.registerCopy("counter_3", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_4 = Services.BLOCKS.registerCopy("counter_4", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_5 = Services.BLOCKS.registerCopy("counter_5", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_6 = Services.BLOCKS.registerCopy("counter_6", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_7 = Services.BLOCKS.registerCopy("counter_7", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_8 = Services.BLOCKS.registerCopy("counter_8", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_9 = Services.BLOCKS.registerCopy("counter_9", Blocks.WOOL.magenta(), BaseBlock::new);

        COUNTER_10 = Services.BLOCKS.registerCopy("counter_10", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_11 = Services.BLOCKS.registerCopy("counter_11", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_12 = Services.BLOCKS.registerCopy("counter_12", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_13 = Services.BLOCKS.registerCopy("counter_13", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_14 = Services.BLOCKS.registerCopy("counter_14", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_15 = Services.BLOCKS.registerCopy("counter_15", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_16 = Services.BLOCKS.registerCopy("counter_16", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_17 = Services.BLOCKS.registerCopy("counter_17", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_18 = Services.BLOCKS.registerCopy("counter_18", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_19 = Services.BLOCKS.registerCopy("counter_19", Blocks.WOOL.magenta(), BaseBlock::new);

        COUNTER_20 = Services.BLOCKS.registerCopy("counter_20", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_21 = Services.BLOCKS.registerCopy("counter_21", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_22 = Services.BLOCKS.registerCopy("counter_22", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_23 = Services.BLOCKS.registerCopy("counter_23", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_24 = Services.BLOCKS.registerCopy("counter_24", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_25 = Services.BLOCKS.registerCopy("counter_25", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_26 = Services.BLOCKS.registerCopy("counter_26", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_27 = Services.BLOCKS.registerCopy("counter_27", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_28 = Services.BLOCKS.registerCopy("counter_28", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_29 = Services.BLOCKS.registerCopy("counter_29", Blocks.WOOL.magenta(), BaseBlock::new);

        COUNTER_30 = Services.BLOCKS.registerCopy("counter_30", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_31 = Services.BLOCKS.registerCopy("counter_31", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_32 = Services.BLOCKS.registerCopy("counter_32", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_33 = Services.BLOCKS.registerCopy("counter_33", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_34 = Services.BLOCKS.registerCopy("counter_34", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_35 = Services.BLOCKS.registerCopy("counter_35", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_36 = Services.BLOCKS.registerCopy("counter_36", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_37 = Services.BLOCKS.registerCopy("counter_37", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_38 = Services.BLOCKS.registerCopy("counter_38", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_39 = Services.BLOCKS.registerCopy("counter_39", Blocks.WOOL.magenta(), BaseBlock::new);

        COUNTER_40 = Services.BLOCKS.registerCopy("counter_40", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_41 = Services.BLOCKS.registerCopy("counter_41", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_42 = Services.BLOCKS.registerCopy("counter_42", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_43 = Services.BLOCKS.registerCopy("counter_43", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_44 = Services.BLOCKS.registerCopy("counter_44", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_45 = Services.BLOCKS.registerCopy("counter_45", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_46 = Services.BLOCKS.registerCopy("counter_46", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_47 = Services.BLOCKS.registerCopy("counter_47", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_48 = Services.BLOCKS.registerCopy("counter_48", Blocks.WOOL.magenta(), BaseBlock::new);
        COUNTER_49 = Services.BLOCKS.registerCopy("counter_49", Blocks.WOOL.magenta(), BaseBlock::new);

        COUNTER_50 = Services.BLOCKS.registerCopy("counter_50", Blocks.WOOL.magenta(), BaseBlock::new);
    }

    public static void load()
    {
        LOG.logBlockInit();
    }
}