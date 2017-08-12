package doggytalents.base.b;

import doggytalents.base.IRegistryMethods;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryMethods implements IRegistryMethods {

	@Override
	public void registerBlock(Object registry, Block block) {
		GameRegistry.registerBlock(block);
	}

	@Override
	public void registerItem(Object registry, Item item) {
		GameRegistry.registerItem(item);
	}

}
