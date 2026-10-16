package com.dynamero.materias.registries.base;

import com.dynamero.contracts.annotations.*;
import com.dynamero.contracts.exceptions.Exceptions;
import com.dynamero.materias.platform.Services;
import com.dynamero.materias.platform.services.utils.RegistryHandle;
import net.minecraft.world.item.Item;

import static com.dynamero.materias.MateriasConstants.LOGGER;

@Developer("TheMentor")
@CreatedAt("2026-10-16")
@ModifiedAt("2026-10-16")
@ModifiedBy("TheMentor")
@Website("https://dynamero.com")
@Repository("https://github.com/drkhodakarami/")
@Discord("https://discord.gg/pmM4emCbuH")
@Youtube("https://www.youtube.com/@TheMentorCodeLab")
@Modrinth("https://modrinth.com/user/jiraiyah")
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
        CARMINIS = Services.ITEMS.register("gem_carminis");
    }

    public static void load()
    {
        LOGGER.logItemInit();
    }
}