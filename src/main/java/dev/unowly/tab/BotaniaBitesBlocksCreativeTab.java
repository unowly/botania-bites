package dev.unowly.tab;

import dev.unowly.BotaniaBites;
import dev.unowly.item.ItemRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class BotaniaBitesBlocksCreativeTab {
    public static final ItemGroup BOTANIA_BITES_BLOCKS = Registry.register(Registries.ITEM_GROUP, Identifier.of(
            "botania-bites-blocks", BotaniaBites.MOD_ID), FabricItemGroup.builder()
            .icon(()-> new ItemStack(ItemRegistry.BANANA))
            .displayName(Text.of("Botania & Bites Blocks"))
            .entries((context, entries) -> {

            })
            .build());

    public static void init(){}
}
