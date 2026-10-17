package com.dynamero.materias.datagen.extra;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;

import static com.dynamero.materias.MateriasConstants.MODID;

public class ModSoundsProvider extends SoundDefinitionsProvider
{
    public ModSoundsProvider(PackOutput output)
    {
        super(output, MODID);
    }

    @Override
    public void registerSounds()
    {

    }
}