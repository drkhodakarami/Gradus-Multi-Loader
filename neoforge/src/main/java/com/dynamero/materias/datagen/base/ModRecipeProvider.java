package com.dynamero.materias.datagen.base;

import com.dynamero.materias.MateriasConstants;
import com.dynamero.materias.platform.services.utils.BlockHandle;
import com.dynamero.materias.registries.base.ModBlocks;
import com.dynamero.materias.registries.base.ModItems;
import com.dynamero.materias.utils.BaseHelper;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.registries.MultiRegistryBootstrap;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

import java.util.List;
import java.util.Map;

import static com.dynamero.materias.MateriasConstants.*;

@SuppressWarnings("SameParameterValue")
public class ModRecipeProvider extends RecipeProvider
{
    protected ModRecipeProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput)
    {
        super(recipeOutput, advancementOutput);
    }

    public static MultiRegistryBootstrap create()
    {
        return RecipeProvider.asBootstrap(ModRecipeProvider::new);
    }

    @Override
    protected void buildRecipes()
    {
        LOG.logRecipeDatagen();

        oreSmelting(List.of(ModItems.RAW_EXODIUM.get()),
                    RecipeCategory.MISC,
                    CookingBookCategory.MISC,
                    ModItems.INGOT_EXODIUM.get(),
                    0.5F,
                    1200,
                    "materia"
        );

        SimpleCookingRecipeBuilder.campfireCooking(
                                          Ingredient.of(Items.EGG),
                                          RecipeCategory.FOOD,
                                          ModItems.COOKED_EGG.get(),
                                          0.15F,
                                          300 // 15 seconds
                                  )
                                  .unlockedBy(RecipeProvider.getHasName(Items.EGG), has(Items.EGG))
                                  .save(output, id("campfire_cooked_egg_from_egg").toString());

        SimpleCookingRecipeBuilder.campfireCooking(
                                          Ingredient.of(ModItems.RAW_RUBBER.get()),
                                          RecipeCategory.MISC,
                                          ModItems.RUBBER.get(),
                                          0.1F,
                                          2400 // 2 minutes
                                  )
                                  .unlockedBy(RecipeProvider.getHasName(ModItems.RAW_RUBBER.get()), has(ModItems.RAW_RUBBER.get()))
                                  .save(output, id("campfire_rubber_from_raw_rubber").toString());

        SimpleCookingRecipeBuilder.smoking(
                                          Ingredient.of(Items.ROTTEN_FLESH),
                                          RecipeCategory.MISC,
                                          Items.LEATHER,
                                          0.1F,
                                          400 // 20 seconds
                                  )
                                  .unlockedBy(RecipeProvider.getHasName(Items.ROTTEN_FLESH), has(Items.ROTTEN_FLESH))
                                  .save(output, id("smoking_leather_from_rotten_flesh").toString());

        SimpleCookingRecipeBuilder.smoking(
                                          Ingredient.of(ModItems.RAW_RUBBER.get()),
                                          RecipeCategory.MISC,
                                          ModItems.RUBBER.get(),
                                          0.1F,
                                          400 // 20 seconds
                                  )
                                  .unlockedBy(RecipeProvider.getHasName(ModItems.RAW_RUBBER.get()), has(ModItems.RAW_RUBBER.get()))
                                  .save(output, id("smoking_rubber_from_raw_rubber").toString());

        SimpleCookingRecipeBuilder.blasting(
                                          Ingredient.of(ModBlocks.ORE_END_EXODIUM_CRACKED.get()),
                                          RecipeCategory.MISC,
                                          CookingBookCategory.MISC,
                                          ModBlocks.ORE_EXODIUM.get(),
                                          7.0F,
                                          7200 // 6 Minutes
                                  )
                                  .unlockedBy(RecipeProvider.getHasName(ModBlocks.ORE_END_EXODIUM_CRACKED.get()), has(ModBlocks.ORE_END_EXODIUM_CRACKED.get()))
                                  .save(output, id("blasting_exodium_ore_from_cracked_exodium").toString());

        SimpleCookingRecipeBuilder.blasting(
                                          Ingredient.of(ModBlocks.RUBBER_WOOD_LOG.get()),
                                          RecipeCategory.MISC,
                                          CookingBookCategory.MISC,
                                          ModItems.RAW_RUBBER.get(),
                                          1.0F,
                                          1200
                                  )
                                  .unlockedBy(RecipeProvider.getHasName(ModBlocks.RUBBER_WOOD_LOG.get()), has(ModBlocks.RUBBER_WOOD_LOG.get()))
                                  .save(output, id("blasting_exodium_ore_from_cracked_exodium").toString());

        shapeless(RecipeCategory.FOOD, ModItems.EGG_AND_BREAD.get(), 1)
                .requires(ModItems.COOKED_EGG.get())
                .requires(Items.BREAD)
                .unlockedBy(RecipeProvider.getHasName(ModItems.COOKED_EGG.get()), has(ModItems.COOKED_EGG.get()))
                .group("materia")
                .save(output);

        woodFromLogs(ModBlocks.RUBBER_WOOD.get(), ModBlocks.RUBBER_WOOD_LOG.get());
        woodFromLogs(ModBlocks.STRIPPED_RUBBER_WOOD.get(), ModBlocks.STRIPPED_RUBBER_WOOD_LOG.get());
        planksFromLog(ModBlocks.RUBBER_WOOD_PLANKS.get(), MateriasConstants.RUBBER_LOGS_ITEM_TAG, 4);

        shaped(RecipeCategory.MISC, ModBlocks.ALIMENTOR.get(), 1)
                .pattern("wcw")
                .pattern("www")
                .define('w', ItemTags.WOODEN_SLABS)
                .define('c', Items.WHEAT)
                .unlockedBy("has_wooden_slabs", has(ItemTags.WOODEN_SLABS))
                .unlockedBy(RecipeProvider.getHasName(Items.WHEAT), has(Items.WHEAT))
                .group("materia")
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.BINDING_STRING.get(), 1)
                .pattern("sss")
                .pattern(" s ")
                .pattern("sss")
                .define('s', Items.STRING)
                .unlockedBy(RecipeProvider.getHasName(Items.STRING), has(Items.STRING))
                .group("materia")
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.THERMAL_CORE.get(), 1)
                .pattern("ppp")
                .pattern("ihi")
                .pattern("ppp")
                .define('i', Items.IRON_BARS)
                .define('h', ModItems.HOT_COAL.get())
                .define('p', ModItems.REINFORCED_PLATE_IRON.get())
                .unlockedBy(RecipeProvider.getHasName(ModItems.HOT_COAL.get()), has(ModItems.HOT_COAL.get()))
                .group("materia")
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.ENDER_CHARM.get(), 1)
                .pattern("eie")
                .pattern("gig")
                .pattern("ihi")
                .define('e', ModItems.ENDERMAN_EYE.get())
                .define('i', ModItems.INGOT_EXODIUM.get())
                .define('g', ModItems.ENDERMAN_GLAND.get())
                .define('h', ModItems.ENDERMAN_HEART.get())
                .unlockedBy(RecipeProvider.getHasName(ModItems.ENDERMAN_HEART.get()), has(ModItems.ENDERMAN_HEART.get()))
                .group("materia")
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.HOT_COAL.get(), 1)
                .pattern("ccc")
                .pattern("cbc")
                .pattern("ccc")
                .define('c', Items.COAL)
                .define('b', Items.LAVA_BUCKET)
                .unlockedBy(RecipeProvider.getHasName(Items.LAVA_BUCKET), has(Items.LAVA_BUCKET))
                .group("materia")
                .save(output);

        generateGear(ItemTags.PLANKS, ItemTags.PLANKS, ModItems.GEAR_WOOD.get());
        generateGear(ModItems.GEAR_WOOD.get(), Items.COBBLESTONE, ModItems.GEAR_STONE.get());
        generateGear(ModItems.GEAR_STONE.get(), Items.IRON_INGOT, ModItems.GEAR_IRON.get());
        generateGear(ModItems.GEAR_STONE.get(), Items.COPPER_INGOT, ModItems.GEAR_COPPER.get());
        generateGear(ModItems.GEAR_COPPER.get(), Items.REDSTONE, ModItems.GEAR_ENERGIZED.get());
        generateGear(ModItems.GEAR_IRON.get(), Items.GOLD_INGOT, ModItems.GEAR_GOLD.get());
        generateGear(ModItems.GEAR_IRON.get(), Items.QUARTZ, ModItems.GEAR_QUARTZ.get());
        generateGear(ModItems.GEAR_GOLD.get(), Items.DIAMOND, ModItems.GEAR_DIAMOND.get());
        generateGear(ModItems.GEAR_GOLD.get(), Items.EMERALD, ModItems.GEAR_EMERALD.get());
        generateGear(ModItems.GEAR_GOLD.get(), Items.LAPIS_LAZULI, ModItems.GEAR_LAPIS.get());
        generateGear(ModItems.GEAR_GOLD.get(), MateriasConstants.RED_GEMS, ModItems.GEAR_CARMINIS.get());
        generateGear(ModItems.GEAR_GOLD.get(), MateriasConstants.BLUE_GEMS, ModItems.GEAR_GLAUCUS.get());
        generateGear(ModItems.GEAR_DIAMOND.get(), Blocks.OBSIDIAN, ModItems.GEAR_OBSIDIAN.get());
        generateGear(ModItems.GEAR_DIAMOND.get(), Items.NETHERITE_INGOT, ModItems.GEAR_NETHERITE.get());
        generateGear(ModItems.GEAR_DIAMOND.get(), ModItems.INGOT_EXODIUM.get(), ModItems.GEAR_EXODIUM.get());
        generateGear(ModItems.GEAR_EMERALD.get(), Items.PRISMARINE_SHARD, ModItems.GEAR_PRISMARINE.get());
        generateGear(ModItems.GEAR_EMERALD.get(), Items.SHULKER_SHELL, ModItems.GEAR_SHULKER.get());
        generateGear(ModItems.GEAR_EMERALD.get(), Items.ENDER_PEARL, ModItems.GEAR_VIBRANT.get());

        generatePlate(Items.AMETHYST_SHARD, ModItems.PLATE_AMETHYST.get());
        generatePlate(MateriasConstants.YELLOW_GEMS, ModItems.PLATE_FLAVUM.get());
        generatePlate(Items.COPPER_INGOT, ModItems.PLATE_COPPER.get());
        generatePlate(Items.DIAMOND, ModItems.PLATE_DIAMOND.get());
        generatePlate(Items.EMERALD, ModItems.PLATE_EMERALD.get());
        generatePlate(ModItems.INGOT_EXODIUM.get(), ModItems.PLATE_EXODIUM.get());
        generatePlate(Items.GOLD_INGOT, ModItems.PLATE_GOLD.get());
        generatePlate(Items.IRON_INGOT, ModItems.PLATE_IRON.get());
        generatePlate(Items.NETHERITE_INGOT, ModItems.PLATE_NETHERITE.get());
        generatePlate(MateriasConstants.RED_GEMS, ModItems.PLATE_CARMINIS.get());
        generatePlate(MateriasConstants.BLUE_GEMS, ModItems.PLATE_GLAUCUS.get());
        generatePlate(Items.SHULKER_SHELL, ModItems.PLATE_SHULKER.get());
        generatePlate(Items.SMOOTH_STONE, ModItems.PLATE_STONE.get());

        generateReinforced(ModItems.PLATE_AMETHYST.get(), ModItems.REINFORCED_PLATE_AMETHYST.get());
        generateReinforced(ModItems.PLATE_FLAVUM.get(), ModItems.REINFORCED_PLATE_FLAVUM.get());
        generateReinforced(ModItems.PLATE_COPPER.get(), ModItems.REINFORCED_PLATE_COPPER.get());
        generateReinforced(ModItems.PLATE_DIAMOND.get(), ModItems.REINFORCED_PLATE_DIAMOND.get());
        generateReinforced(ModItems.PLATE_EMERALD.get(), ModItems.REINFORCED_PLATE_EMERALD.get());
        generateReinforced(ModItems.PLATE_EXODIUM.get(), ModItems.REINFORCED_PLATE_EXODIUM.get());
        generateReinforced(ModItems.PLATE_GOLD.get(), ModItems.REINFORCED_PLATE_GOLD.get());
        generateReinforced(ModItems.PLATE_IRON.get(), ModItems.REINFORCED_PLATE_IRON.get());
        generateReinforced(ModItems.PLATE_NETHERITE.get(), ModItems.REINFORCED_PLATE_NETHERITE.get());
        generateReinforced(ModItems.PLATE_CARMINIS.get(), ModItems.REINFORCED_PLATE_CARMINIS.get());
        generateReinforced(ModItems.PLATE_GLAUCUS.get(), ModItems.REINFORCED_PLATE_GLAUCUS.get());
        generateReinforced(ModItems.PLATE_SHULKER.get(), ModItems.REINFORCED_PLATE_SHULKER.get());

        generateRod(Items.COPPER_INGOT, ModItems.ROD_COPPER.get());
        generateRod(ModItems.INGOT_EXODIUM.get(), ModItems.ROD_EXODIUM.get());
        generateRod(Items.GLOWSTONE_DUST, ModItems.ROD_GLOWSTONE.get());
        generateRod(Items.GOLD_INGOT, ModItems.ROD_GOLD.get());
        generateRod(Items.IRON_INGOT, ModItems.ROD_IRON.get());
        generateRod(Blocks.CRYING_OBSIDIAN, ModItems.ROD_OBSIDIAN.get());
        generateRod(Items.REDSTONE, ModItems.ROD_REDSTONE.get());
        generateRod(Items.SHULKER_SHELL, ModItems.ROD_SHULKER.get());

        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.CARMINIS.get(),
                                         RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARMINIS_BLOCK.get(),
                                         "carminis_block_from_carminis_gem", "compression",
                                         "carminis_gem_from_carminis_block", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.FLAVUM.get(),
                                         RecipeCategory.BUILDING_BLOCKS,ModBlocks.FLAVUM_BLOCK.get(),
                                         "flavum_block_from_flavum_gem", "compression",
                                         "flavum_gem_from_flavum_block", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.GLAUCUS.get(),
                                         RecipeCategory.BUILDING_BLOCKS,ModBlocks.GLAUCUS_BLOCK.get(),
                                         "glaucus_block_from_glaucus_gem", "compression",
                                         "glaucus_gem_from_glaucus_block", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.INGOT_EXODIUM.get(),
                                         RecipeCategory.BUILDING_BLOCKS,ModBlocks.EXODIUM_BLOCK.get(),
                                         "exodium_block_from_exodium_ingot", "compression",
                                         "exodium_ingot_from_exodium_block", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_CARMINIS.get(),
                                         RecipeCategory.BUILDING_BLOCKS,ModBlocks.RAW_CARMINIS_BLOCK.get(),
                                         "raw_carminis_block_from_raw_carminis", "compression",
                                         "raw_carminis_from_raw_carminis_block", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_FLAVUM.get(),
                                         RecipeCategory.BUILDING_BLOCKS,ModBlocks.RAW_FLAVUM_BLOCK.get(),
                                         "raw_flavum_block_from_raw_flavum", "compression",
                                         "raw_flavum_from_raw_flavum_block", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_GLAUCUS.get(),
                                         RecipeCategory.BUILDING_BLOCKS,ModBlocks.RAW_GLAUCUS_BLOCK.get(),
                                         "raw_glaucus_block_from_raw_glaucus", "compression",
                                         "raw_glaucus_from_raw_glaucus_block", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_EXODIUM.get(),
                                         RecipeCategory.BUILDING_BLOCKS,ModBlocks.RAW_EXODIUM_BLOCK.get(),
                                         "raw_exodium_block_from_raw_exodium", "compression",
                                         "raw_exodium_from_raw_exodium_block", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_QUARTZ.get(),
                                         RecipeCategory.BUILDING_BLOCKS,ModBlocks.RAW_QUARTZ_BLOCK.get(),
                                         "raw_quartz_block_from_raw_quartz", "compression",
                                         "raw_quartz_from_raw_quartz_block", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, Items.CARROT,
                                         RecipeCategory.BUILDING_BLOCKS, ModBlocks.CARROT_BOX.get(),
                                         "carrot_box_from_carrots", "compression",
                                         "carrots_from_carrot_box", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, Items.POTATO,
                                         RecipeCategory.BUILDING_BLOCKS, ModBlocks.POTATO_BOX.get(),
                                         "potato_box_from_potatoes", "compression",
                                         "potatoes_from_potato_box", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, Items.LEATHER,
                                         RecipeCategory.BUILDING_BLOCKS, ModBlocks.LEATHER_CRATE.get(),
                                         "leather_crate_from_leathers", "compression",
                                         "leathers_from_leather_crate", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, Items.SUGAR_CANE,
                                         RecipeCategory.BUILDING_BLOCKS, ModBlocks.SUGAR_CANE_CRATE.get(),
                                         "sugar_cane_crate_from_sugar_canes", "compression",
                                         "sugar_canes_from_sugar_cane_crate", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, Items.FEATHER,
                                         RecipeCategory.BUILDING_BLOCKS, ModBlocks.FEATHER_CRATE.get(),
                                         "feather_crate_from_feathers", "compression",
                                         "feathers_from_feather_crate", "decompression");

        nineBlockStorageRecipes(RecipeCategory.MISC, Items.GUNPOWDER,
                                         RecipeCategory.BUILDING_BLOCKS, ModBlocks.GUNPOWDER_CRATE.get(),
                                         "gunpowder_crate_from_gunpowders", "compression",
                                         "gunpowders_from_gunpowder_crate", "decompression");

        createCompacteBlockLevels(ModBlocks.CARMINIS_BLOCK, ModBlocks.COMPRESSED_CARMINIS_BLOCK);
        createCompacteBlockLevels(ModBlocks.FLAVUM_BLOCK, ModBlocks.COMPRESSED_FLAVUM_BLOCK);
        createCompacteBlockLevels(ModBlocks.GLAUCUS_BLOCK, ModBlocks.COMPRESSED_GLAUCUS_BLOCK);
        createCompacteBlockLevels(ModBlocks.EXODIUM_BLOCK, ModBlocks.COMPRESSED_EXODIUM_BLOCK);

        createCompacteBlockLevels(ModBlocks.RAW_CARMINIS_BLOCK, ModBlocks.COMPRESSED_RAW_CARMINIS_BLOCK);
        createCompacteBlockLevels(ModBlocks.RAW_EXODIUM_BLOCK, ModBlocks.COMPRESSED_RAW_EXODIUM_BLOCK);
        createCompacteBlockLevels(ModBlocks.RAW_FLAVUM_BLOCK, ModBlocks.COMPRESSED_RAW_FLAVUM_BLOCK);
        createCompacteBlockLevels(ModBlocks.RAW_GLAUCUS_BLOCK, ModBlocks.COMPRESSED_RAW_GLAUCUS_BLOCK);
        createCompacteBlockLevels(ModBlocks.RAW_QUARTZ_BLOCK, ModBlocks.COMPRESSED_RAW_QUARTZ_BLOCK);

        createCompacteBlockLevels(ModBlocks.ORE_DEEP_CARMINIS, ModBlocks.COMPRESSED_ORE_DEEP_CARMINIS);
        createCompacteBlockLevels(ModBlocks.ORE_DEEP_FLAVUM, ModBlocks.COMPRESSED_ORE_DEEP_FLAVUM);
        createCompacteBlockLevels(ModBlocks.ORE_DEEP_GLAUCUS, ModBlocks.COMPRESSED_ORE_DEEP_GLAUCUS);
        createCompacteBlockLevels(ModBlocks.ORE_END_CARMINIS, ModBlocks.COMPRESSED_ORE_END_CARMINIS);
        createCompacteBlockLevels(ModBlocks.ORE_END_EXODIUM_CRACKED, ModBlocks.COMPRESSED_ORE_END_EXODIUM_CRACKED);
        createCompacteBlockLevels(ModBlocks.ORE_END_FLAVUM, ModBlocks.COMPRESSED_ORE_END_FLAVUM);
        createCompacteBlockLevels(ModBlocks.ORE_END_GLAUCUS, ModBlocks.COMPRESSED_ORE_END_GLAUCUS);
        createCompacteBlockLevels(ModBlocks.ORE_EXODIUM, ModBlocks.COMPRESSED_ORE_EXODIUM);
        createCompacteBlockLevels(ModBlocks.ORE_NETHER_CARMINIS, ModBlocks.COMPRESSED_ORE_NETHER_CARMINIS);
        createCompacteBlockLevels(ModBlocks.ORE_NETHER_COAL, ModBlocks.COMPRESSED_ORE_NETHER_COAL);
        createCompacteBlockLevels(ModBlocks.ORE_NETHER_COPPER, ModBlocks.COMPRESSED_ORE_NETHER_COPPER);
        createCompacteBlockLevels(ModBlocks.ORE_NETHER_DIAMOND, ModBlocks.COMPRESSED_ORE_NETHER_DIAMOND);
        createCompacteBlockLevels(ModBlocks.ORE_NETHER_FLAVUM, ModBlocks.COMPRESSED_ORE_NETHER_FLAVUM);
        createCompacteBlockLevels(ModBlocks.ORE_NETHER_GLAUCUS, ModBlocks.COMPRESSED_ORE_NETHER_GLAUCUS);
        createCompacteBlockLevels(ModBlocks.ORE_NETHER_IRON, ModBlocks.COMPRESSED_ORE_NETHER_IRON);
        createCompacteBlockLevels(ModBlocks.ORE_NETHER_LAPIS, ModBlocks.COMPRESSED_ORE_NETHER_LAPIS);
        createCompacteBlockLevels(ModBlocks.ORE_NETHER_REDSTONE, ModBlocks.COMPRESSED_ORE_NETHER_REDSTONE);
        createCompacteBlockLevels(ModBlocks.ORE_WORLD_CARMINIS, ModBlocks.COMPRESSED_ORE_WORLD_CARMINIS);
        createCompacteBlockLevels(ModBlocks.ORE_WORLD_FLAVUM, ModBlocks.COMPRESSED_ORE_WORLD_FLAVUM);
        createCompacteBlockLevels(ModBlocks.ORE_WORLD_GLAUCUS, ModBlocks.COMPRESSED_ORE_WORLD_GLAUCUS);

        //region BRICKS
        createCompacteBlockLevels(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS, ModBlocks.COMPRESSED_CRACKED_POLISHED_BLACKSTONE_BRICKS);
        createCompacteBlockLevels(Blocks.POLISHED_BLACKSTONE_BRICKS, ModBlocks.COMPRESSED_POLISHED_BLACKSTONE_BRICKS);
        createCompacteBlockLevels(Blocks.BRICKS, ModBlocks.COMPRESSED_BRICKS);
        createCompacteBlockLevels(Blocks.CINNABAR_BRICKS, ModBlocks.COMPRESSED_CINNABAR_BRICKS);
        createCompacteBlockLevels(Blocks.CRACKED_DEEPSLATE_BRICKS, ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_BRICKS);
        createCompacteBlockLevels(Blocks.CRACKED_DEEPSLATE_TILES, ModBlocks.COMPRESSED_CRACKED_DEEPSLATE_TILES);
        createCompacteBlockLevels(Blocks.CRACKED_NETHER_BRICKS, ModBlocks.COMPRESSED_CRACKED_NETHER_BRICKS);
        createCompacteBlockLevels(Blocks.CRACKED_STONE_BRICKS, ModBlocks.COMPRESSED_CRACKED_STONE_BRICKS);
        createCompacteBlockLevels(Blocks.DEEPSLATE_BRICKS, ModBlocks.COMPRESSED_DEEPSLATE_BRICKS);
        createCompacteBlockLevels(Blocks.DEEPSLATE_TILES, ModBlocks.COMPRESSED_DEEPSLATE_TILES);
        createCompacteBlockLevels(Blocks.END_STONE_BRICKS, ModBlocks.COMPRESSED_ENDSTONE_BRICKS);
        createCompacteBlockLevels(Blocks.MOSSY_STONE_BRICKS, ModBlocks.COMPRESSED_MOSSY_STONE_BRICKS);
        createCompacteBlockLevels(Blocks.MUD_BRICKS, ModBlocks.COMPRESSED_MUD_BRICKS);
        createCompacteBlockLevels(Blocks.NETHER_BRICKS, ModBlocks.COMPRESSED_NETHER_BRICKS);
        createCompacteBlockLevels(Blocks.PRISMARINE_BRICKS, ModBlocks.COMPRESSED_PRISMARINE_BRICKS);
        createCompacteBlockLevels(Blocks.QUARTZ_BRICKS, ModBlocks.COMPRESSED_QUARTZ_BRICKS);
        createCompacteBlockLevels(Blocks.RED_NETHER_BRICKS, ModBlocks.COMPRESSED_RED_NETHER_BRICKS);
        createCompacteBlockLevels(Blocks.RESIN_BRICKS, ModBlocks.COMPRESSED_RESIN_BRICKS);
        createCompacteBlockLevels(Blocks.STONE_BRICKS, ModBlocks.COMPRESSED_STONE_BRICKS);
        createCompacteBlockLevels(Blocks.SULFUR_BRICKS, ModBlocks.COMPRESSED_SULFUR_BRICKS);
        createCompacteBlockLevels(Blocks.TUFF_BRICKS, ModBlocks.COMPRESSED_TUFF_BRICKS);
        //endregion

        //region CONCRETE
        createCompacteBlockLevels(Blocks.CONCRETE.black(), ModBlocks.COMPRESSED_CONCRETE_BLACK);
        createCompacteBlockLevels(Blocks.CONCRETE.blue(), ModBlocks.COMPRESSED_CONCRETE_BLUE);
        createCompacteBlockLevels(Blocks.CONCRETE.brown(), ModBlocks.COMPRESSED_CONCRETE_BROWN);
        createCompacteBlockLevels(Blocks.CONCRETE.cyan(), ModBlocks.COMPRESSED_CONCRETE_CYAN);
        createCompacteBlockLevels(Blocks.CONCRETE.gray(), ModBlocks.COMPRESSED_CONCRETE_GRAY);
        createCompacteBlockLevels(Blocks.CONCRETE.green(), ModBlocks.COMPRESSED_CONCRETE_GREEN);
        createCompacteBlockLevels(Blocks.CONCRETE.lightBlue(), ModBlocks.COMPRESSED_CONCRETE_LIGHT_BLUE);
        createCompacteBlockLevels(Blocks.CONCRETE.lightGray(), ModBlocks.COMPRESSED_CONCRETE_LIGHT_GRAY);
        createCompacteBlockLevels(Blocks.CONCRETE.lime(), ModBlocks.COMPRESSED_CONCRETE_LIME);
        createCompacteBlockLevels(Blocks.CONCRETE.magenta(), ModBlocks.COMPRESSED_CONCRETE_MAGENTA);
        createCompacteBlockLevels(Blocks.CONCRETE.orange(), ModBlocks.COMPRESSED_CONCRETE_ORANGE);
        createCompacteBlockLevels(Blocks.CONCRETE.pink(), ModBlocks.COMPRESSED_CONCRETE_PINK);
        createCompacteBlockLevels(Blocks.CONCRETE.purple(), ModBlocks.COMPRESSED_CONCRETE_PURPLE);
        createCompacteBlockLevels(Blocks.CONCRETE.red(), ModBlocks.COMPRESSED_CONCRETE_RED);
        createCompacteBlockLevels(Blocks.CONCRETE.white(), ModBlocks.COMPRESSED_CONCRETE_WHITE);
        createCompacteBlockLevels(Blocks.CONCRETE.yellow(), ModBlocks.COMPRESSED_CONCRETE_YELLOW);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.black(), ModBlocks.COMPRESSED_CONCRETE_BLACK_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.blue(), ModBlocks.COMPRESSED_CONCRETE_BLUE_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.brown(), ModBlocks.COMPRESSED_CONCRETE_BROWN_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.cyan(), ModBlocks.COMPRESSED_CONCRETE_CYAN_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.gray(), ModBlocks.COMPRESSED_CONCRETE_GRAY_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.green(), ModBlocks.COMPRESSED_CONCRETE_GREEN_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.lightBlue(), ModBlocks.COMPRESSED_CONCRETE_LIGHT_BLUE_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.lightGray(), ModBlocks.COMPRESSED_CONCRETE_LIGHT_GRAY_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.lime(), ModBlocks.COMPRESSED_CONCRETE_LIME_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.magenta(), ModBlocks.COMPRESSED_CONCRETE_MAGENTA_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.orange(), ModBlocks.COMPRESSED_CONCRETE_ORANGE_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.pink(), ModBlocks.COMPRESSED_CONCRETE_PINK_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.purple(), ModBlocks.COMPRESSED_CONCRETE_PURPLE_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.red(), ModBlocks.COMPRESSED_CONCRETE_RED_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.white(), ModBlocks.COMPRESSED_CONCRETE_WHITE_POWDER);
        createCompacteBlockLevels(Blocks.CONCRETE_POWDER.yellow(), ModBlocks.COMPRESSED_CONCRETE_YELLOW_POWDER);
        //endregion

        //region LOGS
        createCompacteBlockLevels(Blocks.ACACIA_LOG, ModBlocks.COMPRESSED_LOG_ACACIA);
        createCompacteBlockLevels(Blocks.BIRCH_LOG, ModBlocks.COMPRESSED_LOG_BIRCH);
        createCompacteBlockLevels(Blocks.CHERRY_LOG, ModBlocks.COMPRESSED_LOG_CHERRY);
        createCompacteBlockLevels(Blocks.CRIMSON_STEM, ModBlocks.COMPRESSED_LOG_CRIMSON);
        createCompacteBlockLevels(Blocks.DARK_OAK_LOG, ModBlocks.COMPRESSED_LOG_DARK_OAK);
        createCompacteBlockLevels(Blocks.JUNGLE_LOG, ModBlocks.COMPRESSED_LOG_JUNGLE);
        createCompacteBlockLevels(Blocks.MANGROVE_LOG, ModBlocks.COMPRESSED_LOG_MANGROVE);
        createCompacteBlockLevels(Blocks.OAK_LOG, ModBlocks.COMPRESSED_LOG_OAK);
        createCompacteBlockLevels(Blocks.PALE_OAK_LOG, ModBlocks.COMPRESSED_LOG_PALE_OAK);
        createCompacteBlockLevels(Blocks.SPRUCE_LOG, ModBlocks.COMPRESSED_LOG_SPRUCE);
        createCompacteBlockLevels(Blocks.WARPED_STEM, ModBlocks.COMPRESSED_LOG_WARPED);
        createCompacteBlockLevels(Blocks.BAMBOO_BLOCK, ModBlocks.COMPRESSED_LOG_BAMBOO_BLOCK);
        //endregion

        //region MISC
        createCompacteBlockLevels(Blocks.DIAMOND_BLOCK, ModBlocks.COMPRESSED_DIAMOND_BLOCK);
        createCompacteBlockLevels(Blocks.EMERALD_BLOCK, ModBlocks.COMPRESSED_EMERALD_BLOCK);
        createCompacteBlockLevels(Blocks.GLOWSTONE, ModBlocks.COMPRESSED_GLOWSTONE);
        createCompacteBlockLevels(Blocks.GOLD_BLOCK, ModBlocks.COMPRESSED_GOLD_BLOCK);
        createCompacteBlockLevels(Blocks.HAY_BLOCK, ModBlocks.COMPRESSED_HAY_BLOCK);
        createCompacteBlockLevels(Blocks.HONEY_BLOCK, ModBlocks.COMPRESSED_HONEY_BLOCK);
        createCompacteBlockLevels(Blocks.HONEYCOMB_BLOCK, ModBlocks.COMPRESSED_HONEYCOMB_BLOCK);
        createCompacteBlockLevels(Blocks.ICE, ModBlocks.COMPRESSED_ICE);
        createCompacteBlockLevels(Blocks.LAPIS_BLOCK, ModBlocks.COMPRESSED_LAPIS_BLOCK);
        createCompacteBlockLevels(Blocks.RESIN_BLOCK, ModBlocks.COMPRESSED_RESIN_BLOCK);
        createCompacteBlockLevels(Blocks.SLIME_BLOCK, ModBlocks.COMPRESSED_SLIME_BLOCK);
        createCompacteBlockLevels(Blocks.TNT, ModBlocks.COMPRESSED_TNT);
        createCompacteBlockLevels(Blocks.AMETHYST_BLOCK, ModBlocks.COMPRESSED_AMETHYST_BLOCK);
        createCompacteBlockLevels(Blocks.BLUE_ICE, ModBlocks.COMPRESSED_BLUE_ICE);
        createCompacteBlockLevels(Blocks.DARK_PRISMARINE, ModBlocks.COMPRESSED_DARK_PRISMARINE);
        createCompacteBlockLevels(Blocks.DRIED_KELP_BLOCK, ModBlocks.COMPRESSED_DRIED_KELP);
        createCompacteBlockLevels(Blocks.IRON_BLOCK, ModBlocks.COMPRESSED_IRON_BLOCK);
        createCompacteBlockLevels(Blocks.MELON, ModBlocks.COMPRESSED_MELON);
        createCompacteBlockLevels(Blocks.PACKED_ICE, ModBlocks.COMPRESSED_PACKED_ICE);
        createCompacteBlockLevels(Blocks.BONE_BLOCK, ModBlocks.COMPRESSED_BONE_BLOCK);
        createCompacteBlockLevels(Blocks.CLAY, ModBlocks.COMPRESSED_CLAY);
        createCompacteBlockLevels(Blocks.COAL_BLOCK, ModBlocks.COMPRESSED_COAL_BLOCK);
        createCompacteBlockLevels(Blocks.REDSTONE_BLOCK, ModBlocks.COMPRESSED_REDSTONE_BLOCK);
        createCompacteBlockLevels(Blocks.HORN_CORAL_BLOCK, ModBlocks.COMPRESSED_HORN_CORAL_BLOCK);
        createCompacteBlockLevels(Blocks.BAMBOO_MOSAIC, ModBlocks.COMPRESSED_BAMBOO_MOSAIC);
        //endregion

        //region VANILLA ORES
        createCompacteBlockLevels(Blocks.COAL_ORE, ModBlocks.COMPRESSED_ORE_COAL);
        createCompacteBlockLevels(Blocks.COPPER_ORE, ModBlocks.COMPRESSED_ORE_COPPER);
        createCompacteBlockLevels(Blocks.DEEPSLATE_COAL_ORE, ModBlocks.COMPRESSED_ORE_DEEPSLATE_COAL);
        createCompacteBlockLevels(Blocks.DEEPSLATE_COPPER_ORE, ModBlocks.COMPRESSED_ORE_DEEPSLATE_COPPER);
        createCompacteBlockLevels(Blocks.DEEPSLATE_DIAMOND_ORE, ModBlocks.COMPRESSED_ORE_DEEPSLATE_DIAMOND);
        createCompacteBlockLevels(Blocks.DEEPSLATE_EMERALD_ORE, ModBlocks.COMPRESSED_ORE_DEEPSLATE_EMERALD);
        createCompacteBlockLevels(Blocks.DEEPSLATE_GOLD_ORE, ModBlocks.COMPRESSED_ORE_DEEPSLATE_GOLD);
        createCompacteBlockLevels(Blocks.DEEPSLATE_IRON_ORE, ModBlocks.COMPRESSED_ORE_DEEPSLATE_IRON);
        createCompacteBlockLevels(Blocks.DEEPSLATE_LAPIS_ORE, ModBlocks.COMPRESSED_ORE_DEEPSLATE_LAPIS);
        createCompacteBlockLevels(Blocks.DEEPSLATE_REDSTONE_ORE, ModBlocks.COMPRESSED_ORE_DEEPSLATE_REDSTONE);
        createCompacteBlockLevels(Blocks.DIAMOND_ORE, ModBlocks.COMPRESSED_ORE_DIAMOND);
        createCompacteBlockLevels(Blocks.EMERALD_ORE, ModBlocks.COMPRESSED_ORE_EMERALD);
        createCompacteBlockLevels(Blocks.GOLD_ORE, ModBlocks.COMPRESSED_ORE_GOLD);
        createCompacteBlockLevels(Blocks.IRON_ORE, ModBlocks.COMPRESSED_ORE_IRON);
        createCompacteBlockLevels(Blocks.LAPIS_ORE, ModBlocks.COMPRESSED_ORE_LAPIS);
        createCompacteBlockLevels(Blocks.NETHER_GOLD_ORE, ModBlocks.COMPRESSED_ORE_NETHER_GOLD);
        createCompacteBlockLevels(Blocks.NETHER_QUARTZ_ORE, ModBlocks.COMPRESSED_ORE_NETHER_QUARTZ);
        createCompacteBlockLevels(Blocks.RAW_COPPER_BLOCK, ModBlocks.COMPRESSED_ORE_RAW_COPPER);
        createCompacteBlockLevels(Blocks.RAW_GOLD_BLOCK, ModBlocks.COMPRESSED_ORE_RAW_GOLD);
        createCompacteBlockLevels(Blocks.RAW_IRON_BLOCK, ModBlocks.COMPRESSED_ORE_RAW_IRON);
        createCompacteBlockLevels(Blocks.REDSTONE_ORE, ModBlocks.COMPRESSED_ORE_REDSTONE);
        //endregion

        //region PLANKS
        createCompacteBlockLevels(Blocks.ACACIA_PLANKS, ModBlocks.COMPRESSED_PLANKS_ACACIA);
        createCompacteBlockLevels(Blocks.BIRCH_PLANKS, ModBlocks.COMPRESSED_PLANKS_BIRCH);
        createCompacteBlockLevels(Blocks.CHERRY_PLANKS, ModBlocks.COMPRESSED_PLANKS_CHERRY);
        createCompacteBlockLevels(Blocks.CRIMSON_PLANKS, ModBlocks.COMPRESSED_PLANKS_CRIMSON);
        createCompacteBlockLevels(Blocks.DARK_OAK_PLANKS, ModBlocks.COMPRESSED_PLANKS_DARK_OAK);
        createCompacteBlockLevels(Blocks.JUNGLE_PLANKS, ModBlocks.COMPRESSED_PLANKS_JUNGLE);
        createCompacteBlockLevels(Blocks.MANGROVE_PLANKS, ModBlocks.COMPRESSED_PLANKS_MANGROVE);
        createCompacteBlockLevels(Blocks.OAK_PLANKS, ModBlocks.COMPRESSED_PLANKS_OAK);
        createCompacteBlockLevels(Blocks.PALE_OAK_PLANKS, ModBlocks.COMPRESSED_PLANKS_PALE_OAK);
        createCompacteBlockLevels(Blocks.SPRUCE_PLANKS, ModBlocks.COMPRESSED_PLANKS_SPRUCE);
        createCompacteBlockLevels(Blocks.WARPED_PLANKS, ModBlocks.COMPRESSED_PLANKS_WARPED);
        createCompacteBlockLevels(Blocks.BAMBOO_PLANKS, ModBlocks.COMPRESSED_PLANKS_BAMBOO);
        //endregion

        //region STONE
        createCompacteBlockLevels(Blocks.ANDESITE, ModBlocks.COMPRESSED_ANDESITE);
        createCompacteBlockLevels(Blocks.BASALT, ModBlocks.COMPRESSED_BASALT);
        createCompacteBlockLevels(Blocks.CALCITE, ModBlocks.COMPRESSED_CALCITE);
        createCompacteBlockLevels(Blocks.COBBLED_DEEPSLATE, ModBlocks.COMPRESSED_COBBLED_DEEPSLATE);
        createCompacteBlockLevels(Blocks.COBBLESTONE, ModBlocks.COMPRESSED_COBBLESTONE);
        createCompacteBlockLevels(Blocks.DEEPSLATE, ModBlocks.COMPRESSED_DEEPSLATE);
        createCompacteBlockLevels(Blocks.DIORITE, ModBlocks.COMPRESSED_DIORITE);
        createCompacteBlockLevels(Blocks.DIRT, ModBlocks.COMPRESSED_DIRT);
        createCompacteBlockLevels(Blocks.END_STONE, ModBlocks.COMPRESSED_END_STONE);
        createCompacteBlockLevels(Blocks.GRAVEL, ModBlocks.COMPRESSED_GRAVEL);
        createCompacteBlockLevels(Blocks.MOSS_BLOCK, ModBlocks.COMPRESSED_MOSS_BLOCK);
        createCompacteBlockLevels(Blocks.MOSSY_COBBLESTONE, ModBlocks.COMPRESSED_MOSS_COBBLESTONE);
        createCompacteBlockLevels(Blocks.MUD, ModBlocks.COMPRESSED_MUD);
        createCompacteBlockLevels(Blocks.NETHERRACK, ModBlocks.COMPRESSED_NETHERRACK);
        createCompacteBlockLevels(Blocks.OBSIDIAN, ModBlocks.COMPRESSED_OBSIDIAN);
        createCompacteBlockLevels(Blocks.PALE_MOSS_BLOCK, ModBlocks.COMPRESSED_PALE_MOSS_BLOCK);
        createCompacteBlockLevels(Blocks.SAND, ModBlocks.COMPRESSED_SAND);
        createCompacteBlockLevels(Blocks.SMOOTH_BASALT, ModBlocks.COMPRESSED_SMOOTH_BASALT);
        createCompacteBlockLevels(Blocks.SMOOTH_STONE, ModBlocks.COMPRESSED_SMOOTH_STONE);
        createCompacteBlockLevels(Blocks.SOUL_SAND, ModBlocks.COMPRESSED_SOUL_SAND);
        createCompacteBlockLevels(Blocks.SOUL_SOIL, ModBlocks.COMPRESSED_SOUL_SOIL);
        createCompacteBlockLevels(Blocks.STONE, ModBlocks.COMPRESSED_STONE);
        createCompacteBlockLevels(Blocks.TUFF, ModBlocks.COMPRESSED_TUFF);
        createCompacteBlockLevels(Blocks.GRANITE, ModBlocks.COMPRESSED_GRANITE);
        createCompacteBlockLevels(Blocks.GRASS_BLOCK, ModBlocks.COMPRESSED_GRASS_BLOCK);
        createCompacteBlockLevels(Blocks.SANDSTONE, ModBlocks.COMPRESSED_SANDSTONE);
        createCompacteBlockLevels(Blocks.ANCIENT_DEBRIS, ModBlocks.COMPRESSED_ANCIENT_DEBRIS);
        createCompacteBlockLevels(Blocks.BEDROCK, ModBlocks.COMPRESSED_BEDROCK);
        createCompacteBlockLevels(Blocks.CRYING_OBSIDIAN, ModBlocks.COMPRESSED_CRYING_OBSIDIAN);
        createCompacteBlockLevels(Blocks.CUT_RED_SANDSTONE, ModBlocks.COMPRESSED_CUT_RED_SANDSTONE);
        createCompacteBlockLevels(Blocks.CUT_SANDSTONE, ModBlocks.COMPRESSED_CUT_SANDSTONE);
        createCompacteBlockLevels(Blocks.NETHERITE_BLOCK, ModBlocks.COMPRESSED_NETHERITE_BLOCK);
        createCompacteBlockLevels(Blocks.PACKED_MUD, ModBlocks.COMPRESSED_PACKED_MUD);
        createCompacteBlockLevels(Blocks.PRISMARINE, ModBlocks.COMPRESSED_PRISMARINE);
        createCompacteBlockLevels(Blocks.PURPUR_BLOCK, ModBlocks.COMPRESSED_PURPUR_BLOCK);
        createCompacteBlockLevels(Blocks.PURPUR_PILLAR, ModBlocks.COMPRESSED_PURPUR_PILLAR);
        createCompacteBlockLevels(Blocks.RED_SAND, ModBlocks.COMPRESSED_RED_SAND);
        createCompacteBlockLevels(Blocks.RED_SANDSTONE, ModBlocks.COMPRESSED_RED_SANDSTONE);
        createCompacteBlockLevels(Blocks.CINNABAR, ModBlocks.COMPRESSED_CINNABAR);
        createCompacteBlockLevels(Blocks.POLISHED_BLACKSTONE, ModBlocks.COMPRESSED_POLISHED_BLACKSTONE);
        createCompacteBlockLevels(Blocks.POLISHED_ANDESITE, ModBlocks.COMPRESSED_POLISHED_ANDESITE);
        createCompacteBlockLevels(Blocks.POLISHED_BASALT, ModBlocks.COMPRESSED_POLISHED_BASALT);
        createCompacteBlockLevels(Blocks.POLISHED_CINNABAR, ModBlocks.COMPRESSED_POLISHED_CINNABAR);
        createCompacteBlockLevels(Blocks.POLISHED_DEEPSLATE, ModBlocks.COMPRESSED_POLISHED_DEEPSLATE);
        createCompacteBlockLevels(Blocks.POLISHED_DIORITE, ModBlocks.COMPRESSED_POLISHED_DIORITE);
        createCompacteBlockLevels(Blocks.POLISHED_GRANITE, ModBlocks.COMPRESSED_POLISHED_GRANITE);
        createCompacteBlockLevels(Blocks.POLISHED_SULFUR, ModBlocks.COMPRESSED_POLISHED_SULFUR);
        createCompacteBlockLevels(Blocks.POLISHED_TUFF, ModBlocks.COMPRESSED_POLISHED_TUFF);
        createCompacteBlockLevels(Blocks.SULFUR, ModBlocks.COMPRESSED_SULFUR);
        createCompacteBlockLevels(Blocks.BLACKSTONE, ModBlocks.COMPRESSED_BLACKSTONE);
        //endregion

        //region STRIPPED LOGS
        createCompacteBlockLevels(Blocks.STRIPPED_ACACIA_LOG, ModBlocks.COMPRESSED_STRIPPED_LOG_ACACIA);
        createCompacteBlockLevels(Blocks.STRIPPED_BIRCH_LOG, ModBlocks.COMPRESSED_STRIPPED_LOG_BIRCH);
        createCompacteBlockLevels(Blocks.STRIPPED_CHERRY_LOG, ModBlocks.COMPRESSED_STRIPPED_LOG_CHERRY);
        createCompacteBlockLevels(Blocks.STRIPPED_CRIMSON_STEM, ModBlocks.COMPRESSED_STRIPPED_LOG_CRIMSON);
        createCompacteBlockLevels(Blocks.STRIPPED_DARK_OAK_LOG, ModBlocks.COMPRESSED_STRIPPED_LOG_DARK_OAK);
        createCompacteBlockLevels(Blocks.STRIPPED_JUNGLE_LOG, ModBlocks.COMPRESSED_STRIPPED_LOG_JUNGLE);
        createCompacteBlockLevels(Blocks.STRIPPED_MANGROVE_LOG, ModBlocks.COMPRESSED_STRIPPED_LOG_MANGROVE);
        createCompacteBlockLevels(Blocks.STRIPPED_OAK_LOG, ModBlocks.COMPRESSED_STRIPPED_LOG_OAK);
        createCompacteBlockLevels(Blocks.STRIPPED_PALE_OAK_LOG, ModBlocks.COMPRESSED_STRIPPED_LOG_PALE_OAK);
        createCompacteBlockLevels(Blocks.STRIPPED_SPRUCE_LOG, ModBlocks.COMPRESSED_STRIPPED_LOG_SPRUCE);
        createCompacteBlockLevels(Blocks.STRIPPED_WARPED_STEM, ModBlocks.COMPRESSED_STRIPPED_LOG_WARPED);
        createCompacteBlockLevels(Blocks.STRIPPED_BAMBOO_BLOCK, ModBlocks.COMPRESSED_STRIPPED_LOG_BAMBOO);
        //endregion

        //region TERRACOTTA
        createCompacteBlockLevels(Blocks.TERRACOTTA, ModBlocks.COMPRESSED_TERRACOTTA_SIMPLE);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.black(), ModBlocks.COMPRESSED_TERRACOTTA_BLACK);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.black(), ModBlocks.COMPRESSED_TERRACOTTA_BLUE);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.brown(), ModBlocks.COMPRESSED_TERRACOTTA_BROWN);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.cyan(), ModBlocks.COMPRESSED_TERRACOTTA_CYAN);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.gray(), ModBlocks.COMPRESSED_TERRACOTTA_GRAY);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.green(), ModBlocks.COMPRESSED_TERRACOTTA_GREEN);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.lightBlue(), ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_BLUE);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.lightGray(), ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_GRAY);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.lime(), ModBlocks.COMPRESSED_TERRACOTTA_LIME);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.magenta(), ModBlocks.COMPRESSED_TERRACOTTA_MAGENTA);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.orange(), ModBlocks.COMPRESSED_TERRACOTTA_ORANGE);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.pink(), ModBlocks.COMPRESSED_TERRACOTTA_PINK);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.purple(), ModBlocks.COMPRESSED_TERRACOTTA_PURPLE);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.red(), ModBlocks.COMPRESSED_TERRACOTTA_RED);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.white(), ModBlocks.COMPRESSED_TERRACOTTA_WHITE);
        createCompacteBlockLevels(Blocks.DYED_TERRACOTTA.yellow(), ModBlocks.COMPRESSED_TERRACOTTA_YELLOW);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.black(), ModBlocks.COMPRESSED_TERRACOTTA_BLACK_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.blue(), ModBlocks.COMPRESSED_TERRACOTTA_BLUE_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.brown(), ModBlocks.COMPRESSED_TERRACOTTA_BROWN_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.cyan(), ModBlocks.COMPRESSED_TERRACOTTA_CYAN_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.gray(), ModBlocks.COMPRESSED_TERRACOTTA_GRAY_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.green(), ModBlocks.COMPRESSED_TERRACOTTA_GREEN_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.lightBlue(), ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_BLUE_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.lightGray(), ModBlocks.COMPRESSED_TERRACOTTA_LIGHT_GRAY_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.lime(), ModBlocks.COMPRESSED_TERRACOTTA_LIME_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.magenta(), ModBlocks.COMPRESSED_TERRACOTTA_MAGENTA_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.orange(), ModBlocks.COMPRESSED_TERRACOTTA_ORANGE_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.pink(), ModBlocks.COMPRESSED_TERRACOTTA_PINK_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.purple(), ModBlocks.COMPRESSED_TERRACOTTA_PURPLE_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.red(), ModBlocks.COMPRESSED_TERRACOTTA_RED_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.white(), ModBlocks.COMPRESSED_TERRACOTTA_WHITE_GLAZED);
        createCompacteBlockLevels(Blocks.GLAZED_TERRACOTTA.yellow(), ModBlocks.COMPRESSED_TERRACOTTA_YELLOW_GLAZED);
        //endregion

        //region WOOL
        createCompacteBlockLevels(Blocks.WOOL.black(), ModBlocks.COMPRESSED_WOOL_BLACK);
        createCompacteBlockLevels(Blocks.WOOL.blue(), ModBlocks.COMPRESSED_WOOL_BLUE);
        createCompacteBlockLevels(Blocks.WOOL.brown(), ModBlocks.COMPRESSED_WOOL_BROWN);
        createCompacteBlockLevels(Blocks.WOOL.cyan(), ModBlocks.COMPRESSED_WOOL_CYAN);
        createCompacteBlockLevels(Blocks.WOOL.gray(), ModBlocks.COMPRESSED_WOOL_GRAY);
        createCompacteBlockLevels(Blocks.WOOL.green(), ModBlocks.COMPRESSED_WOOL_GREEN);
        createCompacteBlockLevels(Blocks.WOOL.lightBlue(), ModBlocks.COMPRESSED_WOOL_LIGHT_BLUE);
        createCompacteBlockLevels(Blocks.WOOL.lightGray(), ModBlocks.COMPRESSED_WOOL_LIGHT_GRAY);
        createCompacteBlockLevels(Blocks.WOOL.lime(), ModBlocks.COMPRESSED_WOOL_LIME);
        createCompacteBlockLevels(Blocks.WOOL.magenta(), ModBlocks.COMPRESSED_WOOL_MAGENTA);
        createCompacteBlockLevels(Blocks.WOOL.orange(), ModBlocks.COMPRESSED_WOOL_ORANGE);
        createCompacteBlockLevels(Blocks.WOOL.pink(), ModBlocks.COMPRESSED_WOOL_PINK);
        createCompacteBlockLevels(Blocks.WOOL.purple(), ModBlocks.COMPRESSED_WOOL_PURPLE);
        createCompacteBlockLevels(Blocks.WOOL.red(), ModBlocks.COMPRESSED_WOOL_RED);
        createCompacteBlockLevels(Blocks.WOOL.white(), ModBlocks.COMPRESSED_WOOL_WHITE);
        createCompacteBlockLevels(Blocks.WOOL.yellow(), ModBlocks.COMPRESSED_WOOL_YELLOW);
        //endregion
    }

    //region METHODS
    //This is internally called by oreSmelting and oreBlasting
    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.@NonNull Factory<T> factory, List<ItemLike> smeltables,
                                                                @NonNull RecipeCategory craftingCategory, @NonNull CookingBookCategory cookingCategory, @NonNull ItemLike result,
                                                                float experience, int cookingTime, @NonNull String group, @NonNull String fromDesc) {
        for(ItemLike itemlike : smeltables)
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), craftingCategory, cookingCategory,
                                               result, experience, cookingTime, factory)
                                      .group(group)
                                      .unlockedBy(getHasName(itemlike), has(itemlike))
                                      .save(output, MODID + ":" + getItemName(result) + fromDesc + "_" + getItemName(itemlike));
    }

    @Override
    protected void nineBlockStorageRecipes(
            @NonNull RecipeCategory unpackedFormCategory,
            @NonNull ItemLike unpackedForm,
            @NonNull RecipeCategory packedFormCategory,
            @NonNull ItemLike packedForm,
            @NonNull String packingRecipeId,
            @Nullable String packingRecipeGroup,
            @NonNull String unpackingRecipeId,
            @Nullable String unpackingRecipeGroup) 
    {
        this.shapeless(unpackedFormCategory, unpackedForm, 9)
            .requires(packedForm)
            .group(unpackingRecipeGroup)
            .unlockedBy(getHasName(packedForm), this.has(packedForm))
            .save(this.output, ResourceKey.create(Registries.RECIPE, id(unpackingRecipeId)));
        this.shaped(packedFormCategory, packedForm)
            .define('#', unpackedForm)
            .pattern("###")
            .pattern("###")
            .pattern("###")
            .group(packingRecipeGroup)
            .unlockedBy(getHasName(unpackedForm), this.has(unpackedForm))
            .save(this.output, ResourceKey.create(Registries.RECIPE, id(packingRecipeId)));
    }
    
    private void blastingFromTag(TagKey<Item> tag, String tagName, ItemLike result, float experience, int cookingTime)
    {
        var input = items.getOrThrow(ItemTags.PLANKS);

        SimpleCookingRecipeBuilder.blasting(
                                          Ingredient.of(input),
                                          RecipeCategory.MISC,
                                          CookingBookCategory.MISC,
                                          result,
                                          experience,
                                          cookingTime
                                  )
                                  .unlockedBy("has_" + tagName, has(tag))
                                  .save(output, BaseHelper.id(MODID, "blasting_" + BaseHelper.RegistryNames.get(result.asItem()) + "_from_" + tagName).toString());
    }

    private void createCompacteBlockLevels(BlockHandle<Block> unpacked, Map<String, BlockHandle<Block>> map)
    {
        nineBlockStorageRecipes(
                RecipeCategory.MISC, unpacked.get(),
                RecipeCategory.MISC, map.get("1").get(),
                BaseHelper.RegistryNames.get(map.get("1").get()) +
                "_from_" +
                BaseHelper.RegistryNames.get(unpacked.get()), "compression",
                BaseHelper.RegistryNames.get(unpacked.get()) +
                "_from_" +
                BaseHelper.RegistryNames.get(map.get("1").get()), "decompression");

        for (int i = 1; i < 5; i++)
            nineBlockStorageRecipes(
                    RecipeCategory.MISC, map.get(String.valueOf(i)).get(),
                    RecipeCategory.MISC, map.get(String.valueOf(i + 1)).get(),
                    BaseHelper.RegistryNames.get(map.get(String.valueOf(i + 1)).get()) +
                    "_from_" +
                    BaseHelper.RegistryNames.get(map.get(String.valueOf(i)).get()), "compression",
                    BaseHelper.RegistryNames.get(map.get(String.valueOf(i)).get()) +
                    "_from_" +
                    BaseHelper.RegistryNames.get(map.get(String.valueOf(i + 1)).get()), "decompression");
    }

    private void createCompacteBlockLevels(ItemLike unpacked, Map<String, BlockHandle<Block>> map)
    {
        nineBlockStorageRecipes(
                RecipeCategory.MISC, unpacked,
                RecipeCategory.MISC, map.get("1").get(),
                BaseHelper.RegistryNames.get(map.get("1").get()) +
                "_from_" +
                BaseHelper.RegistryNames.get(unpacked.asItem()), "compression",
                BaseHelper.RegistryNames.get(unpacked.asItem()) +
                "_from_" +
                BaseHelper.RegistryNames.get(map.get("1").get()), "decompression");

        for (int i = 1; i < 5; i++)
            nineBlockStorageRecipes(
                    RecipeCategory.MISC, map.get(String.valueOf(i)).get(),
                    RecipeCategory.MISC, map.get(String.valueOf(i + 1)).get(),
                    BaseHelper.RegistryNames.get(map.get(String.valueOf(i + 1)).get()) +
                    "_from_" +
                    BaseHelper.RegistryNames.get(map.get(String.valueOf(i)).get()), "compression",
                    BaseHelper.RegistryNames.get(map.get(String.valueOf(i)).get()) +
                    "_from_" +
                    BaseHelper.RegistryNames.get(map.get(String.valueOf(i + 1)).get()), "decompression");
    }

    private void generateGear(ItemLike center, ItemLike edge, ItemLike result)
    {
        shaped(RecipeCategory.MISC, result, 1)
                .pattern(" e ")
                .pattern("ece")
                .pattern(" e ")
                .define('e', edge)
                .define('c', center)
                .unlockedBy(RecipeProvider.getHasName(center), has(center))
                .group("materia")
                .save(output);
    }

    private void generateGear(ItemLike center, TagKey<Item> edge, ItemLike result)
    {
        shaped(RecipeCategory.MISC, result, 1)
                .pattern(" e ")
                .pattern("ece")
                .pattern(" e ")
                .define('e', edge)
                .define('c', center)
                .unlockedBy(RecipeProvider.getHasName(center), has(center))
                .group("materia")
                .save(output);
    }

    private void generateGear(TagKey<Item> center, TagKey<Item> edge, ItemLike result)
    {
        shaped(RecipeCategory.MISC, result, 1)
                .pattern(" e ")
                .pattern("ece")
                .pattern(" e ")
                .define('e', edge)
                .define('c', center)
                .unlockedBy("has_" + center.location().getPath(), has(center))
                .group("materia")
                .save(output);
    }

    private void generatePlate(ItemLike ingredient, ItemLike result)
    {
        shaped(RecipeCategory.MISC, result, 1)
                .pattern("ibi")
                .pattern("iii")
                .define('i', ingredient)
                .define('b', ModItems.BINDING_STRING.get())
                .unlockedBy(RecipeProvider.getHasName(ingredient), has(ingredient))
                .group("materia")
                .save(output);
    }

    private void generatePlate(TagKey<Item> ingredient, ItemLike result)
    {
        shaped(RecipeCategory.MISC, result, 1)
                .pattern("ibi")
                .pattern("iii")
                .define('i', ingredient)
                .define('b', ModItems.BINDING_STRING.get())
                .unlockedBy("has_" + ingredient.location().getPath(), has(ingredient))
                .group("materia")
                .save(output);
    }

    private void generateReinforced(ItemLike ingredient, ItemLike result)
    {
        shaped(RecipeCategory.MISC, result, 1)
                .pattern("iii")
                .pattern("iii")
                .define('i', ingredient)
                .unlockedBy(RecipeProvider.getHasName(ingredient), has(ingredient))
                .group("materia")
                .save(output);
    }

    @Deprecated
    private void generateReinforced(TagKey<Item> ingredient, ItemLike result)
    {
        shaped(RecipeCategory.MISC, result, 1)
                .pattern("iii")
                .pattern("iii")
                .define('i', ingredient)
                .unlockedBy("has_" + ingredient.location().getPath(), has(ingredient))
                .group("materia")
                .save(output);
    }

    private void generateRod(ItemLike ingredient, ItemLike result)
    {
        shaped(RecipeCategory.MISC, result, 1)
                .pattern("  i")
                .pattern(" i ")
                .pattern("i  ")
                .define('i', ingredient)
                .unlockedBy(RecipeProvider.getHasName(ingredient), has(ingredient))
                .group("materia")
                .save(output);
    }

    @Deprecated
    private void generateRod(TagKey<Item> ingredient, ItemLike result)
    {
        shaped(RecipeCategory.MISC, result, 1)
                .pattern("  i")
                .pattern(" i ")
                .pattern("i  ")
                .define('i', ingredient)
                .unlockedBy("has_" + ingredient.location().getPath(), has(ingredient))
                .group("materia")
                .save(output);
    }
    //endregion
}