package org.spout.bridge.bukkit.inventory;

import org.bukkit.block.BrewingStand;
import org.bukkit.inventory.BrewerInventory;
import org.bukkit.inventory.ItemStack;

public class BridgeInventoryBrewer extends BridgeInventory implements BrewerInventory {
	@Override
	public ItemStack getIngredient() {
		return null;  //To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public void setIngredient(ItemStack itemStack) {
		//To change body of implemented methods use File | Settings | File Templates.
	}

	@Override
	public BrewingStand getHolder() {
		return null;
	}
}
