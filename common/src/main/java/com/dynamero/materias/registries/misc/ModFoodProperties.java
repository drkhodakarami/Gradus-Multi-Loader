package com.dynamero.materias.registries.misc;

import com.dynamero.contracts.exceptions.Exceptions;
import net.minecraft.world.food.FoodProperties;

public final class ModFoodProperties
{
    public static final FoodProperties COOKED_EGG, EGG_AND_BREAD;

    public ModFoodProperties()
    {
        Exceptions.throwCtorAssertion();
    }

    static
    {
        COOKED_EGG = new FoodProperties.Builder()
                .nutrition(4) //2 hunger bars
                .saturationModifier(0.55F)
                //.alwaysEdible()//Still eat if you are full !
                .build();

        EGG_AND_BREAD = new FoodProperties.Builder()
                .nutrition(11) //5.5 hunger bars
                .saturationModifier(1.2F)
                //.alwaysEdible()//Still eat if you are full !
                .build();
    }
}