package net.izzy.ddwas.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    LEVEL1(MiningLevels.IRON, 99999, 6.0f, 0.0f, 0, () -> Ingredient.fromTag(ItemTags.PLANKS)),
    LEVEL2(MiningLevels.IRON, 99999, 6.0f, 1.0f, 0, () -> Ingredient.fromTag(ItemTags.STONE_TOOL_MATERIALS)),
    LEVEL3(MiningLevels.IRON, 99999, 6.0f, 2.0f, 0, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    LEVEL4(MiningLevels.IRON, 99999, 6.0f, 3.0f, 0, () -> Ingredient.ofItems(Items.DIAMOND)),
    LEVEL5(MiningLevels.IRON, 99999, 6.0f, 4.0f, 0, () -> Ingredient.ofItems(Items.GOLD_INGOT));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
