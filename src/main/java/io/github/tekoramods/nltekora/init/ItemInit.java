package io.github.tekoramods.nltekora.init;

import io.github.tekoramods.nltekora.NLTekora;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NLTekora.MODID);
    public static final RegistryObject<Item> BAUXITE = ITEMS.register("bauxite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<BlockItem> BAUXITE_ORE_ITEM = ITEMS.register("bauxite_ore", () -> new BlockItem(BlockInit.BAUXITE_ORE.get(), new Item.Properties()));
}
