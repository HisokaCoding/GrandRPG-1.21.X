package net.hisokacoding.grandrpgmod.screen.custom;

import net.hisokacoding.grandrpgmod.screen.ModMenuTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;

public class BestiaryMenu extends AbstractContainerMenu {
    public BestiaryMenu(int containerId, Inventory inv, FriendlyByteBuf extraData){
        this(containerId, inv);
    }

    public BestiaryMenu(int containerId, Inventory inv) {
        super(ModMenuTypes.BESTIARY_MENU.get(), containerId);
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return null;
    }

    @Override
    public boolean stillValid(Player player) {
        return false;
    }
}
