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

public class BotaniaBitesItemsCreativeTab {
    public static final ItemGroup BOTANIA_BITES_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(
            "botania-bites-items", BotaniaBites.MOD_ID), FabricItemGroup.builder()
                    .icon(()-> new ItemStack(ItemRegistry.BANANA))
                    .displayName(Text.of("Botania & Bites Items"))
                    .entries((context, entries) -> {
//FOOD
                        entries.add(ItemRegistry.HAMBURGER);
                        entries.add(ItemRegistry.CHEESEBURGER);
                        entries.add(ItemRegistry.SANDWICH);
                        entries.add(ItemRegistry.SALMON_SUSHI);
                        entries.add(ItemRegistry.COD_SUSHI);
                        entries.add(ItemRegistry.CHEESE_WHEEL);
                        entries.add(ItemRegistry.CHEESE);
                        entries.add(ItemRegistry.CHEESE_SLICE);
                        entries.add(ItemRegistry.RAW_BACON);
                        entries.add(ItemRegistry.COOKED_BACON);
//FRUITS
                        entries.add(ItemRegistry.AVOCADO);
                        entries.add(ItemRegistry.BANANA);
                        entries.add(ItemRegistry.BLUEBERRY);
                        entries.add(ItemRegistry.CHERRY);
                        entries.add(ItemRegistry.GRAPE);
                        entries.add(ItemRegistry.KIWI);
                        entries.add(ItemRegistry.LEMON);
                        entries.add(ItemRegistry.PEACH);
                        entries.add(ItemRegistry.PEAR);
                        entries.add(ItemRegistry.PINEAPPLE);
                        entries.add(ItemRegistry.POMEGRANATE);
                        entries.add(ItemRegistry.STRAWBERRY);
//CROPS
                        entries.add(ItemRegistry.BELL_PEPPER);
                        entries.add(ItemRegistry.CORN);
                        entries.add(ItemRegistry.TOMATO);
                        entries.add(ItemRegistry.LEEK);
                        entries.add(ItemRegistry.LETTUCE);
                        entries.add(ItemRegistry.RICE);
//SEEDS
                        entries.add(ItemRegistry.BELL_PEPPER_SEEDS);
                        entries.add(ItemRegistry.CORN_SEEDS);
                        entries.add(ItemRegistry.LEEK_SEEDS);
                        entries.add(ItemRegistry.LETTUCE_SEEDS);
                        entries.add(ItemRegistry.RICE_SEEDS);

                    })
                    .build());

    public static void init(){}
}
