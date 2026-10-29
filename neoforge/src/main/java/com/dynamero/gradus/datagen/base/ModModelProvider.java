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

import static com.dynamero.gradus.MateriasConstants.*;
import static net.minecraft.client.data.models.BlockModelGenerators.createBooleanModelDispatch;
import static net.minecraft.client.data.models.BlockModelGenerators.plainVariant;

import java.util.function.BiConsumer;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.jspecify.annotations.NonNull;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.model.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Block;

import com.dynamero.gradus.blocks.BaseBlock;
import com.dynamero.gradus.registries.base.ModBlocks;

public class ModModelProvider extends ModelProvider
{
    public ModModelProvider(PackOutput output)
    {
        super(output, MODID);
    }

    @Override
    protected void registerModels(@NonNull BlockModelGenerators blockModels, @NonNull ItemModelGenerators itemModels)
    {
        registerBlockModels(blockModels);
        registerItemModels(itemModels);
    }

    private void registerBlockModels(BlockModelGenerators generators)
    {
        LOG.logBlockModelDatagen();

        generate(generators, ModBlocks.COUNTER_0.get());
        generate(generators, ModBlocks.COUNTER_1.get());
        generate(generators, ModBlocks.COUNTER_2.get());
        generate(generators, ModBlocks.COUNTER_3.get());
        generate(generators, ModBlocks.COUNTER_4.get());
        generate(generators, ModBlocks.COUNTER_5.get());
        generate(generators, ModBlocks.COUNTER_6.get());
        generate(generators, ModBlocks.COUNTER_7.get());
        generate(generators, ModBlocks.COUNTER_8.get());
        generate(generators, ModBlocks.COUNTER_9.get());

        generate(generators, ModBlocks.COUNTER_10.get());
        generate(generators, ModBlocks.COUNTER_11.get());
        generate(generators, ModBlocks.COUNTER_12.get());
        generate(generators, ModBlocks.COUNTER_13.get());
        generate(generators, ModBlocks.COUNTER_14.get());
        generate(generators, ModBlocks.COUNTER_15.get());
        generate(generators, ModBlocks.COUNTER_16.get());
        generate(generators, ModBlocks.COUNTER_17.get());
        generate(generators, ModBlocks.COUNTER_18.get());
        generate(generators, ModBlocks.COUNTER_19.get());

        generate(generators, ModBlocks.COUNTER_20.get());
        generate(generators, ModBlocks.COUNTER_21.get());
        generate(generators, ModBlocks.COUNTER_22.get());
        generate(generators, ModBlocks.COUNTER_23.get());
        generate(generators, ModBlocks.COUNTER_24.get());
        generate(generators, ModBlocks.COUNTER_25.get());
        generate(generators, ModBlocks.COUNTER_26.get());
        generate(generators, ModBlocks.COUNTER_27.get());
        generate(generators, ModBlocks.COUNTER_28.get());
        generate(generators, ModBlocks.COUNTER_29.get());

        generate(generators, ModBlocks.COUNTER_30.get());
        generate(generators, ModBlocks.COUNTER_31.get());
        generate(generators, ModBlocks.COUNTER_32.get());
        generate(generators, ModBlocks.COUNTER_33.get());
        generate(generators, ModBlocks.COUNTER_34.get());
        generate(generators, ModBlocks.COUNTER_35.get());
        generate(generators, ModBlocks.COUNTER_36.get());
        generate(generators, ModBlocks.COUNTER_37.get());
        generate(generators, ModBlocks.COUNTER_38.get());
        generate(generators, ModBlocks.COUNTER_39.get());

        generate(generators, ModBlocks.COUNTER_40.get());
        generate(generators, ModBlocks.COUNTER_41.get());
        generate(generators, ModBlocks.COUNTER_42.get());
        generate(generators, ModBlocks.COUNTER_43.get());
        generate(generators, ModBlocks.COUNTER_44.get());
        generate(generators, ModBlocks.COUNTER_45.get());
        generate(generators, ModBlocks.COUNTER_46.get());
        generate(generators, ModBlocks.COUNTER_47.get());
        generate(generators, ModBlocks.COUNTER_48.get());
        generate(generators, ModBlocks.COUNTER_49.get());

        generate(generators, ModBlocks.COUNTER_50.get());
    }

    private void registerItemModels(ItemModelGenerators generators)
    {
        LOG.logItemModelDatagen();
    }

    private static void generate(BlockModelGenerators generators, Block block)
    {
        Identifier onModelLoc = emissive(block, generators.modelOutput);

        MultiVariant off = plainVariant(TexturedModel.CUBE.create(block, generators.modelOutput));
        MultiVariant on = plainVariant(onModelLoc);

        generators.blockStateOutput.accept(MultiVariantGenerator.dispatch(block)
                                                                .with(createBooleanModelDispatch(BaseBlock.LIT,
                                                                                                 on,
                                                                                                 off)));
    }

    private static Identifier emissive(Block block, BiConsumer<Identifier, ModelInstance> modelOutput)
    {

        Identifier blockId = BuiltInRegistries.BLOCK.getKey(block);

        Identifier modelId = BuiltInRegistries.BLOCK.getKey(block).withPrefix("block/").withSuffix("_on");

        Identifier baseTexture = blockId.withPrefix("block/").withSuffix("_on");
        Identifier emissiveTexture = blockId.withPrefix("block/").withSuffix("_emissive");


        modelOutput.accept(modelId, () ->
        {
            JsonObject root = new JsonObject();
            JsonArray elements = new JsonArray();

            JsonArray from = new JsonArray();
            from.add(0);
            from.add(0);
            from.add(0);
            JsonArray to = new JsonArray();
            to.add(16);
            to.add(16);
            to.add(16);
            JsonArray uv = new JsonArray();
            uv.add(0);
            uv.add(0);
            uv.add(16);
            uv.add(16);
            String[] faces = {"down", "up", "north", "south", "west", "east"};

            JsonObject baseElement = new JsonObject();
            baseElement.add("from", from);
            baseElement.add("to", to);
            JsonObject baseFaces = new JsonObject();
            for (String face : faces)
            {
                JsonObject fc = new JsonObject();
                fc.addProperty("texture", "#base");
                fc.addProperty("cullface", face);
                fc.add("uv", uv);
                baseFaces.add(face, fc);
            }
            baseElement.add("faces", baseFaces);
            elements.add(baseElement);

            JsonObject emissiveElement = new JsonObject();
            emissiveElement.add("from", from);
            emissiveElement.add("to", to);
            emissiveElement.addProperty("shade", false);
            emissiveElement.addProperty("light_emission", 15);
            JsonObject emissiveFaces = new JsonObject();

            for (String face : faces)
            {
                JsonObject fc = new JsonObject();
                fc.addProperty("texture", "#emissive");
                fc.addProperty("cullface", face);
                fc.add("uv", uv);
                emissiveFaces.add(face, fc);
            }
            emissiveElement.add("faces", emissiveFaces);
            elements.add(emissiveElement);

            root.add("elements", elements);

            JsonObject textures = new JsonObject();
            textures.addProperty("base", baseTexture.toString());
            textures.addProperty("emissive", emissiveTexture.toString());
            textures.addProperty("particle", baseTexture.toString());
            root.add("textures", textures);

            return root;
        });

        return modelId;
    }
}