package com.herobrine.future.items;

import com.herobrine.future.futurejava;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class dyeblue extends Item {
    public dyeblue() {
        setRegistryName("dyeblue");
        setUnlocalizedName(futurejava.MODID + ".dyeblue");
        setCreativeTab(futureItems.futuretab);
    }

        @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}