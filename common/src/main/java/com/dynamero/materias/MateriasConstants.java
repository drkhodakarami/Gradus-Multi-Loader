package com.dynamero.materias;

import com.dynamero.contracts.annotations.*;
import com.dynamero.contracts.logger.Logger;
import com.dynamero.materias.utils.BEKeys;
import com.dynamero.materias.utils.BaseHelper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

@SuppressWarnings("SameParameterValue")
public class MateriasConstants
{
    public static final String MODID = "materias";
    public static final String MOD_NAME = "Materias";
    public static final Logger LOG = new Logger(MOD_NAME, true);

    public static final String DCLR_ERROR_ID = "dclr.error";
    public static final String DCLR_START_ID = "dclr.start";
    public static final String DCLR_END_ID = "dclr.end";

    public static final MutableComponent INGREDIENTS_CREATIVE_TAB = Component.translatable("creativetab.materia.ingredients");
    public static final MutableComponent COMPONENTS_CREATIVE_TAB = Component.translatable("creativetab.materia.components");
    public static final MutableComponent BLOCKS_CREATIVE_TAB = Component.translatable("creativetab.materia.blocks");
    public static final MutableComponent MISC_CREATIVE_TAB = Component.translatable("creativetab.materia.misc");

    //region TAGS
    public static final TagKey<Block> GEM_BLOCKS = createBlockCommonTag("gems");
    public static final TagKey<Block> RED_GEM_BLOCKS = createBlockCommonTag("red_gems");
    public static final TagKey<Block> YELLOW_GEM_BLOCKS = createBlockCommonTag("yellow_gems");
    public static final TagKey<Block> BLUE_GEM_BLOCKS = createBlockCommonTag("blue_gems");

    public static final TagKey<Block> ORES = createBlockCommonTag("ores");
    public static final TagKey<Block> COMPRESSED = createBlockCommonTag("compressed");

    public static final TagKey<Item> GEMS = createItemCommonTag("gems");
    public static final TagKey<Item> RED_GEMS = createItemCommonTag("red_gems");
    public static final TagKey<Item> YELLOW_GEMS = createItemCommonTag("yellow_gems");
    public static final TagKey<Item> BLUE_GEMS = createItemCommonTag("blue_gems");


    public static final TagKey<Item> RAWS = createItemCommonTag("raws");
    public static final TagKey<Item> GEARS = createItemCommonTag("gears");
    public static final TagKey<Item> RED_GEM_GEARS = createItemCommonTag("red_gem_gears");
    public static final TagKey<Item> YELLOW_GEM_GEARS = createItemCommonTag("yellow_gem_gears");
    public static final TagKey<Item> BLUE_GEM_GEARS = createItemCommonTag("blue_gem_gears");
    public static final TagKey<Item> INGOTS = createItemCommonTag("ingots");
    public static final TagKey<Item> PLATES = createItemCommonTag("plates");
    public static final TagKey<Item> REINFORCED = createItemCommonTag("reinforced");
    public static final TagKey<Item> RODS = createItemCommonTag("rods");

    public static final TagKey<Block> VANILLA_ORE = createBlockCommonTag("vanilla_ores");
    public static final TagKey<Block> MOD_ORE = createBlockTag("materia_ores");
    public static final TagKey<Block> DCLR_BORDER_REPLACE = createBlockTag("dclr_border_replacements");

    public static final TagKey<Block> RUBBER_LOGS_BLOCK_TAG = createBlockTag("rubber_logs");
    public static final TagKey<Item> RUBBER_LOGS_ITEM_TAG = createItemTag("rubber_logs");
    //endregion

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