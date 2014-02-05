package core.lib;


import core.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


/**
 * 
 * creative tab
 * 
 * @author azhdev
 *
 */

public class CreativeTabEC extends CreativeTabs {

    public CreativeTabEC(int par1, String par2Str) {
        
        super(par1, par2Str);
        
    }
    
	public static CreativeTabs tabsAM;
    
	public static void initTab(){
		tabsAM = new CreativeTabEC(CreativeTabs.getNextID(), Reference.MODNAME);
	}
	
   @Override
   @SideOnly(Side.CLIENT)
    // the item that is being displayed on the gui 
     public int getTabIconItemIndex() {
       return Item.writtenBook.itemID;
        
        
    }
   
}    