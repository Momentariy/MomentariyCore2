
package net.mcreator.momentariycore2;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@Elementsmomentariycore2.ModElement.Tag
public class MCreatorMomentariy extends Elementsmomentariycore2.ModElement {
	@ObjectHolder("momentariycore2:momentariy")
	public static final Item block = null;
	public MCreatorMomentariy(Elementsmomentariycore2 instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MCreatorMC2TAB.tab).maxStackSize(64));
			setRegistryName("momentariy");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
