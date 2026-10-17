package com.dynamero.materias.platform;

import com.dynamero.contracts.annotations.*;
import com.dynamero.materias.platform.services.IPlatformHelper;
import com.dynamero.materias.platform.services.registrars.*;

import java.util.ServiceLoader;

@SuppressWarnings("UnnecessaryLocalVariable")
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
    public static final IEntityRegisterar ENTITIES = load(IEntityRegisterar.class);
    public static final IEntityAttributeRegisterar ENTITIE_ATTRIBUTES = load(IEntityAttributeRegisterar.class);
    public static final ICreativeTabRegistrar CREATIVE_TAB_REGISTRAR = load(ICreativeTabRegistrar.class);
    public static final IConsumeEffectRegistrar CONSUME_EFFECT_REGISTRAR = load(IConsumeEffectRegistrar.class);

    public static <T> T load(Class<T> clazz)
    {
        final T loadedService = ServiceLoader.load(clazz, Services.class.getClassLoader())
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        //LOGGER.logC(String.format("Loaded %s for service %s", loadedService, clazz));
        return loadedService;
    }
}