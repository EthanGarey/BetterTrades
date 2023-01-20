package BetterTrades.Command;


import BetterTrades.Main;
import BetterTrades.Menu.Menu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Trade extends Menu implements CommandExecutor{
    final Main plugin;

    public Trade(Main plugin) {
        this.plugin = plugin;
        this.plugin.getCommand("trade").setExecutor(this);
        this.plugin.getCommand("trade").setUsage("").setDescription("");
    }

    @Override

    public boolean onCommand(CommandSender sender,Command command,String label,String[] args) {
        sender.sendMessage("hi");
        Player player = (Player) sender;
        openTradeMenuForPlayer(player);

        return true;
    }
}
