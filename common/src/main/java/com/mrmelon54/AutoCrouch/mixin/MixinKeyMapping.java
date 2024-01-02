package com.mrmelon54.AutoCrouch.mixin;

import com.mojang.blaze3d.platform.InputConstants;
import com.mrmelon54.AutoCrouch.duck.KeyBindingDuckProvider;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(KeyMapping.class)
public class MixinKeyMapping implements KeyBindingDuckProvider {
    @Shadow
    private InputConstants.Key key;

    @Override
    public boolean auto_crouch$isActuallyPressed() {
        long handle = Minecraft.getInstance().getWindow().getWindow();
        int code = key.getValue();
        return InputConstants.isKeyDown(handle, code);
    }
}
