package com.mrmelon54.AutoCrouch.forge;

import com.mrmelon54.AutoCrouch.AutoCrouch;
import dev.architectury.platform.forge.EventBuses;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.ConfigScreenHandler.ConfigScreenFactory;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AutoCrouch.MOD_ID)
public class AutoCrouchForge {
    public AutoCrouchForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(AutoCrouch.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ModLoadingContext.get().registerExtensionPoint(ConfigScreenFactory.class, () -> new ConfigScreenFactory((mc, screen) -> AutoCrouch.createConfigScreen(screen).get()));

        AutoCrouch.init();
    }
}
