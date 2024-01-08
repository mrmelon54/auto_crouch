package com.mrmelon54.AutoCrouch.mixin;

import com.mojang.blaze3d.platform.InputConstants;
import com.mrmelon54.AutoCrouch.AutoCrouch;
import com.mrmelon54.AutoCrouch.duck.KeyBindingDuckProvider;
import dev.architectury.registry.client.keymappings.KeyMappingRegistry;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyMapping.class)
public class MixinKeyMapping implements KeyBindingDuckProvider {
    @Shadow
    private InputConstants.Key key;

    @Shadow
    private boolean isDown;

    @Override
    public boolean auto_crouch$isActuallyPressed() {
        long handle = Minecraft.getInstance().getWindow().getWindow();
        int code = key.getValue();
        return InputConstants.isKeyDown(handle, code);
    }

    @Inject(method = "setDown", at = @At("HEAD"), cancellable = true)
    private void modifiedSetDown(boolean bl, CallbackInfo ci) {
        if (!Minecraft.getInstance().options.keyShift.same((KeyMapping) (Object) this)) return;
        if (AutoCrouch.isShiftHeld) {
            isDown = true;
            ci.cancel();
        }
    }
}
