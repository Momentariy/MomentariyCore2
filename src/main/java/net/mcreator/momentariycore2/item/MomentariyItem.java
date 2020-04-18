
package net.mcreator.momentariycore2.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.momentariycore2.itemgroup.MC2TABItemGroup;
import net.mcreator.momentariycore2.MomentariyCoreElements;

@MomentariyCoreElements.ModElement.Tag
public class MomentariyItem extends MomentariyCoreElements.ModElement {
	@ObjectHolder("momentariycore2:momentariy")
	public static final Item block = null;
	public MomentariyItem(MomentariyCoreElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MC2TABItemGroup.tab).maxStackSize(64));
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
