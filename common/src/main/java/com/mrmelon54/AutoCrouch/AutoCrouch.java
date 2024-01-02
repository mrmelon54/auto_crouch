package com.mrmelon54.AutoCrouch;

import com.mrmelon54.AutoCrouch.autoConfigScreen.ScreenConfigProvider;
import com.mrmelon54.AutoCrouch.config.ConfigStructure;
import com.mrmelon54.AutoCrouch.mappings.InGameScreens;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.gui.registry.GuiRegistry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.minecraft.client.gui.screens.Screen;

import java.util.Map;
import java.util.function.Supplier;

public class AutoCrouch {
    public static final String MOD_ID = "auto_crouch";
    public final static String InGameScreenPackageName = "net.minecraft.client.gui.screens.inventory";
    private static ConfigStructure config;

    public static ConfigStructure getConfig() {
        return config;
    }

    public static void init() {
        GuiRegistry guiRegistry = AutoConfig.getGuiRegistry(ConfigStructure.class);
        guiRegistry.registerTypeProvider(new ScreenConfigProvider(), Map.class);

        AutoConfig.register(ConfigStructure.class, JanksonConfigSerializer::new);
        config = AutoConfig.getConfigHolder(ConfigStructure.class).getConfig();
        InGameScreens.MAPPINGS.forEach((aClass, s) -> {
            if (!config.screenConfig.EnabledScreens.containsKey(s))
                config.screenConfig.EnabledScreens.put(s, true);
        });
    }

    public static Supplier<Screen> createConfigScreen(Screen screen) {
        return AutoConfig.getConfigScreen(ConfigStructure.class, screen);
    }
}
