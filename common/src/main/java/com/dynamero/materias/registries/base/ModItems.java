package com.dynamero.materias.registries.base;

import com.dynamero.contracts.annotations.*;
import com.dynamero.contracts.exceptions.Exceptions;
import com.dynamero.materias.platform.Services;
import com.dynamero.materias.platform.services.utils.ItemHandle;
import com.dynamero.materias.registries.misc.ModFoodConsumables;
import com.dynamero.materias.registries.misc.ModFoodProperties;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.Consumable;

import static com.dynamero.materias.MateriasConstants.LOG;

@Developer("TheMentor")
@CreatedAt("2026-10-16")
@ModifiedAt("2026-10-16")
@ModifiedBy("TheMentor")
@Website("https://dynamero.com")
@Repository("https://github.com/drkhodakarami/")
@Discord("https://discord.gg/pmM4emCbuH")
@Youtube("https://www.youtube.com/@TheMentorCodeLab")
@Modrinth("https://modrinth.com/user/jiraiyah")
public class ModItems
{
    public static final ItemHandle<Item>
            CARMINIS, FLAVUM, GLAUCUS,

            RAW_CARMINIS, RAW_FLAVUM, RAW_GLAUCUS, RAW_QUARTZ, RAW_RUBBER, RAW_EXODIUM,

            BINDING_STRING, RUBBER, SOLIDIFIED_EXPERIENCE, THERMAL_CORE,

            COOKED_EGG, EGG_AND_BREAD,

            ENDER_CHARM, ENDERMAN_EYE, ENDERMAN_GLAND, ENDERMAN_HEART,

            HOT_COAL,

            INGOT_EXODIUM,

            MOLTEN_EXODIUM_BUCKET,

            GEAR_COPPER, GEAR_DIAMOND, GEAR_EMERALD, GEAR_EXODIUM, GEAR_ENERGIZED, GEAR_GOLD, GEAR_IRON, GEAR_LAPIS, GEAR_NETHERITE,
            GEAR_OBSIDIAN, GEAR_PRISMARINE, GEAR_QUARTZ, GEAR_CARMINIS, GEAR_GLAUCUS, GEAR_SHULKER, GEAR_STONE, GEAR_VIBRANT, GEAR_WOOD,

            PLATE_AMETHYST, PLATE_FLAVUM, PLATE_COPPER, PLATE_DIAMOND, PLATE_EMERALD, PLATE_EXODIUM, PLATE_GOLD, PLATE_IRON, PLATE_NETHERITE, PLATE_CARMINIS,
            PLATE_GLAUCUS, PLATE_SHULKER, PLATE_STONE,

            REINFORCED_PLATE_AMETHYST, REINFORCED_PLATE_FLAVUM, REINFORCED_PLATE_COPPER, REINFORCED_PLATE_DIAMOND, REINFORCED_PLATE_EMERALD,
            REINFORCED_PLATE_EXODIUM, REINFORCED_PLATE_GOLD, REINFORCED_PLATE_IRON, REINFORCED_PLATE_NETHERITE, REINFORCED_PLATE_CARMINIS,
            REINFORCED_PLATE_GLAUCUS, REINFORCED_PLATE_SHULKER,

            ROD_COPPER, ROD_EXODIUM, ROD_GLOWSTONE, ROD_GOLD, ROD_IRON, ROD_OBSIDIAN, ROD_REDSTONE, ROD_SHULKER
            ;

    public ModItems()
    {
        Exceptions.throwCtorAssertion();
    }

    static
    {
        //region GEMS
        CARMINIS = Services.ITEMS.register("gem_carminis");
        FLAVUM = Services.ITEMS.register("gem_flavum");
        GLAUCUS = Services.ITEMS.register("gem_glaucus");
        //endregion

        //region RAW
        RAW_CARMINIS = Services.ITEMS.register("raw_carminis");
        RAW_FLAVUM = Services.ITEMS.register("raw_flavum");
        RAW_GLAUCUS = Services.ITEMS.register("raw_glaucus");

        RAW_QUARTZ = Services.ITEMS.register("raw_quartz");
        RAW_RUBBER = Services.ITEMS.register("raw_rubber");
        RAW_EXODIUM = Services.ITEMS.register("raw_exodium");
        //endregion

        //region MISC
        BINDING_STRING = Services.ITEMS.register("binding_string");
        RUBBER = Services.ITEMS.register("rubber");
        SOLIDIFIED_EXPERIENCE = Services.ITEMS.register("solidified_exp");
        THERMAL_CORE = Services.ITEMS.register("thermal_core");
        HOT_COAL = Services.ITEMS.register("hot_coal");
        ENDER_CHARM = Services.ITEMS.register("ender_charm");
        ENDERMAN_EYE = Services.ITEMS.register("enderman_eye");
        ENDERMAN_GLAND = Services.ITEMS.register("enderman_gland");
        ENDERMAN_HEART = Services.ITEMS.register("enderman_heart");
        //endregion

        //region FOOD
        COOKED_EGG = Services.ITEMS.registerFood("cooked_egg", 16,
                                                 ModFoodProperties.COOKED_EGG,
                                                 ModFoodConsumables.COOKED_EGG);
        EGG_AND_BREAD = Services.ITEMS.registerFood("egg_and_bread", 16,
                                                    ModFoodProperties.EGG_AND_BREAD,
                                                    ModFoodConsumables.EGG_AND_BREAD);
        //endregion

        MOLTEN_EXODIUM_BUCKET = Services.ITEMS.register("molten_exodium_bucket");
        INGOT_EXODIUM = Services.ITEMS.register("ingot_exodium");
        
        //region GEAR
        GEAR_COPPER = Services.ITEMS.register("gear_copper");
        GEAR_DIAMOND = Services.ITEMS.register("gear_diamond");
        GEAR_EMERALD = Services.ITEMS.register("gear_emerald");
        GEAR_EXODIUM = Services.ITEMS.register("gear_exodium");
        GEAR_ENERGIZED = Services.ITEMS.register("gear_energized");
        GEAR_GOLD = Services.ITEMS.register("gear_gold");
        GEAR_IRON = Services.ITEMS.register("gear_iron");
        GEAR_LAPIS = Services.ITEMS.register("gear_lapis");
        GEAR_NETHERITE = Services.ITEMS.register("gear_netherite");
        GEAR_OBSIDIAN = Services.ITEMS.register("gear_obsidian");
        GEAR_PRISMARINE = Services.ITEMS.register("gear_prismarine");
        GEAR_QUARTZ = Services.ITEMS.register("gear_quartz");
        GEAR_CARMINIS = Services.ITEMS.register("gear_carminis");
        GEAR_GLAUCUS = Services.ITEMS.register("gear_glaucus");
        GEAR_SHULKER = Services.ITEMS.register("gear_shulker");
        GEAR_STONE = Services.ITEMS.register("gear_stone");
        GEAR_VIBRANT = Services.ITEMS.register("gear_vibrant");
        GEAR_WOOD = Services.ITEMS.register("gear_wood");
        //endregion
        
        //region PLATE
        PLATE_AMETHYST = Services.ITEMS.register("plate_amethyst");
        PLATE_FLAVUM = Services.ITEMS.register("plate_flavum");
        PLATE_COPPER = Services.ITEMS.register("plate_copper");
        PLATE_DIAMOND = Services.ITEMS.register("plate_diamond");
        PLATE_EMERALD = Services.ITEMS.register("plate_emerald");
        PLATE_EXODIUM = Services.ITEMS.register("plate_exodium");
        PLATE_GOLD = Services.ITEMS.register("plate_gold");
        PLATE_IRON = Services.ITEMS.register("plate_iron");
        PLATE_NETHERITE = Services.ITEMS.register("plate_netherite");
        PLATE_CARMINIS = Services.ITEMS.register("plate_carminis");
        PLATE_GLAUCUS = Services.ITEMS.register("plate_glaucus");
        PLATE_SHULKER = Services.ITEMS.register("plate_shulker");
        PLATE_STONE = Services.ITEMS.register("plate_stone");
        //endregion
        
        //region REINFORCED PLATE
        REINFORCED_PLATE_AMETHYST = Services.ITEMS.register("reinforced_amethyst");
        REINFORCED_PLATE_FLAVUM = Services.ITEMS.register("reinforced_flavum");
        REINFORCED_PLATE_COPPER = Services.ITEMS.register("reinforced_copper");
        REINFORCED_PLATE_DIAMOND = Services.ITEMS.register("reinforced_diamond");
        REINFORCED_PLATE_EMERALD = Services.ITEMS.register("reinforced_emerald");
        REINFORCED_PLATE_EXODIUM = Services.ITEMS.register("reinforced_exodium");
        REINFORCED_PLATE_GOLD = Services.ITEMS.register("reinforced_gold");
        REINFORCED_PLATE_IRON = Services.ITEMS.register("reinforced_iron");
        REINFORCED_PLATE_NETHERITE = Services.ITEMS.register("reinforced_netherite");
        REINFORCED_PLATE_CARMINIS = Services.ITEMS.register("reinforced_carminis");
        REINFORCED_PLATE_GLAUCUS = Services.ITEMS.register("reinforced_glaucus");
        REINFORCED_PLATE_SHULKER = Services.ITEMS.register("reinforced_shulker");
        //endregion
        
        //region ROD
        ROD_COPPER = Services.ITEMS.register("rod_copper");
        ROD_EXODIUM = Services.ITEMS.register("rod_exodium");
        ROD_GLOWSTONE = Services.ITEMS.register("rod_glowstone");
        ROD_GOLD = Services.ITEMS.register("rod_gold");
        ROD_IRON = Services.ITEMS.register("rod_iron");
        ROD_OBSIDIAN = Services.ITEMS.register("rod_obsidian");
        ROD_REDSTONE = Services.ITEMS.register("rod_redstone");
        ROD_SHULKER = Services.ITEMS.register("rod_shulker");
        //endregion
    }

    public static void load()
    {
        LOG.logItemInit();
    }
}