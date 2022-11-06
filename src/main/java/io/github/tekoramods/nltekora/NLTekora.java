package io.github.tekoramods.nltekora;

import io.github.tekoramods.nltekora.init.BlockInit;
import io.github.tekoramods.nltekora.init.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(NLTekora.MODID)
public class NLTekora {
    public static final String MODID = "nltekora";
    public NLTekora() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BlockInit.BLOCKS.register(bus);
        ItemInit.ITEMS.register(bus);
    }
}