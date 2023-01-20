package BetterTrades;

import BetterTrades.Command.Trade;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.util.ArrayList;

public final class Main extends JavaPlugin{
    public static ArrayList<Player> playersintrademenu = new ArrayList<>();

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§a§l[BetterTrades] is running");
        Bukkit.getConsoleSender().sendMessage("§a§l[BetterTrades] by EthanGarey has started");
        File config = new File(getDataFolder(),"config.yml");
        if (! (config.exists())) {
            Bukkit.getConsoleSender().sendMessage("§4§lConfig file not found, Creating one for you!");

        }
        saveDefaultConfig();
        new Trade(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
