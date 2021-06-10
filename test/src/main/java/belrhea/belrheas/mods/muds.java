package belrhea.belrheas.mods;

import java.rmi.registry.Registry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class muds implements ModInitializer {

	public static final Item MUD_BALL = new Item(new FabricItemSettings().group(ItemGroup.MISC));
	
	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("belrhea", "mud_ball"), MUD_BALL);
	}
}
