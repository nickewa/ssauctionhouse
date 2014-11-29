package com.serendipitymc.mods.auctionhouse.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemAuctionTool extends Item {
	public ItemAuctionTool() {
		setMaxStackSize(1);
		this.setUnlocalizedName("Auction Tool");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List infoList, boolean advancedTooltips) {
		super.addInformation(stack, player, infoList, advancedTooltips);
		infoList.add("Rightclick to open the auction house");
		
	}
}
