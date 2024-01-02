package com.mrmelon54.AutoCrouch.fabric;

import com.mrmelon54.AutoCrouch.fabriclike.AutoCrouchFabricLike;
import net.fabricmc.api.ModInitializer;

public class AutoCrouchFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AutoCrouchFabricLike.init();
    }
}
