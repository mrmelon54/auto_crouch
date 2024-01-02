package com.mrmelon54.AutoCrouch.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "auto_crouch")
@Config.Gui.Background("minecraft:textures/block/dark_oak_log.png")
public class ConfigStructure implements ConfigData {
    @ConfigEntry.Category("main_config")
    @ConfigEntry.Gui.TransitiveObject
    public MainConfig mainConfig = new MainConfig();
    @ConfigEntry.Category("screen_config")
    @ConfigEntry.Gui.TransitiveObject
    public ScreenConfig screenConfig = new ScreenConfig();
}
