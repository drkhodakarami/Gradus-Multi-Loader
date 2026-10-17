package com.dynamero.materias.datagen.extra;

import net.minecraft.advancements.Advancement;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.advancements.AdvancementProvider;
import net.minecraft.data.advancements.AdvancementSubProvider;
import net.minecraft.data.worldgen.BootstrapContext;

import java.util.List;

public class ModAdvancements extends AdvancementProvider
{
    public ModAdvancements(BootstrapContext<Advancement> context)
    {
        super(List.of(
                ModSubAdvancements::new
        ));
    }

    public static class ModSubAdvancements extends AdvancementSubProvider
    {

        protected ModSubAdvancements(BootstrapContext<Advancement> output)
        {
            super(output);
        }

        @Override
        public void generate()
        {
            var items = output.lookup(Registries.ITEM);
            var blocks = output.lookup(Registries.BLOCK);
        }
    }
}