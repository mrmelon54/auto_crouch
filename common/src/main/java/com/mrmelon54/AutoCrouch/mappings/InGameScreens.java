package com.mrmelon54.AutoCrouch.mappings;

import net.minecraft.client.gui.screens.Screen;

import java.util.HashMap;
import java.util.Map;

public class InGameScreens {
    public final static Map<Class<? extends Screen>, String> MAPPINGS = new HashMap<>();

    static {
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.BrewingStandScreen.class, "net.minecraft.client.gui.screens.inventory.BrewingStandScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.BlastFurnaceScreen.class, "net.minecraft.client.gui.screens.inventory.BlastFurnaceScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen.class, "net.minecraft.client.gui.screens.inventory.AbstractFurnaceScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.AnvilScreen.class, "net.minecraft.client.gui.screens.inventory.AnvilScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.ContainerScreen.class, "net.minecraft.client.gui.screens.inventory.ContainerScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.AbstractCommandBlockEditScreen.class, "net.minecraft.client.gui.screens.inventory.AbstractCommandBlockEditScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.BeaconScreen.class, "net.minecraft.client.gui.screens.inventory.BeaconScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.FurnaceScreen.class, "net.minecraft.client.gui.screens.inventory.FurnaceScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.DispenserScreen.class, "net.minecraft.client.gui.screens.inventory.DispenserScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.AbstractSignEditScreen.class, "net.minecraft.client.gui.screens.inventory.AbstractSignEditScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.HopperScreen.class, "net.minecraft.client.gui.screens.inventory.HopperScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.GrindstoneScreen.class, "net.minecraft.client.gui.screens.inventory.GrindstoneScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.CartographyTableScreen.class, "net.minecraft.client.gui.screens.inventory.CartographyTableScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.HorseInventoryScreen.class, "net.minecraft.client.gui.screens.inventory.HorseInventoryScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.ItemCombinerScreen.class, "net.minecraft.client.gui.screens.inventory.ItemCombinerScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.EnchantmentScreen.class, "net.minecraft.client.gui.screens.inventory.EnchantmentScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.LecternScreen.class, "net.minecraft.client.gui.screens.inventory.LecternScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.AbstractContainerScreen.class, "net.minecraft.client.gui.screens.inventory.AbstractContainerScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.MinecartCommandBlockEditScreen.class, "net.minecraft.client.gui.screens.inventory.MinecartCommandBlockEditScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.InventoryScreen.class, "net.minecraft.client.gui.screens.inventory.InventoryScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.JigsawBlockEditScreen.class, "net.minecraft.client.gui.screens.inventory.JigsawBlockEditScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.ShulkerBoxScreen.class, "net.minecraft.client.gui.screens.inventory.ShulkerBoxScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen.class, "net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.HangingSignEditScreen.class, "net.minecraft.client.gui.screens.inventory.HangingSignEditScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.CommandBlockEditScreen.class, "net.minecraft.client.gui.screens.inventory.CommandBlockEditScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.BookViewScreen.class, "net.minecraft.client.gui.screens.inventory.BookViewScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.SignEditScreen.class, "net.minecraft.client.gui.screens.inventory.SignEditScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.CraftingScreen.class, "net.minecraft.client.gui.screens.inventory.CraftingScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.SmokerScreen.class, "net.minecraft.client.gui.screens.inventory.SmokerScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.BookEditScreen.class, "net.minecraft.client.gui.screens.inventory.BookEditScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.MerchantScreen.class, "net.minecraft.client.gui.screens.inventory.MerchantScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.LoomScreen.class, "net.minecraft.client.gui.screens.inventory.LoomScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.SmithingScreen.class, "net.minecraft.client.gui.screens.inventory.SmithingScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.StonecutterScreen.class, "net.minecraft.client.gui.screens.inventory.StonecutterScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen.class, "net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen");
        MAPPINGS.put(net.minecraft.client.gui.screens.inventory.StructureBlockEditScreen.class, "net.minecraft.client.gui.screens.inventory.StructureBlockEditScreen");
    }
}
