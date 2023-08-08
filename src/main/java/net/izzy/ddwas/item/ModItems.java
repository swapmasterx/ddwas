package net.izzy.ddwas.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.izzy.ddwas.ddwas;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_CITRINE = registerItem("raw_citrine",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item BATTLE_HEAL_BANNER = registerItem("battle_heal_banner",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item BATTERED_LONGSWORD = registerItem("battered_longsword",
            new SwordItem(ModToolMaterials.LEVEL1, 5, -2.95f,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item LONGSWORD = registerItem("longsword",
            new SwordItem(ModToolMaterials.LEVEL2, 5, -2.9f,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item QUESTING_LONGSWORD = registerItem("questing_longsword",
            new SwordItem(ModToolMaterials.LEVEL3, 5, -2.85f,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item GREATSWORD = registerItem("greatsword",
            new SwordItem(ModToolMaterials.LEVEL4, 5, -2.8f,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item THE_LONG_CRUSADE = registerItem("the_long_crusade",
            new SwordItem(ModToolMaterials.LEVEL5, 5, -2.7f,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ddwas.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ddwas.LOGGER.debug("Registering Mod Items for " + ddwas.MOD_ID);
    }
}
