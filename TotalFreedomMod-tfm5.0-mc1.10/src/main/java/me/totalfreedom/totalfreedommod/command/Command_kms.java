package me.totalfreedom.totalfreedommod.command;

import me.totalfreedom.totalfreedommod.rank.Rank;
import me.totalfreedom.totalfreedommod.util.FUtil;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = Rank.SUPER_ADMIN, source = SourceType.BOTH)
@CommandParameters(
        description = "Kills yourself",
        usage = "/<command>",
        aliases = "killmyself,kmself")
public class Command_kms extends FreedomCommand
{
@Override
    public boolean run(CommandSender sender, Player playerSender, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        Player player = (Player) sender;
        FUtil.bcastMsg(ChatColor.GREEN + sender.getName() + " has taken the easy way out!");
        try {
    Thread.sleep(1000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        player.chat("Goodbye cruel world!");
        try {
    Thread.sleep(1000);                 //1000 milliseconds is one second.
} catch(InterruptedException ex) {
    Thread.currentThread().interrupt();
}
        player.setGameMode(GameMode.SURVIVAL);
        player.setHealth(0.0);
        msg(ChatColor.RED + "You have commited suicide!");
     return true;   
    }
    }
