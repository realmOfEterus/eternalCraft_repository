package core;

import core.handlers.PacketHandler;
import core.lib.CreativeTabEC;
import core.lib.Reference;
import core.lib.langInit;
import core.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * 
 * main class of the EternalCraft mod
 * 
 * @author Azhdev
 * 
 * initialize everything here
 * (only methods, no creating variables) 
 *
 */

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
@NetworkMod(channels = { Reference.CHANNEL }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class EternalCraft {
	
	@Instance(Reference.MODID)
	public static EternalCraft instance;
	
	@SidedProxy(clientSide = "core.proxies.ClientProxy", serverSide = "core.proxies.CommonProxy")
	public static CommonProxy proxy;

	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event) {
		
		//last ones to call
		CreativeTabEC.initTab();
		langInit.CreativeTabName();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {
		
	}
}
