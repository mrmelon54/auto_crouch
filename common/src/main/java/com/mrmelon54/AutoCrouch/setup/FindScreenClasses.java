package com.mrmelon54.AutoCrouch.setup;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import com.mrmelon54.AutoCrouch.AutoCrouch;

import java.io.IOException;
import java.util.Set;

public class FindScreenClasses {
    public static void main(String[] args) throws IOException {
        Set<ClassPath.ClassInfo> inGameScreenClasses = getInGameScreenClasses();

        System.out.println("===== START GENERATED CODE =====");
        System.out.println("package com.mrmelon54.AutoCrouch.mappings;\n");
        System.out.println("import net.minecraft.client.gui.screens.Screen;");
        System.out.println("import net.minecraft.client.gui.screens.inventory.*;\n");
        System.out.println("import java.util.HashMap;\nimport java.util.Map;\n");
        System.out.println("public class InGameScreens {");
        System.out.println("    public final static Map<Class<? extends Screen>, String> MAPPINGS = new HashMap<>();\n");
        System.out.println("    static {");
        inGameScreenClasses.forEach(aClass -> {
            String name = aClass.getName();
            for (String classSuffix : ignoreClassSuffix)
                if (name.endsWith(classSuffix)) return;
            System.out.println("        MAPPINGS.put(" + name + ".class, \"" + name + "\");");
        });
        System.out.println("    }");
        System.out.println("}\n");
        System.out.println("===== END GENERATED CODE =====");
    }

    private static ImmutableSet<ClassPath.ClassInfo> getInGameScreenClasses() throws IOException {
        return ClassPath.from(ClassLoader.getSystemClassLoader()).getTopLevelClasses(AutoCrouch.InGameScreenPackageName);
    }

    private final static String[] ignoreClassSuffix = new String[]{
            "CreativeInventoryListener",
            "CyclingSlotBackground",
            "MenuAccess",
            "PageButton",
            "EnchantmentNames",
            "package-info",
    };
}
