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

/*import dev.thementor.api.jilibsbase.block.AbstractBaseBlock;
import dev.thementor.api.jilibsshared.properties.BlockProperties;*/
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Alimentor extends Block//AbstractBaseBlock
{

    /*public AnimalFeed(Properties settings)
    {
        super(settings, new BlockProperties<>());

        VoxelShape SHAPE = Shapes.box(0, 0, 0, 1, 0.5, 1);

        this.properties
            .setConstantShape(SHAPE);
    }*/

    public static final VoxelShape SHAPE = Shapes.box(0, 0, 0, 1, 0.5, 1);

    public Alimentor(Properties properties)
    {
        super(properties);
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context)
    {
        return SHAPE;
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context)
    {
        return SHAPE;
    }

    @Override
    protected boolean useShapeForLightOcclusion(final BlockState state) {
        return true;
    }
}