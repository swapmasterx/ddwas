package net.izzy.ddwas.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.izzy.ddwas.ddwas;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //Crusader Banners
    public static final Item BATTLE_HEAL_BANNER_LV1 = registerItem("battle_heal_banner_lv1",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item BATTLE_HEAL_BANNER_LV2 = registerItem("battle_heal_banner_lv2",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item BATTLE_HEAL_BANNER_LV3 = registerItem("battle_heal_banner_lv3",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item BATTLE_HEAL_BANNER_LV4 = registerItem("battle_heal_banner_lv4",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item BATTLE_HEAL_BANNER_LV5 = registerItem("battle_heal_banner_lv5",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item INSPIRING_CRY_BANNER_LV1 = registerItem("inspiring_cry_banner_lv1",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item INSPIRING_CRY_BANNER_LV2 = registerItem("inspiring_cry_banner_lv2",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item INSPIRING_CRY_BANNER_LV3 = registerItem("inspiring_cry_banner_lv3",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item INSPIRING_CRY_BANNER_LV4 = registerItem("inspiring_cry_banner_lv4",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item INSPIRING_CRY_BANNER_LV5 = registerItem("inspiring_cry_banner_lv5",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));


    //Crusader Swords
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
    //Crusader Armors LV1
    public static final Item CR_A1_H = registerItem("cr_a1_h",
            new ArmorItem(DDwasArmor.CR_A1, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A1_C = registerItem("cr_a1_c",
            new ArmorItem(DDwasArmor.CR_A1, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A1_L = registerItem("cr_a1_l",
            new ArmorItem(DDwasArmor.CR_A1, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A1_B = registerItem("cr_a1_b",
            new ArmorItem(DDwasArmor.CR_A1, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    //Crusader Armors LV2
    public static final Item CR_A2_H = registerItem("cr_a2_h",
            new ArmorItem(DDwasArmor.CR_A2, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A2_C = registerItem("cr_a2_c",
            new ArmorItem(DDwasArmor.CR_A2, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A2_L = registerItem("cr_a2_l",
            new ArmorItem(DDwasArmor.CR_A2, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A2_B = registerItem("cr_a2_b",
            new ArmorItem(DDwasArmor.CR_A2, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    //Crusader Armors LV3
    public static final Item CR_A3_H = registerItem("cr_a3_h",
            new ArmorItem(DDwasArmor.CR_A3, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A3_C = registerItem("cr_a3_c",
            new ArmorItem(DDwasArmor.CR_A3, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A3_L = registerItem("cr_a3_l",
            new ArmorItem(DDwasArmor.CR_A3, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A3_B = registerItem("cr_a3_b",
            new ArmorItem(DDwasArmor.CR_A3, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    //Crusader Armors LV4
    public static final Item CR_A4_H = registerItem("cr_a4_h",
            new ArmorItem(DDwasArmor.CR_A4, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A4_C = registerItem("cr_a4_c",
            new ArmorItem(DDwasArmor.CR_A4, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A4_L = registerItem("cr_a4_l",
            new ArmorItem(DDwasArmor.CR_A4, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A4_B = registerItem("cr_a4_b",
            new ArmorItem(DDwasArmor.CR_A4, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    //Crusader Armors LV5
    public static final Item CR_A5_H = registerItem("cr_a5_h",
            new ArmorItem(DDwasArmor.CR_A5, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A5_C = registerItem("cr_a5_c",
            new ArmorItem(DDwasArmor.CR_A5, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A5_L = registerItem("cr_a5_l",
            new ArmorItem(DDwasArmor.CR_A5, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));
    public static final Item CR_A5_B = registerItem("cr_a5_b",
            new ArmorItem(DDwasArmor.CR_A5, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.DDWASMISC)));



    //Items
    public static final Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));

    public static final Item RAW_CITRINE = registerItem("raw_citrine",
            new Item(new FabricItemSettings().group(ModItemGroup.DDWASMISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ddwas.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ddwas.LOGGER.debug("Registering Mod Items for " + ddwas.MOD_ID);
    }
}
