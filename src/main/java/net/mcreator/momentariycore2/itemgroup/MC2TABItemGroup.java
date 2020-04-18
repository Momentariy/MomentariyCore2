
package net.mcreator.momentariycore2.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.momentariycore2.item.MomentariyItem;
import net.mcreator.momentariycore2.MomentariyCoreElements;

@MomentariyCoreElements.ModElement.Tag
public class MC2TABItemGroup extends MomentariyCoreElements.ModElement {
	public MC2TABItemGroup(MomentariyCoreElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmc2tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MomentariyItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
