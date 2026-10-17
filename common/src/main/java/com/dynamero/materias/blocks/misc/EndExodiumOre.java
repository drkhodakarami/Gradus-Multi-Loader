/*
 * Copyright (c) 2025 Alireza Khodakarami
 *
 * Licensed under the MIT, (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://opensource.org/license/mit
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dynamero.materias.blocks.misc;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

import com.dynamero.materia.registries.base.ModBlocks;


public class EndExodiumOre extends Block
{
    public EndExodiumOre(Properties properties)
    {
        super(properties
                      .mapColor(MapColor.STONE)
                      .instrument(NoteBlockInstrument.BASEDRUM)
                      .strength(-1.0F, 0.0F));
    }

    @Override
    public void wasExploded(ServerLevel level, BlockPos pos, Explosion explosion)
    {
        level.setBlockAndUpdate(pos, ModBlocks.ORES.END_EXODIUM_CRACKED.defaultBlockState());
    }
}