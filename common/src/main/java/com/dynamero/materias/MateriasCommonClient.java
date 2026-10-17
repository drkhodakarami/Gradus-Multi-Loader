package com.dynamero.materias;

import com.dynamero.contracts.exceptions.Exceptions;
import com.dynamero.materias.registries.entities.ModEntityRenderers;
import com.dynamero.materias.registries.entities.ModModelLayers;

public final class MateriasCommonClient
{
    private static boolean initialized;

    public MateriasCommonClient()
    {
        Exceptions.throwCtorAssertion();
    }

    public static void init()
    {
        if(initialized)
            return;

        ModModelLayers.load();
        ModEntityRenderers.load();

        initialized = true;
    }
}