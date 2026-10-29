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

import java.util.Objects;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.NotNull;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import com.dynamero.contracts.logger.Logger;
import com.dynamero.gradus.utils.BEKeys;
import com.dynamero.gradus.utils.BaseHelper;

@SuppressWarnings("SameParameterValue")
public class MateriasConstants
{
    public static final String MODID = "gradus";
    public static final String MOD_NAME = "Gradus";
    public static final Logger LOG = new Logger(MOD_NAME, true);

    public static final String CREATIVE_TAB_PREFIX = "itemGroup";
    public static final String CREATIVE_TAB = "gradus";

    //region METHODS
    public static Identifier id(String name)
    {
        return Identifier.fromNamespaceAndPath(MODID, name);
    }

    /**
     * Creates a Gson instance for pretty printing and disabling HTML escaping.
     *
     */
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    /**
     * Retrieves a registry key for the given name and registry.
     *
     * @param <T> The type of the registry entries.
     * @param name The name of the registry entry.
     * @param registryKey The registry key.
     * @return A registry key for the specified name and registry.
     */
    public static <T> ResourceKey<T> key(String name, ResourceKey<? extends Registry<T>> registryKey)
    {
        return BaseHelper.ResourceKeys.create(MODID, name, registryKey);
    }

    /**
     * Creates an identifier for a vanilla Minecraft path.
     *
     * @param path The path of the identifier.
     * @return An Identifier instance for the specified path.
     */
    public static Identifier vanillaID(@NotNull String path)
    {
        return Identifier.withDefaultNamespace(path);
    }

    /**
     * Creates an identifier from a given path.
     *
     * @param path The path of the identifier.
     * @return An Identifier instance for the specified path.
     */
    public static Identifier idOf(@NotNull String path)
    {
        return Objects.requireNonNull(Identifier.tryParse(path));
    }

    /**
     * Translates a key into a mod-specific text message with optional parameters.
     *
     * @param key The translation key.
     * @param params Optional parameters for the translation.
     * @return A MutableText instance representing the translated message.
     */
    public static MutableComponent translate(String key, Object... params)
    {
        return Component.translatable(MODID + "." + key, params);
    }

    /**
     * Translates a key into a mod-specific text message within a container with optional parameters.
     *
     * @param key The translation key.
     * @param params Optional parameters for the translation.
     * @return A MutableText instance representing the translated message in a container.
     */
    public static MutableComponent translateContainer(String key, Object... params)
    {
        return Component.translatable(MODID + ".container." + key, params);
    }

    /**
     * Retrieves a key for energy amount storage.
     *
     * @return The key for energy amount storage.
     */
    public static String energyAmountKey()
    {
        return MODID + BEKeys.ENERGY_AMOUNT;
    }

    /**
     * Retrieves a key for energy capacity storage.
     *
     * @return The key for energy capacity storage.
     */
    public static String energyCapacityKey()
    {
        return MODID + BEKeys.ENERGY_CAPACITY;
    }

    /**
     * Retrieves a key indicating if the component has energy.
     *
     * @return The key indicating if the component has energy.
     */
    public static String hasEnergyKey()
    {
        return MODID + BEKeys.HAS_ENERGY;
    }

    /**
     * Retrieves a key for fluid amount storage.
     *
     * @return The key for fluid amount storage.
     */
    public static String fluidAmountKey()
    {
        return MODID + BEKeys.FLUID_AMOUNT;
    }

    /**
     * Retrieves a key for fluid capacity storage.
     *
     * @return The key for fluid capacity storage.
     */
    public static String fluidCapacityKey()
    {
        return MODID + BEKeys.FLUID_CAPACITY;
    }

    /**
     * Retrieves a key indicating if the component has fluid.
     *
     * @return The key indicating if the component has fluid.
     */
    public static String hasFluidKey()
    {
        return MODID + BEKeys.HAS_FLUID;
    }

    /**
     * Retrieves a key for progress amount storage.
     *
     * @return The key for progress amount storage.
     */
    public static String progressAmountKey()
    {
        return MODID + BEKeys.PROGRESS_AMOUNT;
    }

    /**
     * Retrieves a key for maximum progress storage.
     *
     * @return The key for maximum progress storage.
     */
    public static String maxProgressKey()
    {
        return MODID + BEKeys.PROGRESS_MAX;
    }

    /**
     * Retrieves a key for cooldown amount storage.
     *
     * @return The key for cooldown amount storage.
     */
    public static String cooldownAmountKey()
    {
        return MODID + BEKeys.COOLDOWN_AMOUNT;
    }

    /**
     * Retrieves a key for maximum cooldown storage.
     *
     * @return The key for maximum cooldown storage.
     */
    public static String maxCooldownKey()
    {
        return MODID + BEKeys.COOLDOWN_MAX;
    }

    /**
     * Retrieves a key for burn amount storage.
     *
     * @return The key for burn amount storage.
     */
    public static String burnAmountKey()
    {
        return MODID + BEKeys.BURN_AMOUNT;
    }

    /**
     * Retrieves a key for maximum burn storage.
     *
     * @return The key for maximum burn storage.
     */
    public static String maxBurnKey()
    {
        return MODID + BEKeys.BURN_MAX;
    }

    /**
     * Retrieves a key indicating if the component has an inventory.
     *
     * @return The key indicating if the component has an inventory.
     */
    public static String hasInventoryKey()
    {
        return MODID + BEKeys.HAS_INVENTORY;
    }

    /**
     * Retrieves a key for dirty status.
     *
     * @return The key for dirty status.
     */
    public static String dirtyKey()
    {
        return MODID + BEKeys.IS_DIRTY;
    }

    /**
     * Retrieves a key for dirty client status.
     *
     * @return The key for dirty client status.
     */
    public static String dirtyClientKey()
    {
        return MODID + BEKeys.IS_DIRTY_CLIENT;
    }

    /**
     * Retrieves a key for world data storage.
     *
     * @return The key for world data storage.
     */
    public static String worldKey()
    {
        return MODID + BEKeys.WORLD;
    }

    /**
     * Retrieves a key for position data storage.
     *
     * @return The key for position data storage.
     */
    public static String posKey()
    {
        return MODID + BEKeys.POS;
    }

    /**
     * Retrieves a key for cached state data storage.
     *
     * @return The key for cached state data storage.
     */
    public static String cachedStateKey()
    {
        return MODID + BEKeys.CACHED_STATE;
    }

    /**
     * Retrieves a key for ticks data storage (duplicate of dirtyKey).
     *
     * @return The key for ticks data storage.
     */
    public static String ticksKey()
    {
        return MODID + BEKeys.IS_DIRTY;
    }

    /**
     * Retrieves a key for ticks client data storage (duplicate of dirtyClientKey).
     *
     * @return The key for ticks client data storage.
     */
    public static String ticksClientKey()
    {
        return MODID + BEKeys.IS_DIRTY;
    }

    /**
     * Creates a block tag with the specified name.
     *
     * @param name The name of the block tag.
     * @return A TagKey instance for the specified block tag.
     */
    private static TagKey<Block> createBlockTag(String name)
    {
        return TagKey.create(Registries.BLOCK, id(name));
    }

    /**
     * Creates a common block tag with the specified name.
     *
     * @param name The name of the common block tag.
     * @return A TagKey instance for the specified common block tag.
     */
    private static TagKey<Block> createBlockCommonTag(String name)
    {
        return TagKey.create(Registries.BLOCK, Objects.requireNonNull(Identifier.tryBuild("c", name)));
    }

    /**
     * Creates an item tag with the specified name.
     *
     * @param name The name of the item tag.
     * @return A TagKey instance for the specified item tag.
     */
    private static TagKey<Item> createItemTag(String name)
    {
        return TagKey.create(Registries.ITEM, id(name));
    }

    /**
     * Creates a common item tag with the specified name.
     *
     * @param name The name of the common item tag.
     * @return A TagKey instance for the specified common item tag.
     */
    private static TagKey<Item> createItemCommonTag(String name)
    {
        return TagKey.create(Registries.ITEM, Objects.requireNonNull(Identifier.tryBuild("c", name)));
    }

    /**
     * Creates an entity tag with the specified name.
     *
     * @param name The name of the entity tag.
     * @return A TagKey instance for the specified entity tag.
     */
    private static TagKey<EntityType<?>> createEntityTag(String name)
    {
        return TagKey.create(Registries.ENTITY_TYPE, id(name));
    }

    /**
     * Creates a common entity tag with the specified name.
     *
     * @param name The name of the common entity tag.
     * @return A TagKey instance for the specified common entity tag.
     */
    private static TagKey<EntityType<?>> createEntityCommonTag(String name)
    {
        return TagKey.create(Registries.ENTITY_TYPE, Objects.requireNonNull(Identifier.tryBuild("c", name)));
    }
    //endregion
}