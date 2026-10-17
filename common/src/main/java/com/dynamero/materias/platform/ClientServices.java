package com.dynamero.materias.platform;

import com.dynamero.contracts.exceptions.Exceptions;
import com.dynamero.materias.platform.services.client.registrars.IEntityRendererRegistrar;

public final class ClientServices
{
    public static final IEntityRendererRegistrar ENTITY_RENDERER = Services.load(IEntityRendererRegistrar.class);

    public ClientServices()
    {
        Exceptions.throwCtorAssertion();
    }
}