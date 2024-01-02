package com.mrmelon54.AutoCrouch.config;

import com.mrmelon54.AutoCrouch.annotation.ScreenMapAnnotation;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

import java.util.HashMap;
import java.util.Map;

@Config(name = "screen-config")
public class ScreenConfig implements ConfigData {
    @ScreenMapAnnotation
    public Map<String, Boolean> EnabledScreens = new HashMap<>();
}
