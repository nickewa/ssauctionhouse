package com.serendipitymc.mods.auctionhouse;

import com.serendipitymc.mods.auctionhouse.item.ItemAuctionTool;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;



@Mod(modid = AuctionHouse.MODID,  version = AuctionHouse.VERSION)

public class AuctionHouse {
	public static final String MODID = "SSAuctionHouse";
	public static final String VERSION = "0.2.1";
	
	public static ItemAuctionTool itemAuctionTool;
	
	
	
	@EventHandler
    public void init(FMLInitializationEvent event) {
		// Starting up, do something
		registerItems();
		registerRecepies();
	}
	
	@Instance(value = AuctionHouse.MODID)
	public static AuctionHouse instance;
	
	@SidedProxy(clientSide="com.serendipitymc.mods.auctionhouse.client.ClientProxy", serverSide="com.serendipitymc.mods.auctionhouse.CommonProxy")
	public static CommonProxy proxy;
	
	// Register items
	public static void registerItems() {
		if (itemAuctionTool == null) {
			itemAuctionTool = new ItemAuctionTool();
			GameRegistry.registerItem(itemAuctionTool, "Serendipity Auction Tool");
		}
	}
	
	public static void registerRecepies() {
		if (itemAuctionTool != null) {
			GameRegistry.addRecipe(new ShapedOreRecipe(itemAuctionTool, "DGD", "GDG", "III", 'D', Blocks.dirt, 'G', Blocks.gravel, 'I', Blocks.anvil));
		}
	}
	
}
