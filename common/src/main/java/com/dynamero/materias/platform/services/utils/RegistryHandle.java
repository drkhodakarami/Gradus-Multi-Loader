package com.dynamero.materias.platform.services.utils;

import com.dynamero.contracts.annotations.*;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;

import java.util.function.Supplier;

@Developer("TheMentor")
@CreatedAt("2026-10-16")
@ModifiedAt("2026-10-16")
@ModifiedBy("TheMentor")
@Website("https://dynamero.com")
@Repository("https://github.com/drkhodakarami/")
@Discord("https://discord.gg/pmM4emCbuH")
@Youtube("https://www.youtube.com/@TheMentorCodeLab")
@Modrinth("https://modrinth.com/user/jiraiyah")
public interface RegistryHandle<T> extends Supplier<T>
{
    Identifier id();
    ResourceKey<? super T> key();
}