package com.dynamero.materias.registries.entities;

import com.dynamero.contracts.exceptions.Exceptions;

public class ModModelLayers
{
    public ModModelLayers()
    {
        Exceptions.throwCtorAssertion();
    }

    static
    {

    }

    public static void load()
    {
        //ClientServices.ENTITY_RENDERER.registerModelLayer(ExampleEntityModel.LAYER_LOCATION, ExampleEntityModel::createBodyLayer);
    }
}