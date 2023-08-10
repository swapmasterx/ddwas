package net.izzy.ddwas.item.ArmorAtribs.crusader;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CrA1Bonus extends ArmorItem {

    protected final Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    public CrA1Bonus(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);

        ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(super.getAttributeModifiers(slot));

        switch (slot) {
            case HEAD:
                // Add attribute modifiers here
                builder.put(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, new EntityAttributeModifier("Knockback modifier", 1.5, EntityAttributeModifier.Operation.ADDITION));
                break;
            case CHEST:
                builder.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier("Damage modifier", 1.5, EntityAttributeModifier.Operation.ADDITION));
                break;
            case LEGS:
                builder.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier("Health modifier", 1.5, EntityAttributeModifier.Operation.ADDITION));
                break;
            case FEET:
                builder.put(EntityAttributes.GENERIC_MOVEMENT_SPEED, new EntityAttributeModifier("Speed modifier", 1.5, EntityAttributeModifier.Operation.ADDITION));
                break;
            default:
                break;
        }

        this.attributeModifiers = builder.build();
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        return slot == this.getSlotType() ? this.attributeModifiers : super.getAttributeModifiers(slot);
    }
}

