package com.watt.item;

import java.util.function.Function;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final Item TERRA_CORE = register(ModItemIds.TERRA_CORE, Item::new, new Item.Properties().stacksTo(1));
    public static final Item OCEAN_HEART = register(ModItemIds.OCEAN_HEART, Item::new, new Item.Properties().stacksTo(1));
    public static final Item THE_BREATH = register(ModItemIds.THE_BREATH, Item::new, new Item.Properties().stacksTo(1));
    public static final Item SOLAR_LAMP = register(ModItemIds.SOLAR_LAMP, Item::new, new Item.Properties().stacksTo(1));
    public static final Item MAHABHUTA = register(ModItemIds.MAHABHUTA, Item::new, new Item.Properties().stacksTo(1));

    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
        Item item = itemFactory.apply(settings.setId(itemKey));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        return item;
    }

    public static void initialize() {
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.COMBAT).register(tab -> {
            tab.accept(TERRA_CORE);
            tab.accept(OCEAN_HEART);
            tab.accept(THE_BREATH);
            tab.accept(SOLAR_LAMP);
            tab.accept(MAHABHUTA);
        });
    }
}