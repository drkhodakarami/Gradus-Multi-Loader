package com.dynamero.materias.platform;

import com.dynamero.contracts.annotations.*;
import static com.dynamero.materias.MateriasConstants.LOGGER;
import com.dynamero.materias.platform.services.IPlatformHelper;
import com.dynamero.materias.platform.services.registrars.IBlockItemRegisterar;
import com.dynamero.materias.platform.services.registrars.IBlockRegisterar;
import com.dynamero.materias.platform.services.registrars.IItemRegisterar;
import net.minecraft.references.BlockItemId;

import java.util.ServiceLoader;

@Developer("TheMentor")
@CreatedAt("2026-10-16")
@ModifiedAt("2026-10-16")
@ModifiedBy("TheMentor")
@Website("https://dynamero.com")
@Repository("https://github.com/drkhodakarami/")
@Discord("https://discord.gg/pmM4emCbuH")
@Youtube("https://www.youtube.com/@TheMentorCodeLab")
@Modrinth("https://modrinth.com/user/jiraiyah")
public class Services
{
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    public static final IItemRegisterar ITEMS = load(IItemRegisterar.class);
    public static final IBlockRegisterar BLOCKS = load(IBlockRegisterar.class);
    public static final IBlockItemRegisterar BLOCK_ITEMS = new IBlockItemRegisterar() {};

    public static <T> T load(Class<T> clazz)
    {
        final T loadedService = ServiceLoader.load(clazz, Services.class.getClassLoader())
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        //LOGGER.logC(String.format("Loaded %s for service %s", loadedService, clazz));
        return loadedService;
    }
}