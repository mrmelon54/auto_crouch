package com.mrmelon54.AutoCrouch.mixin;

import com.mrmelon54.AutoCrouch.AutoCrouch;
import com.mrmelon54.AutoCrouch.config.ConfigStructure;
import com.mrmelon54.AutoCrouch.duck.KeyBindingDuckProvider;
import com.mrmelon54.AutoCrouch.mappings.InGameScreens;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraft.client.gui.screens.ChatScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.player.LocalPlayer;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class MixinMinecraft {
    @Shadow
    @Nullable
    public LocalPlayer player;

    @Shadow
    @Final
    public Options options;

    @Inject(method = "setScreen", at = @At("HEAD"))
    private void setScreenInjected(Screen screen, CallbackInfo ci) {
        if (screen == null) {
            if (options.keyShift instanceof KeyBindingDuckProvider duckProvider)
                AutoCrouch.setShiftHeld(duckProvider.auto_crouch$isActuallyPressed());
            return;
        }
        ConfigStructure config = AutoCrouch.getConfig();
        if (player == null || !player.onClimbable() || player.getAbilities().flying) return;
        if (config.mainConfig.EnableChat && screen.getClass() == ChatScreen.class)
            AutoCrouch.setShiftHeld(true);
        if (config.mainConfig.EnableGUIs && config.screenConfig.EnabledScreens.getOrDefault(InGameScreens.MAPPINGS.get(screen.getClass()), false))
            AutoCrouch.setShiftHeld(true);
    }
}
