package net.mistersecret312.trinkap.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.mistersecret312.trinkap.TrinkapMod;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TrinkapMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TrinkapMod.LOGGER.info("Registering Mod Items for " + TrinkapMod.MOD_ID);
    }
}
