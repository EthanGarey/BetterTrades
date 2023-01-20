package BetterTrades.Menu;

import BetterTrades.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class Menu implements Listener{
    public boolean isInTradeMenu(Player player) {
        return Main.playersintrademenu.contains(player);
    }


    public void openTradeMenuForPlayer(Player player) {
        Inventory trademenugui = Bukkit.createInventory(player,45,"      Trade Menu     ");
        trademenugui.setItem(1,new ItemStack(Material.STAINED_GLASS_PANE));
        player.openInventory(trademenugui);

    }

    @EventHandler
    public void onPlayerClickItemInInventory(InventoryClickEvent event) {

    }

    @EventHandler
    public void onPlayerInventoryClose(InventoryCloseEvent event) {

    }

    @EventHandler
    public void onPickupItem(PlayerPickupItemEvent event) {

    }
}
