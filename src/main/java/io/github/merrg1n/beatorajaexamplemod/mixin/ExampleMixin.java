package io.github.merrg1n.beatorajaexamplemod.mixin;

import bms.player.beatoraja.BMSPlayerMode;
import bms.player.beatoraja.Config;
import bms.player.beatoraja.MainController;
import bms.player.beatoraja.PlayerConfig;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.nio.file.Path;

@Mixin(MainController.class)
public class ExampleMixin {
    @Inject(method = "<init>", at = @At("TAIL"))
    private void onCreate(Path par1, Config par2, PlayerConfig par3, BMSPlayerMode par4, boolean par5, CallbackInfo ci) {
        System.out.println("hello from mixin");
    }
}
