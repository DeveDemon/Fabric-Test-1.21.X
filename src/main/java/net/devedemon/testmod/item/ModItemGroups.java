package net.devedemon.testmod.item;

import net.devedemon.testmod.TestMod;
import net.devedemon.testmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TEST_MOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestMod.MOD_ID, "test_mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MITHRIL_INGOT))
                    .displayName(Text.translatable("itemgroup.testmod.test_mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CAT_PNG);
                        entries.add(ModBlocks.MITHRIL_ORE);
                        entries.add(ModItems.MITHRIL_INGOT);
                    }).build());


    public static void registerItemGroups() {
        TestMod.LOGGER.info("Registering Item Groups for " + TestMod.MOD_ID);
    }
}
