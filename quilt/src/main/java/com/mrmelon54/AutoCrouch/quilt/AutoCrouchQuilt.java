package com.mrmelon54.AutoCrouch.quilt;

import com.mrmelon54.AutoCrouch.fabriclike.AutoCrouchFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class AutoCrouchQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        AutoCrouchFabricLike.init();
    }
}
