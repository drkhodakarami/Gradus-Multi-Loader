package com.dynamero.materias.utils;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

public class ArmorHelper
{
    /**
     * The default constructor for the class
     */
    public ArmorHelper()
    {
        Exceptions.throwArgumentException();
    }

    public static ResourceKey<EquipmentAsset> createId(String modid, String name)
    {
        return ResourceKey.create(EquipmentAssets.ROOT_ID, BaseHelper.id(modid, name));
    }
}