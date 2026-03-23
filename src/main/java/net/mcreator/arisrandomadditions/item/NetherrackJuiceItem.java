
package net.mcreator.arisrandomadditions.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.arisrandomadditions.init.ArisRandomAdditionsModFluids;

public class NetherrackJuiceItem extends BucketItem {
	public NetherrackJuiceItem() {
		super(ArisRandomAdditionsModFluids.NETHERRACK_JUICE, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
