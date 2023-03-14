
package io.github.busituteng.bgpmb.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import io.github.busituteng.bgpmb.item.ItemPotatomagiccircle;
import io.github.busituteng.bgpmb.ElementsBgpmbMod;

@ElementsBgpmbMod.ModElement.Tag
public class TabBgpmbtab extends ElementsBgpmbMod.ModElement {
	public TabBgpmbtab(ElementsBgpmbMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabbgpmbtab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemPotatomagiccircle.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
