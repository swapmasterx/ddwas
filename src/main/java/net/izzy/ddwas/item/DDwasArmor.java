package net.izzy.ddwas.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum DDwasArmor implements ArmorMaterial {
    CR_A1("cr_a1", 40, new int[]{1, 2, 4, 2}, 0,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.5f, 0.00f, () -> Ingredient.ofItems(Items.LEATHER)),
    CR_A2("cr_a2", 40, new int[]{1, 3, 5, 2}, 0,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 1.0f, 0.01f, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    CR_A3("cr_a3", 40, new int[]{2, 4, 6, 2}, 0,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.5f, 0.02f, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    CR_A4("cr_a4", 40, new int[]{2, 5, 7, 3}, 0,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0f, 0.03f, () -> Ingredient.ofItems(Items.DIAMOND)),
    CR_A5("cr_a5", 40, new int[]{3, 6, 8, 3}, 0,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.5f, 0.05f, () -> Ingredient.ofItems(Items.NETHERITE_INGOT));

    private static final int[] BASE_DURABILITY;
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private DDwasArmor(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;

        this.repairIngredientSupplier = new Lazy<Ingredient>(repairIngredientSupplier);
    }

    @Override
    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }



    static {
        BASE_DURABILITY = new int[]{40, 40, 40, 40};
    }
}
