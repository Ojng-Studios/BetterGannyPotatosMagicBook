package io.github.busituteng.bgpmb.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

import io.github.busituteng.bgpmb.gui.GuiPotatobook;
import io.github.busituteng.bgpmb.ElementsBgpmbMod;
import io.github.busituteng.bgpmb.BgpmbMod;

@ElementsBgpmbMod.ModElement.Tag
public class ProcedurePotatobook1RightClickedOnBlock extends ElementsBgpmbMod.ModElement {
	public ProcedurePotatobook1RightClickedOnBlock(ElementsBgpmbMod instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Potatobook1RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Potatobook1RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Potatobook1RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Potatobook1RightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Potatobook1RightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(BgpmbMod.instance, GuiPotatobook.GUIID, world, x, y, z);
	}
}
