package com.dynamero.materias.datagen.misc;

import net.minecraft.ChatFormatting;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.decoration.painting.PaintingVariant;

import java.util.Optional;

public class ModPaintings
{
    public static void bootstrap(BootstrapContext<PaintingVariant> context)
    {

    }

    private static void register(final BootstrapContext<PaintingVariant> context, final ResourceKey<PaintingVariant> key,
                                 final int width, final int height, final boolean hasAuthor)
    {
        context.register(key,
                         new PaintingVariant(width, height, key.identifier(),
                                             Optional.of(Component.translatable(key.identifier().toLanguageKey("painting", "title"))
                                                                  .withStyle(ChatFormatting.YELLOW)),
                                             hasAuthor ? Optional.of(Component.translatable(key.identifier().toLanguageKey("painting", "author"))
                                                                              .withStyle(ChatFormatting.GRAY)) : Optional.empty()));
    }
}