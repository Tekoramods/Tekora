package io.github.tekoramods.nltekora.init;

import io.github.tekoramods.nltekora.NLTekora;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NLTekora.MODID);
    public static final RegistryObject<Block> BAUXITE_ORE = BLOCKS.register("bauxite_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE)));
}
