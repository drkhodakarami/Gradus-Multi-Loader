package com.dynamero.materias.mixin;

import static com.dynamero.materias.MateriasConstants.LOGGER;

import com.dynamero.materias.MateriasConstants;
import net.minecraft.SharedConstants;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinMinecraft {

    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(CallbackInfo info)
    {
        //LOGGER.info("This line is printed by an example mod common mixin!");
        //LOGGER.info("MC Version: {}", SharedConstants.getCurrentVersion().name());
    }
}