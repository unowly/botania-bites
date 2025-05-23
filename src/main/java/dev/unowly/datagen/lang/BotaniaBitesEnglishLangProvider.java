package dev.unowly.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BotaniaBitesEnglishLangProvider extends FabricLanguageProvider {
    public BotaniaBitesEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput,"en_us" ,registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.botania-bites.hamburger", "Hamburger");
        translationBuilder.add("item.botania-bites.cheeseburger", "Cheeseburger");
        translationBuilder.add("item.botania-bites.sandwich", "Sandwich");
        translationBuilder.add("item.botania-bites.salmon_sushi", "Salmon Sushi");
        translationBuilder.add("item.botania-bites.cod_sushi", "Cod Sushi");
        translationBuilder.add("item.botania-bites.cheese_wheel", "Cheese Wheel");
        translationBuilder.add("item.botania-bites.cheese", "Cheese");
        translationBuilder.add("item.botania-bites.cheese_slice", "Cheese Slice");
        translationBuilder.add("item.botania-bites.raw_bacon", "Raw Bacon");
        translationBuilder.add("item.botania-bites.cooked_bacon", "Bacon");


        translationBuilder.add("item.botania-bites.bell_pepper", "Bell Pepper");
        translationBuilder.add("item.botania-bites.bell_pepper_seeds", "Bell Pepper Seeds");
        translationBuilder.add("item.botania-bites.corn", "Corn");
        translationBuilder.add("item.botania-bites.corn_seeds", "Corn Seeds");
        translationBuilder.add("item.botania-bites.tomato", "Tomato");
        translationBuilder.add("item.botania-bites.rice", "Rice");
        translationBuilder.add("item.botania-bites.rice_seeds", "Rice Seeds");
        translationBuilder.add("item.botania-bites.leek", "Leek");
        translationBuilder.add("item.botania-bites.leek_seeds", "Leek Seeds");
        translationBuilder.add("item.botania-bites.lettuce", "Lettuce");
        translationBuilder.add("item.botania-bites.lettuce_seeds", "Lettuce Seeds");

        translationBuilder.add("item.botania-bites.avocado", "Avocado");
        translationBuilder.add("item.botania-bites.banana", "Banana");
        translationBuilder.add("item.botania-bites.blueberry", "Blueberry");
        translationBuilder.add("item.botania-bites.cherry", "Cherry");
        translationBuilder.add("item.botania-bites.grape", "Grape");
        translationBuilder.add("item.botania-bites.kiwi", "Kiwi");
        translationBuilder.add("item.botania-bites.lemon", "Lemon");
        translationBuilder.add("item.botania-bites.peach", "Peach");
        translationBuilder.add("item.botania-bites.pear", "Pear");
        translationBuilder.add("item.botania-bites.pineapple", "Pineapple");
        translationBuilder.add("item.botania-bites.pomegranate", "Pomegranate");
        translationBuilder.add("item.botania-bites.strawberry", "Strawberry");

        translationBuilder.add("tag.item.botania-bites.botania_bites_fruits", "Botania & Bites Fruits");
        translationBuilder.add("tag.item.botania-bites.botania_bites_crops", "Botania & Bites Crops");
        translationBuilder.add("tag.item.botania-bites.botania_bites_berries", "Botania & Bites Berries");
        translationBuilder.add("tag.item.botania-bites.botania_bites_seeds", "Botania & Bites Seeds");

    }
}
