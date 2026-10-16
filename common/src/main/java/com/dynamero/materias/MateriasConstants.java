package com.dynamero.materias;

import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MateriasConstants
{
    public static final String MODID = "materias";
    public static final String MOD_NAME = "Materias";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static Identifier id(String name)
    {
        return Identifier.fromNamespaceAndPath(MODID, name);
    }
}