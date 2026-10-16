package com.dynamero.materias;

import com.dynamero.contracts.logger.Logger;
import net.minecraft.resources.Identifier;

public class MateriasConstants
{
    public static final String MODID = "materias";
    public static final String MOD_NAME = "Materias";
    public static final Logger LOGGER = new Logger(MOD_NAME, true);

    public static Identifier id(String name)
    {
        return Identifier.fromNamespaceAndPath(MODID, name);
    }
}