package com.dynamero.materias.registries.base;

import com.dynamero.materias.platform.Services;
import com.dynamero.materias.platform.services.utils.RegistryHandle;
import com.dynamero.materias.utils.Exceptions;
import net.minecraft.world.item.Item;

public class ModItems
{
    public static final RegistryHandle<Item>
            CARMINIS
            ;

    public ModItems()
    {
        Exceptions.throwCtorAssertion();
    }

    static
    {
        CARMINIS = Services.ITEM_REGISTERAR.register("gem_carminis");
    }

    public static void load()
    {

    }
}