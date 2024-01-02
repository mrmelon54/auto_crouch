package com.mrmelon54.AutoCrouch.autoConfigScreen;

import com.mrmelon54.AutoCrouch.config.ScreenConfig;
import me.shedaniel.autoconfig.gui.registry.api.GuiProvider;
import me.shedaniel.autoconfig.gui.registry.api.GuiRegistryAccess;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import me.shedaniel.clothconfig2.impl.builders.SubCategoryBuilder;
import net.minecraft.network.chat.Component;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ScreenConfigProvider implements GuiProvider {
    @Override
    public List<AbstractConfigListEntry> get(String s, Field field, Object o, Object o1, GuiRegistryAccess guiRegistryAccess) {
        List<AbstractConfigListEntry> list = new ArrayList<>();
        if (o instanceof ScreenConfig screenConfig) {
            Iterator<String> iterator = screenConfig.EnabledScreens.keySet().stream().sorted().iterator();
            SubCategoryBuilder abstractConfigListEntries = ConfigEntryBuilder.create().startSubCategory(Component.literal("In Game Screens")).setExpanded(true);
            while (iterator.hasNext()) {
                final String a = iterator.next();
                Boolean b = screenConfig.EnabledScreens.get(a);
                Component c = Component.literal(a.replace("net.minecraft.client.gui.screens.inventory.", ""));
                abstractConfigListEntries.add(ConfigEntryBuilder.create().startBooleanToggle(c, b).setDefaultValue(true).setSaveConsumer(value -> screenConfig.EnabledScreens.put(a, value)).build());
            }
            list.add(abstractConfigListEntries.build());
        }
        return list;
    }
}
