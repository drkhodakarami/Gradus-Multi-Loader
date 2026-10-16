package com.dynamero.materias.platform;

import com.dynamero.materias.MateriasConstants;
import com.dynamero.materias.platform.services.IPlatformHelper;
import com.dynamero.materias.platform.services.registrars.IItemRegisterar;

import java.util.ServiceLoader;

public class Services
{
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    public static final IItemRegisterar ITEM_REGISTERAR = load(IItemRegisterar.class);

    public static <T> T load(Class<T> clazz)
    {
        final T loadedService = ServiceLoader.load(clazz, Services.class.getClassLoader())
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        MateriasConstants.LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}