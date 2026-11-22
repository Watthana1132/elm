package com.watt.item;

import com.watt.Elements;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemIds {
    public static final ResourceKey<Item> TERRA_CORE = create("terra_core");
    public static final ResourceKey<Item> OCEAN_HEART = create("ocean_heart");
    public static final ResourceKey<Item> THE_BREATH = create("the_breath");
    public static final ResourceKey<Item> SOLAR_LAMP = create("solar_lamp");
    public static final ResourceKey<Item> MAHABHUTA = create("mahabhuta");

    public static ResourceKey<Item> create(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Elements.MOD_ID, name));
    }
}