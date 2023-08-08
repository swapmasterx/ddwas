package net.izzy.ddwas.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.izzy.ddwas.ddwas;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup DDWASMISC = FabricItemGroupBuilder.build(
            new Identifier(ddwas.MOD_ID,"ddwasmisc"), () -> new ItemStack(ModItems.CITRINE));

}
