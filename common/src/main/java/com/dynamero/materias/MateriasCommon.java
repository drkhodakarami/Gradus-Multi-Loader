package com.dynamero.materias;

import com.dynamero.materias.platform.Services;
import com.dynamero.materias.registries.base.ModItems;

import static com.dynamero.materias.MateriasConstants.LOGGER;

public class MateriasCommon
{
    public static void init()
    {
        LOGGER.info("Hello from Common init on {}! we are currently in a {} environment!",
                    Services.PLATFORM.getPlatformName(),
                    Services.PLATFORM.getEnvironmentName());

        // It is common for all supported loaders to provide a similar feature that can not be used directly in the
        // common code. A popular way to get around this is using Java's built-in service loader feature to create
        // your own abstraction layer. You can learn more about this in our provided services class. In this example
        // we have an interface in the common code and use a loader specific implementation to delegate our call to
        // the platform specific approach.
        if (Services.PLATFORM.isModLoaded("materias"))
        {
            MateriasConstants.LOGGER.info("Hello to Materias");
        }

        ModItems.load();
    }
}