package com.dynamero.materias.registries.entities;

import com.dynamero.contracts.exceptions.Exceptions;

public class ModEntityRenderers
{
    public ModEntityRenderers()
    {
        Exceptions.throwCtorAssertion();
    }

    static
    {

    }

    public static void load()
    {
        //ClientServices.ENTITY_RENDERER.register(ModEntityTypes.EXAMPLE_ENTITY.get(), ExampleEntityRenderer::new);
    }
}