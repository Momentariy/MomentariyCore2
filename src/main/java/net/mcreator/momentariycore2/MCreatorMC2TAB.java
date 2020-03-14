
package net.mcreator.momentariycore2;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@Elementsmomentariycore2.ModElement.Tag
public class MCreatorMC2TAB extends Elementsmomentariycore2.ModElement {
	public MCreatorMC2TAB(Elementsmomentariycore2 instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmc2tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(MCreatorMomentariy.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
