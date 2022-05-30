package com.lach.extraitems;


import com.lach.extraitems.init.iteminit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("lachitems")
public class ExtraItems {

    public static final String MOD_ID = "lachitems";

    public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab(MOD_ID) {



        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
            return new ItemStack(iteminit.EXAMPLE_ITEM.get());

        }

    };


    public ExtraItems() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        iteminit.ITEMS.register(bus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
